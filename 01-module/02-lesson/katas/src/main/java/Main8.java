import java.util.Scanner;

public class Main8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What kind of pet do you have?");
        String kind = scan.nextLine();

        System.out.println("What his/her name is?");
        String name = scan.nextLine();

        System.out.println("How old  he/she is? (if it's she you can write as much as you want)");
        int age = Integer.parseInt(scan.nextLine());

        System.out.println("How much he/she weight? (if it's she you can write as much as you want)");
        int weight = Integer.parseInt(scan.nextLine());

        System.out.println("-------------------------------------");
        System.out.println("My pet kind is " + kind);
        System.out.println("His/Her name is " + name);
        System.out.println("He/She " + age + " old");
        System.out.println("He/she " + weight + " kg");
        System.out.println("-------------------------------------");
    }
}
