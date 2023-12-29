import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int cm = sc.nextInt();
    int kg = sc.nextInt();

    int BMI = 10000*kg/(cm*cm);
    if(BMI>=25){
        System.out.println(BMI);
        System.out.println("Obesity");
    }else{
        System.out.println(BMI);
    }

  }
}