package com.refactoring.projects.project04;

/**
 * Implementación de la estrategia de notificación Push.
 * * @author Jesus y Alvaro
 * @version 1.0
 */
public class PushNotificacion implements NotificacionStrategy {

    /**
     * Envía una notificación Push a un dispositivo.
     * @param mensaje El contenido de la notificación.
     * @param destinatario El ID del dispositivo o usuario.
     */
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando push a " + destinatario + ": " + mensaje);
    }
}