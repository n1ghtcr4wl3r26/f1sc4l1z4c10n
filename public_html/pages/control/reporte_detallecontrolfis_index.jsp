<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>DETALLE Y ESTADO CONTROLES ASIGNADOS FISCALIZADOR</strong>
        </h4>
    </div>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-reportecontrol" action="reportedetallecontrolfisidx.do">
            <html:hidden property="codigo" styleId="codigo"/>
            <input type="hidden" name="opcion" id="opcion"/>
            <div class="form-group">
                <label class="col-sm-2 control-label label-required">Fecha Desde:</label>
                <label class="col-sm-2 control-label label-required">Fecha Hasta:</label>
            </div>
            <div class="form-group">
                <div class="col-sm-2">
                    <html:text property="ffecini" styleId="ffecini" styleClass="form-control datepicker required date-less-than" size="30" maxlength="10" />
                </div>    
                <div class="col-sm-2">
                    <html:text property="ffecfin" styleId="ffecfin" styleClass="form-control datepicker required date-less-than" size="30" maxlength="10" />
                </div>   
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label label-required">Tipo de Trámite:</label>
                <label class="col-sm-4 control-label label-required">Estado del Control:</label>
            </div>
            <div class="form-group">
                <div class="col-sm-4">
                    <html:select property="ftipotramite" styleClass="form-control required">
                        <html:option value="-">Seleccione...</html:option>
                        <html:option value="%">TODOS</html:option>
                        <html:option value="DIFERIDO">CONTROL DIFERIDO</html:option>
                        <html:option value="POSTERIOR">FISCALIZACION POSTERIOR</html:option>
                    </html:select>
                </div>
                <div class="col-sm-4">
                    <html:select property="festado" styleClass="form-control required">
                        <html:option value="-">Seleccione...</html:option>
                        <html:option value="%">TODOS</html:option>
                        <html:option value="ASIGNADO">ASIGNADO</html:option>
                        <html:option value="NOTIFICADO">NOTIFICADO</html:option>
                        <html:option value="CONCLUIDO">CONCLUIDO</html:option>
                    </html:select>
                </div>
            </div>
            <div class="btn-container">
                <button type="submit" id="boton" onclick="consultar()" class="btn btn-primary" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Consultar&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>            
            </div>
            <div class="form-group">
                <label class="label-message-required">
                    * Campos Obligatorios
                </label>
            </div>
        </html:form>
    </div>
</div>
<script>
    $(document).ready(function () {
        /*Anb.form.submit('#form-liquidacion', function (form) {
            Anb.form.cleanErrors(form);           
            if (Anb.validate.run(form)) {
                console.log('Enviado!');
                Anb.loading.show()                
                form.submit();
            }
        });*/
    });
    function consultar(){
        $("#opcion").val('CONSULTAR');  
        Anb.form.submit('#form-reportecontrol', function (form) {
        Anb.form.cleanErrors(form);           
            if (Anb.validate.run(form)) {
                console.log('Enviado!');
                Anb.loading.show()                
                form.submit();
            }
        });
    }
</script>