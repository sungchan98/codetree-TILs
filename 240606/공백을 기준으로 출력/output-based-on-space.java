import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        
        String a = str1.replaceAll("\\s+", "");
        String b = str2.replaceAll("\\s+", "");
        
        System.out.println(a+b);
    }
}