import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=1;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                for(int j=1;j<=n;j++){
                    System.out.print(cnt++ + " ");

                }
            }else{
                for(int j=1;j<=n;j++){
                    cnt= cnt+ 2;
                    System.out.print(cnt - 1 + " ");
                }
            }
            System.out.println();
        }
    }
}