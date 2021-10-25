package dynamic;


public class CoinChange {

    public static void main(String[] args) {

        int[] coin = new int[] { 2,5,3,6 };
        int sum = 10;

        System.out.println("[DP Approach] No of ways are : " + getChangeRecursive(coin, coin.length, sum));

        System.out.println("[Non DP Approach] No of ways are : " + getChangeRecursive(coin, coin.length, sum));

        
    }

    // Recursive Solution
    public static int getChangeRecursive(int[] coin, int n, int sum) {

        if(n == 0)
            return 0;
        
        if(sum == 0)
            return 1;

        // Last coin was not Chosen
        int res = getChangeRecursive(coin, n - 1, sum);

        // If Adding Coin doesn't exceeds Sum
        if (coin[n - 1] <= sum)
            res = res + getChangeRecursive(coin, n, sum - coin[n - 1]);

        return res;
    }

    // Dynamic Solution converted above Recursive Solution
    public static int getChangeDP(int[] coin, int n, int sum) {
        
        int[][] dp = new int[sum + 1][n + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < sum; i++) {
            dp[i][0] = 0;
        }
        
        for (int i = 1; i < sum + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                
                dp[i][j] = dp[i][n-1];

                if(coin[j-1] <= i)
                    dp[i][j] += dp[i - coin[n-1]][j];

            }
        }

        return dp[sum][n];
    }
}
