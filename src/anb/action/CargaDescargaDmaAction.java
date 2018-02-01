package anb.action;


import anb.bean.CargaDescargaDmaForm;

import anb.entidades.Dma;
import anb.entidades.HojaExcel;
import anb.entidades.HojaExcelCab;
import anb.entidades.InfoControl;
import anb.entidades.Tramite;

import anb.general.Respuesta;
import anb.general.Util;

import anb.negocio.CargaDescargaDmaNeg;
import anb.negocio.GeneralNeg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;


public class CargaDescargaDmaAction extends MappingDispatchAction {
    private final CargaDescargaDmaNeg neg = new CargaDescargaDmaNeg();
    private final GeneralNeg gen = new GeneralNeg();

    public ActionForward cargadescargadmaidx(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                             HttpServletResponse response) throws Exception {

        CargaDescargaDmaForm bean = new CargaDescargaDmaForm();
        bean = (CargaDescargaDmaForm)request.getAttribute("CargaDescargaDmaForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            bean.setUsuarioger((String)request.getSession().getAttribute("gerencia"));
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
                    //verifica si el usuario esta habilitado para el control ******
                    Respuesta<Boolean> ver =
                        gen.verificaAccesoUsuario(bean.getCodigo(), bean.getUsuario(), "EXCEL", bean.getUsuarioger());
                    if (ver.getCodigo() == 1) {
                        Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                        request.setAttribute("infoControl", inf.getResultado());
                        Respuesta<Tramite[]> tram = gen.ver_TramitesControlxls(bean.getCodigo());
                        request.setAttribute("tramites", tram.getResultado());
                        Respuesta<HojaExcel[]> ben = neg.hojaExcel(bean);
                        if (ben.getCodigo() == 1) {
                            request.setAttribute("hojaTrabajoDui", ben.getResultado());
                        }
                        link = "ok";
                    } else {
                        request.setAttribute("ERROR", "No esta asignado a la Orden de Fiscalizaci&oacute;n");
                    }
                    //******
                } else {
                    if (res.getCodigo() == 0) {
                        request.setAttribute("WARNING", res.getMensaje());
                    } else {
                        request.setAttribute("ERROR", res.getMensaje());
                    }
                }
            } else {
                bean.setFgestion((String)request.getSession().getAttribute("sgestion"));
                bean.setFgerencia((String)request.getSession().getAttribute("sgerencia"));
                bean.setFcontrol((String)request.getSession().getAttribute("scontrol"));
                bean.setFnumero((String)request.getSession().getAttribute("snumero"));
            }
            return mapping.findForward(link);
        }
    }

    public ActionForward cargadescargadma(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                          HttpServletResponse response) throws Exception {

        CargaDescargaDmaForm bean = new CargaDescargaDmaForm();
        bean = (CargaDescargaDmaForm)request.getAttribute("CargaDescargaDmaForm");
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
                    Respuesta<Tramite[]> tram = gen.ver_TramitesControl(bean.getCodigo());
                    request.setAttribute("tramites", tram.getResultado());
                    Respuesta<HojaExcel[]> ben = neg.hojaExcel(bean);
                    if (ben.getCodigo() == 1) {
                        request.setAttribute("hojaTrabajoDui", ben.getResultado());
                        Respuesta<HojaExcelCab> ben2 = neg.hojaExcelCap(bean);
                        request.setAttribute("hojaexcelcab", ben2.getResultado());
                    }
                    link = "ok";
                } else {
                    if (res.getCodigo() == 0) {
                        request.setAttribute("WARNING", res.getMensaje());
                    } else {
                        request.setAttribute("ERROR", res.getMensaje());
                    }
                }
            } else {
                if (bean.getOpcion().equals("MOSTRAR")) {
                    Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                    request.setAttribute("infoControl", inf.getResultado());
                    Respuesta<Tramite[]> tram = gen.ver_TramitesControl(bean.getCodigo());
                    request.setAttribute("tramites", tram.getResultado());
                    Respuesta<Dma[]> ben = neg.lista_dma(bean);
                    request.setAttribute("lista_dma", ben.getResultado());
                    link = "ok";
                } else {
                    if (bean.getOpcion().equals("CONSULTAR2")) {
                        Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                        request.setAttribute("infoControl", inf.getResultado());
                        bean.setGestion(Util.devuelve_alc_gestion(bean.getMostrarid()) );
                        bean.setAduana(Util.devuelve_alc_aduana(bean.getMostrarid()) );
                        bean.setNumero(Util.devuelve_alc_numero(bean.getMostrarid()) );
                        bean.setDma(Util.devuelve_dma(bean.getMostrarid(), bean.getDav()));
                        link = "dma";
                    }
                }
            }
            return mapping.findForward(link);
        }
    }

    public ActionForward cargadescargadilig(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                            HttpServletResponse response) throws Exception {

        CargaDescargaDmaForm bean = new CargaDescargaDmaForm();
        bean = (CargaDescargaDmaForm)request.getAttribute("CargaDescargaDmaForm");
        String usuario = (String)request.getSession().getAttribute("user");
        Boolean sw = false;
        bean.setDmaxml("");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;
            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR2")) {
                Respuesta<Boolean> res =
                    gen.devuelveCodigo(bean.getFgestion(), bean.getFcontrol(), bean.getFgerencia(), bean.getFnumero());
                request.setAttribute("codigo", res.getResultado());
                if (res.getCodigo() == 1) {
                    bean.setCodigo(res.getMensaje().toString());
                    Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                    request.setAttribute("infoControl", inf.getResultado());
                    Respuesta<Tramite[]> tram = gen.ver_TramitesControl(bean.getCodigo());
                    request.setAttribute("tramites", tram.getResultado());
                    Respuesta<HojaExcel[]> ben = neg.hojaExcel(bean);
                    if (ben.getCodigo() == 1) {
                        request.setAttribute("hojaTrabajoDui", ben.getResultado());
                        Respuesta<HojaExcelCab> ben2 = neg.hojaExcelCap(bean);
                        request.setAttribute("hojaexcelcab", ben2.getResultado());
                    }
                    link = "ok";
                } else {
                    if (res.getCodigo() == 0) {
                        request.setAttribute("WARNING", res.getMensaje());
                    } else {
                        request.setAttribute("ERROR", res.getMensaje());
                    }
                }
            } else {
                if (bean.getOpcion().equals("MOSTRAR")) {
                    Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                    request.setAttribute("infoControl", inf.getResultado());
                    Respuesta<Tramite[]> tram = gen.ver_TramitesControl(bean.getCodigo());
                    request.setAttribute("tramites", tram.getResultado());
                    Respuesta<Dma[]> ben = neg.lista_dma(bean);
                    request.setAttribute("lista_dma", ben.getResultado());
                    link = "ok";
                } else {
                    if (bean.getOpcion().equals("DESCARGA")) {
                        Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                        request.setAttribute("infoControl", inf.getResultado());
                        Respuesta<Boolean> des;
                        if(bean.getDma().indexOf('M')>0){
                            des = neg.pDescargarDFdm(bean.getDma(),Util.devuelve_alc_gestion(bean.getMostrarid())+"/"+Util.devuelve_alc_aduana(bean.getMostrarid())+"/C-"+Util.devuelve_alc_numero(bean.getMostrarid()));
                        }else{
                            des = neg.pDescargarD(bean.getDma());
                        }
                        if (des.getCodigo() == 1) {
                            bean.setDmaxml("CORRECTO");
                        } else {
                            bean.setDmaxml("CORRECTO");
                        }
                        link = "dma";
                    } else {
                        if (bean.getOpcion().equals("CARGA")) {
                            Respuesta<InfoControl> inf = gen.devuelveControl(bean.getCodigo());
                            request.setAttribute("infoControl", inf.getResultado());
                            Respuesta<Boolean> des;
                            if(bean.getDma().indexOf('M')>0){
                                des = neg.pSubeLoDatosR(bean.getDocXml(), "/u03/oracle/user_projects/data/fiscalizacion/dma/xml/" + bean.getDocXml().getFileName(), bean.getGestion(),bean.getAduana() , bean.getNumero(), bean.getUsuario(), "R");
                            }else{
                                des = neg.pSubeLoDatosDMAR(bean.getDocXml(), "/u03/oracle/user_projects/data/fiscalizacion/dma/xml/" + bean.getDocXml().getFileName(), bean.getGestion(),bean.getAduana() , bean.getNumero(), bean.getUsuario(), "R");
                            }
                            if (des.getCodigo() == 1) {
                                bean.setDmaxml("");
                                request.setAttribute("CargaDescargaDmaForm",bean);
                                request.setAttribute("OK", "Se cargo correctamente el archivo XML");
                                sw = Util.actualiza_valores_hoja_trabajo(bean.getMostrarid(), usuario);
                            } else {
                                if (des.getCodigo() == 0) {
                                    request.setAttribute("WARNING", des.getMensaje());
                                } else {
                                    request.setAttribute("ERROR", des.getMensaje());
                                }
                            }
                            link = "dma";
                        }
                    }
                }

            }
            return mapping.findForward(link);
        }
    }
}
