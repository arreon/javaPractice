import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What your name?");
        String name = scan.nextLine();

        System.out.println("Ok, " + name + " how old are you?");
        int age = Integer.parseInt(scan.nextLine());

        if (age < 16) {
            System.out.println("You can't drive " + name + ". I'm so sorry.");
        } else if (age > 16 && age < 18){
            System.out.println("You can drive " + name + ". Congratulations, but i don't know how tell this softer but you can't vote.");

        } else if ( age > 18 && age < 25){
            System.out.println("You can vote, but you can't rent a car " + name + ". this don't scary, so what don't worry.");
        }
        if (age >= 25) {
            System.out.println("Hell yeah, this is amazing you can do anything that's legal " + name + ".");
        }
    }
}
