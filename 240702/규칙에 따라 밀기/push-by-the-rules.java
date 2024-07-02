import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    char[] arr = b.toCharArray();

    for (int i = 0; i < b.length(); i++) {
      if (arr[i] == 'L') {
        a = a.substring(1) + a.charAt(0);
      } else if (arr[i] == 'R') {
        a = a.charAt(a.length() - 1) + a.substring(0, a.length() - 1);
      }
    }
    System.out.print(a);

  }
}