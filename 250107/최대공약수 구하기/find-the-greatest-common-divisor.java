import java.util.Scanner;

public class Main {

    public static void commonDiviser(int n, int m){
        System.out.println(m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        commonDiviser(n,m);
    }
}