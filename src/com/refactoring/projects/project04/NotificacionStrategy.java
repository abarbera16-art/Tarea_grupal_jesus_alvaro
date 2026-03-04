package com.refactoring.projects.project04;

/**
 * Interfaz común para todos los tipos de notificaciones (Patrón Strategy).
 * <p>
 * Aplica el principio de inversión de dependencias para permitir polimorfismo.
 * </p>
 * @author Jesus y Alvaro
 * @version 1.0
 */
public interface NotificacionStrategy {
    /**
     * Envía el mensaje al destinatario especificado.
     * @param mensaje El contenido a enviar.
     * @param destinatario El receptor.
     */
    void enviar(String mensaje, String destinatario);
}