import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = console.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = console.nextInt();

        int result = remainder(number1,number2);
        System.out.println("Остаток от деления: " + result );
}
    public static int remainder(int n1, int n2) {
        return n1 % n2;
    }
}