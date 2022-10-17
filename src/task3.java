import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Chickens: ");
        int chickens = console.nextInt();

        System.out.print("Cows: ");
        int cows = console.nextInt();

        System.out.print("Pigs: ");
        int pigs = console.nextInt();

        int result = animals(chickens, cows, pigs);
        System.out.println("Legs: " + result);
    }
    public static int animals(int chic, int cow, int pig) {
        return chic * 2 + cow * 4 + pig * 4;
    }
}
