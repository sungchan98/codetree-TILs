import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        int maxVal = Integer.MIN_VALUE;
        int maxVal2 = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > maxVal){
                maxVal2 = maxVal; 
                maxVal = arr[i];  
            } else if(arr[i] > maxVal2 && arr[i] < maxVal){
                maxVal2 = arr[i]; 
            } else if(arr[i] == maxVal) {
                maxVal2 = maxVal; 
            }
        }
       
        System.out.println(maxVal + " " + maxVal2);
    }
}