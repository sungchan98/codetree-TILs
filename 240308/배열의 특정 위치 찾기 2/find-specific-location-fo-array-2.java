import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();

            if(i%2 == 0){
                sum1 += arr[i]; // 홀수
            }else{
                sum2 += arr[i]; // 짝수
            }
        }
        if(sum1>=sum2){
            System.out.print(sum1 - sum2);
        }else{
            System.out.print(sum2 - sum1);
        }
    }
}