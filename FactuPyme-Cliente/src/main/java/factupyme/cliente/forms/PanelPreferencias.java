package factupyme.cliente.forms;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import factupyme.cliente.vo.ProductoVO;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar Paché
 */
public class PanelPreferencias extends JPanel {

    private static final Logger log = Logger.getLogger(PanelPreferencias.class);

    public PanelPreferencias() {
        initComponents();
    }

    private void consultar() {
        setCursor(new Cursor(Cursor.WAIT_CURSOR));

        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);

        // GET request para encontrar los datos de un producto al azar
        String getProductoURL = "http://localhost:8080/Servidor/webapi/myresource";
        WebResource webResourceGet = client.resource(getProductoURL);
        ClientResponse response = webResourceGet.get(ClientResponse.class);
        ProductoVO producto = response.getEntity(ProductoVO.class);

        if (response.getStatus() != 200) {
            log.info("Error");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "ID Producto: " + producto.getId() 
                + "\n" + "Nombre: " + producto.getNombre() 
                + "\n", "Información", JOptionPane.INFORMATION_MESSAGE);

        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();

        jLabel1.setText("PANEL PREFERENCIAS");

        btnConsulta.setText("Preguntar Datos Producto");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsulta)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(btnConsulta)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
