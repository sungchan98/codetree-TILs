import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] arr = new String[] {"apple", "banana", "grape", "blueberry", "orange"};

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].charAt(2) == str.charAt(0) || arr[i].charAt(3) == str.charAt(0)) {
        System.out.println(arr[i]);
        cnt++;
      }
    }
    System.out.println(cnt);
    sc.close();
  }
}