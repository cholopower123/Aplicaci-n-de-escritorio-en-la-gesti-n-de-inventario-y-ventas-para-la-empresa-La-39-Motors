


public class Proveedor {
    private String nombre;
    private String empresa;
    private String telefono;
    private String correo;
    private String productos;

    public Proveedor(String nombre, String empresa, String telefono, String correo, String productos) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.correo = correo;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    
}
