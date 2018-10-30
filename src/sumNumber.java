import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Enter column: ");
        int column = scanner.nextInt();

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                arr[i][j] = (int) Math.floor(Math.random()*10);
            }
        }
        System.out.println("list index in array: ");
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sumColumn = 0;
        for (int i = 0; i < size; i++){
            sumColumn = sumColumn + arr[i][column];
        }
        System.out.println("Sum number of column: " + sumColumn);
    }
}
