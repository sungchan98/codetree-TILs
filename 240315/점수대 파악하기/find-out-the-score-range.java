import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[100];
    int cntArr[] = new int[100];

    for (int i = 0; i < 100; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] == 0) {
        break;
      }
      if (arr[i] < 10) {
        continue;
      }

      if (arr[i] / 10 == 10) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 9) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 8) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 7) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 6) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 5) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 4) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 3) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 2) {
        cntArr[arr[i] / 10]++;
      } else if (arr[i] / 10 == 1) {
        cntArr[arr[i] / 10]++;
      }

    }

    for (int i = 10; i > 0; i--) {
      System.out.println(i * 10 + " - " + cntArr[i]);
    }
  }
}