<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>BANDEJA JEFE Y SUPERVISOR</strong>
        </h4>
    </div>
    <%
    String res;
    res = "pruebas";
    
    %>
    <div class="modal-body form-horizontal">
        <br/>
        <table class="table table-striped table-hover" id="main-table" style="width:90%">
            <thead>
                <tr>
                    <th class="text-center">Nro. de Orden</th>
                    <th class="text-center">Tipo de Control</th>
                    <th class="text-center">Fecha Registro</th>
                    <th class="text-center">N&uacute;mero de Tr&aacute;mite</th>
                    <th class="text-center">Cantidad de Tr&aacute;mites</th>
                    <th class="text-center">Patr&oacute;n</th>
                    <th class="text-center">&Iacute;tems</th>
                    <th class="text-center">Importador</th>
                    <th class="text-center">Fecha Levante</th>
                    <th class="text-center">Riesgo P.A.</th>
                </tr>
            </thead>
             
            <tbody>
                <c:forEach items="${reporteBandejaJefe}" var="esc">
                    <tr>
                        <td class="text-left">
                            ${esc.numeroControl}
                        </td>
                        <td class="text-center">
                            ${esc.tipoControl}
                        </td>
                        <td class="text-center">
                            ${esc.fechaRegistro}
                        </td>
                        <td class="text-left">
                            <c:if test="${esc.declaracion != 'TRAMITES' }">
                            <a onclick="window.open('lista_dma.jsp?p=${esc.param}','_blank','width=800,height=400,menubar=0,scrollbars=yes,toolbar=0,location=0,directories=0,resizable=0,top=0,left=0')"
                                   href='javascript:void(0)'>                            
                                    ${esc.declaracion}
                            </a>
                            </c:if>    
                            <c:if test="${esc.declaracion == 'TRAMITES' }">                                                     
                                    ${esc.declaracion}
                            </c:if>   
                        </td>
                        <td class="text-center">
                            ${esc.cantidadDUIs}
                        </td>
                        <td class="text-center">
                            ${esc.patron}
                        </td>
                        <td class="text-center">
                            ${esc.items}
                        </td>
                        <td class="text-left">
                            ${esc.importadorNIT}:${esc.importadorNombre}
                        </td>
                        <td class="text-center">
                            ${esc.fechaLevante}
                        </td>
                        <td class="text-center">
                            <c:if test="${esc.riesgopa == '1' }">
                                <a onclick=window.open('/fiscalizacion/pages/control/reporte_riesgopa.jsp?gestion=${esc.gestion}&aduana=${esc.aduana}&numero=${esc.numero}&vdec=&vop=&vusu=${AlcanceForm.usuario}&bandera=undefined','_blank','width=550,height=580,menubar=0,scrollbars=yes,toolbar=0,location=0,directories=0,resizable=0,top=0,left=0') href='javascript:void(0)' >
                                    con_CCA
                                </a>
                            </c:if>
                            &nbsp;
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>