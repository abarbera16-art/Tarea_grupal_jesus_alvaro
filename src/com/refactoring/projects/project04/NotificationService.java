package com.refactoring.projects.project04;

public class NotificationService {

	//Aqui extraemos las constantes
    private static final String TIPO_EMAIL = "email";
    private static final String TIPO_SMS = "SMS";
	private static final String TIPO_PUSH = "push";
    
    public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (TIPO_EMAIL.equals(tipo)) {
            System.out.println("Enviando email a " + destinatario + ": " + mensaje);
        } else if (tipo.equals(TIPO_SMS)) {
            System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
        } else if (tipo.equals(TIPO_PUSH)) {
            System.out.println("Enviando push a " + destinatario + ": " + mensaje);
        }
    }
}