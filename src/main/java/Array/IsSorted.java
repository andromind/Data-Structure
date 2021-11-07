package Array;

public class IsSorted {

    public static int isSorted(int arr[], int n)
    {
        if(n == 1)
            return 1;

        int tmp = 1;
        while (tmp != n && arr[tmp - 1] == arr[tmp]){
            tmp++;
        }

        if(tmp == n)
            return 1;

        boolean checkAsc = arr[tmp - 1] > arr[tmp];

        for (int i = tmp + 1; i < n; i++) {
            if( checkAsc != arr[i-1] > arr[i])
                return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] inp = new int[]{1, 1, 2, 2, 3};
        int i = isSorted(inp, inp.length);

        System.out.println(i);
    }
}
