public class PrendaPromocion implements EstadoPrenda{
    int descuento;

    PrendaPromocion(int descuento) {
        this.descuento = descuento;
    }
    @Override
    public int precio(int precioLista) {
        return precioLista;
    }
}
