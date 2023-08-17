public class Main {
    public static void main(String[] args) {

        int price = 13676;
        if (price < 0) {
            System.out.println("Wrong price");
        } else {
            int bonus = price / 20;
            System.out.println("Count of bonuses: " + bonus);
        }
    }
}