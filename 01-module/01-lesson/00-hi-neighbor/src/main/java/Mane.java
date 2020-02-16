public class Mane {
    public static void main(String[] args){
        Person person1 = new Person("Aron", "Chicago", 0,"Red", "all genre (for my feel, in this day)", "play games");

        System.out.println("---------------------------------------------------");
        System.out.println("Hi Neighbor!");
        System.out.println("My name is " + person1.getFirstName() + ".");
        System.out.println("I'm from " + person1.getCity() + ".");
        System.out.println("I have " + person1.getNumber() + " siblings.");
        System.out.println(person1.getColor() + " is my favorite color.");
        System.out.println("I listen to " + person1.getMusic() + ".");
        System.out.println("My favorite hobby is " + person1.getHobby() + ".");
        System.out.println("Nice to meet you!");
        System.out.println("Good bye!!!");
        System.out.println("---------------------------------------------------");

    }
}
