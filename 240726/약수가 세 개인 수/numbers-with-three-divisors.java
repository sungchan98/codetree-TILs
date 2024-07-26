import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt2 = 0;

        for (int i = start; i <= end; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) { 
                    cnt = 0;
                    for (int k = 1; k <= j; k++) {
                        if (j % k == 0) {
                            cnt++;
                        }
                    }
                    if (cnt == 2) { 
                        cnt2++;
                    }
                }
            }
        }

        System.out.print(cnt2);
    }
}