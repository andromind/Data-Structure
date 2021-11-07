package String;

public class Anagram {

    static boolean isAnagram(char[] s1, char[] s2){
        if(s1.length != s2.length)
            return false;

        int[] count = new int[26];

        for (int i = 0; i < s1.length; i++) {
            count[s1[i] - 'a']++;
            count[s2[i] - 'a']--;
        }

        for (int i : count) {
            if(i!=0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";

        System.out.println(String.format("Result of [ %s || %s ] : ", s1,s2) + isAnagram(s1.toCharArray(), s2.toCharArray()));

        s1 = "allergy";
        s2 = "allergic";
        System.out.println(String.format("Result of [ %s || %s ] : ", s1,s2) + isAnagram(s1.toCharArray(), s2.toCharArray()));
    }
}
