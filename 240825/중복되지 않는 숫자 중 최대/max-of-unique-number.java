import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int maxVal = Integer.MIN_VALUE;

        
        for(int i = 0; i < n; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            } if( maxVal == arr[i]) {
                maxVal = -1;
            }  if(maxVal > arr[i] && maxVal != arr[i] ){
                maxVal = arr[i];
            }
        }
        
        System.out.println(maxVal);
    }
}