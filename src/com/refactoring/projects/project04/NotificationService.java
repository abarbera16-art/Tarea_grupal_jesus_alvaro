package com.refactoring.projects.project04;


public class NotificationService {


	public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (tipo.equals("rmail")) {
            System.out.println("Enviando email a " + destinatario + ": " + mensaje);
        } else if (tipo.equals("sms")) {
            System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
        } else if (tipo.equals("push")) {
            System.out.println("Enviando push a " + destinatario + ": " + mensaje);
        }
    }


/**
 * Servicio encargado de gestionar el envío de notificaciones.
 * <p>
 * <b>Refactorización - Paso 3:</b> Reemplazar condicionales con Polimorfismo.
 * <br>
 * Se ha eliminado totalmente la lógica condicional compleja.
 * Ahora se utiliza el patrón Strategy recibiendo la interfaz {@link NotificacionStrategy}
 * por parámetro, delegando la ejecución a la clase correspondiente.
 * </p>
 * @author Jesus y Alvaro
 * @version 1.3
 */


    /**
     * Envía una notificación ejecutando la estrategia recibida por parámetro.
     * <p>
     * Se elimina la responsabilidad de decidir qué tipo de notificación instanciar,
     * cumpliendo con el principio Abierto/Cerrado (Open/Closed Principle).
     * </p>
     * @param estrategia   La implementación específica a ejecutar (Email, SMS, Push).
     * @param mensaje      El contenido de la notificación.
     * @param destinatario El receptor del mensaje.
     */
    public void enviarNotificacion(NotificacionStrategy estrategia, String mensaje, String destinatario) { 
        estrategia.enviar(mensaje, destinatario);
    }
}

