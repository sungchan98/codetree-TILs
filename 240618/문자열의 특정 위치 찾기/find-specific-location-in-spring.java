import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String s2 = sc.next();


        if(s.contains(s2)){
          System.out.println(s.indexOf(s2));
        }else{
          System.out.print("No");
        }

    }
}