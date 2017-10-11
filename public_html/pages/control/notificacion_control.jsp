<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>NOTIFICACI&Oacute;N CONTROL</strong>
        </h4>
    </div>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-notificacioncontrol" action="notificacioncontrol.do">
            <html:hidden property="codigo" styleId="codigo"/>
            <html:hidden property="esapoderado" styleId="esapoderado"/>
            <input type="hidden" name="opcion" id="opcion"/>
            <div class="form-group">
                <label class="col-sm-2 control-label">C&oacute;digo:</label>
                <div class="col-sm-2">
                    ${infoControl.codigo}
                </div>
                <label class="col-sm-2 control-label">C&oacute;digo Control:</label>
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
                <label class="col-sm-2 control-label">N&uacute;mero de Identificaci&oacute;n:</label>
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
                    <strong>REGISTRAR NOTIFICACI&Oacute;N DEL CONTROL</strong>
                </h4>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">Fecha de Notificaci&oacute;n:</label>
                <div class="col-sm-3">
                    <html:text property="fechaNotificacion" styleId="fechaNotificacion"
                               styleClass="form-control required datepicker date-less-than" size="30" maxlength="10"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">Tipo de Notificaci&oacute;n:</label>
                <div class="col-sm-3">
                    <html:select property="tipoNotificacion" styleId="tipoNotificacion"
                                 styleClass="form-control required">
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
                    <textarea name="observacion" id="observacion" class="form-control required" data-maxlength="100"
                              onkeyup="Textarea_Sin_Enter(event.keyCode, event.which, 'observacion');">${NotificacionControlForm.observacion}</textarea>
                </div>
            </div>
            <br/>
            <div id="personal-panel" style="display:none">
                <div class="form-group">
                    <label class="col-sm-3 control-label">Es apoderado:</label>
                    <div class="col-sm-3">
                        <input type="checkbox" style="width:13px;height:13px" name="chkesapoderado" id="chkesapoderado"
                               class="chkesapoderado"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label person ">CI:</label>
                    <div class="col-sm-3">
                        <html:text property="nroCIPersona" styleId="nroCIPersona" styleClass="form-control "
                                   readonly="true" size="30" maxlength="10"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label person ">CI Expedici&oacute;n:</label>
                    <div class="col-sm-3">
                        <html:select property="expCIPersona" styleId="expCIPersona" styleClass="form-control "
                                     disabled="true">
                            <html:option value="-">Seleccione...</html:option>
                            <html:option value="LP">La Paz</html:option>
                            <html:option value="CB">Cochabamba</html:option>
                            <html:option value="SC">Santa Cruz</html:option>
                            <html:option value="PN">Pando</html:option>
                            <html:option value="PT">Potosi</html:option>
                            <html:option value="TR">Tarija</html:option>
                            <html:option value="CH">Chuquisaca</html:option>
                            <html:option value="BN">Beni</html:option>
                            <html:option value="OR">Oruro</html:option>
                        </html:select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label person ">Nombres:</label>
                    <div class="col-sm-5">
                        <html:text property="nombrePersona" styleId="nombrePersona" styleClass="form-control "
                                   readonly="true" size="30" maxlength="30"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label person ">Apellido Paterno:</label>
                    <div class="col-sm-5">
                        <html:text property="apPatPersona" styleId="apPatPersona" styleClass="form-control "
                                   readonly="true" size="30" maxlength="30"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label person ">Apellido Materno:</label>
                    <div class="col-sm-5">
                        <html:text property="apMatPersona" styleId="apMatPersona" styleClass="form-control "
                                   readonly="true" size="30" maxlength="30"/>
                    </div>
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
      if ($('#tipoNotificacion').val() == "PERSONAL") {
          $('#personal-panel').show();
          if ($('#esapoderado').val() == "SI") {
              $('#chkesapoderado').prop('checked', true).attr('checked', 'checked');
              $('#nroCIPersona').removeAttr("readonly");
              $('#expCIPersona').removeAttr("disabled");
              $('#nombrePersona').removeAttr("readonly");
              $('#apPatPersona').removeAttr("readonly");
              $('#apMatPersona').removeAttr("readonly");
              $('#nroCIPersona').addClass('required');
              $('#expCIPersona').addClass('required');
              $('#nombrePersona').addClass('required');
              $('#apPatPersona').addClass('required');
              $('#apMatPersona').addClass('required');
              $('.person').addClass('label-required');
          }
          else {
              $('#chkesapoderado').prop('checked', false).removeAttr('checked');
              $('#nroCIPersona').attr('readonly', 'true');
              $('#expCIPersona').attr('disabled', 'true');
              $('#expCIPersona').val('-');
              $('#nombrePersona').attr('readonly', 'true');
              $('#apPatPersona').attr('readonly', 'true');
              $('#apMatPersona').attr('readonly', 'true');
              $('#nroCIPersona').removeClass('required');
              $('#expCIPersona').removeClass('required');
              $('#nombrePersona').removeClass('required');
              $('#apPatPersona').removeClass('required');
              $('#apMatPersona').removeClass('required');
              $('.person').removeClass('label-required');
          }
      }

      Anb.form.submit('#form-notificacioncontrol', function (form) {
          Anb.form.cleanErrors(form);
          if (Anb.validate.run(form)) {
              console.log('Enviado!');
              Anb.loading.show()
              form.submit();
          }
      });
      $('#tipoNotificacion').change(function () {
          if ($('#tipoNotificacion').val() == "PERSONAL") {
              $('#personal-panel').show();
              $('#esapoderado').val('NO');
              $('#nroCIPersona').attr('readonly', 'true');
              $('#expCIPersona').attr('disabled', 'true');
              $('#nombrePersona').attr('readonly', 'true');
              $('#apPatPersona').attr('readonly', 'true');
              $('#apMatPersona').attr('readonly', 'true');
              $('#nroCIPersona').removeClass('required');
              $('#expCIPersona').removeClass('required');
              $('#nombrePersona').removeClass('required');
              $('#apPatPersona').removeClass('required');
              $('#apMatPersona').removeClass('required');
              $('.person').removeClass('label-required');
              $('#nroCIPersona').val('');
              $('#expCIPersona').val('-');
              $('#nombrePersona').val('');
              $('#apPatPersona').val('');
              $('#apMatPersona').val('');
          }
          else {
              $('#esapoderado').val('NO');
              $('#personal-panel').hide();
              $('#nroCIPersona').attr('readonly', 'true');
              $('#expCIPersona').attr('disabled', 'true');
              $('#nombrePersona').attr('readonly', 'true');
              $('#apPatPersona').attr('readonly', 'true');
              $('#apMatPersona').attr('readonly', 'true');
              $('#nroCIPersona').removeClass('required');
              $('#expCIPersona').removeClass('required');
              $('#nombrePersona').removeClass('required');
              $('#apPatPersona').removeClass('required');
              $('#apMatPersona').removeClass('required');
              $('.person').removeClass('label-required');
              $('#nroCIPersona').val('');
              $('#expCIPersona').val('-');
              $('#nombrePersona').val('');
              $('#apPatPersona').val('');
              $('#apMatPersona').val('');
          }
      });
      $("#chkesapoderado").click(function (event) {
          if ($(this).is(":checked")) {
              $('#esapoderado').val('SI');
              $('#nroCIPersona').removeAttr("readonly");
              $('#expCIPersona').removeAttr("disabled");              
              $('#nombrePersona').removeAttr("readonly");
              $('#apPatPersona').removeAttr("readonly");
              $('#apMatPersona').removeAttr("readonly");
              $('#nroCIPersona').addClass('required');
              $('#expCIPersona').addClass('required');
              $('#nombrePersona').addClass('required');
              $('#apPatPersona').addClass('required');
              $('#apMatPersona').addClass('required');
              $('.person').addClass('label-required');
              $('#NroCIPersona').val('');
              $('#expCIPersona').val('-');
              $('#nombrePersona').val('');
              $('#apPatPersona').val('');
              $('#apMatPersona').val('');
          }
          else {
              $('#esapoderado').val('NO');
              $('#nroCIPersona').attr('readonly', 'true');
              $('#expCIPersona').attr('disabled', 'true');              
              $('#nombrePersona').attr('readonly', 'true');
              $('#apPatPersona').attr('readonly', 'true');
              $('#apMatPersona').attr('readonly', 'true');
              $('#nroCIPersona').removeClass('required');
              $('#expCIPersona').removeClass('required');
              $('#nombrePersona').removeClass('required');
              $('#apPatPersona').removeClass('required');
              $('#apMatPersona').removeClass('required');
              $('.person').removeClass('label-required');
              $('#nroCIPersona').val('');
              $('#expCIPersona').val('-');
              $('#nombrePersona').val('');
              $('#apPatPersona').val('');
              $('#apMatPersona').val('');
          }
      });
  });

  function consultar() {
      $("#opcion").val('ASIGNA');
  }
</script>