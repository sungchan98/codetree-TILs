import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int cnt = 0;
        for(int i=0;i<=100;i++){
           cnt++;
           if(str1.charAt(i) == str2.charAt(0)){
            break;
           }
        }
        System.out.println(cnt+1);
    }
}