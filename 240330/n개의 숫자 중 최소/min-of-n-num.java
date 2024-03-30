import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        
        final int INT_MAX = Integer.MAX_VALUE;

        int n = sc.nextInt();
        int arr[] = new int[n];
        int cnt = 0;
        int minval = INT_MAX;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(minval > arr[i]) {
                minval = arr[i];
                cnt++;
            }
        }
        System.out.print(minval + " " + cnt);
    }
}