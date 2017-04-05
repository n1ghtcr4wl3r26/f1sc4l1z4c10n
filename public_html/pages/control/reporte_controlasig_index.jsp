<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>RESUMEN DE CONTROLES ASIGNADOS</strong>
        </h4>
    </div>
    <div class="modal-body form-horizontal">
        <html:form styleId="form-reportecontrol" action="reportecontrolasigidx.do">
            <html:hidden property="codigo" styleId="codigo"/>
            <input type="hidden" name="opcion" id="opcion"/>
            <div class="form-group">
                <label class="col-sm-4 control-label">Usuario Supervisor:</label>
                <label class="col-sm-2 control-label">Fecha Desde:</label>
                <label class="col-sm-2 control-label">Fecha Hasta:</label>
            </div>
            <div class="form-group">
                <div class="col-sm-4">
                    <html:select property="funcionario" styleId="funcionario" styleClass="form-control required">
                        <html:option value="-">Seleccione...</html:option>
                        <html:option value="%">Todos los Funcionarios</html:option>
                        <c:forEach items="${fiscalizadores}" var="fis">
                            <html:option value="${fis.codigo}">${fis.nombre}</html:option>
                        </c:forEach>
                    </html:select>
                </div>
                <div class="col-sm-2">
                    <html:text property="ffecini" styleId="ffecini" styleClass="form-control datepicker required" size="30" maxlength="10" />
                </div>    
                <div class="col-sm-2">
                    <html:text property="ffecfin" styleId="ffecfin" styleClass="form-control datepicker required" size="30" maxlength="10" />
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
        Anb.form.cleanErrors(form);           
            if (Anb.validate.run(form)) {
                console.log('Enviado!');
                Anb.loading.show()                
                form.submit();
            }
    }
</script>