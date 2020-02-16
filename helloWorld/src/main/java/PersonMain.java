public class PersonMain {
    public static void main(String[] args){
        Person person1 = new Person("Aron", "Zhumagulov", 19, "Black", "Brown");
        Person person2 = new Person("Samat", "Baltin", 30, "Black", "Brown");

        System.out.println("-------------------------------------------------");
        System.out.println("person1 first name= " + person1.getFirstName());
        System.out.println("person1 last name= " + person1.getLastName());
        System.out.println("person1 age= " + person1.getAge());
        System.out.println("person1 hair color= " + person1.getHairColor());
        System.out.println("person1 eye color= " + person1.getEyeColor());
        System.out.println("--------------------------------------------------");

        person1.setFirstName("Nora");
        person1.setAge(91);

        System.out.println("-------------------------------------------------");
        System.out.println("person1 first name= " + person1.getFirstName());
        System.out.println("person1 last name= " + person1.getLastName());
        System.out.println("person1 age= " + person1.getAge());
        System.out.println("person1 hair color= " + person1.getHairColor());
        System.out.println("person1 eye color= " + person1.getEyeColor());
        System.out.println("--------------------------------------------------");
    }
}
