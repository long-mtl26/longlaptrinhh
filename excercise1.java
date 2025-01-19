package btvn;

import java.util.Arrays;  

public class excercise1 {  
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu: " + Arrays.toString(mang));

        daoNguocMang(mang);

        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(mang));
    }

    public static void daoNguocMang(int[] mang) {
        int left = 0, right = mang.length - 1;
        while (left < right) {
            int temp = mang[left];
            mang[left] = mang[right];
            mang[right] = temp;
            left++;
            right--;
        }
    }
}
