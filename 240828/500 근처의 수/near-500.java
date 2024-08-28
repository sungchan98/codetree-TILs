import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[10];
       int maxVal = 1;
       int minVal = 1000;
       for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
       }

        for(int i = 0; i < 10; i++){
           if(arr[i] >= maxVal && arr[i] < 500){
                maxVal = arr[i];
           } else if(arr[i] <= minVal && arr[i] > 500){
                minVal = arr[i];
           }
       }
       System.out.println(maxVal + " " + minVal);
    }
}