public class Prenda {
    String tipo;
    int precioLista;
    EstadoPrenda estadoPrenda;

    Prenda(String tipo, int precioLista, EstadoPrenda estadoPrenda) {
        this.tipo = tipo;
        this.precioLista = precioLista;
        this.estadoPrenda = estadoPrenda;
    }

    int precioFinal(){
        return this.estadoPrenda.precio(this.precioLista);
    }
}

