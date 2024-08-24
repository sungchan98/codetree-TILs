import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN;
        int maxVal2 = INT_MIN;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] >= maxVal){
                maxVal = arr[i];
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] >= maxVal2 && arr[i] <= maxVal){
                maxVal2 = arr[i];
            }
        }
        System.out.println(maxVal + " " + maxVal2);
    }
}