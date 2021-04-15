import java.util.LinkedList;

public class Macowins {

    LinkedList<Venta> ventas = new LinkedList();

    int gananciasDe(java.util.Date fecha){

        return ventas.stream().filter(venta -> venta.confirmarFecha(fecha)).mapToInt(venta -> venta.montoTotal()).sum();
    }
}
