import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Prob: ");
        double prob = console.nextDouble();

        System.out.print("Prize: ");
        int prize = console.nextInt();

        System.out.print("Pay: ");
        int pay = console.nextInt();

        boolean result = profitableGamble(prob, prize, pay);
        System.out.println("Resutl: " + result);
    }
    public static boolean profitableGamble(double prob, int prize, int pay) {
        if (prob * prize > pay){
            return true;
        }
        else return false;
    }
}

