<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<%@ page import="anb.general.*"%>
<!DOCTYPE html>
<html:html lang="es">
<head>
    <title>${sessionScope.NOMBRE_SISTEMA}</title>  
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Aplicacion Crefas" />
    <meta name="Author" content="DDS" lang="es"/>
    
    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css?${sessionScope.VERSION_ASSETS}">
    <link rel="stylesheet" type="text/css" href="lib/datepicker/css/bootstrap-datepicker.min.css?${sessionScope.VERSION_ASSETS}">
    <link rel="stylesheet" type="text/css" href="lib/datatables/css/jquery.dataTables.min.css?${sessionScope.VERSION_ASSETS}">
    <link rel="stylesheet" type="text/css" href="lib/font-awesome/css/font-awesome.min.css?${sessionScope.VERSION_ASSETS}">
    <link rel="stylesheet" type="text/css" href="lib/select2/css/select2.min.css?${sessionScope.VERSION_ASSETS}">
    <link rel="stylesheet" type="text/css" href="css/main.css?${sessionScope.VERSION_ASSETS}"/>
    <script src="lib/jquery/jquery-1.11.2.min.js"></script>
</head>
<body class="login">
<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            <strong>LISTA DE DOCUMENTOS DMA</strong>
        </h4>
    </div>
    <%  
        String param = request.getParameter("p");    
        param = param.replace(" ","+");
        String ress = Util.Desencriptar(param);   
        int idx1 = ress.indexOf("&");
        int idx2 = ress.indexOf("&", idx1+1);
        int idx3 = ress.indexOf("&", idx2+1);
        int idx4 = ress.indexOf("&", idx3+1);
        int idx5 = ress.indexOf("&", idx4+1);
        int conf = ress.length();
        String pass = ress.substring(idx5+1, conf);
        String[] d = ress.split("&"); 
        String gestion = d[0];
        String aduana = d[1];
        String numero = d[2];
        String token = d[3];
        String usuario = d[4];
        String marca = Util.devuelve_marca_fecha();
        if (token.equals(marca)){
        %>
        <div class="modal-body form-horizontal">
            <html:form styleId="form-cargadescargadma" action="cargadescargadma.do">           
                <div class="table-responsive">
                    <table class="table table-striped table-hover" id="main-3table">
                        <thead>
                            <tr>
                                <th>N&uacute;mero</th>
                                <th>Declaraci&oacute;n</th>
                                <th>DAV/FDM</th>
                                <th class="noExport">Acciones</th>
                            </tr>
                        </thead>                     
                        <tbody>
                           <%=Util.devuelveListaDMA(gestion, aduana, numero, usuario, pass)%>
                        </tbody>
                    </table>
                </div>
            </html:form>
        </div>
        <%
        } else {
        %>
        <div class="modal-body form-horizontal">
            LA SESSION HA CADUCADO
        </div>
        <%
        }
        %>
</div>
</body>
</html:html>