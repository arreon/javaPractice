import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you ready for quiz?");
        String word = scan.nextLine();

        System.out.println("Okay, here it comes!");
        System.out.println("                     ");
        System.out.println("01) What is the capital of Alaska?");
        System.out.println("           1) Melbourne            ");
        System.out.println("           2) Anchorage            ");
        System.out.println("           3) Juneau               ");
        int number = Integer.parseInt(scan.nextLine());

        if (number == 1) {
            System.out.println("Sorry but you wrong");
        } else if (number == 2) {
            System.out.println("Sorry but you wrong");
        } else if (number == 3) {
            System.out.println("That's right");
        }

            if (number == 1) {
                number = 0;
            }else if (number == 2) {
                number = 0;
            }else if (number == 3) {
                number = 1;
            }

            System.out.println("                     ");
            System.out.println("02) Can you store the value 'cat' in a variable of type int?");
            System.out.println("           1) yes            ");
            System.out.println("           2) no             ");
            int number2 = Integer.parseInt(scan.nextLine());


            if (number2 == 1) {
                System.out.println("Sorry, 'cat' is a string. can only store numbers");
            } else if (number2 == 2) {
                System.out.println("That's right");
            }


                if (number2 == 1) {
                    number2 = 0;
                }else if (number2 == 2) {
                    number2 = 1;
                }

                System.out.println("                     ");
            System.out.println("03) What is the result of 9+6/3?");
            System.out.println("           1) 5              ");
            System.out.println("           2) 11             ");
            System.out.println("           3) 15/3           ");
            int number3 = Integer.parseInt(scan.nextLine());


            if (number3 == 1) {
                System.out.println("That's incorrect");
            } else if (number3 == 2) {
                System.out.println("That's correct");
            } else if (number3 == 3) {
                System.out.println("That's incorrect");
            }


                if (number3 == 1) {
                    number3 = 0;
                }else if (number3 == 2) {
                    number3 = 1;
                }else if (number3 == 3) {
                    number3 = 0;
                }

            System.out.println("Overall, you got " + (number + number2 + number3) + " out of 3 correct");
            System.out.println("Thanks for playing");
        }
    }
