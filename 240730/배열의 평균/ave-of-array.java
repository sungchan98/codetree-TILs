import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] arr2d = new int[2][4];

        int sum2 = 0;

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                arr2d[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
               sum += arr2d[i][j];            
            }
            System.out.printf("%.1f ",(double)sum/4);
        }
        System.out.println();

        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<2; j++){
               sum += arr2d[j][i];            
            }
            System.out.printf("%.1f ",(double)sum/2);
        }

        System.out.println();

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
               sum2 += arr2d[i][j];            
            }
        }
        System.out.printf("%.1f ",(double)sum2/8);
        

    }
}