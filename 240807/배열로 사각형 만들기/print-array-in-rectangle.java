public class Main {
    public static void main(String[] args) {
        int[][] arr2d = new int[5][5];

        for (int j = 0; j < 5; j++) {
            arr2d[0][j] = 1;
        }
        for (int i = 0; i < 5; i++) {
            arr2d[i][0] = 1;
        }


        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                arr2d[i][j] = arr2d[i -1][j] + arr2d[i][j-1];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}