import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char d = c.charAt(0);
        System.out.println(d);
        System.out.printf("%.2f\n",a);
        System.out.printf("%.2f",b);
    }
}