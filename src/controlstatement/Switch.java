package controlstatement;

public class Switch {
    public static void main(String[] args) {
        int number = 20;
        String numberIs;

        switch (number) {
            case 10:
                System.out.println("10");
                numberIs = "10";
                break;

            case 20:
                System.out.println("20");
                numberIs = "20";
                break;

            case 30:
                System.out.println("30");
                numberIs = "30";
                break;

            // Default case statement
            default:
                System.out.println("Not in 10, 20 or 30");
                numberIs = "0";
        }
        System.out.println(numberIs);

        // Switch statement without break
        switch (number) {
            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        // Nested switch statement
        char branch = 'C';
        int collegeYear = 4;
        switch (collegeYear) {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}

/*
like if-else-if ladder statement
works with byte, short, int, long, enum types, string(from java 7)
case value must be literal or constant
Not allow variable
Case value must be unique (else compile time error)
Break statement is optional
 */

