import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("your first number");
        int number1 = Integer.parseInt(scan.nextLine());

        System.out.println("your second number");
        int number2 = Integer.parseInt(scan.nextLine());

        System.out.println("your third number");
        int number3 = Integer.parseInt(scan.nextLine());

        System.out.println((number1 * number2) * number3);
    }
}
