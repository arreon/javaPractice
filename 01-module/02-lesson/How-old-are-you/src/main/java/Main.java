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
        } else {
            System.out.println("You can drive " + name + " congratulations.");
        }

        if (age < 18) {
            System.out.println("I don't know how tell this softer but " + name + ". You can't vote.");
        } else {
            System.out.println(name + " you can vote.");
        }

        if (age < 25) {
                System.out.println("You can't rent a car " + name + ". this don't scary, so what not worry.");
        } else {
                System.out.println("You can rent a car " + name + ". this don't important, but this just ok.");
        }
        if (age >= 25) {
                    System.out.println("Hell yeah, this is amazing you can do anything that's legal " + name + ".");
        }
    }
}