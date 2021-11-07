import java.util.ArrayDeque;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("THis is Hello World");

        getBalance("()))((");
    }

    public static int getBalance(String s) {

        char[] array = s.toCharArray();

        ArrayDeque<Character> deque = new ArrayDeque<>();

        deque.push(array[0]);

        for (int j = 1; j < array.length; j++) {
            char tmp = array[j];

            if(deque.size() > 0 && checkForPop(deque.peek(),tmp)){
                deque.pop();
            }else{
                deque.push(tmp);
            }
        }

        System.out.println(deque.size());
        return 0;
    }

    public static boolean checkForPop(char c, char x){
        Math.abs(101);
        return c == '(' && x == ')';
    }
    
}
