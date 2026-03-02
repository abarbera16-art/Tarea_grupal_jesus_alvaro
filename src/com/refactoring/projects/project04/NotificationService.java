package com.refactoring.projects.project04;

/**
 * Servicio encargado de gestionar el envío de notificaciones.
 * <p>
 * <b>Refactorización - Paso 2:</b> Extraer Métodos.
 * <br>
 * Se ha aplicado el patrón "Extraer métodos" para solucionar el code smell de 
 * "Métodos muy largos". Ahora cada método privado realiza una única tarea, 
 * mejorando la legibilidad y facilitando la reutilización.
 * </p>
 * @author Jesus y Alvaro
 * @version 1.2
 */
public class NotificationService {

	// Constantes extraídas en el paso 1
    private static final String TIPO_EMAIL = "email";
    private static final String TIPO_SMS = "sms";
	private static final String TIPO_PUSH = "push";

    /**
     * Envía una notificación delegando la lógica en métodos especializados.
     * @param tipo 		   El canal de envío (email, sms, push)
     * @param mensaje 	   El contenido de la notificación
     * @param destinatario El receptor del mensaje
     */
    public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (TIPO_EMAIL.equals(tipo)) {
            enviarEmail(mensaje, destinatario);
        } else if (TIPO_SMS.equals(tipo)) {
            enviarSMS(mensaje, destinatario);
        } else if (TIPO_PUSH.equals(tipo)) {
            enviarPush(mensaje, destinatario);
        }
    }

    // --- MÉTODOS EXTRAÍDOS (Refactorización Paso 2) ---

    /**
     * Envía un correo electrónico.
     * @param mensaje El cuerpo del correo.
     * @param destinatario La dirección de email de destino.
     */
    private void enviarEmail(String mensaje, String destinatario) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }

    /**
     * Envía un mensaje SMS.
     * @param mensaje El texto del SMS.
     * @param destinatario El número de teléfono.
     */
    private void enviarSMS(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }

    /**
     * Envía una notificación Push.
     * @param mensaje El contenido de la notificación.
     * @param destinatario El ID del dispositivo o usuario.
     */
    private void enviarPush(String mensaje, String destinatario) {
        System.out.println("Enviando push a " + destinatario + ": " + mensaje);
    }
}