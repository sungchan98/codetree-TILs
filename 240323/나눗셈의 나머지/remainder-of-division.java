import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] remainderCnt = new int[10];
        
        while (a > 1) {
            int remainder = a % b;
            remainderCnt[remainder]++;
            a /= b;
        }
        
        int sum = 0;
        for (int count : remainderCnt) {
            sum += count * count;
        }
        
        System.out.println(sum);
    }
}