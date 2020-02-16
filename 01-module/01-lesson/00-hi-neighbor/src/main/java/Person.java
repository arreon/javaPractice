import java.security.PublicKey;

public class Person {
    private String firstName;
    private String city;
    private int number;
    private String color;
    private String music;
    private String hobby;

    public Person(String firstName, String city, int number, String color, String music, String hobby) {
        this.firstName = firstName;
        this.city = city;
        this.number = number;
        this.color = color;
        this.music = music;
        this.hobby = hobby;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getCity() {
        return this.city;
    }

    public int getNumber() {
        return this.number;
    }

    public String getColor() {
        return this.color;
    }

    public String getMusic() {
        return this.music;
    }

    public String getHobby() {
        return this.hobby;
    }
}