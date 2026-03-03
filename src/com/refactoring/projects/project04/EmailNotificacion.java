package com.refactoring.projects.project04;

public class EmailNotificacion implements NotificacionStrategy {
	
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}
