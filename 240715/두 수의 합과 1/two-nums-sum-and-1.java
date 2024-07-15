import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int sum = a+b;

        String sumStr = Integer.toString(sum);

        for(int i=0; i<sumStr.length(); i++){
            if(sumStr.charAt(i) == '1'){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}