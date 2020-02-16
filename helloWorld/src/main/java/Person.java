public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String hairColor;
    private String eyeColor;

//       CONSTRUCTOR
    public Person(String firstName, String lastName, int age, String hairColor, String eyeColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getFirstName (){
        return this.firstName;
    }

    public String getLastName (){
        return  this.lastName;
    }

    public int getAge (){
        return this.age;
    }

    public String getHairColor (){
        return this.hairColor;
    }

    public String getEyeColor (){
        return this.eyeColor;
    }

//    SETERS
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void  setAge(int age){
        this.age = age;
    }

    public void  setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
}
