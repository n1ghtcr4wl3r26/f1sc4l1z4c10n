<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>CARGA Y DESCARGA DMA - DILIGENCIA</strong>
        </h4>
    </div>
    <% 
        CargaDescargaDmaForm gen = (CargaDescargaDmaForm)request.getAttribute("CargaDescargaDmaForm");
    %>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-cargadescargadma" action="cargadescargadilig.do" enctype="multipart/form-data">
            <html:hidden property="codigo" styleId="codigo"/>
            <html:hidden property="mostrarid" styleId="mostrarid"/>
            <html:hidden property="dma" styleId="dma"/>     
            <html:hidden property="gestion" styleId="gestion"/>  
            <html:hidden property="aduana" styleId="aduana"/> 
            <html:hidden property="numero" styleId="numero"/> 
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
            <br/>
            <br/>
            <table width="100%">
                <tr>
                    <td>
                        <% //if(off4.equals("0")){
                        if( gen.getDmaxml() != null && gen.getDmaxml().equals("CORRECTO") ){ 
                            String tramite = "Descarga.jsp?dma=" + gen.getDma()+".xml";
                        %>
                            <table align="left">
                                <tbody >
                                    <tr>
                                        <td>
                                            <a href="<%= tramite%>" target="_blank" style="font-size:130%; color:#003366">Descargar Archivo XML: &nbsp; <%= gen.getDma()+".xml"  %></a>
                                        </td>                                        
                                    </tr>
                                </tbody>
                            </table>
                        <%  
                        }
                        %>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="button" class="btn btn-primary" name="descargar" value="Descargar DMA Resumen" onclick="ejecutaXml('8');"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        &nbsp;
                        <br/>
                        &nbsp;
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:file property="docXml" size="60"/>
                        <br/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="button" class="btn btn-primary" name="cargar" value="Cargar DMA" onclick="ejecutaXml2('5');"/>
                    </td>
                </tr>            
            </table>
        </html:form>
    </div>
</div>
<script>
  $(document).ready(function () {
  
        
         var DT = new Anb.datatable({
            filter: false,
            columnDefs: [{
                targets: "datatable-nosort",
                orderable: false
            }],
            "iDisplayLength": -1,
            oLanguage: {"sSearch": '<i class="glyphicon glyphicon-search"></i> Buscar: ' }

        });
      
      Anb.form.submit('#form-cargadescargadma', function (form) {
          Anb.form.cleanErrors(form);
          if ($("#opcion").val() =='DESCARGA')
                form.submit();
            else
            if ($("#opcion").val() =='CARGA')
                form.submit();
            else
          if (Anb.validate.run(form)) {
              console.log('Enviado!');
              $("#opcion").val('CONSULTAR2'); 
              Anb.loading.show()
              form.submit();
          }
      });
     
      $('.deletebtn').on('click', function() {           
            var id = this.getAttribute('data-item');
            var dui = this.getAttribute('data-id');
            $("#mostrarid").val(id);
            $("#opcion").val('MOSTRAR'); 
            $("#form-cargadescargadma").submit();
      });
  });
  function consultar(){
      $("#opcion").val('CONSULTAR3'); 
  }
  
  function ejecutaXml(aux){
      var f=document.forms["CargaDescargaDmaForm"];    
      $("#opcion").val('DESCARGA'); 
      f.submit();
  }
  function ejecutaXml2(aux){
      var f=document.forms["CargaDescargaDmaForm"];    
      $("#opcion").val('CARGA'); 
      f.submit();
  }

  
</script>