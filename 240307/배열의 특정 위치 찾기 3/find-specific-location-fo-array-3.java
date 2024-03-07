import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int arr[] = new int[100];
        int sum = 0;
        for(int i=0;i<100;i++){           
            arr[i] = sc.nextInt();
            
            if(arr[i] == 0){
                break;
            }
            
            sum += arr[0]; 
            sum += arr[1];
            sum += arr[2];
        }
        // System.out.print(arr[0]);
        // System.out.print(arr[1]);
        // System.out.print(arr[2]);
        
        System.out.print(arr[0]+arr[1]+arr[2]);
    }
}