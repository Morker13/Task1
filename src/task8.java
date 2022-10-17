import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите 1 сторону: ");
        int side1 = console.nextInt();

        System.out.print("Введите 2 сторону: ");
        int side2 = console.nextInt();

        System.out.println("Максимальное значение 3 стороны: " + nextEdge(side1, side2) );
    }
    public static int nextEdge(int s1, int s2){
        return s1 + s2 - 1;
    }
}
