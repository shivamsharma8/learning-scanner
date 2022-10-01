import java.util.Scanner;


public class scanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {

            int order = counter + 1;
            System.out.println("enter number #" + order+":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            }
                else {
                    System.out.println("Invalid Number");
                }
                scanner.nextLine();


        }
        System.out.println("sum = "+ sum);
        scanner.close();
    }
}