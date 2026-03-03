package com.refactoring.projects.project04;

public class NotificationService {
    
    private static final String SMS = "sms";
    private static final String PUSH = "push";
    private static final String EMAIL = "email";

    public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (tipo.equals(EMAIL)) {
            enviarEmail(mensaje, destinatario);
        } else if (tipo.equals(SMS)) {
            enviarSMS(mensaje, destinatario);
        } else if (tipo.equals(PUSH)) {
            Enviarpush(mensaje, destinatario);
        }
    }

    private void Enviarpush(String mensaje, String destinatario) {
        System.out.println("Enviando push a " + destinatario + ": " + mensaje);
    }

    private void enviarSMS(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }

    private void enviarEmail(String mensaje, String destinatario) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}