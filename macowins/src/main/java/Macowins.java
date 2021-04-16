import java.util.LinkedList;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Macowins {

    LinkedList<Venta> ventas = new LinkedList();

    int gananciasDe(LocalDate fecha){

        return ventas.stream().filter(venta -> venta.confirmarFecha(fecha)).mapToInt(venta -> venta.montoTotal()).sum();
    }

    void agregarVenta(Venta venta){
        ventas.add(venta);
    }


    public static void main(String[] args){
        System.out.println("Hello World");
        Prenda pantalonGucci = new Prenda("Pantalon", 150, new PrendaPromocion(50) );
        Prenda camisaPrada = new Prenda("Camisa", 200, new PrendaNueva());
        Prenda sacoFeo = new Prenda("Saco", 300, new PrendaLiquidacion());
        System.out.println("El precio de un pantalonGucci en promocion es: "+pantalonGucci.precioFinal());
        System.out.println("El precio de una camisaPrada nueva es: "+camisaPrada.precioFinal());
        System.out.println("El precio de un sacoFeo en liquidacion es: "+sacoFeo.precioFinal());
        Venta ventaGrande = new Venta();
        ventaGrande.agregarVenta(camisaPrada);
        ventaGrande.agregarVenta(pantalonGucci);
        ventaGrande.agregarVenta(sacoFeo);
        Venta ventaPequenia = new Venta();
        ventaPequenia.agregarVenta(sacoFeo);
        System.out.println("El precio de una ventaGrande con un pantalonGucci, una camisaPadra y un sacoFeo es: "+ventaGrande.montoTotal());
        System.out.println("El precio de una ventaPequenia con un sacoFeo es: "+ventaPequenia.montoTotal());
        Macowins macowins = new Macowins();
        macowins.agregarVenta(ventaGrande);
        macowins.agregarVenta(ventaPequenia);
        System.out.println("El total de ganancias de macowins el dia de la fecha es(se vendieron una ventaGrande y una ventaPequenia) : "+macowins.gananciasDe(LocalDate.now()));

        System.out.println("Bye World");
    }

}
