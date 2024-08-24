import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int count[] = new int[1001]; 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }

        int maxVal = -1;

        for (int i = 0; i < n; i++) {
            if (count[arr[i]] == 1 && arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        System.out.println(maxVal);

    
    }
}