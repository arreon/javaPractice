import java.util.Scanner;

public class RegisrationForm {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What your name?");
        String name = scan.nextLine();

        System.out.println("What your surname?");
        String surname = scan.nextLine();

        System.out.println("What your Email?");
        String email = scan.nextLine();

        System.out.println("What your Twitter handle?");
        String twitter = scan.nextLine();

        System.out.println("How old are you?");
        int age = Integer.parseInt(scan.nextLine());

        System.out.println("Where you from?");
        String country = scan.nextLine();

        System.out.println("What your Profession");
        String profession = scan.nextLine();

        System.out.println("What yor favorite operating system?");
        String system = scan.nextLine();

        System.out.println("What your favorite programing language?");
        String language = scan.nextLine();

        System.out.println("What your favorite computer scientist?");
        String computer = scan.nextLine();

        System.out.println("What your favorite keyboard shortcut?");
        String keyboard = scan.nextLine();

        System.out.println("Have you ever built your own computer?");
        String built = scan.nextLine();

        System.out.println("If you could be any superhero, who would it be?");
        String hero = scan.nextLine();

        System.out.println(" 1." + name);
        System.out.println(" 2." + surname);
        System.out.println(" 3." + email);
        System.out.println(" 4." + twitter);
        System.out.println(" 5." + age);
        System.out.println(" 6." + country);
        System.out.println(" 7." + profession);
        System.out.println(" 8." + system);
        System.out.println(" 9." + language);
        System.out.println("10." + computer);
        System.out.println("11." + keyboard);
        System.out.println("12." + built);
        System.out.println("13." + hero);
    }
}
