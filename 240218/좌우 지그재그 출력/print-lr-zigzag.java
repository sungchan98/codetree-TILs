import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt1=1;
        int cnt2=1;
        for(int i=1;i<=n;i++){
            
            if(i%2==1){
                for(int j=0;j<n;j++){
                  
                    System.out.print(cnt1 +" ");
                    cnt2=cnt1+n;
                    cnt1++;
                }
                
            }
            else{
                for(int j=0;j<n;j++){
                    System.out.print(cnt2 + " ");
                    cnt1=cnt2+n;
                    cnt2--;
                }
                
            }System.out.println();
        }
    }
}