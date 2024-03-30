import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        
        final int INT_MAX = Integer.MAX_VALUE;

        int n = sc.nextInt();
        int arr[] = new int[n];
        int cnt =0;
        int minVal = INT_MAX;


        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(minVal > arr[i]) {
                minVal = arr[i];
                cnt=1;
            }else if(minVal == arr[i]){
                cnt++;
            }
        }
        System.out.print(minVal + " " + cnt);
    }
}