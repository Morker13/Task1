import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите A: ");
        int A = console.nextInt();

        System.out.print("Введите B: ");
        int B = console.nextInt();

        System.out.print("Введите C: ");
        int C = console.nextInt();

        System.out.println(abcmath(A, B, C));
    }
    public static boolean abcmath(int a, int b, int c){
        int sum = a;
        for (int i = 0; i < b + 1; i++) {
            sum += a * i;
        }
        if (sum % c == 0){
            return true;
        }
        else return false;
    }
}