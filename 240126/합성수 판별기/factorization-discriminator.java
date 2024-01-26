import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean satisfied = false;

    for (int i = 1; i <= n; i++) {
      if (i % n == 0 && i / n == 1) {
        satisfied = true;
      }
    }
    if (satisfied == true) {
      System.out.println("C");
    } else {
      System.out.println("N");
    }
  }
}