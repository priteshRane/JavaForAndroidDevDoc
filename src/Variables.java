public class Variables {

    int data = 50; // Instance Variable
    static int m = 100; // Static Variable

    void method() {
        int n = 90; // local variable
    }

    public static void main(String[] args) {
        // Add two numbers
        System.out.println();
        System.out.println("=== Add two numbers ===");
        int a = 10;
        int b = 10;
        int c = a + b;
        System.out.println(c);

        // Widening
        System.out.println();
        System.out.println("=== Widening ===");
        float f = a;
        System.out.println(a);
        System.out.println(f);

        // Narrowing (Typecasting)
        System.out.println();
        System.out.println("=== Narrowing ===");
        f = 10.5f;
        a = (int)f;
        System.out.println(f);
        System.out.println(a);

        // Overflow
        System.out.println();
        System.out.println("=== Overflow ===");
        a = 130;
        byte d = (byte)a;
        System.out.println(a);
        System.out.println(d);

        // Adding lower type
        System.out.println();
        System.out.println("=== Adding lower type ===");
        byte e = 10;
        byte g = 10;
        byte h = (byte)(e + g);
        System.out.println(h);
    }
}

/*
Variable is a container which holds the value while the Java program is executed
Variable assign with a data type
Variable is a name memory location
Variable types: local, instance and static
Data-Types types: primitive and non-primitive

Local Variable
declared inside the body of the method
access within that method only
cannot defined with static keyword

Instance Variable
declared inside class but outside of the method
not declared as static
value is instance specific

Static Variable
variable declared as static
Cannot be local
Can create copy and shared amoung
Memory allocation happen only once when class loaded in memory
 */


