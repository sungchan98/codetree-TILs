public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp;
        int temp2;
    

        temp = a;
        a = c;
        System.out.println(a);
        
        temp2 = b;
        a = temp;
        b = a;
        System.out.println(b);
        
        b = temp2;
        c = b;
        System.out.println(c);
    }
}