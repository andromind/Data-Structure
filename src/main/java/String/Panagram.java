package String;

public class Panagram {

    static boolean isPanagram(String s){

        s = s.toLowerCase();

        char[] inp = s.toCharArray();
        int [] count = new int[26];

        for (char c : inp) {
            count[c - 'a']++;
        }

        for (int c : count) {
            if(c==0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "Thequickbrownfoxjumpsoverthelazydog";
        System.out.println(String.format("Result [%s] : ", s) + isPanagram(s));
        s = "HeavyDuty";
        System.out.println(String.format("Result [%s] : ", s) + isPanagram(s));
    }
}
