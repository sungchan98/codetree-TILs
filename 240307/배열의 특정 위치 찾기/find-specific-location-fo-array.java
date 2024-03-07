import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0; 
        int sum2 = 0;
        double cnt = 0;
    
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();           
        }
        for(int i=1;i<=10;i+=2){
            sum += arr[i];
            //System.out.print(arr[i]);
        }
        for(int i=2;i<=10;i+=3){    
            sum2 += arr[i];
            cnt++;
            //System.out.print(arr[i]); 
        }
        System.out.printf("%d %.1f", sum, sum2/cnt);
    }
}