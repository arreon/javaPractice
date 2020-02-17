import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your current earth weight?");
        int weight = Integer.parseInt(scan.nextLine());

        System.out.println("I have information for the following planet:");
        System.out.println("   1. Venus   2. Mars    3. Jupiter ");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune ");
        System.out.println("                                    ");
        System.out.println("Which planet are you visiting?");
        int number = Integer.parseInt(scan.nextLine());


        if (number == 1){
            System.out.println("Your weight would be " + weight * 0.78 + " pounds on that planet");
        }else if (number == 2){
            System.out.println("Your weight would be " + weight * 0.39 + " pounds on that planet");
        }else if (number == 3){
            System.out.println("Your weight would be " + weight * 2.65 + " pounds on that planet");
        }else if (number == 4){
            System.out.println("Your weight would be " + weight * 1.17 + " pounds on that planet");
        }else if (number == 5){
            System.out.println("Your weight would be " + weight * 1.05 + " pounds on that planet");
        }else if (number == 6){
            System.out.println("Your weight would be " + weight * 1.23 + " pounds on that planet");
        }
    }
}
