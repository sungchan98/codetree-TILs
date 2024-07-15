import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int n = sc.nextInt();
        int sum = 0;

        String nStr = Integer.toString(n);

        for(int i=0; i<nStr.length(); i++){
            sum += (int)nStr.charAt(i) - '0';
           
        }

        System.out.println(sum);
    }
}