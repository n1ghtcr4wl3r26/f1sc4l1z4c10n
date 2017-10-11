package anb.persistencia;


import anb.bean.NotificacionControlForm;

import anb.general.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import oracle.jdbc.OracleTypes;


public class NotificacionDao extends Conexion {
    public NotificacionDao() {
        super();
    }
    
    public String graba_notificacion(NotificacionControlForm bean) throws SQLException, ClassNotFoundException,
                                                                  NamingException {
        String res;
        try {
            open();
            call = cn.prepareCall("{ ? = call pkg_seguimiento.graba_notificacion ( ?,?,?,?,?, ?,?,?,?,?,?)}");
            call.registerOutParameter(1, OracleTypes.VARCHAR);
            call.setString(2, bean.getCodigo());
            call.setString(3, bean.getUsuario());
            call.setString(4, bean.getFechaNotificacion());
            call.setString(5, bean.getTipoNotificacion());
            call.setString(6, bean.getObservacion());
            call.setString(7, bean.getEsapoderado());
            call.setString(8, bean.getNroCIPersona());
            call.setString(9, bean.getExpCIPersona());
            call.setString(10, bean.getNombrePersona());
            call.setString(11, bean.getApPatPersona());
            call.setString(12, bean.getApMatPersona());
            call.execute();
            res = (String)call.getObject(1);
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return res;
    }
    
    public NotificacionControlForm devuelveNotificacion(NotificacionControlForm bean) throws SQLException, ClassNotFoundException, NamingException {
       try {
           open();
           call = cn.prepareCall("{ ? = call pkg_seguimiento.devuelve_notificacion ( ? )}");
           call.registerOutParameter(1, OracleTypes.CURSOR);
           call.setString(2, bean.getCodigo());
           call.execute();
           rs = (ResultSet) call.getObject(1);           
           while (rs.next()) {
               bean.setCodigo(rs.getString(1));
               bean.setFechaNotificacion(rs.getString(2));
               bean.setTipoNotificacion(rs.getString(3));
               bean.setObservacion(rs.getString(4)); 
               bean.setEsapoderado(rs.getString(9));
               bean.setNroCIPersona(rs.getString(10));
               bean.setExpCIPersona(rs.getString(11));
               bean.setNombrePersona(rs.getString(12));
               bean.setApPatPersona(rs.getString(13));
               bean.setApMatPersona(rs.getString(14));
           }
       } finally {
           if (cn != null) {
               cn.close();
           }
       }
       return bean;
    }
}