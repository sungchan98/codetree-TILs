import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                s = s.substring(1) + s.charAt(0);
                System.out.println(s);
            } else if (a == 2) {
                s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
                System.out.println(s);
            } else if (a == 3) {
                StringBuilder sb = new StringBuilder(s);
                s = sb.reverse().toString();
                System.out.println(s);
            }
        }
        sc.close();
    }
}