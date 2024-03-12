import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr[] = new int[10];
        arr[0] = n1;
        arr[1] = n2;
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        for(int i=2;i<10;i++){
            
            arr[i] = arr[i - 1] + arr[i - 2];

            
            System.out.print(arr[i]%10+ " ");
        }
        
    }
}