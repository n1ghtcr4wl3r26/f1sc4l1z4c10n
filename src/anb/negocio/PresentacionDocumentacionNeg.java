package anb.negocio;


import anb.bean.PresentacionDocumentacionForm;

import anb.general.Respuesta;

import anb.persistencia.PresentacionDocumentacionDao;

import java.sql.SQLException;

import javax.naming.NamingException;


public class PresentacionDocumentacionNeg {
    private final PresentacionDocumentacionDao dao = new PresentacionDocumentacionDao();
    private final String CORRECTO_BD = "CORRECTO";
    private final String ERROR_BD = "ERROR";

    private boolean estaConectadoBd() {
        return dao != null;
    }

    public Respuesta<Boolean> graba_presentacion(PresentacionDocumentacionForm bean){
        Respuesta<Boolean> respuesta = new Respuesta<Boolean>();
        respuesta.setCodigo(-1);
        respuesta.setResultado(false);
        if (estaConectadoBd()) {
            try {
                String result = dao.graba_presentacion(bean);
                if (result == null) {
                    respuesta.setMensaje("No se pudo guardar la información");
                } else if (result.substring(0, 8).equals(CORRECTO_BD)) {
                    respuesta.setCodigo(1);
                    respuesta.setMensaje(result.substring(8));
                    respuesta.setResultado(true);
                } else {
                    respuesta.setMensaje(result);
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
    
    public Respuesta<PresentacionDocumentacionForm> devuelvePresentacion(PresentacionDocumentacionForm bean) {
        Respuesta<PresentacionDocumentacionForm> respuesta = new Respuesta<PresentacionDocumentacionForm>();
        respuesta.setCodigo(-1);
        if (estaConectadoBd()) {
            try {
                PresentacionDocumentacionForm res = dao.devuelvePresentacion(bean);
                if (res == null ) {
                    respuesta.setCodigo(0);
                    respuesta.setMensaje("No existen control registrado");
                } else {
                    respuesta.setCodigo(1);
                    respuesta.setMensaje("OK");
                    respuesta.setResultado(res);
                }
            } catch (SQLException e) {
                respuesta.setMensaje("Error no identificado - " + e.getMessage());
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                respuesta.setMensaje("Error no identificado - " + e.getMessage());
            } catch (NamingException e) {
                respuesta.setMensaje("Error no identificado - " + e.getMessage());
            }
        } else {
            respuesta.setMensaje("Error. No se puede conectar a la base de datos.");
        }

        return respuesta;
    }
}
