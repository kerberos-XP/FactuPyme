package factupyme.cliente.forms;

import factupyme.cliente.utilities.Utils;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar Paché
 */
public class PanelPrincipal extends JFrame {

    private static final Logger log = Logger.getLogger(PanelPrincipal.class);

    public PanelPrincipal() {
        initComponents();
    }

    private void preferencias() {
        this.getContentPane().removeAll();
        this.add(new PanelPreferencias());
        refrescarPanel();
    }

    private void acercaDe() {
        JOptionPane.showMessageDialog(null, "Sistema de Facturación Electrónica."
                + " \nSi tiene dudas escríbanos a contacto@factupyme.cl", 
                "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }

    private void refrescarPanel() {
        this.paintAll(this.getGraphics());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        separdor = new javax.swing.JPopupMenu.Separator();
        itemPreferencias = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        itemVentaPOS = new javax.swing.JMenuItem();
        menuAbastecimiento = new javax.swing.JMenu();
        itemProductos = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        panelPrincipal.setBorder(null);

        jLabel1.setText("FACTU  PYME");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        getContentPane().add(panelPrincipal, "card2");

        barraMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        menuSistema.setText("Sistema");
        menuSistema.add(separdor);

        itemPreferencias.setText("Preferencias");
        itemPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPreferenciasActionPerformed(evt);
            }
        });
        menuSistema.add(itemPreferencias);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuSistema.add(itemSalir);

        barraMenu.add(menuSistema);

        menuVentas.setText("Ventas");

        itemVentaPOS.setText("Venta POS");
        itemVentaPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVentaPOSActionPerformed(evt);
            }
        });
        menuVentas.add(itemVentaPOS);

        barraMenu.add(menuVentas);

        menuAbastecimiento.setText("Abastecimiento");

        itemProductos.setText("Productos");
        itemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosActionPerformed(evt);
            }
        });
        menuAbastecimiento.add(itemProductos);

        barraMenu.add(menuAbastecimiento);

        menuAyuda.setText("Ayuda");

        itemAcercaDe.setText("Acerca de");
        itemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(itemAcercaDe);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        Utils.cerrarAplicacion();
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPreferenciasActionPerformed
        preferencias();
    }//GEN-LAST:event_itemPreferenciasActionPerformed

    private void itemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcercaDeActionPerformed
        acercaDe();
    }//GEN-LAST:event_itemAcercaDeActionPerformed

    private void itemVentaPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVentaPOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemVentaPOSActionPerformed

    private void itemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemProductosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemAcercaDe;
    private javax.swing.JMenuItem itemPreferencias;
    private javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemVentaPOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu menuAbastecimiento;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPopupMenu.Separator separdor;
    // End of variables declaration//GEN-END:variables
}
