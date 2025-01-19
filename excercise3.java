package btvn;

import java.util.Arrays;

public class excercise3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        reverseArray(arr);
        
        System.out.println("Reversed array: " + Arrays.toString(arr));
        
        int max = findMax(arr);
        int min = findMin(arr);
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        
        boolean isPalindrome = checkPalindrome(arr);
        System.out.println("Is the array a palindrome? " + isPalindrome);
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
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    public static boolean checkPalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
