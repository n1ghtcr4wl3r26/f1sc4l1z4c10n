<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>ESTADO DE DEUDA POR CONTROL</strong>
        </h4>
    </div>
    <% 
        TributosOmitidosForm gen = (TributosOmitidosForm)request.getAttribute("TributosOmitidosForm");
    %>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-tributos" action="tributos.do">
            <html:hidden property="codigo" styleId="codigo"/>
            <input type="hidden" name="opcion" id="opcion"/>
            <div class="form-group">
                <label class="col-sm-2 control-label">Codigo:</label>
                <div class="col-sm-2">
                    ${infoControl.codigo}
                </div>
                <label class="col-sm-2 control-label">Codigo Control:</label>
                <div class="col-sm-2">
                    ${infoControl.codigoControl}
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Tipo Control:</label>
                <div class="col-sm-2">
                    ${infoControl.tipoControl}
                </div>
                <label class="col-sm-2 control-label">Tipo Documento:</label>
                <div class="col-sm-2">
                    ${infoControl.tipoDocumento}
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">N&uacute;mero de Documento:</label>
                <div class="col-sm-2">
                    ${infoControl.nroDocumento}
                </div>
                <label class="col-sm-2 control-label">Fecha Documento:</label>
                <div class="col-sm-2">
                    ${infoControl.fecDocumento}
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Resumen de la Observaci&oacute;n:</label>
                <div class="col-sm-2">
                    ${infoControl.detDocumento}
                </div>
                <label class="col-sm-2 control-label">Riesgo Identificado:</label>
                <div class="col-sm-2">
                    ${infoControl.riesgoIdentificado}
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Tipo Documento de Identificaci&oacute;n:</label>
                <div class="col-sm-2">
                    ${infoControl.tipoDocIdentificacion}
                </div>
                <label class="col-sm-2 control-label">Estado:</label>
                <div class="col-sm-2">
                    ${infoControl.estado}
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">N&uacute;mero de Identificacion:</label>
                <div class="col-sm-2">
                    ${infoControl.docIdentificacion}
                </div>
                <label class="col-sm-2 control-label">Nombre/Raz&oacute;n Social:</label>
                <div class="col-sm-2">
                    ${infoControl.nomIdentificacion}
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Direcci&oacute;n:</label>
                <div class="col-sm-2">
                    ${infoControl.direccion}
                </div>
                <label class="col-sm-2 control-label">Actividad:</label>
                <div class="col-sm-2">
                    ${infoControl.actividad}
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Fecha de Registro:</label>
                <div class="col-sm-2">
                    ${infoControl.fechaRegistro}
                </div>
            </div>
            <% 
            if(!(gen.getOpcion() == null) && (gen.getOpcion().equals("CONSULTAR"))) {
            %>
            <br></br>
            <br></br>
            <div class="panel-title">
                <strong>ESTADO DE DEUDA POR CONTROL</strong>
            </div>
            <table class="table table-striped table-hover" id="main-table">
                <thead>
                    <tr>
                        <th class="text-center">N&uacute;mero</th>
                        <th class="text-center">DUI</th>
                        <th class="text-center">Fecha Validación</th>
                        <th class="text-center">GA Bs.</th>
                        <th class="text-center">IVA Bs.</th>
                        <th class="text-center">ICE Bs.</th>
                        <th class="text-center">IEHD Bs.</th>
                        <th class="text-center">ICD Bs.</th>
                        <th class="text-center">Sanción por Omisión de Pago UFV</th>
                        <th class="text-center">Sanción por Omisión de Pago Bs.</th>
                        <th class="text-center">Total a Pagar Bs.</th>
                    </tr>
                </thead>
                 
                <tbody>
                    <c:forEach items="${tributosOm}" var="esc">
                        <tr>
                            <td class="text-center">
                                ${esc.numero}
                            </td>
                            <td class="text-center">
                                ${esc.dui}
                            </td>
                            <td class="text-center">
                                ${esc.fechareg}
                            </td>
                            <td class="text-right">
                                ${esc.ga}
                            </td>
                            <td class="text-right">
                                ${esc.iva}
                            </td>
                            <td class="text-right">
                                ${esc.ice}
                            </td>
                            <td class="text-right">
                                ${esc.iehd}
                            </td>
                            <td class="text-right">
                                ${esc.icd}
                            </td>
                            <td class="text-right">
                                ${esc.sancionufv}
                            </td>   
                            <td class="text-right">
                                ${esc.sancionbs}
                            </td>   
                            <td class="text-right">
                                ${esc.total}
                            </td>   
                        </tr>
                    </c:forEach>
                </tbody>
            
            <%
              
            }
            %>
                <tfoot>
                    <tr>
                        <td class="text-center" colspan="8">
                            Sub total Omisión de Pago
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center" colspan="8">
                            Contravención Aduanera relacionada con la DUI Cod. 167
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center" colspan="8">
                            Contravenciones Aduaneras relacionadas con la orden Cod. 167
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center" colspan="8">
                            Sanción por Defraudación Cod. 169
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center" colspan="8">
                            Sanción por Contrabando Contravencional 235
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center" colspan="8">
                            Sanción por Delito Cod 236
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center" colspan="8">
                            Total Adeudo
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                        <td class="text-center">
                            &nbsp;
                        </td>
                    </tr>
                
                </tfoot>
            </table>
        </html:form>
    </div>
</div>
<script>
  $(document).ready(function () {
      Anb.form.submit('#form-tributos', function (form) {
          Anb.form.cleanErrors(form);
          if ($("#opcion").val() =='MOSTRAR')
                form.submit();
            else
          if (Anb.validate.run(form)) {
              console.log('Enviado!');
              Anb.loading.show()
              form.submit();
          }
      });
      
      var DT = new Anb.datatable({
            filter: true,
            "iDisplayLength": -1,
            oLanguage: {"sSearch": '<i class="glyphicon glyphicon-search"></i> Buscar: '}
            
      });
      DT.$('.deletebtn').on('click', function() {           
            var id = this.getAttribute('data-item');
            $("#mostrarid").val(id);
            $("#opcion").val('MOSTRAR'); 
            $("#form-tributos").submit();
      });
      
  });

  
</script>