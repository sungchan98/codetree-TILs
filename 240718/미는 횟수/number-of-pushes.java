import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int cnt = 0;
        for(int i = 0; i < a.length(); i++) {
            cnt++;

            b = b.substring(1) + b.charAt(0);
            if(a.equals(b)){
                break;
            }
             

        }
        System.out.println(cnt < a.length() ? cnt : -1);    
        }
}