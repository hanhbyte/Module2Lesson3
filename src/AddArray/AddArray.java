package AddArray;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,10,6,7,9};
        int []newArray = new int[Array.length+1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the location you want to add : ");
        int index = sc.nextInt();
        System.out.println("Enter the number you want to add : ");
        int so = sc.nextInt();
        for(int i=0;i<newArray.length;i++){
            if(i<index){
                newArray[i]= Array[i];
            }
            if(i==index){
                newArray[i] = so;
            }
            if(i>index){
                newArray[i]= Array[i-1];
            }
        }
        for(int j=0;j<newArray.length;j++){
            System.out.println(newArray[j]);
        }
    }
}
