import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        

        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<4;j++){
                int arr[] = new int[4];
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            if(sum/4 >= 60){
                System.out.println("pass");
                cnt++;
            }else{
                System.out.println("fail");
            }  
        }
        System.out.println(cnt);
    }
}