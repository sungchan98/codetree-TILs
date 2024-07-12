import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String a2 = "";
        String b2 = "";
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) >= '0' && a.charAt(i) <= '9'){
                a2 += a.charAt(i);
            } else {
                break;
            }
        }

        for(int i = 0; i < b.length(); i++) {
            if(b.charAt(i) >= '0' && b.charAt(i) <= '9'){
                b2 += (b.charAt(i) - '0');
            } else {
                break;
            }
        }

        System.out.println(Integer.parseInt(a2) + Integer.parseInt(b2));


    }
}