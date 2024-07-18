import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int cnt = 0;
        for(int i = 0; i < a.length(); i++) {
            cnt++;

            b = b.substring(a.length() - 1, a.length()) + b.substring(0, a.length() - 1);

            if(a.equals(b)){
                break;
            }
            if(cnt >= a.length()){
                cnt = -1;
            }

        }
        System.out.println(cnt);
    }
}