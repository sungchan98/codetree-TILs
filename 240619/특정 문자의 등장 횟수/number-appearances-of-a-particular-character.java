public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);

    String str = sc.next();

    int cntEE = 0;

    int cntEB = 0;


    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
        cntEE++;
      } else if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'b') {
        cntEB++;
      }
    }

    System.out.print(cntEE + " " + cntEB);
  }
}