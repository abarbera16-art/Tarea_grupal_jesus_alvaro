package com.refactoring.projects.project04;

/**
 * Servicio encargado de gestionar el envío de notificaciones.
 * <p>
 * <b>Refactorización - Paso 3:</b> Reemplazar condicionales con Polimorfismo.
 * <br>
 * Se ha eliminado la lógica condicional compleja y los métodos privados extensos.
 * Ahora se utiliza el patrón Strategy a través de la interfaz {@link Notificacion},
 * delegando la responsabilidad del envío en clases especializadas (Email, SMS, Push).
 * </p>
 * @author Jesus y Alvaro
 * @version 1.3
 */
public class NotificationService {

    // Constantes para identificar el tipo de notificación
    private static final String TIPO_EMAIL = "email";
    private static final String TIPO_SMS = "sms";
    private static final String TIPO_PUSH = "push";

    /**
     * Envía una notificación instanciando dinámicamente la estrategia correcta.
     * <p>
     * Selecciona la implementación adecuada de {@link Notificacion} basándose en el
     * parámetro 'tipo' y ejecuta el envío sin conocer los detalles de la implementación.
     * </p>
     * @param tipo 		   El canal de envío (email, sms, push).
     * @param mensaje 	   El contenido de la notificación.
     * @param destinatario El receptor del mensaje.
     */
    public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        // Variable polimórfica (Interfaz)
        Notificacion notificacion = null;

        // Determinamos qué estrategia usar
        if (TIPO_EMAIL.equals(tipo)) {
            notificacion = new EmailNotificacion();
        } else if (TIPO_SMS.equals(tipo)) {
            notificacion = new SMSNotificacion();
        } else if (TIPO_PUSH.equals(tipo)) {
            notificacion = new PushNotificacion();
        }

        // Ejecutamos el envío delegando en la clase correspondiente
        if (notificacion != null) {
            notificacion.enviar(mensaje, destinatario);
        }
    }
}