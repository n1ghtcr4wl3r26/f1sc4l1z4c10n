<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="anb.bean.*"%>
<%@ page import="anb.general.*"%>
<%@ page import="anb.entidades.RiesgoPA"%>
<%@ page import="java.sql.*, oracle.jdbc.driver.*, java.util.*, java.text.*"%>
<%@ page import="oracle.jdbc.OracleTypes"%>
<style type="text/css">
    table, td {
        font-family: 'Times New Roman', 'Arial Black', times, Serif;
        border-color: Black;
        border-style: solid;
        font-size: 12px;
    }

    table {
        border-width: 0 0 1px 1px;
        border-spacing: 0px;
        border-collapse: collapse;
        font-size: 12px;
    }

    td {
        margin: 0;
        padding: 7px;
        border-width: 1px 1px 1px 1px;
        background-color: White;
    }
</style>
<div id="formulario">
    <%        
    ReporteForm bean = new ReporteForm();
    String gestion = request.getParameter("gestion");
    String aduana = request.getParameter("aduana");
    String numero = request.getParameter("numero");
    bean = (ReporteForm)request.getSession().getAttribute("ReporteForm");  
    List<RiesgoPA> lista = Util.listariesgoPA(gestion,aduana,numero);
    %>
    <table width="500px" style="border-width:0px;border-style:none;">     
        <caption>LISTADO DE ITEMS CON OBSERVACIONES</caption>       
         <tr>
            <th width='10%'>&nbsp;</th>
            <th width='25%'>&nbsp;</th>
            <th width='15%'>&nbsp;</th>
            <th width='60%'>&nbsp;</th>
        </tr>       
        <tr>
            <th>No.</th>
            <th>Declaraci&oacute;n</th>
            <th>&Iacute;tem</th>
            <th>Subpartida</th>
        </tr>         
        <%
        int c=1;
        for(int i = 0; i <  lista.size(); i++) {
       
        %>
        <tr>
            <td>
                <%=c%>
            </td>
            <td>
                <%=lista.get(i).getGestion()%>/ 
                <%=lista.get(i).getAduana()%>/C- 
                <%=lista.get(i).getNumero()%>
            </td>
            <td>
                <%=lista.get(i).getItem()%>
            </td>
            <td>
                <%=lista.get(i).getPartida()%>
            </td>
        </tr>         
        <%
        }
        %>              
    </table>
    </div>