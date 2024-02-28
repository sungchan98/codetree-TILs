import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt2 = 0;

        for(int i=start;i<=end;i++){
           int cnt=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    cnt++;
                    if(cnt == 3){
                        cnt2++;
                    }
                }
            }
        }
        System.out.print(cnt2);
    }
}