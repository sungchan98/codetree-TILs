import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int c2 = (int)c;
        if(c2 + 1 == 123){
            c2=97;
        }
        System.out.println((char)c2);
    }
}