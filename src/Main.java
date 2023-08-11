import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter price: ");

        int price = myObj.nextInt();
        if(price < 0) {
            System.out.println("Wrong price");
        } else {
            int bonus = price / 20;
            System.out.println("Count of bonuses: " + bonus);
        }
    }
}