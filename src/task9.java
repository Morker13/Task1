import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество чисел в массиве: ");

        int size = console.nextInt();
        int numbers[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbers[i] = console.nextInt();
        }
        System.out.println(sumOfCubes(size,numbers));

    }
    public static int sumOfCubes(int size, int [] array){
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum  = sum + array[i] * array[i] * array[i];
        }
        return sum;
    }
}
