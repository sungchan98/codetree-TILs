import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int val = 0;
    int cnt = 0;

    while (true) {
      if (n == 1) { 
        break;
      }
      
      if (n % 2 == 0) {
        cnt++;
        n /= 2;
      } else if (n % 2 != 0) {
        cnt++;
        n = (n * 3) + 1;
      }

    }
    System.out.println(cnt);
  }
}