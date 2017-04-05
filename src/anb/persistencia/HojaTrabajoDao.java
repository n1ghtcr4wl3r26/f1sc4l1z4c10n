package anb.persistencia;


import anb.bean.GeneracionHojaForm;

import anb.entidades.HojaTrabajoDui;

import anb.general.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import oracle.jdbc.OracleTypes;


public class HojaTrabajoDao extends Conexion {
    public HojaTrabajoDao() {
        super();
    }

    public List<HojaTrabajoDui> hojaTrabajoDui(GeneracionHojaForm bean) throws SQLException, ClassNotFoundException,
                                                                               NamingException {
        List<HojaTrabajoDui> htls = new ArrayList<HojaTrabajoDui>();
        int cont = 1;
        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_seguimiento.devuelve_hoja_trabajo ( ?)}");
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, bean.getCodigo());
            call.execute();
            rs = (ResultSet)call.getObject(1);
            while (rs.next()) {
                HojaTrabajoDui ht = new HojaTrabajoDui();
                ht.setSequencia(String.valueOf(cont++));
                ht.setItem(rs.getString(1));
                ht.setSubpartidadec(rs.getString(2));
                ht.setSubpartidadet(rs.getString(3));
                ht.setGestion(rs.getString(4));
                ht.setAduana(rs.getString(5));
                ht.setSerial(rs.getString(6));
                ht.setNumero(rs.getString(7));
                ht.setFechaval(rs.getString(8));
                ht.setFechavcto(rs.getString(9));

                ht.setDecfobusd(rs.getString(10));
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
                ht.setTipoalcance(rs.getString(28));
                ht.setContravencionorden(rs.getString(29));
                htls.add(ht);
            }
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return htls;
    }
    
    public List<HojaTrabajoDui> hojaTrabajoTramite(GeneracionHojaForm bean) throws SQLException, ClassNotFoundException,
                                                                               NamingException {
        List<HojaTrabajoDui> htls = new ArrayList<HojaTrabajoDui>();
        int cont = 1;
        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_seguimiento.devuelve_hoja_trabajo_tramite ( ?)}");
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, bean.getCodigo());
            call.execute();
            rs = (ResultSet)call.getObject(1);
            while (rs.next()) {
                HojaTrabajoDui ht = new HojaTrabajoDui();
                ht.setSequencia(String.valueOf(cont++));
                ht.setCodigo(rs.getString(1));
                ht.setTipotramite(rs.getString(2));
                ht.setTramite(rs.getString(3));
                ht.setTipoalcance(rs.getString(4));
                ht.setItem(rs.getString(5));
            
                ht.setFecha(rs.getString(7));
                ht.setProveedor(rs.getString(8));
                ht.setMercancia(rs.getString(9));
                //ht.setDetfobusd2(Double.parseDouble(rs.getString(10)));
                if(rs.getString(10) == null)
                    ht.setDetfobusd(rs.getString(10));
                else 
                    ht.setDetfobusd(rs.getString(10).replace('.',','));
                
                if(rs.getString(11) == null)
                    ht.setDetfleteusd(rs.getString(11));
                else
                    ht.setDetfleteusd(rs.getString(11).replace('.',','));
                
                if(rs.getString(12) == null)
                    ht.setDetsegurousd(rs.getString(12));
                else
                    ht.setDetsegurousd(rs.getString(12).replace('.',','));
                
                if(rs.getString(13) == null)
                    ht.setDetotrosusd(rs.getString(13));
                else
                    ht.setDetotrosusd(rs.getString(13).replace('.',','));
                     
                if(rs.getString(14) == null)
                    ht.setDetcifusd(rs.getString(14));
                else
                    ht.setDetcifusd(rs.getString(14).replace('.',','));
                     
                if(rs.getString(15) == null)
                    ht.setDetcifbs(rs.getString(15));
                else
                    ht.setDetcifbs(rs.getString(15).replace('.',','));
                     
                if(rs.getString(16) == null)
                    ht.setDetcifufv(rs.getString(16));
                else
                    ht.setDetcifufv(rs.getString(16).replace('.',','));
                
                ht.setIlicitodet(rs.getString(17));
                if(rs.getString(18) == null)
                    ht.setContravencionorden(rs.getString(18));
                else
                    ht.setContravencionorden(rs.getString(18).replace('.',','));
                /*     
                ht.setDetfleteusd(rs.getString(11));
                ht.setDetsegurousd(rs.getString(12));
                ht.setDetotrosusd(rs.getString(13));
                ht.setDetcifusd(rs.getString(14));
                ht.setDetcifbs(rs.getString(15));
                ht.setDetcifufv(rs.getString(16));*/
                htls.add(ht);
            }
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return htls;
    }

    public static String formatnum(String numero) {
        try {
            if (numero == null) {
                return null;
            } else {
                if (numero.equals("0")) {
                    return "0,00";
                } else {
                    if (numero.substring(0, 1).equals(".")) {
                        return "0," + numero.substring(1);
                    } else {
                        return numero;
                    }
                }
            }

        } catch (Exception ex) {
            return null;
        }
    }

}
