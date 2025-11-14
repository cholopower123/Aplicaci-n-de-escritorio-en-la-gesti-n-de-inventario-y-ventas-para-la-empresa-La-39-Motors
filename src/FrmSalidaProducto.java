import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FrmSalidaProducto extends javax.swing.JFrame {

   private Inventario inventario;
   
    public FrmSalidaProducto(Inventario inventario) {
        initComponents();
        this.inventario = inventario;
        cargarProductosEnComboBox();
        
        
    }
  public FrmSalidaProducto() {
        // Obtiene la instancia Singleton de Inventario a través de ControlInventario
        this.inventario = ControlInventario.getInventario();
        initComponents();
        cargarProductosEnComboBox();
        
        
    }
       
     private void cargarProductosEnComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        // Se asegura que 'inventario' no sea null antes de intentar acceder a sus productos
        if (inventario != null && inventario.getListaProductos() != null) {
            for (Producto p : inventario.getListaProductos()) {
                // Se asegura que el producto y su nombre no sean null antes de añadirlo
                if (p != null && p.getNombre() != null) {
                    model.addElement(p.getNombre());
                }
            }
        }
        cbProducto.setModel(model); // Asigna el modelo al JComboBox
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbProducto = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        btnRegistrarSalida = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnestablecerminimo = new javax.swing.JButton();
        btnstockbajo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE SALIDA DE PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 45, -1, -1));

        cbProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto:"));
        cbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 107, 264, 49));

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad:"));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 111, 262, -1));

        txtVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del vendedor:"));
        txtVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 168, 262, -1));

        txtMotivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Motivo de salida:"));
        txtMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 168, 264, -1));

        btnRegistrarSalida.setText("Registrar salida");
        btnRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 239, 130, 35));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setText("Salir ");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 337, -1, 38));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu-icon-images-2 (1).jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        btnestablecerminimo.setText("ESTABLECER MINIMO DE STOCK");
        btnestablecerminimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestablecerminimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnestablecerminimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 280, -1, 45));

        btnstockbajo.setText("Productos con bajo Stock");
        btnstockbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstockbajoActionPerformed(evt);
            }
        });
        getContentPane().add(btnstockbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 204, 45));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -100, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -100, -1, -1));

        setSize(new java.awt.Dimension(635, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendedorActionPerformed
private void mostrarProductosConStockBajo() {
    List<Producto> bajos = inventario.obtenerProductosConStockBajo();
    if (bajos.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los productos tienen stock suficiente.");
        return;
    }

    StringBuilder mensaje = new StringBuilder("Productos con stock bajo:\n\n");
    for (Producto p : bajos) {
        mensaje.append("- ").append(p.getNombre())
               .append(": ").append(p.getCantidad())
               .append(" unidades (mínimo: ").append(p.getStockMinimo()).append(")\n");
    }

    JOptionPane.showMessageDialog(this, mensaje.toString());
}

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        FrmMenu FM= new FrmMenu();
        FM.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
private void establecerMinimoProducto() {
    String productoSeleccionado = (String) cbProducto.getSelectedItem();
    if (productoSeleccionado == null) {
        JOptionPane.showMessageDialog(this, "Selecciona un producto.");
        return;
    }

    String input = JOptionPane.showInputDialog(this, "Ingrese nuevo límite mínimo para '" + productoSeleccionado + "':");
    try {
        int nuevoMinimo = Integer.parseInt(input);
        boolean actualizado = inventario.establecerStockMinimo(productoSeleccionado, nuevoMinimo);
        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Límite mínimo actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Producto no encontrado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un número válido.");
    }
}
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
   int respuesta = JOptionPane.showConfirmDialog(
        this,
        "¿Estás seguro de que deseas salir?",
        "Confirmar salida",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );

    if (respuesta == JOptionPane.YES_OPTION) {
        this.dispose(); // Solo cierra FrmSalidaProducto
    }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProductoActionPerformed
private void limpiarCampos() {
        txtCantidad.setText("");
        txtMotivo.setText("");
        txtVendedor.setText("");
        cbProducto.setSelectedIndex(0); // Selecciona el primer elemento
    }
    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed
        
    String nombreProducto = cbProducto.getSelectedItem().toString();
    String cantidadStr = txtCantidad.getText();
    String motivo = txtMotivo.getText();
    String nombreVendedor = txtVendedor.getText();
    LocalDateTime fechaSalida = LocalDateTime.now();

    if (nombreProducto == null || cantidadStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Completa todos los campos.");
        return;
    }

    try {
        int cantidad = Integer.parseInt(cantidadStr);
        boolean exito = inventario.registrarSalidaProducto(nombreProducto, cantidad, motivo, nombreVendedor, fechaSalida);

        if (exito) {
            // 🔸 Aquí colocas el código de RF28
            Producto producto = null;
            for (Producto p : inventario.getListaProductos()) {
                if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
                    producto = p;
                    break;
                }
            }

            if (producto != null && producto.getCantidad() <= producto.getStockMinimo()) {
                JOptionPane.showMessageDialog(this,
                    "️ Alerta: El producto '" + producto.getNombre() + "' tiene stock bajo.\n" +
                    "Unidades restantes: " + producto.getCantidad(),
                    "Stock Bajo", JOptionPane.WARNING_MESSAGE);
            }
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Cantidad inválida.");
    }

    
    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed

    private void txtMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoActionPerformed

    private void btnestablecerminimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestablecerminimoActionPerformed
        establecerMinimoProducto();
    }//GEN-LAST:event_btnestablecerminimoActionPerformed

    private void btnstockbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstockbajoActionPerformed
        mostrarProductosConStockBajo();
    }//GEN-LAST:event_btnstockbajoActionPerformed

  
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
            java.util.logging.Logger.getLogger(FrmSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new FrmSalidaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JButton btnestablecerminimo;
    private javax.swing.JButton btnstockbajo;
    private javax.swing.JComboBox<String> cbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}

