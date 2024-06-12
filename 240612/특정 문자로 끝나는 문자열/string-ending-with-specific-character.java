import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[10];

        for(int i=0;i<10;i++){
            arr[i]=sc.next();
        }

        String a = sc.next();

        for(int i=0;i<10;i++){
            int b = arr[i].length() - 1;

            if(arr[i].charAt(b)==a.charAt(0)){
              System.out.println(arr[i]);
            }
        }
    }
}