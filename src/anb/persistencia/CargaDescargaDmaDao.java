package anb.persistencia;


import Xml.ClaseXml;
import Xml.ClaseXmlFdmR;
import Xml.ClaseXmlR;
import Xml.dav_gen;
import Xml.dav_genR;
import Xml.dav_item;
import Xml.dav_itemR;
import Xml.fdm_genR;
import Xml.fdm_itemR;

import anb.bean.CargaDescargaDmaForm;

import anb.entidades.Dma;
import anb.entidades.HojaExcel;
import anb.entidades.HojaExcelCab;

import anb.general.Conexion;
import anb.general.Util;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.naming.NamingException;

import oracle.jdbc.OracleTypes;

import org.apache.struts.upload.FormFile;


public class CargaDescargaDmaDao extends Conexion {
    public CargaDescargaDmaDao() {
        super();
    }

    public List<HojaExcel> hojaExcel(CargaDescargaDmaForm bean) throws SQLException, ClassNotFoundException,
                                                                       NamingException {
        List<HojaExcel> htls = new ArrayList<HojaExcel>();
        int cont = 1;
        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_seguimiento.devuelve_hoja_trabajoxls2 ( ?)}");
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, bean.getMostrarid());
            call.execute();
            rs = (ResultSet)call.getObject(1);
            while (rs.next()) {
                HojaExcel ht = new HojaExcel();
                ht.setSequencia(String.valueOf(cont++));
                ht.setItem(rs.getString(1));
                /*ht.setSubpartidadec(rs.getString(2));
                ht.setSubpartidadet(rs.getString(3));
                ht.setGestion(rs.getString(4));
                ht.setAduana(rs.getString(5));
                ht.setSerial(rs.getString(6));
                ht.setNumero(rs.getString(7));
                ht.setFechaval(rs.getString(8));
                ht.setFechavcto(rs.getString(9));*/
                ht.setDecfobusd(Util.completaCerosDecimal(rs.getString(2))); /*
                ht.setDecfleteusd(rs.getString(11));
                ht.setDecsegurousd(rs.getString(12));
                ht.setDecotrosusd(rs.getString(13));
                ht.setDeccifusd(rs.getString(14));
                ht.setDectc(rs.getString(15));
                ht.setDeccifbs(rs.getString(16));
                ht.setDecga(rs.getString(17));
                ht.setDecivabs(rs.getString(18));
                ht.setDetfobusd(rs.getString(19));
                ht.setDetfleteusd(rs.getString(20));
                ht.setDetsegurousd(rs.getString(21));
                ht.setDetotrosusd(rs.getString(22));
                ht.setDetcifusd(rs.getString(23));
                ht.setDetcifbs(rs.getString(24));
                ht.setContravencion(rs.getString(25));
                ht.setIlicitodet(rs.getString(26));
                ht.setObservacion(rs.getString(27));
                ht.setTipoalcance(rs.getString(28));*/
                ht.setPartida(rs.getString(3));
                ht.setSubpartida(rs.getString(4));
                htls.add(ht);
            }
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return htls;
    }

    public HojaExcelCab hojaExcelCap(CargaDescargaDmaForm bean) throws SQLException, ClassNotFoundException,
                                                                       NamingException {
        HojaExcelCab htls = new HojaExcelCab();
        int cont = 1;

        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_seguimiento.devuelve_hoja_trabajoxls_cab ( ?)}");
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, bean.getMostrarid());
            call.execute();
            rs = (ResultSet)call.getObject(1);
            if (rs.next()) {


                htls.setFobtotal(Util.completaCerosDecimal(rs.getString(1)));
                htls.setFlete(Util.completaCerosDecimal(rs.getString(2)));
                htls.setFletediv("");
                htls.setSeguro(Util.completaCerosDecimal(rs.getString(3)));
                htls.setSegurodiv("");
                htls.setOtrosg(Util.completaCerosDecimal(rs.getString(4)));
                htls.setDui(rs.getString(5));
                htls.setOtrosgdiv("");
                htls.setOtrase("");
                htls.setOtrasediv("");
                htls.setDeducciones("");
                htls.setDeduccionesdiv("");
                htls.setTotalitems("");

            }
        } finally {
            if (cn != null) {
                cn.close();
            }
        }


        return htls;
    }

    public List<Dma> lista_dma(CargaDescargaDmaForm bean) throws SQLException, ClassNotFoundException,
                                                                 NamingException {
        List<Dma> dma = new ArrayList<Dma>();
        int cont = 1;
        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_seguimiento.lista_documentos_dma ( ?)}");
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, bean.getMostrarid());
            call.execute();
            rs = (ResultSet)call.getObject(1);
            if (rs.next()) {
                Dma dm = new Dma();
                dm.setDav(rs.getString(1));
                dm.setKey_year(rs.getString(2));
                dm.setKey_cuo(rs.getString(3));
                dm.setKey_dec(rs.getString(4));
                dm.setKey_nber(rs.getString(5));
                dm.setSad_reg_year(rs.getString(6));
                dm.setSad_reg_serial("C");
                dm.setSad_reg_nber(rs.getString(7));
                dm.setTipo_doc(rs.getString(8));
                dm.setCodigo(rs.getString(1));
                dm.setDescripcion(rs.getString(1));
                dma.add(dm);
            }
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return dma;
    }

    //DESCARGA FDM

    public String pDescargarDFdm(String dma, String dui) throws SQLException, ClassNotFoundException, NamingException,
                                                                FileNotFoundException, UnsupportedEncodingException,
                                                                IOException {
        {
            String m_ira = Util.devuelveNombreMira();
            
            String auxi = "";
            String arma = "0";
            String res = "";
            open();
            try {
                //    ARCHIVO XML
                call = cn.prepareCall("{? = call "+ m_ira +".PKG_EXTERNO_AD.arma_cabecera_xml_fdm( ?, ?, ?, ?, ? ) }");
                call.registerOutParameter(1, OracleTypes.VARCHAR);
                call.registerOutParameter(4, OracleTypes.INTEGER);
                call.registerOutParameter(5, OracleTypes.VARCHAR);
                call.setString(6, dui);
                call.setString(2, dma);
                call.setString(3, "1");
                call.execute();

                int i = 1;
                String ret = (String)call.getObject(1);
                int item = call.getInt(4);
                String fin = (String)call.getObject(5);
                auxi = ret.substring(0, 5);
                //  verifica si hubo algun error
                if (auxi.equals("Error"))
                    throw new SQLException(ret);

                String nomxml = "/u03/oracle/user_projects/data/fiscalizacion/dma/xml/" + dma + ".xml";

                //cs.setDav(bDma.numero);
                OutputStream fout = new FileOutputStream(nomxml);
                OutputStream bout = new BufferedOutputStream(fout);
                OutputStreamWriter out = new OutputStreamWriter(bout, "iso-8859-1");
                //    File file;
                out.write(ret);

                ret = "";

                String aux = "";
                //crear el paquete que arme el xml
                call = cn.prepareCall("{? = call "+ m_ira +".PKG_EXTERNO_AD.arma_items_xml_fdm( ?, ?, ? ) }");
                call.registerOutParameter(1, OracleTypes.VARCHAR);
                //call.setString(2, bDma.numero);
                call.setString(2, dma);
                //call.setString(4, bDma.getDescarga());
                call.setString(4, "1");
                for (int j = 1; j <= item; j++) {
                    call.setInt(3, j);
                    call.execute();
                    ret = (String)call.getObject(1);
                    aux = ret.substring(0, 5);

                    if (!aux.equals("Error")) {
                        out.write(ret);
                        i = i + 1;
                    }
                }
                out.write(fin);
                out.flush();
                out.close();
                res = "CORRECTO";
            } finally {
                if (cn != null) {
                    cn.close();
                }
            }
            close();
            return res;

        }
    }

    //DESCARGA DMA

    public String pDescargarD(String dma) throws SQLException, ClassNotFoundException, NamingException {
        String res;
        String m_ira = Util.devuelveNombreMira();
        String auxi = "";
        try {
            open();
            call = cn.prepareCall("{ ? = call "+ m_ira +".PKG_DAV_AD.arma_cabecera_xml_dma( ?, ?, ?, ? )}");
            call.registerOutParameter(1, OracleTypes.VARCHAR);
            call.registerOutParameter(4, OracleTypes.INTEGER);
            call.registerOutParameter(5, OracleTypes.VARCHAR);
            call.setString(2, dma);
            call.setString(3, "1");
            call.execute();
            int i = 1;
            String ret = (String)call.getObject(1);
            int item = call.getInt(4);
            String fin = (String)call.getObject(5);
            auxi = ret.substring(0, 5);

            if (auxi.equals("Error")) {
                res = "ERROR";
            } else {
                String nomxml = "/u03/oracle/user_projects/data/fiscalizacion/dma/xml/" + dma + ".xml";
                try {
                    OutputStream fout = new FileOutputStream(nomxml);
                    OutputStream bout = new BufferedOutputStream(fout);
                    OutputStreamWriter out = new OutputStreamWriter(bout, "iso-8859-1");
                    out.write(ret);
                    ret = "";
                    String aux = "";
                    call = cn.prepareCall("{? = call "+ m_ira +".PKG_DAV_AD.arma_items_xml_dma( ?, ?, ? ) }");
                    call.registerOutParameter(1, OracleTypes.VARCHAR);
                    call.setString(2, dma);
                    call.setString(4, "1");

                    for (int j = 1; j <= item; j++) {
                        call.setInt(3, j);
                        call.execute();
                        ret = (String)call.getObject(1);
                        aux = ret.substring(0, 5);
                        if (!aux.equals("Error")) {
                            out.write(ret);
                            i = i + 1;
                        }
                    }
                    out.write(fin);
                    out.flush();
                    out.close();
                    res = "CORRECTO";
                } catch (Exception ex) {
                    res = "ERROR";
                }
            }
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return res;
    }

    public String pSubeLoDatosDMA(FormFile bDocxml, String ruta, String gestion, String aduana, String numero,
                                  String usuario, String etapa) throws SQLException, ClassNotFoundException,
                                                                       NamingException {
        String res = "";
        String m_ira = Util.devuelveNombreMira();

        try {

            FormFile file = bDocxml;
            if (file.getFileSize() <= 0)
                throw new SQLException("El archivo que envio no tiene el formato DAV - XML");

            // Direccion del archivo
            InputStream stream = file.getInputStream();
            OutputStream bos = new FileOutputStream(ruta);
            String ad1 = gestion;
            String adu2 = aduana;
            String num12 = numero;
            int bytesRead = 0;
            int resindex;
            byte[] buffer = new byte[8192];

            while ((bytesRead = stream.read(buffer, 0, 8192)) != -1)
                bos.write(buffer, 0, bytesRead);

            bos.close();
            dav_gen dg = null;
            //verifica si el archivo es comprimido o xml
            String str = ruta;
            boolean resultado = str.endsWith(".zip");
            if (resultado) {

                //archivo comprimido
                ZipFile zipfile = new ZipFile(ruta);
                Enumeration e = zipfile.entries();
                while (e.hasMoreElements()) {
                    ZipEntry entry = (ZipEntry)e.nextElement();
                    String TargetName = entry.getName();

                    if (!TargetName.endsWith(".xml"))
                        throw new SQLException("El archivo comprimido debe ser en formato xml");

                    ClaseXml xml = new ClaseXml();
                    dg = xml.pdigester(zipfile.getInputStream(entry));

                    dg.validaCabecera();
                    if (dg.lista.size() > 0) {
                        String abc = "";
                        for (Iterator i = dg.lista.iterator(); i.hasNext(); )
                            abc = abc + "<br>" + (String)i.next();

                        throw new SQLException("No corresponde el archivo " + TargetName + " al formato DAV<br>" +
                                               abc);
                    }
                    break;
                }
            } else {
                //verifica q el archivo xml no sea mayor a 512 kb
                if (file.getFileSize() > 524288)
                    throw new SQLException("El archivo es muy grande para ser enviado. Debe Comprimirlo");

                if (!str.endsWith(".xml"))
                    throw new SQLException("El archivo debe ser en formato xml");

                ClaseXml xml = new ClaseXml();
                dg = xml.pdigester(file.getInputStream());

                dg.validaCabecera();
                if (dg.lista.size() > 0) {
                    String abc = "";
                    for (Iterator i = dg.lista.iterator(); i.hasNext(); )
                        abc = abc + "<br>" + (String)i.next();

                    throw new SQLException("No corresponde el archivo " + ruta + " al formato DAV<br>" + abc);
                }
            }
            open();
            call =
cn.prepareCall("{? = call "+ m_ira +".PKG_DAV_AD.graba_cabecera( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ) }");
            call.registerOutParameter(1, OracleTypes.VARCHAR);
            //version
            call.setString(2, dg.getCversion());
            call.setString(3, dg.getRef());
            call.setString(4, dg.getAnticipado());
            call.setString(5, dg.getC30());
            call.setString(6, dg.getC31());
            call.setString(7, dg.getC32());
            call.setString(8, dg.getC33());
            call.setString(9, dg.getC40());
            call.setString(10, dg.getC41());
            call.setString(11, dg.getC42());
            call.setString(12, dg.getC43());
            call.setString(13, dg.getC50());
            call.setString(14, dg.getC51());
            call.setString(15, dg.getC52());
            call.setString(16, dg.getC53());
            call.setString(17, dg.getC60());
            call.setString(18, dg.getC61());
            call.setString(19, dg.getC62());
            call.setString(20, dg.getC63());
            call.setString(21, dg.getC70());
            call.setString(22, dg.getC81());
            call.setString(23, dg.getC82());
            call.setString(24, dg.getC83());
            call.setString(25, dg.getC90());
            call.setString(26, dg.getC100());
            call.setString(27, dg.getC110());
            call.setString(28, dg.getC120());
            call.setString(29, dg.getC130());
            call.setString(30, dg.getC140());
            call.setString(31, dg.getC150());
            call.setString(32, dg.getC160());
            call.setString(33, dg.getC170());
            call.setString(34, dg.getC180());
            call.setString(35, dg.getC190());
            call.setString(36, dg.getC200());
            call.setString(37, dg.getC210());
            call.setString(38, dg.getC220());
            call.setString(39, dg.getC230());
            call.setString(40, dg.getC240());
            call.setString(41, dg.getC250());
            call.setString(42, dg.getC260());
            call.setString(43, dg.getC270());
            call.setString(44, dg.getC271());
            call.setString(45, dg.getC280());
            call.setString(46, dg.getC290());
            call.setString(47, dg.getC300());
            call.setString(48, dg.getC310());
            call.setString(49, dg.getC320());
            call.setString(50, dg.getC330());
            call.setString(51, dg.getC340());
            call.setString(52, dg.getC350());
            call.setString(53, dg.getC360());
            call.setString(54, dg.getC361());
            call.setString(55, dg.getC370());
            call.setString(56, dg.getC380());
            call.setString(57, dg.getC390());
            call.setString(58, dg.getC400());
            call.setString(59, dg.getC410());
            call.setString(60, dg.getC420());
            call.setString(61, dg.getC430());
            call.setString(62, dg.getC440());
            call.setString(63, dg.getC450());
            call.setString(64, dg.getC460());
            call.setString(65, dg.getC470());
            call.setString(66, dg.getC480());
            call.setString(67, dg.getC490());
            call.setString(68, dg.getC500());
            call.setString(69, dg.getC510());
            call.setString(70, dg.getC520());
            call.setString(71, dg.getC530());
            call.setString(72, dg.getC540());
            call.setString(73, dg.getC550());
            call.setString(74, dg.getC560());
            call.setString(75, dg.getC570());
            call.setString(76, dg.getC580());
            call.setString(77, dg.getC590());
            call.setString(78, dg.getC600());
            call.setString(79, dg.getC610());
            call.setString(80, dg.getC611());
            call.setString(81, dg.getC620());
            call.setString(82, dg.getC621());
            call.setString(83, dg.getC622());
            call.setString(84, dg.getC631());
            call.setString(85, dg.getC632());
            call.setString(86, dg.getC633());
            call.setString(87, dg.getC634());
            call.setString(88, dg.getC630());
            call.setString(89, dg.getC640());
            call.setString(90, dg.getC650());
            call.setString(91, dg.getC660());
            call.setString(92, dg.getC670());
            call.setString(93, dg.getC1270());
            call.setString(94, dg.getC1281());
            call.setString(95, dg.getC1282());
            call.setString(96, dg.getC1283());
            call.setString(97, dg.getC1290());
            call.setString(98, dg.getC1300());
            call.setString(99, dg.getC1310());
            call.setString(100, dg.getC1320());
            call.setString(101, dg.getC1330());
            call.setString(102, dg.getC1340());
            call.setString(103, usuario);
            call.execute();

            String ans = (String)call.getObject(1);

            if (!ans.equals("Correcto"))
                throw new SQLException("Cabecera: " + ans);

            this.pSubeLoDatosItemDMA(dg, dg.getRef(), usuario, etapa);
        } catch (Exception e) {
            //throw new SQLException(e.getMessage());
            res = e.getMessage();
        }

        return res;
    }

    //CARGA DATOS FDM

    public String pSubeLoDatosR(FormFile bDocxml, String ruta, String gestion, String aduana, String numero,
                                String usuario, String etapa) throws SQLException, ClassNotFoundException,
                                                                     NamingException {
        String dui = "";
        String m_ira = Util.devuelveNombreMira();
        String ans = "";
        String variacion;
        String res = "";
        open();
        try {

            FormFile file = bDocxml;
            dui = gestion + "/" + aduana + "/C-" + numero;
            if (file.getFileSize() <= 0) {
                throw new SQLException("El archivo que envio no tiene el formato FDM - XML");
            }

            // Direccion del archivo
            InputStream stream = file.getInputStream();
            OutputStream bos = new FileOutputStream(ruta);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];

            while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bos.close();
            fdm_genR dg = null;
            int resindex = 0;
            //verifica si el archivo es comprimido o xml
            String str = ruta;
            boolean resultado = str.endsWith(".zip");
            if (resultado) {
                //archivo comprimido
                ZipFile zipfile = new ZipFile(ruta);
                Enumeration e = zipfile.entries();
                while (e.hasMoreElements()) {
                    ZipEntry entry = (ZipEntry)e.nextElement();
                    String TargetName = entry.getName();

                    if (!TargetName.endsWith(".xml")) {
                        throw new SQLException("El archivo comprimido debe ser en formato xml");
                    }

                    ClaseXmlFdmR xml = new ClaseXmlFdmR();
                    dg = xml.pdigesterR(zipfile.getInputStream(entry));

                    dg.validaCabeceraR();
                    if (dg.lista.size() > 0) {
                        String abc = "";
                        for (Iterator i = dg.lista.iterator(); i.hasNext(); ) {
                            abc = abc + "<br>" + (String)i.next();
                        }

                        throw new SQLException("No corresponde el archivo " + TargetName + " al formato FDM<br>" +
                                               abc);
                    }
                    break;
                }
            } else {
                //verifica q el archivo xml no sea mayor a 512 kb
                if (file.getFileSize() > 524288) {
                    throw new SQLException("El archivo es muy grande para ser enviado. Debe Comprimirlo");
                }

                if (!str.endsWith(".xml")) {
                    throw new SQLException("El archivo debe ser en formato xml");
                }
                ClaseXmlFdmR xml = new ClaseXmlFdmR();
                System.out.println("Entra a pdigester");
                dg = xml.pdigesterR(file.getInputStream());
                System.out.println("Salio de pdigester");
                dg.validaCabeceraR();
                System.out.println("Salio de ValidaCabecera");
                if (dg.lista.size() > 0) {
                    String abc = "";
                    for (Iterator i = dg.lista.iterator(); i.hasNext(); ) {
                        abc = abc + "<br>" + (String)i.next();
                    }

                    throw new SQLException("No corresponde el archivo " + ruta + " al formato FDM<br>" + abc);
                }
            }


            call = cn.prepareCall("{? = call "+ m_ira +".PKG_FDM_AD.g_datosFdmR( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ,?) }");
            call.registerOutParameter(1, OracleTypes.VARCHAR);
            call.setString(2, dg.getRef());
            cald =
cn.prepareCall("{? = call "+ m_ira +".PKG_FDM_AD.g_Fdm5_E( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ) }");
            cald.registerOutParameter(1, OracleTypes.VARCHAR);
            cald.setString(2, dg.getRef());
            fdm_itemR di = null;

            for (int i = 0; i < dg.getFdm_item(); i++) {
                di = dg.getFdm_item(i);
                call.setString(3, di.getC210());
                call.setString(4, di.getC220());
                call.setString(5, di.getC230());
                call.setString(6, di.getC231());
                call.setString(7, di.getC250());
                call.setString(8, di.getC260());
                call.setString(9, di.getC270());
                call.setString(10, di.getC280());
                call.setString(11, di.getC290());
                call.setString(12, di.getC300());
                call.setString(13, di.getC310());
                call.setString(14, di.getC320());
                call.setString(15, di.getC330());
                call.setString(16, usuario);
                call.setString(17, dui);
                call.setString(18, dg.getCversion());
                call.execute();

                ans = (String)call.getString(1);
                if (!di.getC280().equals(di.getC320()))
                    variacion = "SI";
                if (!di.getC290().equals(di.getC330()))
                    variacion = "SI";
                System.out.println("ejecuto el paquete g_datosFdmR:=>" + ans);
                if (!ans.equals("Correcto"))
                    throw new SQLException("Item: " + di.getC210() + ' ' + ans);

                cald.setString(3, di.getC210());
                cald.setString(4, di.getC2401());
                cald.setString(5, di.getC2402());
                cald.setString(6, di.getC2403());
                cald.setString(7, di.getC2404());
                cald.setString(8, di.getC2405());
                cald.setString(9, di.getC2406());
                cald.setString(10, di.getC2407());
                cald.setString(11, di.getC2408());
                cald.setString(12, di.getC2409());
                cald.setString(13, di.getC2410());
                cald.setString(14, di.getC2411());
                cald.setString(15, di.getC2412());
                cald.setString(16, di.getC2413());
                cald.setString(17, di.getC2414());
                cald.setString(18, di.getC2415());
                cald.setString(19, di.getC2416());
                cald.setString(20, di.getC2417());
                cald.setString(21, di.getC2418());
                cald.setString(22, di.getC2419());
                cald.setString(23, di.getC2420());
                cald.setString(24, di.getC2421());
                cald.setString(25, di.getC2422());
                cald.setString(26, di.getC2423());
                cald.setString(27, di.getC2424());
                cald.setString(28, di.getC2425());
                cald.setString(29, di.getC2426());
                cald.setString(30, di.getC2427());
                cald.setString(31, di.getC2428());
                cald.execute();
                ans = (String)cald.getString(1);
                System.out.println("ejecuto el paquete g_Fdm5_E :=>" + ans);
                if (!(ans.substring(0, 8)).equals("Correcto")) {
                    res = "Item: " + di.getC210() + " la DMA tiene error " + ans;
                }
                res = "CORRECTO";


            }
        } catch (Exception e) {
            res = e.getMessage();
        }
        close();
        return res;
    }

    //CARGA DATOS DMA

    public String pSubeLoDatosDMAR(FormFile bDocxml, String ruta, String gestion, String aduana, String numero,
                                   String usuario, String etapa) throws SQLException, ClassNotFoundException,
                                                                        NamingException {
        String aux = "";
        String m_ira = Util.devuelveNombreMira();
        String res = "ERROR SUBIR";
        String variacion;
        open();
        try {

            FormFile file = bDocxml;

            String ans = "";
            if (file.getFileSize() <= 0)
                throw new SQLException("El archivo que envio no tiene el formato DAV - XML");

            // Direccion del archivo
            InputStream stream = file.getInputStream();
            OutputStream bos = new FileOutputStream(ruta);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];

            while ((bytesRead = stream.read(buffer, 0, 8192)) != -1)
                bos.write(buffer, 0, bytesRead);

            bos.close();
            dav_genR dg = null;
            int resindex = 0;
            //verifica si el archivo es comprimido o xml
            String str = ruta;
            boolean resultado = str.endsWith(".zip");
            if (resultado) {

                //archivo comprimido
                ZipFile zipfile = new ZipFile(ruta);
                Enumeration e = zipfile.entries();
                while (e.hasMoreElements()) {
                    ZipEntry entry = (ZipEntry)e.nextElement();
                    String TargetName = entry.getName();

                    if (!TargetName.endsWith(".xml"))
                        throw new SQLException("El archivo comprimido debe ser en formato xml");

                    ClaseXmlR xml = new ClaseXmlR();
                    dg = xml.pdigesterR(zipfile.getInputStream(entry));

                    dg.validaCabeceraR();
                    if (dg.lista.size() > 0) {
                        String abc = "";
                        for (Iterator i = dg.lista.iterator(); i.hasNext(); )
                            abc = abc + "<br>" + (String)i.next();

                        throw new SQLException("No corresponde el archivo " + TargetName + " al formato DAV<br>" +
                                               abc);
                    }
                    break;
                }
            } else {
                //verifica q el archivo xml no sea mayor a 512 kb
                if (file.getFileSize() > 524288)
                    throw new SQLException("El archivo es muy grande para ser enviado. Debe Comprimirlo");

                if (!str.endsWith(".xml"))
                    throw new SQLException("El archivo debe ser en formato xml");
                ClaseXmlR xml = new ClaseXmlR();
                dg = xml.pdigesterR(file.getInputStream());

                dg.validaCabeceraR();
                if (dg.lista.size() > 0) {
                    String abc = "";
                    for (Iterator i = dg.lista.iterator(); i.hasNext(); )
                        abc = abc + "<br>" + (String)i.next();

                    throw new SQLException("No corresponde el archivo " + ruta + " al formato DAV<br>" + abc);
                }
            }


            call = cn.prepareCall("{? = call "+ m_ira +".PKG_DAV_AD.g_datos4R( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ,?) }");
            call.registerOutParameter(1, OracleTypes.VARCHAR);
            call.setString(2, dg.getRef());
            cald =
cn.prepareCall("{? = call "+ m_ira +".PKG_DAV_AD.g_datos5_E( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ) }");
            cald.registerOutParameter(1, OracleTypes.VARCHAR);
            cald.setString(2, dg.getRef());
            dav_itemR di = null;

            for (int i = 0; i < dg.getDav_item(); i++) {
                di = dg.getDav_item(i);
                call.setDouble(3, Double.valueOf(di.getC210()));
                call.setString(4, di.getC220());
                call.setString(5, di.getC230());
                call.setString(6, di.getC231());
                call.setDouble(7, Double.valueOf(di.getC250()));
                call.setString(8, di.getC260());
                call.setDouble(9, Double.valueOf(di.getC270()));
                call.setDouble(10, Double.valueOf(di.getC280()));
                call.setDouble(11, Double.valueOf(di.getC290()));
                call.setDouble(12, Double.valueOf(di.getC300()));
                call.setDouble(13, Double.valueOf(di.getC310()));
                call.setDouble(14, Double.valueOf(di.getC320()));
                call.setDouble(15, Double.valueOf(di.getC330()));
                call.setString(16, usuario);

                call.setString(17, dg.getCversion());
                call.execute();

                ans = (String)call.getString(1);
                if (!di.getC280().equals(di.getC320()))
                    variacion = "SI";
                if (!di.getC290().equals(di.getC330()))
                    variacion = "SI";
                if (!ans.equals("Correcto"))
                    throw new SQLException("Item: " + di.getC210() + ' ' + ans);

                cald.setString(3, di.getC210());
                cald.setString(4, di.getC2401());
                cald.setString(5, di.getC2402());
                cald.setString(6, di.getC2403());
                cald.setString(7, di.getC2404());
                cald.setString(8, di.getC2405());
                cald.setString(9, di.getC2406());
                cald.setString(10, di.getC2407());
                cald.setString(11, di.getC2408());
                cald.setString(12, di.getC2409());
                cald.setString(13, di.getC2410());
                cald.setString(14, di.getC2411());
                cald.setString(15, di.getC2412());
                cald.setString(16, di.getC2413());
                cald.setString(17, di.getC2414());
                cald.setString(18, di.getC2415());
                cald.setString(19, di.getC2416());
                cald.setString(20, di.getC2417());
                cald.setString(21, di.getC2418());
                cald.setString(22, di.getC2419());
                cald.setString(23, di.getC2420());
                cald.setString(24, di.getC2421());
                cald.setString(25, di.getC2422());
                cald.setString(26, di.getC2423());
                cald.setString(27, di.getC2424());
                cald.setString(28, di.getC2425());
                cald.setString(29, di.getC2426());
                cald.setString(30, di.getC2427());
                cald.setString(31, di.getC2428());

                cald.execute();

                ans = (String)cald.getString(1);
                if (!ans.equals("Correcto"))
                    res = "Item: " + di.getC210() + " la DMA tiene error " + ans;
                else
                    res = "CORRECTO";

                //bDoc.setRuta(dg.getRef());
            }
        } catch (Exception e) {
            //throw new SQLException(e.getMessage());
            res = e.getMessage();
        }
        close();
        return res;
    }

    private void pSubeLoDatosItemDMA(dav_gen dg, String DAV, String usuario, String etapa) throws Exception {
        String m_ira = Util.devuelveNombreMira();
        open();
        String variacion;
        call =
cn.prepareCall("{? = call "+ m_ira +".PKG_DAV_AD.g_datos4_E( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ) }");
        call.registerOutParameter(1, OracleTypes.VARCHAR);
        call.setString(2, DAV);

        cald =
cn.prepareCall("{? = call "+ m_ira +".PKG_DAV_AD.g_datos5_E( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ) }");
        cald.registerOutParameter(1, OracleTypes.VARCHAR);
        cald.setString(2, DAV);

        dav_item di = null;

        for (int i = 0; i < dg.getDav_item(); i++) {
            di = dg.getDav_item(i);
            call.setString(3, di.getC680());
            call.setString(4, di.getC690());
            call.setString(5, di.getC700());
            call.setString(6, di.getC701());
            call.setString(7, di.getC710());
            call.setString(8, di.getC711());
            call.setString(9, di.getC760());
            call.setString(10, di.getC770());
            call.setString(11, di.getC780());
            call.setString(12, di.getC790());
            call.setString(13, di.getC800());
            call.setString(14, di.getC801());
            call.setString(15, di.getC820());
            call.setString(16, di.getC830());
            call.setString(17, di.getC840());
            call.setString(18, di.getC850());
            call.setString(19, di.getC860());
            call.setString(20, di.getC870());
            call.setString(21, di.getC880());
            call.setString(22, di.getC890());
            call.setString(23, di.getC900());
            call.setString(24, di.getC910());
            call.setString(25, di.getC920());
            call.setString(26, di.getC930());
            call.setString(27, di.getC940());
            call.setString(28, di.getC950());
            call.setString(29, di.getC960());
            call.setString(30, di.getC970());
            call.setString(31, di.getC980());
            call.setString(32, di.getC990());
            call.setString(33, di.getC1000());
            call.setString(34, di.getC1010());
            call.setString(35, di.getC1020());
            call.setString(36, di.getC1030());
            call.setString(37, di.getC1040());
            call.setString(38, di.getC1050());
            call.setString(39, di.getC1060());
            call.setString(40, di.getC1070());
            call.setString(41, di.getC1080());
            call.setString(42, di.getC1090());
            call.setString(43, di.getC1100());
            call.setString(44, di.getC1110());
            call.setString(45, di.getC1120());
            call.setString(46, di.getC1130());
            call.setString(47, di.getC1140());
            call.setString(48, di.getC1150());
            call.setString(49, di.getC1160());
            call.setString(50, di.getC1161());
            call.setString(51, di.getC1170());
            call.setString(52, di.getC1180());
            call.setString(53, di.getC1190());
            call.setString(54, di.getC1191());
            call.setString(55, di.getC1200());
            call.setString(56, di.getC1210());
            call.setString(57, di.getC1220());
            call.setString(58, di.getC1221());
            call.setString(59, di.getC1230());
            call.setString(60, di.getC1240());
            call.setString(61, di.getC1250());
            call.setString(62, di.getC1260());
            call.setString(63, etapa);
            call.setString(64, usuario);
            call.execute();

            String ans = (String)call.getString(1);

            //if (!ans.equals("Correcto"))
            if (!(ans.substring(0, 8)).equals("Correcto"))
                throw new SQLException("Item: " + di.getC680() + ' ' + ans);
            if (ans.indexOf("SI") > -1)
                variacion = "SI";
            cald.setString(3, di.getC680());
            cald.setString(4, di.getC7101());
            cald.setString(5, di.getC7102());
            cald.setString(6, di.getC7103());
            cald.setString(7, di.getC7104());
            cald.setString(8, di.getC7105());
            cald.setString(9, di.getC7106());
            cald.setString(10, di.getC7107());
            cald.setString(11, di.getC7108());
            cald.setString(12, di.getC7109());
            cald.setString(13, di.getC7110());
            cald.setString(14, di.getC7111());
            cald.setString(15, di.getC7112());
            cald.setString(16, di.getC7113());
            cald.setString(17, di.getC7114());
            cald.setString(18, di.getC7115());
            cald.setString(19, di.getC7116());
            cald.setString(20, di.getC7117());
            cald.setString(21, di.getC7118());
            cald.setString(22, di.getC7119());
            cald.setString(23, di.getC7120());
            cald.setString(24, di.getC7121());
            cald.setString(25, di.getC7122());
            cald.setString(26, di.getC7123());
            cald.setString(27, di.getC7124());
            cald.setString(28, di.getC7125());
            cald.setString(29, di.getC7126());
            cald.setString(30, di.getC7127());
            cald.setString(31, di.getC7128());
            cald.execute();
            ans = (String)cald.getString(1);
            //cald.close();
            if (!ans.equals("Correcto"))
                throw new SQLException("Item: " + di.getC680() + " la DMA tiene error " + ans);
        }
    }


}

