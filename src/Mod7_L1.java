import java.util.Scanner;
public class Mod7_L1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temp = 0;
        double total = 0;
        String trash = "";
        String tempVal = "";
        for (int i = 0; i <= 30; i++) {

            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 30; i >= 0; i--) {

            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 0; i <= 18; i += 3) {

            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 10; i >= 0; i -= 2) {

            System.out.print(i + " ");

        }
        System.out.println();


        for (int row = 0; row <= 5; row++) {

            for (int col = 0; col <= row; col++) {

                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println();

        for (int row = 5; row >= 0; row--) {

            for (int col = 0; col <= row; col++) {

                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println();


        for (int row = 0; row <= 5; row++) {

            for (int col = 0; col <= 5; col++) {

                System.out.print("*");

            }
            System.out.println();


        }


        System.out.println("Give me a degree");
        while (true) {
            if (in.hasNextDouble()) {
                temp = in.nextDouble();
                in.nextLine();
                break;

            } else {
                trash = in.nextLine();
                System.out.println("you enter trash " + trash);
            }
        }


        System.out.println("what degree type are you starting with?");
        while (true) {
            tempVal = in.nextLine();
            if (tempVal.equalsIgnoreCase("F")) {
                total = (temp * 5/9 - 32);
                break;
            }
            else if (tempVal.equalsIgnoreCase("C")) {
                total = (temp * 9 / 5 + 32);
                break;
            }
            else {

                System.out.println("you enter trash " + tempVal);

            }


        }
        System.out.println("your temp is " + total);



    }

}