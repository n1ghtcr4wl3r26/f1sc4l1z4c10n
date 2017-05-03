<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>CUADRO LIQUIDACIÓN</strong>
        </h4>
    </div>
    <% 
        CuadroLiquidacionForm gen = (CuadroLiquidacionForm)request.getAttribute("CuadroLiquidacionForm");
    %>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-liquidacion" action="liquidacion.do">
            <html:hidden property="codigo" styleId="codigo"/>
            <input type="hidden" name="opcion" id="opcion"/>
            <div class="form-group">
                <label class="col-sm-2 control-label">Código:</label>
                <div class="col-sm-2">
                    ${infoControl.codigo}
                </div>
                <label class="col-sm-2 control-label">Código Control:</label>
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
                <label class="col-sm-2 control-label">N&uacute;mero de Identificación:</label>
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
            <div class="panel-title imp">
                <strong>CUADRO DE LIQUIDACIÓN</strong>
            </div>
            <div class="table-responsive">
            <table class="table table-striped table-hover" id="main-table">
                <thead>
                    <tr>
                        <th rowspan="2" class="text-center">N&uacute;mero</th>
                        <th rowspan="2" class="text-center">Item</th>
                        <th rowspan="2" class="text-center">Subpartida Declarada</th>
                        <th rowspan="2" class="text-center">Subpartida Determinada</th>
                        <th rowspan="2" class="text-center">Declaraci&oacute;n</th>
                        <th rowspan="2" class="text-center">Fecha Validaci&oacute;n</th>
                        <th rowspan="2" class="text-center">Fecha Vencimiento</th>
                        <th rowspan="2" class="text-center">Fecha de Calculo</th>
                        <th colspan="12" class="text-center">VALORES DECLARADOS</th>
                        <th colspan="12" class="text-center">VALORES ENCONTRADOS</th>    
                        <th colspan="6" class="text-center">TRIBUTOS OMITIDOS</th>   
                        <th colspan="6" class="text-center">TRIBUTOS OMITIDOS UFV</th>
                        <th rowspan="2" class="text-center">UFV FECHA VENCIMIENTO</th>
                        <th rowspan="2" class="text-center">D&iacute;as</th>
                          
                        <th colspan="5" class="text-center">TRIBUTOS OMITIDOS + INTERESES</th>
                        <th rowspan="2" class="text-center">ADEUDO TOTAL UFV</th>
                        <th rowspan="2" class="text-center">&nbsp;</th>
                        <th rowspan="2" class="text-center">&nbsp;</th>
                    </tr>
                    <tr>
                        <th class="text-center">FOB USD</th>
                        <th class="text-center">FLETE USD</th>
                        <th class="text-center">SEGURO USD</th>
                        <th class="text-center">OTROS USD</th>
                        <th class="text-center">VALOR CIF USD</th>
                        <th class="text-center">T/C</th>
                        <th class="text-center">VALOR CIF Bs</th>
                        <th class="text-center">GA</th>
                        <th class="text-center">IVA</th>
                        <th class="text-center">ICE</th>
                        <th class="text-center">IEHD</th>
                        <th class="text-center">ICD</th>
                        
                        <th class="text-center">FOB USD</th>
                        <th class="text-center">FLETE USD</th>
                        <th class="text-center">SEGURO USD</th>
                        <th class="text-center">OTROS USD</th>
                        <th class="text-center">VALOR CIF USD</th>
                        <th class="text-center">T/C</th>
                        <th class="text-center">VALOR CIF Bs</th>
                        <th class="text-center">GA</th>
                        <th class="text-center">IVA</th>
                        <th class="text-center">ICE</th>
                        <th class="text-center">IEHD</th>
                        <th class="text-center">ICD</th>
                        
                        <th class="text-center">GA Bs</th>
                        <th class="text-center">IVA Bs</th>
                        <th class="text-center">ICE Bs</th>
                        <th class="text-center">IEHD Bs</th>
                        <th class="text-center">ICD Bs</th>
                        <th class="text-center">TOTAL Bs</th>
                        
                        <th class="text-center">GA UFV</th>
                        <th class="text-center">IVA UFV</th>
                        <th class="text-center">ICE UFV</th>
                        <th class="text-center">IEHD UFV</th>
                        <th class="text-center">ICD UFV</th>
                        <th class="text-center">TOTAL UFV</th>
                                                
                        
                        <th class="text-center">GA UFV</th>
                        <th class="text-center">IVA UFV</th>
                        <th class="text-center">ICE UFV</th>
                        <th class="text-center">IEHD UFV</th>
                        <th class="text-center">ICD UFV</th>
                        
                    </tr>
                </thead>
                 
                <tbody>
                    <c:forEach items="${cuadroLiquidacion}" var="esc">
                        <tr>
                            <td class="text-center">
                                ${esc.sequencia}
                            </td>
                            <td class="text-center">
                                ${esc.item}
                            </td>
                            <td class="text-center">
                                ${esc.subpartidadec}
                            </td>
                            <td class="text-center">
                                ${esc.subpartidadet}
                            </td>
                            <td class="text-center">
                                ${esc.gestion}/${esc.aduana}/${esc.serial}-${esc.numero}
                            </td>
                            <td class="text-center">
                                ${esc.fechaval}
                            </td>
                            <td class="text-center">
                                ${esc.fechavcto}
                            </td>
                            <td class="text-center">
                                ${esc.fechacalculo}
                            </td>
                           
                            <td class="text-right">
                                ${esc.decfobusd}
                            </td>
                            <td class="text-right">
                                ${esc.decfleteusd}
                            </td>
                            <td class="text-right">
                                ${esc.decsegurousd}
                            </td>
                            <td class="text-right">
                                ${esc.decotrosusd}
                            </td>
                            <td class="text-right">
                                ${esc.deccifusd}
                            </td>
                            <td class="text-right">
                                ${esc.dectc}
                            </td>
                            <td class="text-right">
                                ${esc.deccifbs}
                            </td>
                            <td class="text-right">
                                ${esc.decga}
                            </td>
                            <td class="text-right">
                                ${esc.deciva}
                            </td>
                            <td class="text-right">
                                ${esc.decice}
                            </td>
                            <td class="text-right">
                                ${esc.deciehd}
                            </td>
                            <td class="text-right">
                                ${esc.decicd}
                            </td>
                            
                            
                           <td class="text-right">
                                ${esc.detfobusd}
                            </td>
                            <td class="text-right">
                                ${esc.detfleteusd}
                            </td>
                            <td class="text-right">
                                ${esc.detsegurousd}
                            </td>
                            <td class="text-right">
                                ${esc.detotrosusd}
                            </td>
                            <td class="text-right">
                                ${esc.detcifusd}
                            </td>
                            <td class="text-right">
                                ${esc.dettc}
                            </td>
                            <td class="text-right">
                                ${esc.detcifbs}
                            </td>
                            <td class="text-right">
                                ${esc.detga}
                            </td>
                            <td class="text-right">
                                ${esc.detiva}
                            </td>
                            <td class="text-right">
                                ${esc.detice}
                            </td>
                            <td class="text-right">
                                ${esc.detiehd}
                            </td>
                            <td class="text-right">
                                ${esc.deticd}
                            </td>
                             
                             
                            <td class="text-right">
                                ${esc.toga}
                            </td>
                            <td class="text-right">
                                ${esc.toiva}
                            </td>
                            <td class="text-right">
                                ${esc.toice}
                            </td>
                            <td class="text-right">
                                ${esc.toiehd}
                            </td>
                            <td class="text-right">
                                ${esc.toicd}
                            </td>
                            <td class="text-right">
                                ${esc.tototal}
                            </td>
                            
                            <td class="text-right">
                                ${esc.toufvga}
                            </td>
                            <td class="text-right">
                                ${esc.toufviva}
                            </td>
                            <td class="text-right">
                                ${esc.toufvice}
                            </td>
                            <td class="text-right">
                                ${esc.toufviehd}
                            </td>
                            <td class="text-right">
                                ${esc.toufvicd}
                            </td>
                            <td class="text-right">
                                ${esc.toufvtotal}
                            </td>
                            
                            
                            <td class="text-right">
                                ${esc.ufvvenc}
                            </td>
                            <td class="text-right">
                                ${esc.dias}
                            </td>
                            
                            <td class="text-right">
                                ${esc.dtufvga}
                            </td>
                            <td class="text-right">
                                ${esc.dtufviva}
                            </td>
                            <td class="text-right">
                                ${esc.dtufvice}
                            </td>
                            <td class="text-right">
                                ${esc.dtufviehd}
                            </td>
                            <td class="text-right">
                                ${esc.dtufvicd}
                            </td>
                           
                            <td class="text-right">
                                ${esc.adeudo_totalufv}
                            </td>
                            <td class="text-right">
                                &nbsp;
                            </td>
                            <td class="text-right">
                                &nbsp;
                            </td>
                            
                            
                                                        
                             
                             
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            </div>
            <%
              
            }
            %>
            
            
        </html:form>
    </div>
</div>
<script>
  $(document).ready(function () {
      Anb.form.submit('#form-liquidacion', function (form) {
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
            $("#form-liquidacion").submit();
      });
      
  });

  
</script>