import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 || i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
        System.out.print("0 ");
      } else if ((i - 30) >= 0 && (i - 30) <= 9) {
        System.out.print("0 ");
      } else if ((i - 60) >= 0 && (i - 60) <= 9) {
        System.out.print("0 ");
      } else if ((i - 90) >= 0 && (i - 90) <= 9) {
        System.out.print("0 ");
      } else {
        System.out.print(i + " ");
      }
    }
  }
}