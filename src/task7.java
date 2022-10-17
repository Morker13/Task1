import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = console.nextInt();

        System.out.println("Сумма: " + addUpTo(number) );
    }
    public static int addUpTo(int n){
        int sum = 0;
        for (int i = 1; i < n + 1; i++){
            sum += i;
        }
        return sum;
    }
}
