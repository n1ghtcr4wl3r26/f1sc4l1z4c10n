<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>ASIGNACION DE FISCALIZADOR</strong>
        </h4>
    </div>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-asigna" action="asignaidx.do">
            <input type="hidden" name="opcion" id="opcion"/>
            <div class="form-group">
                <label class="col-sm-2 control-label">N&uacute;mero Control Memorizado:</label>
                <div class="col-sm-2">
                    <html:text property="codigo" styleId="codigo" maxlength="15" styleClass="form-control required" size="15"/>
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
        /*Anb.form.submit('#form-asigna', function (form) {
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
        Anb.form.cleanErrors(form);           
            if (Anb.validate.run(form)) {
                console.log('Enviado!');
                Anb.loading.show()                
                form.submit();
            }
    }
</script>