package anb.persistencia;


import anb.bean.GeneracionHojaForm;

import anb.bean.TributosOmitidosForm;

import anb.entidades.HojaTrabajoDui;

import anb.entidades.TributosOmitidos;
import anb.entidades.TributosOmitidosTotales;

import anb.general.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import oracle.jdbc.OracleTypes;


public class TributosOmitidosDao extends Conexion {
    public TributosOmitidosDao() {
        super();
    }
    
    
    public List<TributosOmitidos> devuelveTributosOmitidos(TributosOmitidosForm bean) throws SQLException, ClassNotFoundException,
                                                                  NamingException {
        List<TributosOmitidos> htls = new ArrayList<TributosOmitidos>();
        int cont = 1;
        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_reporte.devuelve_tributos3 ( ?)}");
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, bean.getCodigo());
            call.execute();
            rs = (ResultSet)call.getObject(1);
            while (rs.next()) {
                TributosOmitidos ht = new TributosOmitidos();
                ht.setNumero(String.valueOf(cont++));
                ht.setDui(rs.getString(1));
                ht.setFechareg(rs.getString(2));
                ht.setGa(rs.getString(4));
                ht.setIva(rs.getString(5));
                ht.setIce(rs.getString(6));
                ht.setIehd(rs.getString(7));
                ht.setIcd(rs.getString(8));
                ht.setSancionufv(rs.getString(10));
                ht.setSancionbs(rs.getString(11));
                ht.setTotal(rs.getString(9));
                htls.add(ht);
            }
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return htls;
    }
    

    public TributosOmitidosTotales devuelveTributosOmitidosTotales(TributosOmitidosForm bean) throws SQLException, ClassNotFoundException,
                                                                  NamingException {
        TributosOmitidosTotales ht = new TributosOmitidosTotales();
        int cont = 1;
        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_reporte.devuelve_tributos3tot ( ?)}");
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, bean.getCodigo());
            call.execute();
            rs = (ResultSet)call.getObject(1);
            while (rs.next()) {
                ht.setGa(rs.getString(1));
                ht.setIva(rs.getString(2));
                ht.setIce(rs.getString(3));
                ht.setIehd(rs.getString(4));
                ht.setIcd(rs.getString(5));
                ht.setTotal(rs.getString(6));
                ht.setSancionufv(rs.getString(7));
                ht.setSancionbs(rs.getString(8));
                ht.setTotalfinal(rs.getString(9));
                ht.setContrav(rs.getString(10));
                ht.setContravorden(rs.getString(11));   
                ht.setSubtotal(rs.getString(12));
            }
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return ht;
    }
    
}
