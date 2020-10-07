public class Operators {
    public static void main(String[] args) {
        // Unary operator
        int a = 10;
        System.out.println("=== Unary operator ===");
        System.out.println(a++); // 10(11)
        System.out.println(++a); // 12
        System.out.println(a--); // 12(11)
        System.out.println(--a); // 10

        int b = 10;
        int c = 10;
        System.out.println(b++ + ++b); // 10+12=22
        System.out.println(c++ + c++); // 10+11=21

        int d = 10;
        int e = -10;
        boolean f = true;
        boolean g = false;
        System.out.println(~d); // -11
        System.out.println(~e); // 9
        System.out.println(!f); // false
        System.out.println(!g); // true

        // Arithmetic operator
        System.out.println();
        System.out.println("=== Arithmetic operator ===");
        int h = 10;
        int i = 5;
        System.out.println(h + i);
        System.out.println(h - i);
        System.out.println(h * i);
        System.out.println(h / i);
        System.out.println(h % i);

        // Left Shift Operator
        System.out.println();
        System.out.println("=== Left shift operator ===");
        System.out.println(10 << 2); // 10*2^2 = 10*4 = 40
        System.out.println(10 << 3); // 10*2^3 = 10*8 = 80
        System.out.println(20 << 2); // 20*2^2 = 20*4 = 80
        System.out.println(15 << 4); // 15*2^4 = 15*16 = 240

        // Right shift operator
        System.out.println();
        System.out.println("=== Right shift operator ===");
        System.out.println(10 >> 2); // 10/2^2=10/4=2
        System.out.println(20 >> 2); // 20/2^2=20/4=5
        System.out.println(20 >> 3); // 20/2^3=20/8=2
        // For positive number >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        // For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);

        // Logical && and Bitwise &
        System.out.println();
        System.out.println("=== Logical && and Bitwise & ===");
        int j = 10;
        int k = 5;
        int l = 20;
        System.out.println(j < k && j < l); // false && true = false
        System.out.println(j < k & j < l); // false & true = false

        // Logical && vs Bitwise &
        System.out.println();
        System.out.println("=== Logical && vs Bitwise & ===");
        int m = 10;
        int n = 5;
        int o = 20;
        System.out.println(m < n && m++ < o);//false && true = false
        System.out.println(m);//10 because second condition is not checked
        System.out.println(m < n & m++ < o);//false && true = false
        System.out.println(m);//11 because second condition is checked

        // Logical || and Bitwise |
        System.out.println();
        System.out.println("=== Logical || and Bitwise | ===");
        int p = 10;
        int q = 5;
        int r = 20;
        System.out.println(p > q || p < r);//true || true = true
        System.out.println(p > q | p < r);//true | true = true
        System.out.println(p > q || p++ < r);//true || true = true
        System.out.println(p);//10 because second condition is not checked
        System.out.println(p > q | p++ < r);//true | true = true
        System.out.println(p);//11 because second condition is checked

        // Ternary operator
        System.out.println();
        System.out.println("=== Ternary operator ===");
        int s = 2;
        int t = 5;
        int min = (s < t) ? s : t;
        System.out.println(min);

        /*
        Assignment operator
        Adding short will be error
        Solution: a=(short)(a+b);//20 which is int now converted to short
         */
        System.out.println();
        System.out.println("=== Assignment operator ===");
        int u = 10;
        u += 3; // 10+3
        System.out.println(u);
        u -= 4; // 13-4
        System.out.println(u);
        u *= 2; // 9*2
        System.out.println(u);
        u /= 2; // 18/2
        System.out.println(u);
    }
}

/*
Unary (postfix, prefix)
Arithmetic (multiplicative, additive)
Shift (shift)
Relational (comparison, equality)
Bitwise (bitwise AND, bitwise exclusive OR, bitwise inclusive OR)
Logical (logical AND, logical OR)
Ternary (ternary)
Assignment (assignment)
 */
