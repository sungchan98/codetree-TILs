import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int cntEE = 0;

        int cntEB = 0;

        if(str.contains("ee")){
            cntEE++;
        }

        if(str.contains("eb")){
            cntEB++;
        }

        System.out.print(cntEE + " " + cntEB);
    }
}