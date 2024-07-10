import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        String str = sc.nextLine();


        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - ('a' - 'A')));
            } else if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + ('a' - 'A')));
            }
        }

        System.out.println(result.toString());
        

    }
}