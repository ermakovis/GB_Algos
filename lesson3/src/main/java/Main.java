import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>(1);
        IntStream.range(0, 10)
                .forEach(queue::insert);

    }

    private static String revertString(String someString) {
        MyStack<Character> myStack = new MyStack<>();

        IntStream.range(0, someString.length())
                .mapToObj(someString::charAt)
                .forEach(myStack::push);

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, myStack.size())
                .forEach(i -> sb.append(myStack.pop()));
        return sb.toString();
    }
}
