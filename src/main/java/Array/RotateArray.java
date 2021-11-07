package Array;

import java.util.Arrays;

public class RotateArray {

    //d Extra space
    static void rotateArr(int[] arr, int d, int n) {

        int[] tmp = new int[d];

        for (int i = 0; i < d; i++) {
            tmp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[i+n-d] = tmp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] inp = new int[]{2,4,6,8,10,12,14,16,18,20};
        int n = inp.length;
        int d = 3;

        rotateArrBest(inp,d,n);
    }

    //Theta(1) extra space
    static void rotateArrBest(int[] arr, int d, int n){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int d, int i) {
        int tmp;
        while (d<i){
            tmp = arr[d];
            arr[d] = arr[i];
            arr[i] = tmp;
            d++;
            i--;
        }
    }


}
