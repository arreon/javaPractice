import java.util.Scanner;

public class RectPavingCompany {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the width of the driveway in feet?");
        int width = Integer.parseInt(scan.nextLine());

        System.out.println("what is the length of the driveway in feet");
        int length = Integer.parseInt(scan.nextLine());

        int area = width * length;
        int perimeter = (length + width) * 2;

        float cementCost = 12.5f;
        float framingCost = 8.25f;

        float cementPrice = area * cementCost;
        float framingPrice = perimeter * framingCost;

        System.out.println("the width is " + width + " feet");
        System.out.println("the length is " + length + " feet");
        System.out.format("the area of the driveway is %d square feet. %n", area);
        System.out.format("the perimeter of the driveway is %d square feet. %n", perimeter);

        System.out.format("the cost of the cement is %f. %n", area * cementCost);
        System.out.format("the cost of the framing is %f. %n", perimeter * framingCost);

        if (cementPrice > 500000){
            System.out.println("NO, it is too expensive");
        } else if (cementPrice > 100000 && cementPrice < 500000) {
            System.out.println("expensive, but ok");
        } else {
            System.out.println("OK lets do this!");
        }
    }
}
