import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("your number");
        int number = Integer.parseInt(scan.nextLine());

        System.out.println((number + 5) * 2);
    }
}
