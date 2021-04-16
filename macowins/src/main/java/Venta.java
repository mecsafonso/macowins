import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Venta {
    LocalDate fecha = LocalDate.now();
    LinkedList<Prenda>prendas = new LinkedList();

    // Venta (LinkedList<Prenda>prendas) {
    //    this.prendas = prendas;
    // }

    boolean confirmarFecha(LocalDate fechaRequerida) {
        return fecha.compareTo(fechaRequerida) == 0; //compareTo retorna 0 si las fechas son iguales
    }
    void agregarVenta(Prenda prenda){
        prendas.add(prenda);
    }

    LocalDate fechaVenta(){
        return fecha;
    }

    int montoTotal() {
        return prendas.stream().mapToInt(prenda -> prenda.precioFinal()).sum();
    }
}
