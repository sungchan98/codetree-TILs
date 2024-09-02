import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int q = sc.nextInt();

        char[] arr = s.toCharArray();
        
        for(int i = 0; i < q; i++){
            int n = sc.nextInt();
            if(n == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char temp;
                temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
            }else if(n == 2){
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for(int j = 0; j < s.length(); j++){
                    if(arr[j] == a){
                        arr[j] = b;
                    }
                }
            }
            System.out.println(arr);
        }
        
    }
}