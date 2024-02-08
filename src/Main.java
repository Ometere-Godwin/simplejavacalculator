

public class Main {
    public static void main(String[] args) {
        int arr [];
        arr = new int[2];
        arr [0] =1;
        arr [1] =2;
        System.out.println(arr);
        System.out.println(arr[1]);


//        implicit data type conversion
        int a = 100;
        System.out.println("The value for a is:" + a);

        long b = a;
        System.out.println("The value for b is:" +b);

        float d = a;
        System.out.println("The value for d is:" +d);

        double c = a;
        System.out.println("The value for c is:" +c);
//Explicit Data Type Conversion
        double dou = 10.10;
        System.out.println("Double value" + dou);

        float f = (float)dou;
        System.out.println("Float representation" +f);
    }
}