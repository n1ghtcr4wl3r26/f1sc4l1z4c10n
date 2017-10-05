<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>BANDEJA FISCALIZADOR</strong>
        </h4>
    </div>
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
                    <th class="text-center">Estado</th>
                    <th class="text-center">Fecha de Asignacion</th>
                    <th class="text-center">Origen</th>
                    <th class="text-center">Plazo</th>
                </tr>
            </thead>
             
            <tbody>
                <c:forEach items="${reporteBandejaFiscalizador}" var="esc">
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
                            ${esc.declaracion}
                        </td>
                        <td class="text-center">
                            ${esc.cantidadDUIs}
                        </td>
                        <td class="text-right">
                            ${esc.patron}
                        </td>
                        <td class="text-center">
                            ${esc.items}
                        </td>
                        <td class="text-center">
                            ${esc.importadorNIT}:${esc.importadorNombre}
                        </td>
                        <td class="text-center">
                            ${esc.fechaLevante}
                        </td>
                        <td class="text-center">
                            ${esc.estado}
                        </td>
                        <td class="text-center">
                            ${esc.fechaAsignacion}
                        </td>
                        <td class="text-center">
                            ${esc.origen}
                        </td>
                        <td class="text-center">
                            ${esc.plazoDias}
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>