package btvn;

import java.util.Arrays;  

public class excercise2 {  
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        reverseArray(arr);
        
        System.out.println("Reversed array: " + Arrays.toString(arr));
        
        int max = Max(arr);
        int min = Min(arr);
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    public static int Max(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
    
    public static int Min(int[] arr) {
        int min = arr[0];
        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
}
