import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Salary firs player");
        int player1 = Integer.parseInt(scan.nextLine());

        System.out.println("Salary second player");
        int player2 = Integer.parseInt(scan.nextLine());

        System.out.println("Salary third player");
        int player3 = Integer.parseInt(scan.nextLine());

        int limit = player1 + player2 + player3;
        int tax = (limit / 100) * 18;

        if (limit < 40000000) {
            System.out.println("OK! It's very good");
        } else {
            System.out.println(limit + tax);
            System.out.println("It's not good for team");
        }
    }
}
