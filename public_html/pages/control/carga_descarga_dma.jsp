<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>CARGA Y DESCARGA DMA</strong>
        </h4>
    </div>
    <% 
        CargaDescargaDmaForm gen = (CargaDescargaDmaForm)request.getAttribute("CargaDescargaDmaForm");
    %>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-cargadescargadma" action="cargadescargadma.do">
            <html:hidden property="codigo" styleId="codigo"/>
            <html:hidden property="mostrarid" styleId="mostrarid"/>
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
            
            
             
           
            
            
            <h4>
                <strong>LISTA DEL ALCANCE DE LA FISCALIZACIÓN</strong>
            </h4>            
            <div class="table-responsive">
            <table class="table table-striped table-hover" id="main-3table">
                <thead>
                    <tr>
                        <th>N&uacute;mero</th>
                        <th>Tipo</th>
                        <th>Documento</th>
                        <th>Observaci&oacute;n</th>
                        <th class="noExport">Acciones</th>
                    </tr>
                </thead>
                <tbody>                    
                    <c:forEach items="${tramites}" var="tra">
                    <tr>
                    <td>${tra.numero}</td>
                        <td class="text-left">${tra.tipoTramite}</td>
                        <td class="text-left">${tra.tramite}</td>
                        <td class="text-left">${tra.observacion}</td>
                        <td>
                            <button class="deletebtn btn btn-info btn-sm " 
                                    type="button"
                                    title="Mostrar Ítems de la Declaración"
                                    data-item="${tra.codigo}"
                                    data-id="${tra.codigo}">
                                <i class="fa fa-close"></i> Ver Ítems
                            </button>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>   
            </div>
           
             <% 
            if(!(gen.getOpcion() == null) && (gen.getOpcion().equals("MOSTRAR"))) {
            %>
           
            <br>
            <div class="panel-title imp" id="macro">
                <strong>LISTA DAV</strong>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">DAV:</label>
                <div class="col-sm-4">
                    <html:select property="dav" styleClass="form-control required">
                        <option value="-">Seleccione...</option>
                        <html:optionsCollection name="lista_dma" value="codigo" label="descripcion"/>
                    </html:select>
                </div>
                 <div class="btn-container">
                    <button type="submit" id="boton" onclick="consultar()" class="btn btn-primary" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Procesar&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>            
                </div>
                <div class="form-group">
                    <label class="label-message-required">
                        * Campos Obligatorios
                    </label>
                </div>
            </div>
            <%
              
            }
            %>
            
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
          if ($("#opcion").val() =='MOSTRAR')
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
  
</script>