import java.util.Scanner;

public class D_AnyBaseToAnyBase {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Source Number");
        int sourceNumber = scn.nextInt();

        System.out.println("Enter the Source Base");
        int sourceBase = scn.nextInt();

        System.out.println("Enter the Destination Base");
        int destinationBase = scn.nextInt();

        int decimalNumber = getValueInDecimalBase(sourceNumber, sourceBase);
        int convertedNumber = getValueinDestinationBase(decimalNumber, destinationBase);

        System.out.println(convertedNumber);
    }

    public static int getValueInDecimalBase(int sourceNumber, int sourceBase) {

        int decimalNumber = 0;
        int bp = 1;

        while (sourceNumber > 0) {
            int rem = sourceNumber % sourceBase;
            sourceNumber = sourceNumber / sourceBase;

            decimalNumber = decimalNumber + rem * bp;
            bp *= sourceBase;
        }

        return decimalNumber;
    }

    public static int getValueinDestinationBase(int decimalNumber, int destinationBase){

        int convertedNumber = 0;
        int tp = 1;

        while(decimalNumber > 0){
            int rem = decimalNumber % destinationBase;
            decimalNumber = decimalNumber / destinationBase;

            convertedNumber = convertedNumber + rem * tp;
            tp*=10;
        }
        return convertedNumber;
    }

}
