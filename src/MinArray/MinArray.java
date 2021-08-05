package MinArray;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 14, 55, 22, 10, 18};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
