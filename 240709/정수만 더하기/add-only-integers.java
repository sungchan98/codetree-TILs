import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 
        String str = sc.nextLine();
        int sum = 0;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9'){
                sum += c - 48;
            }
        }
        System.out.println(sum);

        

    }
}