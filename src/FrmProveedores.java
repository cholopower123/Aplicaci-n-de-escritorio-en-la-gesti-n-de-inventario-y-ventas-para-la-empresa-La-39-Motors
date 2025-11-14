import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmProveedores extends javax.swing.JFrame {

    private ArrayList<Proveedor> listaProveedores = ControlProveedores.getListaProveedores();

    public FrmProveedores() {
        initComponents();
        configurarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtProductos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnContactar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnMostrarTodos = new javax.swing.JButton();
        btnlimpiarCampos = new javax.swing.JButton();
        txtEmpresa = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 60));

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 310, 60));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 200, 60));

        txtProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        getContentPane().add(txtProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 300, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proovedores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 105, 49));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 105, 49));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 105, 49));

        btnContactar.setText("Contactar");
        btnContactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContactar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 110, 49));

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProveedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 620, 250));

        btnMostrarTodos.setText("MostrarTodos");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 110, 49));

        btnlimpiarCampos.setText("Limpiar");
        btnlimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 105, 49));

        txtEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        getContentPane().add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 210, 60));

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 105, 49));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, -20, 370, 740));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu-icon-images-2 (1).jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -240, 470, 1160));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 980, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 550, 330));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, 290, 330));

        setSize(new java.awt.Dimension(659, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombre.getText();
        String empresa = txtEmpresa.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String productos = txtProductos.getText();

        if (nombre.isEmpty() || empresa.isEmpty() || telefono.isEmpty() || correo.isEmpty() || productos.isEmpty()) {
           JOptionPane.showMessageDialog(this, "No se pudo registrar el proveedor. Completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }

       Proveedor nuevo = new Proveedor(nombre, empresa, telefono, correo, productos);
       listaProveedores.add(nuevo);

       JOptionPane.showMessageDialog(this, "Proveedor registrado exitosamente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
       limpiarCampos(); 

    }//GEN-LAST:event_btnRegistrarActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = tblProveedores.getSelectedRow();
        if (fila >= 0) {

            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar este proveedor?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                listaProveedores.remove(fila);
               actualizarTabla(listaProveedores);
               JOptionPane.showMessageDialog(this, "Proveedor eliminado exitosamente.", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
           JOptionPane.showMessageDialog(this, "Selecciona un proveedor para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String criterio = JOptionPane.showInputDialog(this, "Ingrese nombre o producto a buscar:");
        if (criterio == null || criterio.isEmpty()) {
            return;
        }

        ArrayList<Proveedor> resultado = new ArrayList<>();
        for (Proveedor p : listaProveedores) {
            if (p.getNombre().equalsIgnoreCase(criterio) || p.getProductos().toLowerCase().contains(criterio.toLowerCase())) {
                resultado.add(p);
            }
        }

        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron proveedores.");
        } else {
            actualizarTabla(resultado);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        // TODO add your handling code here:
        actualizarTabla(listaProveedores);
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnContactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactarActionPerformed
        // TODO add your handling code here:
            int fila = tblProveedores.getSelectedRow();
    if (fila >= 0) {
        Proveedor proveedorSeleccionado = listaProveedores.get(fila);
        String correo = proveedorSeleccionado.getCorreo();
        JOptionPane.showMessageDialog(null, "Correo del proveedor: " + correo);
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona un proveedor primero.");
    }

    }//GEN-LAST:event_btnContactarActionPerformed

    private void btnlimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarCamposActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnlimpiarCamposActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas salir del sistema?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
           dispose(); 
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        FrmMenu FM= new FrmMenu();
            FM.setVisible(true);
            dispose();
    }//GEN-LAST:event_jLabel7MouseClicked
        private void configurarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Empresa", "Telefono",  "Productos"});
        tblProveedores.setModel(modelo);
        
    }
    
    private void actualizarTabla(ArrayList<Proveedor> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tblProveedores.getModel();
        modelo.setRowCount(0);

        for (Proveedor p : lista) {
            modelo.addRow(new Object[]{
                p.getNombre(),
                p.getEmpresa(),
                p.getTelefono(),
                p.getProductos()
            });
        }
    }
    
    private void limpiarCampos() {
        txtNombre.setText("");
        txtEmpresa.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtProductos.setText("");
    }   
    
   
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
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnContactar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnlimpiarCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProductos;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}