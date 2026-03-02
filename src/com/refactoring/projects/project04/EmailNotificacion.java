package com.refactoring.projects.project04;

public class EmailNotificacion implements Notificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}