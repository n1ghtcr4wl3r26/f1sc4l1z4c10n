package anb.general;


import anb.entidades.RiesgoPA;

import anb.persistencia.GeneralDao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.security.MessageDigest;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.struts.upload.FormFile;


/*
*   Nombre de la clase: Util, metodos generales que se utilizaran en todo el sistema
*
*   Fecha creación, Fecha Modificación
*
*   Autor creador, Autor Modificador
*/

public class Util {

    private static String secretKey = "aduananacionaldeboliviamiradeclaracion2015";

    public static String Encriptar(String texto) {

        String base64EncryptedString = "";

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return base64EncryptedString;
    }

    public static String Desencriptar(String textoEncriptado) throws Exception {

        String base64EncryptedString = "";

        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");

            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] plainText = decipher.doFinal(message);

            base64EncryptedString = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return base64EncryptedString;
    }

    public static String devuelveListaDMA(String gestion, String aduana, String numero, String usuario, String pass) {
        String res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.devuelveListaDMA(gestion, aduana, numero, usuario, pass);
        } catch (Exception ex) {
            res = "";
        }
        return res;
    }

    public static String devuelveRutaMira() {
        String res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.devuelveRutaMira();
        } catch (Exception ex) {
            res = "";
        }
        return res;
    }

    public static String devuelveNombreMira() {
        String res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.devuelveNombreMira();
        } catch (Exception ex) {
            res = "";
        }
        return res;
    }

    public static List<RiesgoPA> listariesgoPA(String gestion, String aduana, String numero) {
        GeneralDao neg = new GeneralDao();
        List<RiesgoPA> res = new ArrayList<RiesgoPA>();
        try {
            res = neg.listaRiesgoPA(gestion, aduana, numero);
        } catch (Exception ex) {
        }
        return res;
    }

    public static Boolean actualiza_valores_hoja_trabajo(String id_alcance, String usuario) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.actualiza_valores_hoja_trabajo(id_alcance, usuario);
        } catch (Exception ex) {
            res = false;
        }
        return res;
    }

    public static String devuelve_marca() {
        SimpleDateFormat fFecha = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(fecha.getTime());
        String fecmarca = fFecha.format(fecha.getTime());
        return fecmarca;
    }
    
    public static String devuelve_marca_fecha() {
        SimpleDateFormat fFecha = new SimpleDateFormat("yyyyMMdd");
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(fecha.getTime());
        String fecmarca = fFecha.format(fecha.getTime());
        return fecmarca;
    }

    public static String subePDF(FormFile filepdf, String nomArch, String ubicacion) {
        try {
            int tam = 0;
            FormFile file = filepdf;
            if (!file.getFileName().equals("")) {
                tam = file.getFileSize();
                if (file.getFileSize() <= 0)
                    return "El archivo que envio no tiene el formato PDF";
                if (file.getFileSize() > 1024 * 1024 * 2) //restriccion de tamaño 2mb maximo
                    return "El archivo supera los 2mb permitidos";
                String str = file.getFileName();
                boolean resultado = str.toLowerCase().endsWith(".pdf");
                if (!resultado)
                    return "El archivo que envio no tiene el formato PDF";
                File subdir = new File("/u03/oracle/user_projects/data/fiscalizacion/" + ubicacion + "/");
                if (!subdir.exists())
                    subdir.mkdir();
                InputStream stream = file.getInputStream();
                String fil = subdir + "/" + nomArch;
                OutputStream bos = new FileOutputStream(fil);
                int bytesRead = 0;
                byte buffer[] = new byte[8192];
                while ((bytesRead = stream.read(buffer, 0, 8192)) != -1)
                    bos.write(buffer, 0, bytesRead);
                bos.close();
                return "CORRECTO";
            } else {
                return "Error al cargar el archivo";
            }
        } catch (Exception e) {
            return "ERROR " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        Calendar calendario = GregorianCalendar.getInstance();
        Date fecha = calendario.getTime();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyyHHmmss");
        byte[] encodedBytes =
            Base64.encodeBase64(String.valueOf(Util.randomWord(5) + formato.format(fecha)).getBytes());
        System.out.println(new String(encodedBytes));
    }

    public static Boolean mostrar_botones(String gestion, String usuario, String opcion) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.mostrar_botones(gestion, usuario, opcion);
        } catch (Exception ex) {
            res = false;
        }
        return res;
    }

    public static Boolean esFechaMenorIgualAHoy(String fecha) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.esFechaMenorIgualAHoy(fecha);
        } catch (Exception ex) {
            res = false;
        }
        return res;
    }

    public static Boolean esFecha(String fecha) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.esFecha(fecha);
        } catch (Exception ex) {
            res = false;
        }
        return res;
    }

    public static String devuelve_dma(String codigo, String dav) {
        String res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.devuelve_dma(codigo, dav);
        } catch (Exception ex) {
            res = "";
        }
        return res;
    }

    public static String devuelve_alc_gestion(String codigo) {
        String res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.devuelve_alc_gestion(codigo);
        } catch (Exception ex) {
            res = "";
        }
        return res;
    }

    public static String devuelve_alc_aduana(String codigo) {
        String res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.devuelve_alc_aduana(codigo);
        } catch (Exception ex) {
            res = "";
        }
        return res;
    }

    public static String devuelve_alc_numero(String codigo) {
        String res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.devuelve_alc_numero(codigo);
        } catch (Exception ex) {
            res = "";
        }
        return res;
    }

    public static Boolean mostrar_botones_concluir(String codigo, String usuario, String opcion) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.mostrar_botones_concluir(codigo, usuario, opcion);
        } catch (Exception ex) {
            res = false;
        }
        return res;
    }

    public static Boolean llenar_valores(String gestion, String usuario, String opcion, String nivel) {
        Boolean res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.llenar_valores(gestion, usuario, opcion, nivel);
        } catch (Exception ex) {
            res = false;
        }
        return res;
    }

    public static String nombrecompleto(String codigo) {
        String res;
        GeneralDao dao = new GeneralDao();
        try {
            res = dao.nombrecompleto(codigo);
        } catch (Exception ex) {
            res = "";
        }
        return res;
    }

    public static String completarCeros6(String numero) {
        String res = "";

        if (numero.length() == 6)
            res = numero;
        if (numero.length() == 5)
            res = "0" + numero;
        if (numero.length() == 4)
            res = "00" + numero;
        if (numero.length() == 3)
            res = "000" + numero;
        if (numero.length() == 2)
            res = "0000" + numero;
        if (numero.length() == 1)
            res = "00000" + numero;

        return res;
    }

    public static String devuelveDireccionGerencia(String gerencia) {
        String res = "-";

        if (gerencia.length() == 3) {
            if (gerencia.equals("GNF"))
                res =
"Remitir a la Gerencia Nacional de Fiscalización, ubicada en la Av. 20 de Octubre Nº 2038 de la ciudad de La Paz";
            if (gerencia.equals("GRL"))
                res =
"Remitir a la Gerencia Regional La Paz, ubicada en Ciudad Satélite – Av. del Policía s/n entre calle Diego de Portugal y Av. Ballivian Otero de la Ciudad de El Alto";
            if (gerencia.equals("GRC"))
                res = "Remitir a la Gerencia Regional Cochabamba, ubicada en la Av. Capitán Victor Ustariz Km. 7.5";
            if (gerencia.equals("GRS"))
                res =
"Remitir a la Gerencia Regional Santa Cruz, ubicada en la Av. La Salle esq. Claudio Peñaranda s/n Edificio Don Uruguay de la ciudad de Santa Cruz de la Sierra";
            if (gerencia.equals("GRO"))
                res =
"Remitir a la Gerencia Regional Oruro, ubicada en la calle Madrid N° 390 entre América y Colón, zona sud, Oruro";
            if (gerencia.equals("GRT"))
                res =
"Remitir a la Gerencia Regional Tarija, ubicada en la Av. Jaime Paz Zamora N° 2381 (Zona Juan XXIII) – Tarija";
            if (gerencia.equals("GRP"))
                res =
"Remitir a la Gerencia Regional Potosi, ubicada en la Av. Villazon N° 242, segundo piso, ambiente N° 20";


        }

        return res;
    }

    public static String completaCerosDecimal(String numero) {
        String res = "";
        res = numero;
        if (numero != null)
            if (numero.length() > 0) {
                if (numero.substring(0, 1).equals(".")) {
                    res = "0" + numero;
                }
                if (numero.length() > 1) {
                    if (numero.substring(0, 2).equals("-.")) {
                        res = "-0" + numero.substring(1);
                    }
                }
            }
        return res;
    }

    public static String numeroGerencia(String gerencia) {
        String res = "";
        if (gerencia.equals("GNF"))
            res = "%";
        if (gerencia.equals("GRL"))
            res = "2";
        if (gerencia.equals("GRC"))
            res = "3";
        if (gerencia.equals("GRS"))
            res = "7";
        if (gerencia.equals("GRO"))
            res = "4";
        if (gerencia.equals("GRP"))
            res = "5";
        if (gerencia.equals("GRT"))
            res = "6";

        return res;
    }

    public static String gusuarioGerencia(String gerencia) {
        String res = "";

        if (gerencia.equals("15"))
            res = "GNF";
        if (gerencia.equals("19"))
            res = "GRL";
        if (gerencia.equals("20"))
            res = "GRO";
        if (gerencia.equals("21"))
            res = "GRC";
        if (gerencia.equals("22"))
            res = "GRS";
        if (gerencia.equals("23"))
            res = "GRT";
        if (gerencia.equals("24"))
            res = "GRP";

        return res;
    }

    public static String NombreGerencia(String gerencia) {
        String res = "";

        if (gerencia.equals("15"))
            res = "GERENCIA NACIONAL DE FISCALIZACION";
        if (gerencia.equals("19"))
            res = "GERENCIA REGIONAL LA PAZ";
        if (gerencia.equals("20"))
            res = "GERENCIA REGIONAL ORURO";
        if (gerencia.equals("21"))
            res = "GERENCIA REGIONAL COCHABAMBA";
        if (gerencia.equals("22"))
            res = "GERENCIA REGIONAL SANTA CRUZ";
        if (gerencia.equals("23"))
            res = "GERENCIA REGIONAL TARIJA";
        if (gerencia.equals("24"))
            res = "GERENCIA REGIONAL POTOSI";

        return res;
    }

    public static String completarCeros7(String numero) {
        String res = "";
        if (numero.length() == 7)
            res = numero;
        if (numero.length() == 6)
            res = "0" + numero;
        if (numero.length() == 5)
            res = "00" + numero;
        if (numero.length() == 4)
            res = "000" + numero;
        if (numero.length() == 3)
            res = "0000" + numero;
        if (numero.length() == 2)
            res = "00000" + numero;
        if (numero.length() == 1)
            res = "000000" + numero;

        return res;
    }

    public static String completarCeros8(String numero) {
        String res = "";

        if (numero.length() == 8)
            res = numero;
        if (numero.length() == 7)
            res = "0" + numero;
        if (numero.length() == 6)
            res = "00" + numero;
        if (numero.length() == 5)
            res = "000" + numero;
        if (numero.length() == 4)
            res = "0000" + numero;
        if (numero.length() == 3)
            res = "00000" + numero;
        if (numero.length() == 2)
            res = "000000" + numero;
        if (numero.length() == 1)
            res = "0000000" + numero;

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

    public static String join(String[] elements, String separator) {
        String text = "";
        for (String el : elements) {
            text += el + separator;
        }
        return text.replaceAll("\\" + separator + "+$", "");
    }

    public static void noCache(HttpServletResponse response) {
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0); // Proxies.
    }

}
