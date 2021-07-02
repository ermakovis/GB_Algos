import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void push() {
        MyStack<Integer> myStack = new MyStack<>(1);
        IntStream.range(0, 100)
                .forEach(myStack::push);

        assertEquals(100, myStack.size());
        while (!myStack.isEmpty()) System.out.println(myStack.pop());

    }
}