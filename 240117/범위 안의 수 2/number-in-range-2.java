import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cntVal1 = 0;
        int cntVal2 = 0;
        for(int i=0; i<10; i++) {
            int n = sc.nextInt();
            if(n >=0 && n <= 200) {
                cntVal1 += n;
                cntVal2++;
            }
        }
        System.out.printf("%d %.1f", cntVal1, (double)cntVal1 / cntVal2);
    }
}