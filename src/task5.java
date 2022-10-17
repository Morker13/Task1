import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите каким должен быть результат: ");
        int result = console.nextInt();

        System.out.print("Введите первое число: ");
        int number1 = console.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = console.nextInt();

        String oper = operation(result, number1, number2);
        System.out.println(oper);
    }
    public static String operation(int res, int n1, int n2) {
        if (n1 + n2 == res){
            return "added";
        }
        else if (n1-n2 == res){
            return "subtracted";
        }
        else if (n1 * n2 == res){
            return "multiplicationed";
        }
        else if (n1/n2 == res){
            return "divisioned";
        }
        else return "none";
    }
}


