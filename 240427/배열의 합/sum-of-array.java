import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2d = new int[4][4];
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
           // sum += arr2d[i][j];
            for (int j = 0; j < 4; j++) {
               sum += arr2d[i][j];  
            }
            System.out.print(sum);
            sum = 0;
            System.out.println();
        }
    }
}