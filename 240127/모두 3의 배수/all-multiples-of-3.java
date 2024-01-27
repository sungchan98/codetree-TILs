import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    boolean satisfied = true;
    for (int i = 0; i <= 4; i++) {
      int a = sc.nextInt();
      if (a % 3 != 0) {
        satisfied = false;
      }
    }
    if (satisfied == true) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }
}