import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n + 1];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    while (true) {
      int maxVal = 0;
      int idx = 0;

      for (int i = 0; i <= n; i++) {
        if (arr[i] >= maxVal) {
          maxVal = arr[i];
        }
      }

      for (int i = 0; i <= n; i++) {
        if (arr[i] == maxVal) {
          idx = i;
          break;
        }
      }

      n = idx - 1;
      System.out.print(idx + 1 + " ");
      if (idx == 0) {
        break;
      }
    }
  }
}