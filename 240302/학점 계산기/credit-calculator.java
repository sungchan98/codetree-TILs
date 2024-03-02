import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] arr = new double[n];
        double sum = 0;
        int cnt = 0;
        for(int i=0; i<n;i++){
            cnt++;  
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        if(sum/n >= 4.0){
            System.out.printf("%.1f\n",(double)sum/n);
             System.out.println("Perfect");
        } else if(sum/n >= 3.0)  {
            System.out.printf("%.1f\n",(double)sum/n);
            System.out.println("Good");
        }  else{
            System.out.printf("%.1f\n",(double)sum/n);
            System.out.println("Poor");
        }   
    }
}