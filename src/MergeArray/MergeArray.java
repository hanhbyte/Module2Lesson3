package MergeArray;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] Array1 = new int[5];
        int[] Array2 = new int[6];
        int[] Array3 = new int[11];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < Array1.length) {
            System.out.println("Enter the element of array 1 : ");
            Array1[i] = scanner.nextInt();
            i++;
        }
        int j = 0;
        while (j < Array2.length) {
            System.out.println("Enter the element of array 2 : ");
            Array2[j] = scanner.nextInt();
            j++;
        }
        for (int k = 0; k < Array3.length; k++) {
            if (k < Array1.length) {
                Array3[k] = Array1[k];
            } else {
                Array3[k] = Array2[Array3.length - k - 1];
            }
        }
        for (int g = 0; g < Array3.length; g++) {
            System.out.print(Array3[g]);
        };
    }
}
