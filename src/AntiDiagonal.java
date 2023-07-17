import java.util.Scanner;

public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int row = scanner.nextInt();
        System.out.println("Enter the no. of column : ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        findAntiDiagonal(matrix);
    }

    private static void findAntiDiagonal(int[][] matrix) {
        int[][] outputMatrix = new int[matrix.length * 2 -1][matrix[0].length];
        int N = matrix.length;
        int M = matrix[0].length;
        for (int x = 0; x < M; x++){
            int i = 0, j = x;
            while (i < M){
                if (j >= 0){
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print("0 ");
                }
                i++;
                j--;
            }
            System.out.println();
        }

        for (int y = 1; y < N; y++){
            int i = y, j = M-1;
            while (j >= 0){
                if(i < N){
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print("0 ");
                }
                i++;
                j--;
            }
            System.out.println();
        }
    }
}
