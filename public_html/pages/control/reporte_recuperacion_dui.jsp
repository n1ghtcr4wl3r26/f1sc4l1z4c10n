<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>REPORTE DE RECUPERACI&Oacute;N DE TRIBUTOS DE LA ORDEN POR DUI</strong>
        </h4>
    </div>
    <% 
        ReporteForm gen = (ReporteForm)request.getAttribute("ReporteForm");
    %>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-reporte_recuperacion_dui" action="reporte_recuperacion_duiidx.do">
            <html:hidden property="codigo" styleId="codigo"/>
            <input type="hidden" name="opcion" id="opcion"/>
            <strong>Gerencia:</strong>
            ${ReporteForm.fgerencianombre}
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <strong>Fecha desde:</strong>
            ${ReporteForm.ffecini}
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <strong>Fecha hasta:</strong>
            ${ReporteForm.ffecfin}
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <strong>Tipo de Tr&aacute;mite:</strong>
            ${ReporteForm.ftipotramitenombre}
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <strong>N&uacute;mero de NIT:</strong>
            ${ReporteForm.fnitnombre}
            <% 
            if(!(gen.getOpcion() == null) && (gen.getOpcion().equals("CONSULTAR"))) {
            %>
            <br></br>
            <div class="panel-title imp">
                <strong>REPORTE DE RECUPERACI&Oacute;N DE TRIBUTOS DE LA ORDEN POR DUI</strong>
            </div>
            <div class="table-responsive">
                <table class="table table-striped table-hover" id="main-table">
                    <thead>
                        <tr>
                            <th class="text-center">N&Uacute;MERO</th>
                            <th class="text-center">GESTI&Oacute;N</th>
                            <th class="text-center">TIPO DE CONTROL</th>
                            <th class="text-center">GERENCIA</th>
                            <th class="text-center">NUMERO CORRELATIVO POR GESTI&Oacute;N</th>
                            <th class="text-center">N&Uacute;MERO DE CONTROL POSTERIOR</th>
                            <th class="text-center">FECHA DE LA ORDEN DE CONTROL</th>
                            <th class="text-center">DECLARACI&Oacute;N C&Oacute;DIGO DE ADUANA</th>
                            <th class="text-center">DECLARACI&Oacute;N N&Uacute;MERO DECLARACI&Oacute;N</th>
                            <th class="text-center">DECLARACI&Oacute;N FECHA DE REGISTRO</th>
                            <th class="text-center">DECLARACI&Oacute;N PATR&Oacute;N</th>
                            <th class="text-center">DECLARACI&Oacute;N CANAL</th>
                            <th class="text-center">DECLARACI&Oacute;N FECHA DEL PASE SALIDA</th>
                            <th class="text-center">DECLARACI&Oacute;N NIT IMPORTADOR</th>
                            <th class="text-center">DECLARACI&Oacute;N NOMBRE IMPORTADOR</th>
                            <th class="text-center">DECLARACI&Oacute;N NIT DECLARANTE</th>
                            <th class="text-center">DECLARACI&Oacute;N NOMBRE DECLARANTE</th>
                            <th class="text-center">DECLARACI&Oacute;N DIRECCI&Oacute;N PROVEEDOR</th>
                            <th class="text-center">DECLARACI&Oacute;N NOMBRE PROVEEDOR</th>
                            <th class="text-center">DECLARACI&Oacute;N LOCALIZACI&Oacute;N MERCANC&Iacute;A</th>
                            <th class="text-center">DECLARACI&Oacute;N PA&Iacute;S DE ORIGEN</th>
                            <th class="text-center">DECLARACI&Oacute;N PA&Iacute;S ULTIMA PROCEDENCIA</th>
                            <th class="text-center">DECLARACI&Oacute;N PUERTO PA&Iacute;S DE EMBARQUE</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL PESO BRUTO</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL PESO NETO</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL VALOR FOB DECLARADO SUS</th>
                            <th class="text-center">DECLARACI&Oacute;N FLETE DECLARADO SUS</th>
                            <th class="text-center">DECLARACI&Oacute;N SEGURO DECLARADO SUS</th>
                            <th class="text-center">DECLARACI&Oacute;N OTROS GASTOS DECLARADOS SUS</th>
                            <th class="text-center">DECLARACI&Oacute;N VALOR CIF DECLARADO SUS</th>
                            <th class="text-center">DECLARACI&Oacute;N VALOR CIF DECLARADO EN BS</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL GA DECLARADO BS</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL IVA DECLARADO BS</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL ICE DECLARADO BS</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL IEHD DECLARADO BS</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL ICD DECLARADO BS</th>
                            <th class="text-center">DECLARACI&Oacute;N TOTAL TRIBUTOS DECLARADOS BS</th>
                            <th class="text-center">ESTADO DEL CONTROL</th>
                            <th class="text-center">TOTAL RECUPERADO - TRIBUTO PAGADO GA BS</th>
                            <th class="text-center">TOTAL RECUPERADO - TRIBUTO PAGADO IVA BS</th>
                            <th class="text-center">TOTAL RECUPERADO - TRIBUTO PAGADO ICE BS</th>
                            <th class="text-center">TOTAL RECUPERADO - TRIBUTO PAGADO IEHD BS</th>
                            <th class="text-center">TOTAL RECUPERADO - ICD PAGADO BS</th>
                            <th class="text-center">TOTAL RECUPERADO - TOTAL TRIBUTO PAGADO BS</th>
                            <th class="text-center">TOTAL RECUPERADO - SANCI&Oacute;N OMISI&Oacute;N BS</th>
                            <th class="text-center">TOTAL RECUPERADO - MULTA CONTRAVENCI&Oacute;N ADUANERA BS</th>
                            <th class="text-center">TOTAL RECUPERADO - MULTA CONTRABANDO CONTRAVENCIONAL</th>
                            <th class="text-center">TOTAL RECUPERADO - MULTA CONTRABANDO DELITO</th>
                            <th class="text-center">TOTAL RECUPERADO - TOTAL RECUPERADO</th>
                            <th class="text-center">FACILIDADES DE PAGO - CUOTA INICIAL BS</th>
                            <th class="text-center">FACILIDADES DE PAGO - GARANT&Iacute;A EN EFECTIVO BS</th>
                            <th class="text-center" width="180px">FACILIDADES DE PAGO - SALDO POR COBRAR SUJETO A FACILIDADES DE PAGO
                                                    EN BS</th>
                            <th class="text-center">FACILIDADES DE PAGO - USUARIO QUE REGISTRO LOS PAGOS</th>
                        </tr>
                    </thead>
                     
                    <tbody>
                        <c:forEach items="${reporte_recuperacion_dui}" var="rep">
                            <tr>
                                <td class="text-center">
                                    ${rep.secuencia}
                                </td>
                                <td class="text-center">
                                    ${rep.orden_gestion}
                                </td>
                                <td class="text-center">
                                    ${rep.orden_tipo_control}
                                </td>
                                <td class="text-center">
                                    ${rep.orden_gerencia}
                                </td>
                                <td class="text-center">
                                    ${rep.orden_numero}
                                </td>
                                <td class="text-center">
                                    ${rep.orden_codigo}
                                </td>
                                <td class="text-center">
                                    ${rep.orden_fecha}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_aduana}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_codigo}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_fecha}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_patron}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_canal}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_fecha_pase}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_importador_numero}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_importador_nombre}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_declarante_numero}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_declarante_nombre}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_proveedor_direccion}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_proveedor_nombre}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_localizacion}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_origen}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_procedencia_pais}
                                </td>
                                <td class="text-center">
                                    ${rep.dui_embarque_pais}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_peso_bruto}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_peso_neto}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_fob}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_flete}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_seguro}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_otros}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_cif_sus}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_cif_bs}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_ga_bs}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_iva_bs}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_ice_bs}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_iehd_bs}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_icd_bs}
                                </td>
                                <td class="text-right">
                                    ${rep.dui_declarado_tributos_bs}
                                </td>
                                <td class="text-center">
                                    ${rep.orden_estado}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_trib_ga}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_trib_iva}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_trib_ice}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_trib_iehd}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_trib_icd}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_trib_total}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_sancion}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_multa_contrav}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_multa_contrab}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_multa_contrab_delito}
                                </td>
                                <td class="text-right">
                                    ${rep.recuperado_total_recuperado}
                                </td>
                                <td class="text-right">
                                    ${rep.facilidades_cuota_inicial}
                                </td>
                                <td class="text-right">
                                    ${rep.facilidades_garantia}
                                </td>
                                <td class="text-right">
                                    ${rep.facilidades_saldo}
                                </td>
                                <td class="text-center">
                                    ${rep.facilidades_usuario}
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
      Anb.form.submit('#form-reporte_recuperacion_dui', function (form) {
          Anb.form.cleanErrors(form);
          if (Anb.validate.run(form)) {
              console.log('Enviado!');
              Anb.loading.show()
              form.submit();
          }
      });
      var DT = new Anb.datatable( {
          filter : true, "iDisplayLength" :  - 1, oLanguage :  {
              "sSearch" : '<i class="glyphicon glyphicon-search"></i> Buscar: '
          }

      });
  });
</script>