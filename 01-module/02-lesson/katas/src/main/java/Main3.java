import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How much money you want?");
        int number1 = Integer.parseInt(scan.nextLine());

        System.out.println("How much cars you want?");
        int number2 = Integer.parseInt(scan.nextLine());

        System.out.println("How much houses you want?");
        int number3 = Integer.parseInt(scan.nextLine());

        System.out.println("How much companies you want?");
        int number4 = Integer.parseInt(scan.nextLine());

        System.out.println("How much friends do you have?");
        int number5 = Integer.parseInt(scan.nextLine());

        System.out.println("-------------------------------------");
        System.out.println("I have has " + number1 + " dollars.");
        System.out.println("-------------------------------------");
        System.out.println("I have has " + number2 + " cars.");
        System.out.println("-------------------------------------");
        System.out.println("I have has " + number3 + " houses.");
        System.out.println("-------------------------------------");
        System.out.println("I have has " + number4 + " companies.");
        System.out.println("-------------------------------------");
        System.out.println("I have has " + number5 + " friends.");
        System.out.println("-------------------------------------");
    }
}
