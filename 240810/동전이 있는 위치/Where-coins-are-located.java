import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] placed = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            placed[r][c] = 1;
             //System.out.println(placed[r][c]);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(placed[i+1][j+1] + " ");
            }
            System.out.println();
        }
       // System.out.println(placed[r][c]);
    }
}