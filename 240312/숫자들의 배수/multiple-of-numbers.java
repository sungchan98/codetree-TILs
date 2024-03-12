import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=0;
        int i=0;
        int arr[] = new int[100];

        while(true){
            i++;
            arr[i] = n * i;

            System.out.printf(arr[i]+ " ");

            if(arr[i]%5==0){
                cnt++;
            }
            if(cnt==2){
                break;
            }

        }
    }
}