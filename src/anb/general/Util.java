package anb.general;


import anb.persistencia.GeneralDao;

import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;


/*
*   Nombre de la clase: Util, metodos generales que se utilizaran en todo el sistema
*
*   Fecha creación, Fecha Modificación
*
*   Autor creador, Autor Modificador
*/

public class Util {
    
    public static void main(String args[]) {
        Calendar calendario = GregorianCalendar.getInstance();
        Date fecha = calendario.getTime();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyyHHmmss");
        byte[] encodedBytes = Base64.encodeBase64(String.valueOf(Util.randomWord(5) + formato.format(fecha)).getBytes());
        System.out.println(new String(encodedBytes));
    }
        
    public static Boolean mostrar_botones(String gestion,String usuario, String opcion) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try{
            res = dao.mostrar_botones(gestion, usuario, opcion);
        }
        catch(Exception ex){
            res = false;
        }
        return res;
    }
    
    public static Boolean mostrar_botones_concluir(String codigo, String usuario, String opcion) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try{
            res = dao.mostrar_botones_concluir(codigo, usuario, opcion);
        }
        catch(Exception ex){
            res = false;
        }
        return res;
    }
    
    public static Boolean llenar_valores(String gestion,String usuario, String opcion, String nivel) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try{
            res = dao.llenar_valores(gestion, usuario, opcion, nivel);
        }
        catch(Exception ex){
            res = false;
        }
        return res;
    }
    
    public static String completarCeros6(String numero) {
        String res = "";
        
        if(numero.length() == 6)
            res = numero;    
        if(numero.length() == 5)
            res = "0"+numero;    
        if(numero.length() == 4)
            res = "00"+numero;    
        if(numero.length() == 3)
            res = "000"+numero;    
        if(numero.length() == 2)
            res = "0000"+numero;    
        if(numero.length() == 1)
            res = "00000"+numero;   
        
        return res;
    }
    
    public static String numeroGerencia(String gerencia) {
        String res = "";
        if(gerencia.equals("GNF"))
            res = "%";
        if(gerencia.equals("GRL"))
            res = "2";    
        if(gerencia.equals("GRC"))
            res = "3";    
        if(gerencia.equals("GRS"))
            res = "7";    
        if(gerencia.equals("GRO"))
            res = "4";    
        if(gerencia.equals("GRP"))
            res = "5";    
        if(gerencia.equals("GRT"))
            res = "6";    
                
        return res;
    }
    
    public static String gusuarioGerencia(String gerencia) {
        String res = "";
        
        if(gerencia.equals("15"))
            res = "GNF";
        if(gerencia.equals("19"))
            res = "GRL";    
        if(gerencia.equals("20"))
            res = "GRO";    
        if(gerencia.equals("21"))
            res = "GRC";    
        if(gerencia.equals("22"))
            res = "GRS";    
        if(gerencia.equals("23"))
            res = "GRT";    
        if(gerencia.equals("24"))
            res = "GRP";  
        /*
          15  GERENCIA NACIONAL DE FISCALIZACION
          19  GERENCIA REGIONAL LA PAZ    
          20  GERENCIA REGIONAL ORURO     
          21  GERENCIA REGIONAL COCHABAMBA
          22  GERENCIA REGIONAL SANTA CRUZ
          23  GERENCIA REGIONAL TARIJA    
          24  GERENCIA REGIONAL POTOSI  
        */                
        return res;
    }
    
    public static String completarCeros7(String numero) {
        String res = "";
        if(numero.length() == 7)
            res = numero;
        if(numero.length() == 6)
            res = "0"+numero;    
        if(numero.length() == 5)
            res = "00"+numero;    
        if(numero.length() == 4)
            res = "000"+numero;    
        if(numero.length() == 3)
            res = "0000"+numero;    
        if(numero.length() == 2)
            res = "00000"+numero;    
        if(numero.length() == 1)
            res = "000000"+numero;   
        
        return res;
    }
    
    public static String completarCeros8(String numero) {
        String res = "";
        
        if(numero.length() == 8)
            res = numero;    
        if(numero.length() == 7)
            res = "0"+numero;    
        if(numero.length() == 6)
            res = "00"+numero;    
        if(numero.length() == 5)
            res = "000"+numero;    
        if(numero.length() == 4)
            res = "0000"+numero;    
        if(numero.length() == 3)
            res = "00000"+numero;    
        if(numero.length() == 2)
            res = "000000"+numero;    
        if(numero.length() == 1)
            res = "0000000"+numero;   
        
        return res;
    }
    
    public static String randomWord(int length) {
        Random random = new Random();
        StringBuilder word = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            word.append((char)('a' + random.nextInt(26)));
        }

        return word.toString();
    }
    
    public static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' ||
                       chars[i] == '\'') { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }
    
    public static void isAjax(HttpServletRequest request, HttpServletResponse response) {
        if (!"XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
            Util.redirect(request, response, "/index.do");
        }
    }
    
    public static void redirect(HttpServletRequest request, HttpServletResponse response, String url) {
        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (ServletException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
               
    public static String join(String elements[], String separator) {
        String text = "";
        for (String el : elements) {
            text += el + separator;
        }
        return text.replaceAll("\\" + separator + "+$","");
    }
    
    public static void noCache(HttpServletResponse response) {
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0); // Proxies.
    }
           
}