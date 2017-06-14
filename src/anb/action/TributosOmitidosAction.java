package anb.action;


import anb.bean.TributosOmitidosForm;

import anb.entidades.InfoControl;
import anb.entidades.TributosOmitidos;
import anb.entidades.TributosOmitidosTotales;

import anb.general.Respuesta;

import anb.negocio.GeneralNeg;
import anb.negocio.TributosOmitidosNeg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;


public class TributosOmitidosAction extends MappingDispatchAction {
    private final TributosOmitidosNeg neg = new TributosOmitidosNeg();
    private final GeneralNeg gen = new GeneralNeg();
    
    public ActionForward tributosidx(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                   HttpServletResponse response) throws Exception {
        
        TributosOmitidosForm bean = new TributosOmitidosForm();
        bean = (TributosOmitidosForm)request.getAttribute("TributosOmitidosForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;
            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                request.getSession().setAttribute("sgestion", bean.getFgestion());
                request.getSession().setAttribute("sgerencia", bean.getFgerencia());
                request.getSession().setAttribute("scontrol", bean.getFcontrol());
                request.getSession().setAttribute("snumero", bean.getFnumero());
                Respuesta<Boolean> res =
                    gen.devuelveCodigo(bean.getFgestion(), bean.getFcontrol(), bean.getFgerencia(), bean.getFnumero());
                request.setAttribute("codigo", res.getResultado());
                if (res.getCodigo() == 1) {
                    bean.setCodigo(res.getMensaje().toString());
                    Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                    request.setAttribute("infoControl", inf.getResultado());
                    Respuesta<TributosOmitidos[]> ben = neg.devuelveTributosOmitidos(bean);
                    Respuesta<TributosOmitidosTotales> bentot = neg.devuelveTributosOmitidosTotales(bean);
                    if (ben.getCodigo() == 1) {
                        bean.setCantidad("1");
                        long total=0;
                        long ttotal=0;
                        for (int i = 0; i <  ben.getResultado().length; i++) {
                            TributosOmitidos trib = (TributosOmitidos)ben.getResultado()[i];
                            total = total + Long.parseLong(trib.getTotal().toString());
                        }                        
                        bentot.getResultado().setTotal(String.valueOf(total));
                        ttotal = ttotal + Long.parseLong(bentot.getResultado().getTotal()) + Long.parseLong(bentot.getResultado().getSancionomision()) + Long.parseLong(bentot.getResultado().getContravdui()) + Long.parseLong(bentot.getResultado().getContravorden()) + Long.parseLong(bentot.getResultado().getSancioncontrabando()) + Long.parseLong(bentot.getResultado().getSanciondefraudacion()) + Long.parseLong(bentot.getResultado().getDelito()) ;
                        bentot.getResultado().setTotalfinal(String.valueOf(ttotal));                        
                        request.setAttribute("tributosOm", ben.getResultado());
                        request.setAttribute("tributosOmtot", bentot.getResultado());                        
                    }
                    link = "ok";
                } 
                else {
                    if (res.getCodigo() == 0) {
                        request.setAttribute("WARNING", res.getMensaje());
                    } else {
                        request.setAttribute("ERROR", res.getMensaje());
                    }
                }
            }else {
                bean.setFgestion((String)request.getSession().getAttribute("sgestion"));
                bean.setFgerencia((String)request.getSession().getAttribute("sgerencia"));
                bean.setFcontrol((String)request.getSession().getAttribute("scontrol"));
                bean.setFnumero((String)request.getSession().getAttribute("snumero"));                
            }
            return mapping.findForward(link);
        }
    }
    
    public ActionForward tributos(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                   HttpServletResponse response) throws Exception {

        TributosOmitidosForm bean = new TributosOmitidosForm();
        bean = (TributosOmitidosForm)request.getAttribute("TributosOmitidosForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;
            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                Respuesta<Boolean> res =
                    gen.devuelveCodigo(bean.getFgestion(), bean.getFcontrol(), bean.getFgerencia(), bean.getFnumero());
                request.setAttribute("codigo", res.getResultado());
                if (res.getCodigo() == 1) {
                    bean.setCodigo(res.getMensaje().toString());
                    Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                    request.setAttribute("infoControl", inf.getResultado());
                    Respuesta<TributosOmitidos[]> ben = neg.devuelveTributosOmitidos(bean);
                    if (ben.getCodigo() == 1) {
                        request.setAttribute("hojaTrabajoDui", ben.getResultado());
                    }
                    link = "ok";
                } 
                else {
                    if (res.getCodigo() == 0) {
                        request.setAttribute("WARNING", res.getMensaje());
                    } else {
                        request.setAttribute("ERROR", res.getMensaje());
                    }
                }
            }
            return mapping.findForward(link);
        }
    }
}