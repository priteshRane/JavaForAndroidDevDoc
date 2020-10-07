package controlstatement;

public class ForLoop {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // nested for loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }

        // for-each loop
        /*
        Used to traverse array or collection in Java.
        Easier then for loop
         */
        int arr[] = {12, 23, 44, 56, 78};
        for (int i: arr) {
            System.out.println(i);
        }

        // labeled for loop
        /*
        Use label before the for loop
        Useful for loop so that we can break/continue specific for loop
         */
        System.out.println();
        System.out.println("=== Labeled for loop ===");
        aa: for (int i = 1; i <= 3; i++) {
            bb: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa; // break bb;
                }
                System.out.println(i + " " + j);
            }
        }

        // Infinitive for loop
        // for(;;){}


    }
}

/*
initialization, condition, increment/decrement

For loop
Used to iterate a part of the program several times.
Used If the number of iteration is fixed

For loop
Nested for loop
For-Each loop
Labeled for loop
Infinitive for loop


 */