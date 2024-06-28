import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    String b = sc.next();

    while (a.contains(b)) {
      a = a.substring(0, a.indexOf(b)) + a.substring(a.indexOf(b) + b.length(), a.length());
    }

    System.out.println(a);
  }
}