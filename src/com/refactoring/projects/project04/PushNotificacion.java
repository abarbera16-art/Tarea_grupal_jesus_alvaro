package com.refactoring.projects.project04;

public class PushNotificacion implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando push a " + destinatario + ": " + mensaje);
        
    }
}