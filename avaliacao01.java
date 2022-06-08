import java.util.Scanner;
import java.util.Random;

public class avaliacao01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[][] arr = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                arr[i][j] = r.nextInt(100);
        System.out.println("Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter a value: ");
        int value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println("Even, I'm printing even numbers");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[i][j] % 2 == 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Odd, I'm printing odd numbers");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[i][j] % 2 != 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
