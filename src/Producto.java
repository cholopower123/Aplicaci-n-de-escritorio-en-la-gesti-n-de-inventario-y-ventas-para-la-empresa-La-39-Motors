
import java.time.LocalDateTime;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private int stockMinimo; // 🔸 NUEVO CAMPO
    private String Categoria;
    public String tipoProducto;
    private String SubCategoria;
    String descripcion;
    LocalDateTime Fecha;

    // Constructor completo

    public Producto(String nombre, double precio, int cantidad, int stockMinimo, String Categoria, String tipoProducto, String SubCategoria, String descripcion, LocalDateTime Fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stockMinimo = stockMinimo;
        this.Categoria = Categoria;
        this.tipoProducto = tipoProducto;
        this.SubCategoria = SubCategoria;
        this.descripcion = descripcion;
        this.Fecha = Fecha;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getSubCategoria() {
        return SubCategoria;
    }

    public void setSubCategoria(String SubCategoria) {
        this.SubCategoria = SubCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }

    
    

   
    

}
