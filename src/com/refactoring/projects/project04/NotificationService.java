package com.refactoring.projects.project04;

public class NotificationService {

	public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (tipo.equals("email")) {
            System.out.println("Enviando email a " + destinatario + ": " + mensaje);
        } else if (tipo.equals("sms")) {
            System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
        } else if (tipo.equals("push")) {
            System.out.println("Enviando push a " + destinatario + ": " + mensaje);
        }
    }
}
