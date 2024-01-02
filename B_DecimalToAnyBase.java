import java.util.Scanner;

public class B_DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Decimal number");
        int decimalNumber = scn.nextInt();

        System.out.println("Enter the Destination Base");
        int base = scn.nextInt();

        int cn = getValueInDestinationBase(decimalNumber, base);

        System.out.println("The converted value is " + cn);
    }

    public static int getValueInDestinationBase(int decimalNumber, int base) {
        int cn = 0;
        int tp = 1;

        while (decimalNumber > 0) {
            int rem = decimalNumber % base;
            decimalNumber = decimalNumber / base;

            cn = cn + rem * tp;
            tp = tp * 10;
        }
        return cn;
    }
}
