package CharacterCount;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "ThanChiAnSi";
        int count= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character from the keyboard : ");
        int tu= sc.nextLine().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==tu){
                count++;
            }
        }
        System.out.println("The number of characters entered in the string is" +count);
    }
}
