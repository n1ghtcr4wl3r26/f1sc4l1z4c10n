<%@ page import="java.io.*"%><%String dma = request.getParameter("dma");response.setHeader("Content-Disposition","attachment;filename="+dma);response.setContentType("application/octet-stream");
try
{
    FileInputStream archivo = new FileInputStream("/u03/oracle/user_projects/data/fiscalizacion/dma/xml/"+dma);
    int longitud = archivo.available();
    byte[] datos = new byte[longitud];
    archivo.read(datos);
    archivo.close();
    ServletOutputStream ouputStream = response.getOutputStream();
    ouputStream.write(datos);
    ouputStream.flush();
    ouputStream.close();
}
catch(Exception e)
{ 
    e.printStackTrace();
}%>