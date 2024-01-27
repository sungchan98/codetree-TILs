import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = false;
        for(int i=2; i <=1000; i++){
            if(i % n == 0){
                a = true;
            }
        }
        if(a = true) {
            System.out.println("P");
        }else {
            System.out.println("C");
        }
    }
}