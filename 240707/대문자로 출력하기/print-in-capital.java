import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열 입력
        String str = sc.nextLine();

        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 문자열의 각 문자를 순회
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - ('a' - 'A')));
            } else if (c >= 'A' && c <= 'Z') {
                result.append(c);
            }
        }


        System.out.println(result.toString());
        

    }
}