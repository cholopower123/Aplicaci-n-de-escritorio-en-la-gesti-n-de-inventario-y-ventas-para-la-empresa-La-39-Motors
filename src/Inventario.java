import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Inventario {
    private List<Producto> listaProductos;
    private List<Categoria> listaCategorias;
    
    public Inventario() {
        listaCategorias= new ArrayList<>();
        listaProductos = new ArrayList<>();
        
        listaCategorias.add(new Categoria("Llantas"));
        listaCategorias.add(new Categoria("Aceite"));
        listaCategorias.add(new Categoria("Luces"));
        listaCategorias.add(new Categoria("Parachoque"));
        listaCategorias.add(new Categoria("Rines"));
        listaCategorias.add(new Categoria("Tubo de escape"));
        listaCategorias.add(new Categoria("Bujia"));
    }

    public boolean agregarProducto(String nombre, String precioStr, String cantidadStr,String categoria, String descripcion,String tipoProducto,LocalDateTime fecha) {
        if (nombre.isEmpty() || precioStr.isEmpty() || cantidadStr.isEmpty() || descripcion.isEmpty()) {
            mostrarMensaje("Todos los campos deben estar llenos.");
            return false;
        }

        try {
            double precio = Double.parseDouble(precioStr);
            int cantidad = Integer.parseInt(cantidadStr);

            if (precio < 0 || cantidad <= 0) {
                mostrarMensaje("El precio debe ser positivo y la cantidad mayor a 0.");
                return false;
            }

            Producto nuevoProducto = new Producto(nombre, precio, cantidad, 1, categoria, tipoProducto, null, descripcion, fecha);
            listaProductos.add(nuevoProducto);
            mostrarMensaje("Producto registrado exitosamente.");
            return true;
        } catch (NumberFormatException e) {
            mostrarMensaje("Precio debe ser un número decimal y cantidad un entero positivo.");
            return false;
        }
    }
    
    
     public boolean registrarSalidaProducto(String nombreProducto, int cantidadSalida, String motivo, String nombreVendedor, LocalDateTime fechaSalida) {
        if (nombreProducto.isEmpty() || motivo.isEmpty() || nombreVendedor.isEmpty() || cantidadSalida <= 0) {
            mostrarMensaje("Todos los campos de salida deben estar llenos y la cantidad debe ser mayor a 0.");
            return false;
        }

        Producto productoEncontrado = null;
        for (Producto p : listaProductos) {
            if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoEncontrado = p;
                break;
            }
        }

        if (productoEncontrado == null) {
            mostrarMensaje("El producto '" + nombreProducto + "' no se encuentra en el inventario.");
            return false;
        }

        if (productoEncontrado.getCantidad() < cantidadSalida) {
            mostrarMensaje("La cantidad a salir (" + cantidadSalida + ") supera el stock disponible (" + productoEncontrado.getCantidad() + ") para '" + nombreProducto + "'.");
            return false; // RF25: Verificar que la cantidad registrada no supere el stock disponible
        }

        // RF26: Actualizar automáticamente el inventario, descontando la cantidad correspondiente
        productoEncontrado.setCantidad(productoEncontrado.getCantidad() - cantidadSalida);
        mostrarMensaje("Salida de producto registrada exitosamente. Nuevo stock de '" + nombreProducto + "': " + productoEncontrado.getCantidad());

        // Aquí podrías agregar la lógica para almacenar el registro de salida (RF27)
        // Por ahora, solo lo mostramos en un mensaje. Más adelante te daré una sugerencia para implementarlo.
        System.out.println("Registro de Salida:");
        System.out.println("  Producto: " + nombreProducto);
        System.out.println("  Cantidad: " + cantidadSalida);
        System.out.println("  Motivo: " + motivo);
        System.out.println("  Vendedor: " + nombreVendedor);
        System.out.println("  Fecha: " + fechaSalida);

        return true;
    }


    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }
    
    public void AgregarCategorias(String nombre){
        if(nombre==null||nombre.trim().isEmpty()){
            mostrarMensaje("El nombre de la categoria no puede estar vacío");
            return;
        }
        for(Categoria c: listaCategorias){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                mostrarMensaje("La categoria ya existe");
                return;
            }
        }
        listaCategorias.add(new Categoria(nombre));
        mostrarMensaje("Categoria agregada correctamente");
    }
    
    
    
    public void EliminarCategoria(String nombre){
        listaCategorias.removeIf(c->c.getNombre().equalsIgnoreCase(nombre));
        
        listaProductos.removeIf(p->p.getCategoria().equalsIgnoreCase(nombre));
        mostrarMensaje("Categoria eliminada correctamente");
    }
    
    public void EditarCategoria(String nombreAntiguo,String nombreNuevo){
        for(Categoria c:listaCategorias){
            if(c.getNombre().equalsIgnoreCase(nombreAntiguo)){
                c.setNombre(nombreNuevo);
                break;
            }
        }
        for(Producto p:listaProductos){
            if(p.getCategoria().equalsIgnoreCase(nombreAntiguo)){
                p.setCategoria(nombreNuevo);
            }
        }
        mostrarMensaje("Categoria editada correctamente");
    }
    public List<Producto> obtenerProductosConStockBajo() {
    List<Producto> productosBajoStock = new ArrayList<>();
    for (Producto p : listaProductos) {
        if (p.getCantidad() <= p.getStockMinimo()) {
            productosBajoStock.add(p);
        }
    }
    return productosBajoStock;
}
    public boolean establecerStockMinimo(String nombreProducto, int nuevoMinimo) {
    for (Producto p : listaProductos) {
        if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
            p.setStockMinimo(nuevoMinimo);
            return true;
        }
    }
    return false;
}

    private void mostrarMensaje(String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(null, mensaje);
    }
}