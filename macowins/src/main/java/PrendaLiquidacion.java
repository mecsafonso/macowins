public class PrendaLiquidacion implements EstadoPrenda{
    @Override
    public int precio(int precioLista) {
        return precioLista/2;
    }
}
