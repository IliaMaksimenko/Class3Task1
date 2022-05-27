import  java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int bonusAmount = 20;

        Scanner in = new Scanner(System.in);
        System.out.print("Input ticket price: ");
        int ticket = in.nextInt();

        System.out.printf("Bonus miles credited: %d \n ", ticket/bonusAmount);
        in.close();

    }
}