package Array;

public class PrintArray {
    public static void printArrayRecursively(int arr[], int n)
    {
        if(n == 0)
            return;
        printArrayRecursively(arr,n-1);
        System.out.println(arr[n-1]);
    }

    public static void main(String[] args) {
        printArrayRecursively(new int[]{1,2,3,4,5,6},6);
    }
}
