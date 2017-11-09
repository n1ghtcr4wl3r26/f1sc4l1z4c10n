package anb.negocio;


import anb.bean.CargaDescargaDmaForm;

import anb.entidades.Dma;
import anb.entidades.HojaExcel;
import anb.entidades.HojaExcelCab;

import anb.general.Respuesta;

import anb.persistencia.CargaDescargaDmaDao;

import java.sql.SQLException;

import java.util.List;

import javax.naming.NamingException;


public class CargaDescargaDmaNeg {
    private final CargaDescargaDmaDao dao = new CargaDescargaDmaDao();
    private final String CORRECTO_BD = "CORRECTO";
    private final String ERROR_BD = "ERROR";

    private boolean estaConectadoBd() {
        return dao != null;
    }
    
    public Respuesta<HojaExcel[]> hojaExcel(CargaDescargaDmaForm bean) {
        Respuesta<HojaExcel[]> respuesta = new Respuesta<HojaExcel[]>();
        respuesta.setCodigo(-1);
        if (estaConectadoBd()) {
            try {
                List<HojaExcel> result = dao.hojaExcel(bean);
                if (result == null || result.size() == 0) {
                    respuesta.setMensaje("No existen registros");
                    respuesta.setCodigo(0);
                } else {
                    respuesta.setCantidad(result.size());
                    respuesta.setCodigo(1);
                    respuesta.setMensaje("OK");
                    respuesta.setResultado(result.toArray(new HojaExcel[result.size()]));
                }
            } catch (SQLException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            } catch (ClassNotFoundException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            } catch (NamingException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            }
        } else {
            respuesta.setMensaje("Error. No se puede conectar a la base de datos.");
        }
        return respuesta;
    } 
    
    public Respuesta<HojaExcelCab> hojaExcelCap(CargaDescargaDmaForm bean) {
        Respuesta<HojaExcelCab> respuesta = new Respuesta<HojaExcelCab>();
        respuesta.setCodigo(-1);
        if (estaConectadoBd()) {
            try {
                HojaExcelCab result = dao.hojaExcelCap(bean);
                if (result == null ) {
                    respuesta.setMensaje("No existen registros");
                    respuesta.setCodigo(0);
                } else {
                    respuesta.setCantidad(1);
                    respuesta.setCodigo(1);
                    respuesta.setMensaje("OK");
                    respuesta.setResultado(result);
                }
            } catch (SQLException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            } catch (ClassNotFoundException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            } catch (NamingException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            }
        } else {
            respuesta.setMensaje("Error. No se puede conectar a la base de datos.");
        }
        return respuesta;
    } 
    
    public Respuesta<Dma[]> lista_dma(CargaDescargaDmaForm bean) {
        Respuesta<Dma[]> respuesta = new Respuesta<Dma[]>();
        respuesta.setCodigo(-1);
        if (estaConectadoBd()) {
            try {
                List<Dma> result = dao.lista_dma(bean);
                if (result == null || result.size() == 0) {
                    respuesta.setMensaje("No existen registros");
                    respuesta.setCodigo(0);
                } else {
                    respuesta.setCantidad(result.size());
                    respuesta.setCodigo(1);
                    respuesta.setMensaje("OK");
                    respuesta.setResultado(result.toArray(new Dma[result.size()]));
                }
            } catch (SQLException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            } catch (ClassNotFoundException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            } catch (NamingException e) {
                respuesta.setMensaje("Error no identificado -  " + e.getMessage());
            }
        } else {
            respuesta.setMensaje("Error. No se puede conectar a la base de datos.");
        }
        return respuesta;
    } 
}

