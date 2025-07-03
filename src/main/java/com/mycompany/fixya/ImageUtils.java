package com.mycompany.fixya;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Utilidades para trabajar con imágenes en etiquetas.
 */
public class ImageUtils {

    /**
     * Ajusta una imagen al tamaño de un JLabel y la establece como su icono.
     *
     * @param label JLabel destino
     * @param resourcePath ruta del recurso de imagen
     */
    public static void setImageLabel(JLabel label, String resourcePath) {
        ImageIcon image = new ImageIcon(ImageUtils.class.getResource(resourcePath));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(
                label.getWidth(),
                label.getHeight(),
                Image.SCALE_FAST));
        label.setIcon(icon);
    }
}
