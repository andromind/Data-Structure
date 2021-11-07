package String;

public class SubSequence {

    public static boolean isSubSequence(String A, String B) {

        if(B.length() < A.length())
            return false;

        int aLen = A.length() - 1;
        int bLen = B.length() - 1;

        while (aLen >= 0 && bLen >= 0) {
            if(A.charAt(aLen) == B.charAt(bLen))
                aLen--;
            bLen--;
        }

        return aLen == -1;
    }

    public static void main(String[] args) {

        String s1 = "AXY";
        String s2 = "YADXCP";

        System.out.println(String.format("Result [ %s || %s ] : ", s1,s2) + isSubSequence(s1,s2));

        s1 = "gksrek";
        s2 = "geeksforgeeks";

        System.out.println(String.format("Result [ %s || %s ] : ", s1,s2) + isSubSequence(s1,s2));

    }
}
