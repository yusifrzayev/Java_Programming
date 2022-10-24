package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {
        // ------------ Implicit Casting ------------
        //Implicit casting --> casting the smaller primitive type to a larger

        byte a = 15;
        short b = (short)a;
        // short b = (short)a;

        System.out.println(b);

        int c = a;   // implicit casting

        long d = 3000L;

        float f = d; // implicit casting


        // ------------ Explicit Casting ------------
        //Explicit casting --> casting larger primitive types to a smaller

        int x = 100;
        byte y = (byte)x;
        // it gives us an error, so we have to use casting operator () to cast it in
        // Tip: it is better to always cast in the same variable Type

        float z = 20.8f;
        // if you type f at the end of the value, it automatically casts it in float type in background
        // so no need to cast it in explicitly

        short q = (short)z;
        // z  = 20.8, but short and other integer variable types take only first part of the number
        // 20.8 --> 20

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1; // n1 = 2.5

        System.out.println(n2);

        System.out.println("--------------------------------------------------------------");

        int num = 500;
        byte result = (byte)num;

        System.out.println(result);

        //if the value of variable type is greater than the range of type, we want to cast in, we do explicit casting
        //it will give us a negative number, because the value is greater than the range

        int r = 50000;
        short t = (short) r;

        System.out.println(t);
















    }
}
