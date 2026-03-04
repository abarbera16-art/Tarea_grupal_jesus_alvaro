package com.refactoring.projects.project04;

/**
 * Implementación de la estrategia de notificación por correo electrónico.
 * * @author Jesus y Alvaro
 * @version 1.0
 */
public class EmailNotificacion implements NotificacionStrategy {

    /**
     * Envía un mensaje a través de correo electrónico.
     * @param mensaje El cuerpo del correo.
     * @param destinatario La dirección de email de destino.
     */
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);  
    }
}