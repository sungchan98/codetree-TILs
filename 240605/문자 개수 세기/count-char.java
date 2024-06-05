import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int cnt = 0;
        for(int i=0;i<str1.length();i++){
           
           if(str1.charAt(i) == str2.charAt(0)){
            cnt++;
           }
        }
        System.out.println(cnt);
    }
}