import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void insert() {
        MyQueue<Integer> myQueue = new MyQueue<>(1);
        IntStream.range(0,100)
                .forEach(myQueue::insert);

        assertEquals(100, myQueue.size());
        while (!myQueue.isEmpty()) System.out.println(myQueue.remove());
    }
}