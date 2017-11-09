package anb.persistencia;


import anb.bean.CargaDescargaDmaForm;

import anb.entidades.Dma;
import anb.entidades.HojaExcel;
import anb.entidades.HojaExcelCab;

import anb.general.Conexion;
import anb.general.Util;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import oracle.jdbc.OracleTypes;


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
                ht.setDecfobusd(Util.completaCerosDecimal(rs.getString(2)));/*
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
}

