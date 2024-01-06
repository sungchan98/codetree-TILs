import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    String a1 = sc.next();
    int a2 = sc.nextInt();
    String b1 = sc.next();
    int b2 = sc.nextInt();
    String c1 = sc.next();
    int c2 = sc.nextInt();

    if ((a1.equals("Y") && a2 >= 37) && (b1.equals("Y") && b2 >= 37)) {
      System.out.println("E");
    } else if ((b1.equals("Y") && b2 >= 37) && (b1.equals("Y") && c2 >= 37)) {
      System.out.println("E");
    } else if ((a1.equals("Y") && a2 >= 37) && (c1.equals("Y") && c2 >= 37)) {
      System.out.println("E");
    } else {
      System.out.println("N");
    }
  }
}