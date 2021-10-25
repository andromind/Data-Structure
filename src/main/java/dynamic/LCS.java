package dynamic;

public class LCS {

    static int res = 0;
    
    public static void main(String[] args) {

        /*
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        */

        String s1 = "AXYZ";
        String s2 = "BAZ";

        int m = s1.length();
        int n = s2.length();

        System.out.println("[LCS Recursively] Length of SubSequence : " + getLCSRecursively(s1.toCharArray(), s2.toCharArray(), m, n));

        System.out.println("[LCS DP] Length of SubSequence : " + getLCSRecursively(s1.toCharArray(), s2.toCharArray(), m, n));
    }

    public static int getLCSRecursively(char[] s1, char[] s2, int m, int n) {
        if(m == 0 || n == 0)
            return 0;
        
        if(s1[m-1] == s2[n-1]){
            return 1 + getLCSRecursively(s1, s2, m-1, n-1);
        }else{
            return Math.max(getLCSRecursively(s1,s2,m-1,n) ,getLCSRecursively(s1, s2, m, n - 1));
        }
    }

    public static int getLCS(char[] s1, char[] s2, int m, int n) {
        
        int[][] dp = new int[m+1][n+1];
        
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = -1;
        }

        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = -1;
        }

        for (int i = 1; i < m + 1; i++) {

            for (int j = 1; j < n + 1; j++) {
                
                if(s1[i] == s2[j])
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        return dp[m][n];
    }
}
