import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int n = sc.nextInt();
                if(j <= i){
                    sum += n;
                    //System.out.printf(n + " ");
                }
            }
        }
        System.out.println(sum);
    }
}