import java.util.Scanner;

public class A_GetDigitsFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number");
        //Taking the number as input
        int num = scn.nextInt();
        System.out.println("Enter the Digit");
        int digit = scn.nextInt();

        int frequency = getDigitsFrequency(num, digit);
        System.out.println(frequency);
    }

    public static int getDigitsFrequency(int num, int digit) {
        int frequency = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            if (rem == digit) {
                frequency += 1;
            }
        }
        return frequency;
    }
}


