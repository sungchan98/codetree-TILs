import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] arr2d = new int[n][m];

    int num = 1;
    int sum = 0;

    for (int k = 0; k <= n + m; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (i + j == k) {
            arr2d[i][j] = num;
            num++;
          }
        }
      }
    }

    // 출력
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr2d[i][j] + " ");
      }
      System.out.println();
    }
  }
}