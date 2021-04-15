import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Venta {
    java.util.Date fecha = new Date();
    LinkedList<Prenda>prendas = new LinkedList();

    Venta (LinkedList<Prenda>prendas) {
        this.prendas = prendas;
    }

    boolean confirmarFecha(java.util.Date fechaRequerida) {
        return fecha == fechaRequerida;
    }

    int montoTotal() {
        return prendas.stream().mapToInt(prenda -> prenda.precioFinal()).sum();
    }
}
