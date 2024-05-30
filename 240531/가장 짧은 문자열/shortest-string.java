import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int maxLength = Math.max(str1.length(), Math.max(str2.length(), str3.length()));
        int minLength = Math.min(str1.length(), Math.min(str2.length(), str3.length()));

        System.out.println(maxLength - minLength);

        sc.close();

    }
}