import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        
        int num = n*n;
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) { 
                for(int i = n - 1; i >=0; i--){           
                    arr[i][j] = num--;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = num--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}