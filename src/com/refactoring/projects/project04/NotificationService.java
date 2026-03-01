package com.refactoring.projects.project04;
/**
 * Servicio encargado de gestionar el envío de notificaciones.
 * <p>
 * <b>Refactorización - Paso 1:</b> Extraer Constantes.
 * <br>
 * Se han eliminado los datos "hardcodeados" ("email", "sms", "push")
 * reemplazándolos por constantes estáticas para mejorar la legibilidad y
 * facilitar el mantenimiento del software.
 * </p>
 * @author Jesus y Alvaro
 * @version 1.1
 */

public class NotificationService {

	//Aqui extraemos las constantes
    private static final String TIPO_EMAIL = "email";
    private static final String TIPO_SMS = "SMS";
	private static final String TIPO_PUSH = "push";
    /**
     * Envia una notificación según el tipo, mensaje y destinatario proporcionados.
     * @param tipo 		El canal de envio (email,SMS, push)
     * @param mensaje 	El contenido de la notificación
     * @param destinatario	 El receptor del mensaje
     */
    public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (TIPO_EMAIL.equals(tipo)) {
            System.out.println("Enviando email a " + destinatario + ": " + mensaje);
        } else if (TIPO_SMS.equals(tipo)) {
            System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
        } else if (TIPO_PUSH.equals(tipo)) {
            System.out.println("Enviando push a " + destinatario + ": " + mensaje);
        }
    }
}