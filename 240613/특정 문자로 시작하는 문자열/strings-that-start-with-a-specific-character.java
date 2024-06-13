package algorithm.test.codetree;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String arr[] = new String[n];
    int cnt = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.next();
    }
    String word = sc.next();

    for (int i = 0; i < n; i++) {
      if (word.charAt(0) == arr[i].charAt(0)) {
        cnt++;
      }
      sum += arr[i].length();
    }
    double a = (double) sum / n;
    System.out.printf("%d %.2f", cnt, a);
  }
}