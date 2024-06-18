import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] str = new String[n];
    String strAll = "";

    for (int i = 0; i < n; i++) {
      str[i] = sc.next();
    }

    for (int i = 0; i < n; i++) {
      strAll += str[i];
    }

    for (int i = 0; i < strAll.length(); i++) {
      System.out.print(strAll.charAt(i));
      if ((i + 1) % 5 == 0) {
        System.out.println();
      }
    }
  }
}