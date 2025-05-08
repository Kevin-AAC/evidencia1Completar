import java.util.List;
import java.util.ArrayList;

public class Concesionario {
    private List<Vehiculo> ****** = new ArrayList<>(); //Lista de vehículos disponibles
    private List<Venta> ventas = new ******; //Lista de ventas realizadas

    // Método para agregar un vehículo al inventario
    public void agregarVehiculo(Vehiculo vehiculo) {
        ********.add(vehiculo);
    }

    // Método para realizar una venta de un vehículo
    public void realizarVenta(String codigoVehiculo, double monto, String apellido, String nombre, String documento) {
        Vehiculo vehiculoVendido = *****;
        // Buscar el vehículo en el inventario
        for (Vehiculo v : inventario) {
            if (v.getCodigo().equals(codigo*******)) {
                vehiculoVendido = v;
                break;
            }
        }
        // Si se encuentra el vehículo, se registra la venta
        if (vehiculoVendido != null) {
            ventas.add(new Venta(monto, vehiculoVendido, apellido, nombre, documento));
            *******.remove(vehiculoVendido);
            System.out.println("Venta realizada: " + nombre + " " + apellido + " ha comprado " + vehiculoVendido.getMarca());
        } else {
            System.out.println("Error: Vehículo con código " + codigoVehiculo + " no encontrado.");
        }
    }

    // Método para mostrar el inventario actual
    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Vehiculo v : inventario) {
            System.out.println(v);
        }
    }

    // Método para mostrar el historial de ventas
    public void mostrarVentas() {
        System.out.println("Ventas realizadas:");
        for (Venta v : ventas) {
            System.out.println(v);
        }
    }
}
