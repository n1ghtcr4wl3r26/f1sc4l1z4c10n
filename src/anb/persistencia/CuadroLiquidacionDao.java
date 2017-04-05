package anb.persistencia;


import anb.bean.CuadroLiquidacionForm;

import anb.entidades.CuadroLiquidacion;

import anb.general.Conexion;

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
                ht.setDecfleteusd(rs.getString(11));
                ht.setDecsegurousd(rs.getString(12));                
                ht.setDecotrosusd(rs.getString(13));
                ht.setDeccifusd(rs.getString(14));
                ht.setDectc(rs.getString(15));
                ht.setDeccifbs(rs.getString(16));
                ht.setDecga(rs.getString(17));
                ht.setDeciva(rs.getString(18));
                ht.setDecice(rs.getString(19));
                ht.setDeciehd(rs.getString(20));
                ht.setDecicd(rs.getString(21));
                
                String fob2 = rs.getString(22);
                ht.setDetfobusd(rs.getString(22));
                ht.setDetfleteusd(rs.getString(23));
                ht.setDetsegurousd(rs.getString(24));
                ht.setDetotrosusd(rs.getString(25));
                ht.setDetcifusd(rs.getString(26));
                ht.setDettc(rs.getString(27));
                ht.setDetcifbs(rs.getString(28));
                ht.setDetga(rs.getString(29));
                ht.setDetiva(rs.getString(30));
                ht.setDetice(rs.getString(31));   
                ht.setDetiehd(rs.getString(32)); 
                ht.setDeticd(rs.getString(33)); 
                
                ht.setUfvvenc(rs.getString(34));
                
                ht.setToga(rs.getString(35));
                ht.setToiva(rs.getString(36));
                ht.setToice(rs.getString(37));
                ht.setToiehd(rs.getString(38));
                ht.setToicd(rs.getString(39));
                ht.setTototal(rs.getString(40));
                
                ht.setToufvga(rs.getString(41));
                ht.setToufviva(rs.getString(42));
                ht.setToufvice(rs.getString(43));
                ht.setToufviehd(rs.getString(44));
                ht.setToufvicd(rs.getString(45));
                ht.setToufvtotal(rs.getString(46));
                
                ht.setDias(rs.getString(47));
                ht.setFormula(rs.getString(48));
                
                ht.setIga(rs.getString(49));
                ht.setIiva(rs.getString(50));
                ht.setIice(rs.getString(51));
                ht.setIiehd(rs.getString(52));
                ht.setIicd(rs.getString(53));
                ht.setItotal(rs.getString(54));
                
                ht.setDtufvga(rs.getString(55));
                ht.setDtufviva(rs.getString(56));
                ht.setDtufvice(rs.getString(57));
                ht.setDtufviehd(rs.getString(58));
                ht.setDtufvicd(rs.getString(59));
                ht.setDtufvtotal(rs.getString(60));
                
                ht.setSancion(rs.getString(61));
                ht.setAdeudo_totalbs(rs.getString(62));
                ht.setAdeudo_totalufv(rs.getString(63));

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
