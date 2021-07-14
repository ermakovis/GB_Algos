import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedStackTest {
    private MyLinkedStack<Integer> testedClass;

    @BeforeEach
    void setup() {
       testedClass = new MyLinkedStack<>();
    }

    @Test
    void push() {
        testedClass.push(1);
        assertEquals(1, (int) testedClass.peek());
        testedClass.push(2);
        assertEquals(2, (int) testedClass.peek());
        testedClass.push(3);
        assertEquals(3, (int) testedClass.peek());
        assertEquals(3, testedClass.size());
    }

    @Test
    void pop() {
        testedClass.push(1);
        testedClass.push(2);
        testedClass.push(3);
        assertEquals(3, testedClass.size());
        assertEquals(3, (int) testedClass.pop());
        assertEquals(2, testedClass.size());
        assertEquals(2, (int) testedClass.pop());
        assertEquals(1, testedClass.size());
        assertEquals(1, (int) testedClass.pop());
        assertEquals(0, testedClass.size());
        assertThrows(EmptyStackException.class, () -> testedClass.pop());
    }

    @Test
    void peek() {
        assertThrows(EmptyStackException.class, () -> testedClass.peek());
        testedClass.push(1);
        testedClass.push(2);
        testedClass.push(3);
        assertEquals(3, testedClass.size());
        assertEquals(3, (int) testedClass.peek());
        assertEquals(3, testedClass.size());
        assertEquals(3, (int) testedClass.peek());
    }

    @Test
    void empty() {
        assertTrue(testedClass.empty());
        testedClass.push(1);
        assertFalse(testedClass.empty());
    }

    @Test
    void iterator() {
        IntStream.range(0, 10).forEach(testedClass::push);

        int count = 9;
        Iterator<Integer> iterator = testedClass.iterator();
        while (iterator.hasNext()) {
            assertEquals(count--, (int) iterator.next());
        }

        count = 9;
        for (Integer i : testedClass) {
            assertEquals(count--, (int) i);
        }
    }
}