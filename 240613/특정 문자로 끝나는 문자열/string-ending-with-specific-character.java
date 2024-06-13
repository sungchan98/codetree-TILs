import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String inputArray[] = new String[10];
    String resultArray[] = new String[10];

    for (int i = 0; i < 10; i++) {
      inputArray[i] = sc.next();
    }

    String word = sc.next();
    boolean found = false;


    for (int i = 0; i < 10; i++) {
      if (inputArray[i].charAt(inputArray[i].length() - 1) == word.charAt(0)) {
        resultArray[i] = inputArray[i];
      }
    }

    for (int i = 0; i < 10; i++) {
      if (resultArray[i] == null) {
        continue;
      } else {
        System.out.println(resultArray[i]);
        found = true;
      }
    }

    if (found != true) {
      System.out.println("None");
    }
  }
}