import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        
        for(int i=0;i<100;i++){
            arr[i]= sc.nextInt();

            if(arr[i]==0){
                break;
            }else if((arr[i]) % 2 == 1){
                arr[i] += 3;
            }else{
                arr[i] /= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}