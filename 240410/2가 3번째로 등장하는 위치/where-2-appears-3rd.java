import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        

        int arr[] = new int[100];
        int cnt=0;
        int idx = -1;
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 2){
                cnt++;
            }
            if(cnt==3){
                idx=i+1;
            }
        }
        System.out.println(idx);
    }
}