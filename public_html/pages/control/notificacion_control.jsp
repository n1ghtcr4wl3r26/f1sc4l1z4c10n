<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>NOTIFICACION CONTROL</strong>
        </h4>
    </div>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-notificacioncontrol" action="notificacioncontrol.do">
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
            <div class="panel-heading">
                <h4 class="panel-title">
                    <strong>REGISTRAR NOTIFICACION DEL CONTROL</strong>
                </h4>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">Fecha de Notificaci&oacute;n:</label>
                <div class="col-sm-3">
                    <html:text property="fechaNotificacion" styleId="fechaNotificacion"
                               styleClass="form-control required datepicker" size="30" maxlength="10"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">Tipo de Notificaci&oacute;n:</label>
                <div class="col-sm-3">
                    <html:select property="tipoNotificacion" styleId="tipoNotificacion" styleClass="form-control required">
                        <html:option value="-">-- Seleccione el Tipo --</html:option>
                        <html:option value="ELECTRONICA">ELECTRONICA</html:option>
                        <html:option value="PERSONAL">PERSONAL</html:option>
                        <html:option value="CEDULA">CEDULA</html:option>
                        <html:option value="EDICTO">EDICTO</html:option>
                        <html:option value="TACITO">TACITO</html:option>
                    </html:select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">Observaci&oacute;n:</label>
                <div class="col-sm-3">
                    <html:text property="observacion" styleId="observacion;" styleClass="form-control required"
                               size="30" maxlength="30"/>
                </div>
            </div>
            <div class="btn-container">
                <button type="submit" id="boton" onclick="consultar()" class="btn btn-primary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Grabar&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
            </div>
        </html:form>
    </div>
</div>
<script>
  $(document).ready(function () {
      Anb.form.submit('#form-notificacioncontrol', function (form) {
          Anb.form.cleanErrors(form);
          if (Anb.validate.run(form)) {
              console.log('Enviado!');
              Anb.loading.show()
              form.submit();
          }
      });
  });

  function consultar() {
      $("#opcion").val('ASIGNA');
  }
</script>