package anb.action;


import anb.bean.ReporteControlForm;

import anb.entidades.Fiscalizador;
import anb.entidades.RepCantidades;
import anb.entidades.RepControl;
import anb.entidades.RepEstadoControl;

import anb.general.Respuesta;

import anb.negocio.GeneralNeg;
import anb.negocio.ReporteControlNeg;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;


public class ReporteControlAction extends MappingDispatchAction {
    private final ReporteControlNeg neg = new ReporteControlNeg();
    private final GeneralNeg gen = new GeneralNeg();

    public ActionForward reportecontrolidx(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                           HttpServletResponse response) throws Exception {
        ReporteControlForm bean = new ReporteControlForm();
        bean = (ReporteControlForm)request.getAttribute("ReporteControlForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;
            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                bean.setFgerencia((String)request.getSession().getAttribute("sgerencia"));
                Respuesta<RepControl[]> ben = neg.reporteControl(bean);
                if (ben.getCodigo() == 1) {
                    request.setAttribute("reporteControl", ben.getResultado());
                    link = "ok";
                } else {
                    if (ben.getCodigo() == 0) {
                        request.setAttribute("WARNING", ben.getMensaje());
                    } else {
                        request.setAttribute("ERROR", ben.getMensaje());
                    }
                }
            }
            return mapping.findForward(link);
        }
    }

    public ActionForward reportecontrol(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                        HttpServletResponse response) throws Exception {

        ReporteControlForm bean = new ReporteControlForm();
        bean = (ReporteControlForm)request.getAttribute("ReporteControlForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;
            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                Respuesta<RepControl[]> ben = neg.reporteControl(bean);
                if (ben.getCodigo() == 1) {
                    request.setAttribute("reporteControl", ben.getResultado());
                    link = "ok";
                }

                else {
                    if (ben.getCodigo() == 0) {
                        request.setAttribute("WARNING", ben.getMensaje());
                    } else {
                        request.setAttribute("ERROR", ben.getMensaje());
                    }
                }
            }
            return mapping.findForward(link);
        }
    }

    public ActionForward reportecontrolasigidx(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                               HttpServletResponse response) throws Exception {

        ReporteControlForm bean = new ReporteControlForm();
        bean = (ReporteControlForm)request.getAttribute("ReporteControlForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;
            Respuesta<List<Fiscalizador>> fis = gen.obtenerFiscalizadores(bean.getCodger());
            if (fis.getCodigo() == 1) {
                request.setAttribute("fiscalizadores", fis.getResultado());
            } else {
                request.setAttribute("fiscalizadores", null);
            }
            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                bean.setFgerencia((String)request.getSession().getAttribute("sgerencia"));
                Respuesta<RepCantidades[]> ben = neg.reporteControlAsig(bean);
                if (ben.getCodigo() == 1) {
                    request.setAttribute("reporteControlAsig", ben.getResultado());
                    Respuesta<RepCantidades[]> ben2 = neg.reporteControlAsigTot(bean);
                    request.setAttribute("reporteControlAsigTot", ben2.getResultado());
                    link = "ok";
                } else {
                    if (ben.getCodigo() == 0) {
                        request.setAttribute("WARNING", ben.getMensaje());
                    } else {
                        request.setAttribute("ERROR", ben.getMensaje());
                    }
                }
            }
            return mapping.findForward(link);
        }
    }

    public ActionForward reportedetallecontrolsupidx(ActionMapping mapping, ActionForm form,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response) throws Exception {

        ReporteControlForm bean = new ReporteControlForm();
        bean = (ReporteControlForm)request.getAttribute("ReporteControlForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;
            Respuesta<List<Fiscalizador>> fis = gen.obtenerFiscalizadores(bean.getCodger());
            if (fis.getCodigo() == 1) {
                request.setAttribute("fiscalizadores", fis.getResultado());
            } else {
                request.setAttribute("fiscalizadores", null);
            }
            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                bean.setFgerencia((String)request.getSession().getAttribute("sgerencia"));
                Respuesta<RepEstadoControl[]> ben = neg.reporteDetalleControles(bean);//modificar
                if (ben.getCodigo() == 1) {
                    request.setAttribute("detalleControles", ben.getResultado());
                    Respuesta<RepCantidades[]> ben2 = neg.reporteDetalleCantidades(bean);
                    request.setAttribute("cantidadControles", ben2.getResultado());
                    Respuesta<RepCantidades[]> ben3 = neg.reporteDetalleTotales(bean);
                    request.setAttribute("totalControles", ben3.getResultado());
                    link = "ok";
                } else {
                    if (ben.getCodigo() == 0) {
                        request.setAttribute("WARNING", ben.getMensaje());
                    } else {
                        request.setAttribute("ERROR", ben.getMensaje());
                    }
                }
            }
            return mapping.findForward(link);
        }
    }
    public ActionForward reportedetallecontrolfisidx(ActionMapping mapping, ActionForm form,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response) throws Exception {

        ReporteControlForm bean = new ReporteControlForm();
        bean = (ReporteControlForm)request.getAttribute("ReporteControlForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;

            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                bean.setFgerencia((String)request.getSession().getAttribute("sgerencia"));
                bean.setFuncionario(usuario);
                Respuesta<RepEstadoControl[]> ben = neg.reporteDetalleControles(bean);//modificar
                if (ben.getCodigo() == 1) {
                    request.setAttribute("detalleControles", ben.getResultado());
                    Respuesta<RepCantidades[]> ben3 = neg.reporteDetalleTotales(bean);
                    request.setAttribute("totalControles", ben3.getResultado());
                    link = "ok";
                } else {
                    if (ben.getCodigo() == 0) {
                        request.setAttribute("WARNING", ben.getMensaje());
                    } else {
                        request.setAttribute("ERROR", ben.getMensaje());
                    }
                }
            }
            return mapping.findForward(link);
        }
    }
    public ActionForward reportecuadroliquidacionidx(ActionMapping mapping, ActionForm form,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response) throws Exception {

        ReporteControlForm bean = new ReporteControlForm();
        bean = (ReporteControlForm)request.getAttribute("ReporteControlForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;

            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                bean.setFgerencia((String)request.getSession().getAttribute("sgerencia"));
                Respuesta<RepCantidades[]> ben = neg.reporteControlAsig(bean);
                if (ben.getCodigo() == 1) {
                    request.setAttribute("reporteControlAsig", ben.getResultado());
                    Respuesta<RepCantidades[]> ben2 = neg.reporteControlAsigTot(bean);
                    request.setAttribute("reporteControlAsigTot", ben2.getResultado());
                    link = "ok";
                } else {
                    if (ben.getCodigo() == 0) {
                        request.setAttribute("WARNING", ben.getMensaje());
                    } else {
                        request.setAttribute("ERROR", ben.getMensaje());
                    }
                }
            }
            return mapping.findForward(link);
        }
    }
    public ActionForward reporteliquidacionpreviaidx(ActionMapping mapping, ActionForm form,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response) throws Exception {

        ReporteControlForm bean = new ReporteControlForm();
        bean = (ReporteControlForm)request.getAttribute("ReporteControlForm");
        String usuario = (String)request.getSession().getAttribute("user");
        if (usuario == null) {
            return mapping.findForward("nook");
        } else {
            bean.setUsuario(usuario);
            bean.setCodger((String)request.getSession().getAttribute("user.codger"));
            String link = "index";
            String codigo;

            if (!(bean.getOpcion() == null) && bean.getOpcion().equals("CONSULTAR")) {
                bean.setFgerencia((String)request.getSession().getAttribute("sgerencia"));
                Respuesta<RepCantidades[]> ben = neg.reporteControlAsig(bean);
                if (ben.getCodigo() == 1) {
                    request.setAttribute("reporteControlAsig", ben.getResultado());
                    Respuesta<RepCantidades[]> ben2 = neg.reporteControlAsigTot(bean);
                    request.setAttribute("reporteControlAsigTot", ben2.getResultado());
                    link = "ok";
                } else {
                    if (ben.getCodigo() == 0) {
                        request.setAttribute("WARNING", ben.getMensaje());
                    } else {
                        request.setAttribute("ERROR", ben.getMensaje());
                    }
                }
            }
            return mapping.findForward(link);
        }
    }
}

