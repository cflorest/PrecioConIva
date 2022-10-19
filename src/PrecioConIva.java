public class PrecioConIva{
    public static void main(String[] args) {

        double precioTotal = precioConIva(1000);
        System.out.println(precioTotal);
    }


    static double precioConIva(int precio)
    {
        return precio * 1.19;
    }
}
