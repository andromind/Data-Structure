package String;
public class Palindrome {

    static boolean isPalin(int N)
    {
        String s = String.valueOf(N);
        return doRecCheck(s,0,s.length()-1);
    }

    static boolean doRecCheck(String s, int i, int n) {

        if (i > n)
            return true;

        if(s.charAt(i) != s.charAt(n))
            return false;

        return doRecCheck(s,i+1,n-1);
    }


    public static void main(String[] args) {
        System.out.println("isPalin() = " + isPalin(1001001));
        System.out.println("isPalin() = " + isPalin(1011001));
    }
}
