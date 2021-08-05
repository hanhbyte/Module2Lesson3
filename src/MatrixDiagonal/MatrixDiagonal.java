package MatrixDiagonal;

import java.util.Scanner;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] Array = {
                {1,2,3,5},{4,5,6,2},{2,3,6,1},{3,6,3,6}
        };
        int total =0;
        for(int i =0;i< Array.length;i++){
            for (int j=0;j< Array[i].length;j++){
                if(i==j){
                    total+= Array[i][j];
                }
            }
        }
        System.out.println("tổng đường chéo của ma trận trên là : " +total);
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập cạnh của ma trận :");
        int row = sc.nextInt();
        int[][] matrix = new int[row][row];
        System.out.println("Nhập các giá trị vào mảng : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int total1 =0;
        for(int i =0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                if(i==j){
                    total1+= Array[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo của ma trận vừa nhập là :" +total1);
    }
}
