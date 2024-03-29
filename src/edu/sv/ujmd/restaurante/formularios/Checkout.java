/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.sv.ujmd.restaurante.formularios;

import edu.sv.ujmd.restaurante.clases.Alimentos;
import edu.sv.ujmd.restaurante.clases.Bebida;
import edu.sv.ujmd.restaurante.clases.Factura;
import edu.sv.ujmd.restaurante.util.CargarPropiedades;
import static edu.sv.ujmd.restaurante.util.CargarPropiedades.prop;
import edu.sv.ujmd.restaurante.util.ComboAlimentos;
import edu.sv.ujmd.restaurante.util.ComboBebidas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reyee
 */
public class Checkout extends javax.swing.JFrame {
    
float Subtotal=0;
    CargarPropiedades p;
    String idAlimentos;
    String idBebidas;
    String textAlimento;
    String textBebida;
    String CantidadAlimentos;
    String CantidadBebidas;
    Factura fac;
    ComboAlimentos comboAli;
    ComboBebidas comboBeb;
    public Checkout() {
        
        try{
        
        p = new CargarPropiedades();
        fac = new Factura();
        setIconImage(new ImageIcon(getClass().getResource("/edu/sv/ujmd/restaurante/icon/taco.png")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        CargarTexto();
        
        }catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

        

    }
        public void CargarTexto() {
        this.lblChechkoutAlimento.setText(prop.getProperty("lblCheckoutAlimento"));
        this.lblCheckoutBebida.setText(prop.getProperty("lblCheckoutBebida"));
        this.lblCheckoutCantidad.setText(prop.getProperty("lblCheckoutCantidad"));
        this.lblTituloCheckout.setText(prop.getProperty("lblTituloCheckout"));
        
        
    }

     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChechkoutAlimento = new javax.swing.JLabel();
        lblCheckoutBebida = new javax.swing.JLabel();
        lblCheckoutCantidad = new javax.swing.JLabel();
        txtAlimentos = new javax.swing.JTextField();
        txtBebidas = new javax.swing.JTextField();
        txtCantidadAlimentos = new javax.swing.JTextField();
        txtCantidadBebidas = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtSubtotal = new javax.swing.JTextField();
        lblTituloCheckout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrito de Compras");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblChechkoutAlimento.setText(".");

        lblCheckoutBebida.setText(".");

        lblCheckoutCantidad.setText(".");

        txtAlimentos.setEditable(false);
        txtAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlimentosActionPerformed(evt);
            }
        });

        txtBebidas.setEditable(false);

        txtCantidadAlimentos.setEditable(false);

        txtCantidadBebidas.setEditable(false);

        btnConfirmar.setText("Ingresar Datos");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtSubtotal.setEditable(false);

        lblTituloCheckout.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTituloCheckout.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCheckoutBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblChechkoutAlimento))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidadAlimentos)
                            .addComponent(txtCantidadBebidas)
                            .addComponent(lblCheckoutCantidad)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblTituloCheckout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTituloCheckout)
                .addGap(18, 18, 18)
                .addComponent(lblCheckoutCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChechkoutAlimento)
                    .addComponent(txtAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckoutBebida)
                    .addComponent(txtBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConfirmar.getAccessibleContext().setAccessibleName("Confirmar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

                
                
                if(Integer.parseInt(idAlimentos)==1 && Integer.parseInt(idBebidas) ==1){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)5.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)2.50);
                }else if(Integer.parseInt(idAlimentos)==1 && Integer.parseInt(idBebidas) ==2){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)5.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.75);
                }else if(Integer.parseInt(idAlimentos)==1 && Integer.parseInt(idBebidas) ==3){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)5.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.00);
                }else if(Integer.parseInt(idAlimentos)==2 && Integer.parseInt(idBebidas) ==1){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.50)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)2.50);
                }else if(Integer.parseInt(idAlimentos)==2 && Integer.parseInt(idBebidas) ==2){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.50)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.75);
                }else if(Integer.parseInt(idAlimentos)==2 && Integer.parseInt(idBebidas) ==3){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.50)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.00);
                }else if(Integer.parseInt(idAlimentos)==3 && Integer.parseInt(idBebidas) ==1){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)2.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)2.50);
                }else if(Integer.parseInt(idAlimentos)==3 && Integer.parseInt(idBebidas) ==2){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)2.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.75);
                }else if(Integer.parseInt(idAlimentos)==3 && Integer.parseInt(idBebidas) ==3){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)2.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.00);
                }else if(Integer.parseInt(idAlimentos)==4 && Integer.parseInt(idBebidas) ==1){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)2.50);
                }else if(Integer.parseInt(idAlimentos)==4 && Integer.parseInt(idBebidas) ==2){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.75);
                }else if(Integer.parseInt(idAlimentos)==4 && Integer.parseInt(idBebidas) ==3){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.00);
                }else if(Integer.parseInt(idAlimentos)==5 && Integer.parseInt(idBebidas) ==1){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.75)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)2.50);
                }else if(Integer.parseInt(idAlimentos)==5 && Integer.parseInt(idBebidas) ==2){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.75)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.75);
                }else if(Integer.parseInt(idAlimentos)==5 && Integer.parseInt(idBebidas) ==3){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)3.75)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.00);
                }else if(Integer.parseInt(idAlimentos)==6 && Integer.parseInt(idBebidas) ==1){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)4.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)2.50);
                }else if(Integer.parseInt(idAlimentos)==6 && Integer.parseInt(idBebidas) ==2){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)4.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.75);
                }else if(Integer.parseInt(idAlimentos)==6 && Integer.parseInt(idBebidas) ==3){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)4.25)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.00);
                }else if(Integer.parseInt(idAlimentos)==7 && Integer.parseInt(idBebidas) ==1){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)1.50)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)2.50);
                }else if(Integer.parseInt(idAlimentos)==7 && Integer.parseInt(idBebidas) ==2){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)1.50)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.75);
                }else if(Integer.parseInt(idAlimentos)==7 && Integer.parseInt(idBebidas) ==3){
                Subtotal = (Integer.parseInt(txtCantidadAlimentos.getText())*(float)1.50)+(Integer.parseInt(txtCantidadBebidas.getText())*(float)1.00);
                }
                
                String resultado = null;
                resultado = fac.IngresarDatos(
                    Integer.parseInt(idAlimentos),
                    Integer.parseInt(idBebidas),
                    Subtotal
        
                    );
                JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        txtSubtotal.setText("$" + String.valueOf(Subtotal));
        txtAlimentos.setText(textAlimento);
        txtBebidas.setText(textBebida);
        
        
        txtCantidadAlimentos.setText(CantidadAlimentos);
        txtCantidadBebidas.setText(CantidadBebidas);
        
        
    }//GEN-LAST:event_formWindowActivated

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlimentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlimentosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lblChechkoutAlimento;
    private javax.swing.JLabel lblCheckoutBebida;
    private javax.swing.JLabel lblCheckoutCantidad;
    private javax.swing.JLabel lblTituloCheckout;
    private javax.swing.JTextField txtAlimentos;
    private javax.swing.JTextField txtBebidas;
    private javax.swing.JTextField txtCantidadAlimentos;
    private javax.swing.JTextField txtCantidadBebidas;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
