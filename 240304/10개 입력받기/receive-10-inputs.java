import java.util.Scanner;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
    double sum = 0;
    int cnt = 0;
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
      sum += arr[i];
      if (arr[i] == 0) {
        break;
      }
      cnt++;
    }

    for (int i = cnt + 1; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.printf("%d %.1f", (int) sum, sum / cnt);
  }
}