import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Основание: ");
        int base = console.nextInt();

        System.out.print("Высота: ");
        int height = console.nextInt();

        double result = triArea(base, height);
        System.out.println("Площадь треугольника: " + result);
    }
    public static double triArea( int triBase, int triHeight) {
        return triBase * triHeight * 0.5;
    }
}
