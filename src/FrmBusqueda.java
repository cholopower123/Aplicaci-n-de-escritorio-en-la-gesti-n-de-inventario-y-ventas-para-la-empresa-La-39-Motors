import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import java.util.stream.Collectors;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Element;
import com.itextpdf.text.Chunk;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




public class FrmBusqueda extends javax.swing.JFrame {
    
    private Inventario inventario;
    private ArrayList<Producto> ListaProductos=new ArrayList<>();
    //Cosntructor
    public FrmBusqueda(Inventario inventario) {
        initComponents();
        this.ListaProductos=(ArrayList<Producto>)inventario.getListaProductos();
        cargarCategorias(inventario.getListaCategorias());
        cargarTabla(ListaProductos);
    }
    
    public void actualizarComboCategorias(){
        cbCategoria.removeAllItems();
        cbCategoria.addItem("Todas");
        for(Categoria c:inventario.getListaCategorias()){
            cbCategoria.addItem(c.getNombre());
        }
    }

    FrmBusqueda() {
    initComponents();
    }
    

    private void cargarTabla(ArrayList<Producto> productos){
        // 1. Define los nombres de tus columnas
        String[] nombresColumnas = {"Producto", "Precio", "Cantidad", "Categoria"}; // <-- NUEVA LÍNEA

        // 2. Crea un nuevo DefaultTableModel con los nombres de columna definidos
        //    y 0 filas iniciales.
        DefaultTableModel model = new DefaultTableModel(nombresColumnas, 0); // <-- LÍNEA CAMBIADA

        // 3. Asigna este nuevo modelo a tu tabla.
        //    (La línea que tenías antes: 'DefaultTableModel model = (DefaultTableModel) tblBusquedaProducto.getModel();'
        //    ya no es necesaria porque estamos creando uno nuevo)
        tblBusquedaProducto.setModel(model); // <-- NUEVA LÍNEA

        // 4. (Opcional, pero recomendado si quieres limpiar la tabla antes de cargar)
        //    Si ya estás creando un nuevo modelo cada vez, setRowCount(0) puede ser redundante aquí
        //    pero no hace daño si quieres asegurarte. Sin embargo, al crear un modelo nuevo con 0 filas
        //    ya estará vacío.
        // model.setRowCount(0); // <-- Esta línea podría ser eliminada o mantenerse, pero ya no es crítica para limpiar.

        // 5. Procede a agregar las filas como lo hacías antes,
        //    asegurándote de que los datos de 'fila' correspondan al orden de 'nombresColumnas'.
        for (Producto prod : productos) {
            Object[] fila = {
                prod.getNombre(),
                prod.getPrecio(),
                prod.getCantidad(),
                prod.getCategoria()
            };
            model.addRow(fila);
        }
    }
    
    

    private void InicializarProducto(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusquedaProducto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnBuscarCategoria = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtGenerarRegistro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBusquedaProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBusquedaProducto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 267, 690, 395));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("Busqueda de Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 210, -1));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONA---", "Llantas", "Aceite", "Luces", "Parachoque", "Rines", "Tubo de Escape", "Bujias", " " }));
        cbCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elegir categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 510, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu-icon-images-2 (1).jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtNombreProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 510, 66));

        btnBuscarProducto.setText("Buscar por Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 150, 50));

        btnBuscarCategoria.setText("Buscar por Categoria");
        btnBuscarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 50));

        jButton1.setText("Todos los Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 170, 50));

        txtGenerarRegistro.setText("Generar Registro");
        txtGenerarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenerarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(txtGenerarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 130, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(721, 676));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            FrmMenu FM= new FrmMenu();
            FM.setVisible(true);
            dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
    
    private void btnBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaActionPerformed
        String categoriaSeleccionada = (String) cbCategoria.getSelectedItem();
        if (categoriaSeleccionada == null || categoriaSeleccionada.equals("---SELECCIONA---")) {
        cargarTabla(this.ListaProductos);
        return;
        }

        ArrayList<Producto> productosFiltrados = (ArrayList<Producto>) this.ListaProductos.stream()
        .filter(p -> p.getCategoria().equalsIgnoreCase(categoriaSeleccionada))
        .collect(Collectors.toCollection(ArrayList::new));

        if (productosFiltrados.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "No hay productos en esa categoría.");
        }
        
        cargarTabla(productosFiltrados);
    }//GEN-LAST:event_btnBuscarCategoriaActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        String nombreBuscado = txtNombreProducto.getText().trim();
        
        if (nombreBuscado.isEmpty())
        {
            cargarTabla(this.ListaProductos);
            return;
        }
        ArrayList<Producto> productosFiltrados = (ArrayList<Producto>) this.ListaProductos.stream().filter(p -> p.getNombre().toLowerCase().contains(nombreBuscado.toLowerCase())).collect(Collectors.toCollection(ArrayList::new));
        
        cargarTabla(productosFiltrados);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarTabla(this.ListaProductos);
        cbCategoria.setSelectedIndex(0);
        txtNombreProducto.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtGenerarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenerarRegistroActionPerformed
try {
        DefaultTableModel model = (DefaultTableModel) tblBusquedaProducto.getModel();

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "La tabla de proveedores está vacía. No hay datos para generar el reporte.", "Reporte Vacío", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Reporte de Productos");
        fileChooser.setSelectedFile(new File("ReporteProductos.pdf"));

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
            Paragraph titulo = new Paragraph("Reporte de Productos", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            document.add(new Paragraph(Chunk.NEWLINE));

            Font fontInfo = FontFactory.getFont(FontFactory.HELVETICA, 10);
            Paragraph info = new Paragraph("Fecha de generación: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()), fontInfo);
            info.setAlignment(Element.ALIGN_RIGHT);
            document.add(info);
            document.add(new Paragraph(Chunk.NEWLINE));

            PdfPTable table = new PdfPTable(model.getColumnCount());
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            Font fontHeader = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
            for (int i = 0; i < model.getColumnCount(); i++) {
                table.addCell(new Phrase(model.getColumnName(i), fontHeader));
            }

            Font fontCell = FontFactory.getFont(FontFactory.HELVETICA, 10);
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object cellValue = model.getValueAt(i, j);
                    table.addCell(new Phrase(cellValue != null ? cellValue.toString() : "", fontCell));
                }
            }

            document.add(table);

            document.close();

            JOptionPane.showMessageDialog(this, "Reporte de productos generado exitosamente en: " + filePath, "Éxito", JOptionPane.INFORMATION_MESSAGE);

        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al generar el reporte PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_txtGenerarRegistroActionPerformed

    private void cargarCategorias(List<Categoria> categorias){
        Set<String> existentes= new HashSet<>();
        for(int i=0;i<cbCategoria.getItemCount();i++){
            existentes.add(cbCategoria.getItemAt(i));
        }
        for(Categoria c: categorias){
            if(!existentes.contains(c.getNombre())){
                cbCategoria.addItem(c.getNombre());
            }
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCategoria;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusquedaProducto;
    private javax.swing.JButton txtGenerarRegistro;
    private javax.swing.JTextField txtNombreProducto;
    // End of variables declaration//GEN-END:variables
}
