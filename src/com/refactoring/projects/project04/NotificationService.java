package com.refactoring.projects.project04;

public class NotificationService {

    public void enviarNotificacion(NotificacionStrategy estrategia, String mensaje, String destinatario) { 
        estrategia.enviar(mensaje, destinatario);
    }
}