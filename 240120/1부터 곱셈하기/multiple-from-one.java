import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val=1;
        for (int i = 1; i <= 10; i++) {
            val *= i;
            if(val>=n) {
                System.out.println(i);
                break;
            }
        }
    }
}