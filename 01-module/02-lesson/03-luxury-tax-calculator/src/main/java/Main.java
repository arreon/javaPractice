public class Main {
    public static void main(String[] args){

        int footballPlayer1 = 12000000;
        int footballPlayer2 = 20000000;
        int footballPlayer3 = 10000000;

        int limit = footballPlayer1 + footballPlayer2 + footballPlayer3;
        int tax = (limit / 100) * 18;

        if (limit < 40000000) {
            System.out.println("OK! It's very good");
        } else {
            System.out.println(limit + tax);
            System.out.println("It's not good for team");
        }
    }
}
