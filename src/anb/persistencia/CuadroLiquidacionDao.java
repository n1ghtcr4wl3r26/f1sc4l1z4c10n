package anb.persistencia;


import anb.bean.CuadroLiquidacionForm;

import anb.entidades.CuadroLiquidacion;

import anb.general.Conexion;
import anb.general.Util;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import oracle.jdbc.OracleTypes;


public class CuadroLiquidacionDao extends Conexion {
    public List<CuadroLiquidacion> devuelveCuadroLiq(CuadroLiquidacionForm bean) throws SQLException, ClassNotFoundException,
                                                                                  NamingException {
        List<CuadroLiquidacion> htls = new ArrayList<CuadroLiquidacion>();
        int cont = 1;
        String error ="";
        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_reporte.dev_liquidacion (?)}");
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, bean.getCodigo());
            call.execute();
            rs = (ResultSet)call.getObject(1);
            while (rs.next()) {
                CuadroLiquidacion ht = new CuadroLiquidacion();
                ht.setSequencia(String.valueOf(cont++));
                ht.setItem(rs.getString(1));
                ht.setSubpartidadec(rs.getString(2));
                ht.setSubpartidadet(rs.getString(3));
                ht.setGestion(rs.getString(4));
                ht.setAduana(rs.getString(5));
                ht.setSerial("C");
                ht.setNumero(rs.getString(6));
                ht.setFechaval(rs.getString(7));
                ht.setFechavcto(rs.getString(8));
                ht.setFechacalculo(rs.getString(9));
                
                ht.setDecfobusd(rs.getString(10));
                String fob1 = rs.getString(10);
                ht.setDecfleteusd(Util.completaCerosDecimal(rs.getString(11)));
                ht.setDecsegurousd(Util.completaCerosDecimal(rs.getString(12)));                
                ht.setDecotrosusd(Util.completaCerosDecimal(rs.getString(13)));
                ht.setDeccifusd(Util.completaCerosDecimal(rs.getString(14)));
                ht.setDectc(Util.completaCerosDecimal(rs.getString(15)));
                ht.setDeccifbs(Util.completaCerosDecimal(rs.getString(16)));
                ht.setDecga(Util.completaCerosDecimal(rs.getString(17)));
                ht.setDeciva(Util.completaCerosDecimal(rs.getString(18)));
                ht.setDecice(Util.completaCerosDecimal(rs.getString(19)));
                ht.setDeciehd(Util.completaCerosDecimal(rs.getString(20)));
                ht.setDecicd(Util.completaCerosDecimal(rs.getString(21)));
                
                String fob2 = rs.getString(22);
                ht.setDetfobusd(Util.completaCerosDecimal(rs.getString(22)));
                ht.setDetfleteusd(Util.completaCerosDecimal(rs.getString(23)));
                ht.setDetsegurousd(Util.completaCerosDecimal(rs.getString(24)));
                ht.setDetotrosusd(Util.completaCerosDecimal(rs.getString(25)));
                ht.setDetcifusd(Util.completaCerosDecimal(rs.getString(26)));
                ht.setDettc(Util.completaCerosDecimal(rs.getString(27)));
                ht.setDetcifbs(Util.completaCerosDecimal(rs.getString(28)));
                ht.setDetga(Util.completaCerosDecimal(rs.getString(29)));
                ht.setDetiva(Util.completaCerosDecimal(rs.getString(30)));
                ht.setDetice(Util.completaCerosDecimal(rs.getString(31)));   
                ht.setDetiehd(Util.completaCerosDecimal(rs.getString(32))); 
                ht.setDeticd(Util.completaCerosDecimal(rs.getString(33))); 
                
                ht.setUfvvenc(Util.completaCerosDecimal(rs.getString(34)));
                
                ht.setToga(Util.completaCerosDecimal(rs.getString(35)));
                ht.setToiva(Util.completaCerosDecimal(rs.getString(36)));
                ht.setToice(Util.completaCerosDecimal(rs.getString(37)));
                ht.setToiehd(Util.completaCerosDecimal(rs.getString(38)));
                ht.setToicd(Util.completaCerosDecimal(rs.getString(39)));
                ht.setTototal(Util.completaCerosDecimal(rs.getString(40)));
                
                ht.setToufvga(Util.completaCerosDecimal(rs.getString(41)));
                ht.setToufviva(Util.completaCerosDecimal(rs.getString(42)));
                ht.setToufvice(Util.completaCerosDecimal(rs.getString(43)));
                ht.setToufviehd(Util.completaCerosDecimal(rs.getString(44)));
                ht.setToufvicd(Util.completaCerosDecimal(rs.getString(45)));
                ht.setToufvtotal(Util.completaCerosDecimal(rs.getString(46)));
                
                ht.setDias(rs.getString(47));
                ht.setFormula(rs.getString(48));
                
                ht.setIga(Util.completaCerosDecimal(rs.getString(49)));
                ht.setIiva(Util.completaCerosDecimal(rs.getString(50)));
                ht.setIice(Util.completaCerosDecimal(rs.getString(51)));
                ht.setIiehd(Util.completaCerosDecimal(rs.getString(52)));
                ht.setIicd(Util.completaCerosDecimal(rs.getString(53)));
                ht.setItotal(Util.completaCerosDecimal(rs.getString(54)));
                
                ht.setDtufvga(Util.completaCerosDecimal(rs.getString(55)));
                ht.setDtufviva(Util.completaCerosDecimal(rs.getString(56)));
                ht.setDtufvice(Util.completaCerosDecimal(rs.getString(57)));
                ht.setDtufviehd(Util.completaCerosDecimal(rs.getString(58)));
                ht.setDtufvicd(Util.completaCerosDecimal(rs.getString(59)));
                ht.setDtufvtotal(Util.completaCerosDecimal(rs.getString(60)));
                
                ht.setSancion(Util.completaCerosDecimal(rs.getString(61)));
                ht.setAdeudo_totalbs(Util.completaCerosDecimal(rs.getString(62)));
                ht.setAdeudo_totalufv(Util.completaCerosDecimal(rs.getString(63)));

                htls.add(ht);
            }
            
        } 
        catch(Exception ex){
                error = ex.toString();
            }
        finally {
            if (cn != null) {
                cn.close();
            }
        }
        return htls;
    }

}
