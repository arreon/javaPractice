import java.util.Scanner;

public class Main9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you give the film Captain America?");
        int number1 = Integer.parseInt(scan.nextLine());

        System.out.println("How much do you give the film Thor?");
        int number2 = Integer.parseInt(scan.nextLine());

        System.out.println("How much do you give the film Iron Man?");
        int number3 = Integer.parseInt(scan.nextLine());

        System.out.println("How much do you give the film The Avengers?");
        int number4 = Integer.parseInt(scan.nextLine());

        System.out.println("How much do you give the film Guardians of the Galaxy?");
        int number5 = Integer.parseInt(scan.nextLine());


        System.out.println("Rated user the movie Captain America " + number1 + " stars");
        System.out.println("Rated user the movie Captain America " + number2 + " stars");
        System.out.println("Rated user the movie Captain America " + number3 + " stars");
        System.out.println("Rated user the movie Captain America " + number4 + " stars");
        System.out.println("Rated user the movie Captain America " + number5 + " stars");
    }
}
