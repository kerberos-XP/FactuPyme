package factupyme.cliente.utilities;

import factupyme.cliente.main.Main;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import java.util.Properties;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

/**
 * Clase con funciones de utilidad
 *
 * @author Omar Paché
 */
public class Utils {

    private static final Logger log = Logger.getLogger(Utils.class);

    /**
     * Evalua si ya existe otra instancia del programa en ejecución
     *
     * @return true en caso de que no este corriendo otra instancia del programa, falso si ya esta corriendo
     */
    public static boolean comprobarInstancia() {
        UnaInstancia ui;
        try {
            Socket clientSocket = new Socket("localhost", UnaInstancia.PORT);
            return false;
        } catch (IOException e) {
            ui = new UnaInstancia();
            ui.start();
            return true;
        }
    }

    /**
     * Cierra la aplicación
     */
    public static void cerrarAplicacion() {
        System.exit(0);
    }

    /**
     * Lee el archivo de propiedades y carga su valores en variables globales
     */
    public static void leerArchivoPropiedades() {
        Properties propiedades = new Properties();
        InputStream in;
        try {
            in = (Utils.class).getClassLoader().getResourceAsStream("configuracion.properties");
            propiedades.load(in);
        } catch (IOException e) {
            log.warn("Error al leer archivo configuracion.properties", e);
        }
        
        Global.ambiente = propiedades.getProperty("ambiente");
        log.info("Ambiente: " + Global.ambiente);
    }
    
    /**
     * Imagen de icono para la ventana principal
     * 
     * @return 
     */
    public static Image getIcono(){
        URL urlDeLaImagen = Main.class.getClassLoader().getResource("images/icon.png");
        ImageIcon img = new ImageIcon(urlDeLaImagen);
        return img.getImage();
    }
}
