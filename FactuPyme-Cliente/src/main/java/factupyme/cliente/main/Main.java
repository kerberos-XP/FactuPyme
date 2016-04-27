package factupyme.cliente.main;

import com.pagosoft.plaf.PlafOptions;
import factupyme.cliente.forms.PanelPrincipal;
import factupyme.cliente.utilities.Utils;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;


/**
 *
 * @author Omar Paché
 */
public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    private static PanelPrincipal ventanaPrincipal;

    public static PanelPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public static void main(String args[]) {

        // Establecer apariencia de la aplicación
        PlafOptions.setAsLookAndFeel();
        PlafOptions.updateAllUIs();

        if (!Utils.comprobarInstancia()) {
            JOptionPane.showMessageDialog(null, "La aplicación ya está ejecutándose en otra ventana",
                    "Error", JOptionPane.ERROR_MESSAGE);
            Utils.cerrarAplicacion();
        }

        log.info("Iniciando Aplicacion");
        // Mostrar S.O.
        log.info("S.O. cliente: " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " "
                + System.getProperty("os.arch"));
        // Mostrar usuario S.0.
        log.info("Nombre usuario S.O: " + System.getProperty("user.name"));
        // Mostrar version java
        log.info("Version JRE: " + System.getProperty("java.version") + " de " + System.getProperty("java.vendor"));

        // Obtiene los valores del archivo de propiedades
        Utils.leerArchivoPropiedades();

        // Levantar ventana principal
        ventanaPrincipal = new PanelPrincipal();
        ventanaPrincipal.setTitle("Colegio Fácil");
        ventanaPrincipal.setIconImage(Utils.getIcono());
        ventanaPrincipal.setMinimumSize(new Dimension(800, 600));
        ventanaPrincipal.setResizable(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setVisible(true);
    }

}
