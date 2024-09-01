import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    
    String result = ""; 
    
    for (int i = 0; i < str.length(); i++) {
      int count = 1; 
      
      while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      
      result += str.charAt(i);
      result += Integer.toString(count);
    }
    

    System.out.println(result.length());
    System.out.println(result);
  }
}