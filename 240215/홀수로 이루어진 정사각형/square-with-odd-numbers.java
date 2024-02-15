import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n*2;i=i+2){
            for(int j=1;j<=n*2;j=j+2){
                System.out.print(i+j+9+" ");
                
            }
            System.out.println();
        }
    }
}