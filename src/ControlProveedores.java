import java.util.ArrayList;

public class ControlProveedores {
    private static ArrayList<Proveedor> listaProveedores = new ArrayList<>();

    public static ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public static void agregarProveedor(Proveedor proveedor) {
        listaProveedores.add(proveedor);
    }

    public static void eliminarProveedor(Proveedor proveedor) {
        listaProveedores.remove(proveedor);
    }
}
