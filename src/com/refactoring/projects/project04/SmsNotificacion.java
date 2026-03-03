package com.refactoring.projects.project04;

public class SmsNotificacion implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando Sms a " + destinatario + ": " + mensaje);   
    }
}