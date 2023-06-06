package retauranteuca;

public class Calcular {
    private static float subtotal1;
    private static float subtotal2;
    private static float subtotal3;
    private static float subtotal4;
    private static float descuento;

    public static float getDescuento() {
        return descuento;
    }

    public static void setDescuento(float descuento) {
        Calcular.descuento = descuento;
    }
    

    public static float getSubtotal1() {
        return subtotal1;
    }

    public static void setSubtotal1(float subtotal1) {
        Calcular.subtotal1 = subtotal1;
    }

    public static float getSubtotal2() {
        return subtotal2;
    }

    public static void setSubtotal2(float subtotal2) {
        Calcular.subtotal2 = subtotal2;
    }

    public static float getSubtotal3() {
        return subtotal3;
    }

    public static void setSubtotal3(float subtotal3) {
        Calcular.subtotal3 = subtotal3;
    }

    public static float getSubtotal4() {
        return subtotal4;
    }

    public static void setSubtotal4(float subtotal4) {
        Calcular.subtotal4 = subtotal4;
    }
    public static float Total(){
        float total = getSubtotal1() + getSubtotal2() + getSubtotal3() + getSubtotal4();
        return total;
    }
    
}
