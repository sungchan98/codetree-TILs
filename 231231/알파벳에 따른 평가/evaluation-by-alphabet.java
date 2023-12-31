import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    String e = sc.next();

    if (e.equals("S")) {
      System.out.println("Superior");
    } else if (e.equals("A")) {
      System.out.println("Excellent");
    } else if (e.equals("B")) {
      System.out.println("Good");
    } else if (e.equals("C")) {
      System.out.println("Usually");
    } else if (e.equals("D")) {
      System.out.println("Effort");
    } else {
      System.out.println("Failure");
    }
  }
}