import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    String a2 = sc.nextLine();
    int b1 = sc.nextInt();
    String b2 = sc.nextLine();

    if ((a1 >= 19 && a2.equals("M")) || (b1 >= 19 && b2.equals("M"))) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }
}