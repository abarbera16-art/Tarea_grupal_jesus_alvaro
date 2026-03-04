package com.refactoring.projects.project04;

/**
 * Implementación de la estrategia de notificación por SMS.
 * * @author Jesus y Alvaro
 * @version 1.0
 */
public class SmsNotificacion implements NotificacionStrategy {

    /**
     * Envía un mensaje de texto corto (SMS).
     * @param mensaje El texto del SMS.
     * @param destinatario El número de teléfono.
     */
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando Sms a " + destinatario + ": " + mensaje);  
     }
}