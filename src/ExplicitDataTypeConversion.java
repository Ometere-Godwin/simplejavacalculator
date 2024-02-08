public class ExplicitDataTypeConversion {
    public static void main(String[] args) {
        double dou = 10.10;
        System.out.println("Double value" + dou);

        float f = (float)dou;
        System.out.println("Float representation" +f);
    }
}