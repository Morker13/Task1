import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char symbol = console.next().charAt(0);

        System.out.println(ctoa(symbol));
    }
    public static int ctoa(char c){
        int ascii = c;
        return ascii;
        }
}
