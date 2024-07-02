import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] arr = s.toCharArray();
    int q = sc.nextInt();


    for (int i = 0; i < q; i++) {
      int a = sc.nextInt();
      if (a == 1) {
        s = s.substring(1, s.length()) + s.substring(0, 1);
        System.out.println(s);
      } else if (a == 2) {
        s = s.substring(s.length() - 1, s.length()) + s.substring(0, s.length() - 1);
        System.out.println(s);
      } else if (a == 3) {

        for (int j = 0; j < s.length() / 2; j++) {
          // s += s.substring(s.length() - j - 1, s.length() - j);
          char temp = arr[j];
          arr[j] = s.charAt(s.length() - 1 - j);
          arr[s.length() - 1 - j] = temp;
        }
        s = new String(arr);
        System.out.println(s.toString());

      }
    }
  }
}