package btvn;

import java.util.Arrays;  

public class excercise4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        
        int newLength = arr.length;
        for (int i = 0; i < newLength; i++) {
            for (int j = i + 1; j < newLength; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < newLength - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newLength--;
                    j--;
                }
            }
        }

        int[] result = Arrays.copyOf(arr, newLength);

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
