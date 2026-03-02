package com.refactoring.projects.project04;

public class NotificationService {

	private static final String SMS = "sms";
	private static final String PUSH = "push";
	private static final String EMAIL = "email";

	public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (tipo.equals(EMAIL)) {
            System.out.println("Enviando email a " + destinatario + ": " + mensaje);
        } else if (tipo.equals(SMS)) {
            System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
        } else if (tipo.equals(PUSH)) {
            System.out.println("Enviando push a " + destinatario + ": " + mensaje);
        }
    }
	
}
