import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("your number");
        int number = Integer.parseInt(scan.nextLine());

        System.out.println((number * 2) + 5);
    }
}
