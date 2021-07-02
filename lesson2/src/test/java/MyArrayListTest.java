import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void testAdd() {
        MyArrayList<Integer> list = new MyArrayList<>(1);
        IntStream.range(0, 10).forEach(list::add);
        System.out.println(list);
        assertEquals(list.size(), 10);
    }

    @Test
    public void testInsert() {
        MyArrayList<Integer> list = new MyArrayList<>(10);
        assertThrows(IllegalArgumentException.class, () -> {list.add(-1, 1);});
        assertThrows(IllegalArgumentException.class, () -> {list.add(10, 1);});
        list.add(0,1);
        assertEquals(1, (int) list.get(0));
        list.add(9, 2);
        assertEquals(2, (int) list.get(9));
    }

    public void testTestAdd() {
    }

    public void testRemove() {
    }

    public void testTestRemove() {
    }

    public void testGet() {
    }

    public void testContains() {
    }

    public void testIndexOf() {
    }

    public void testIsEmpty() {
    }

    public void testSize() {
    }

    public void testTestToString() {
    }

    public void testSelectionSort() {
    }

    public void testInsertionSort() {
    }

    public void testBubbleSort() {
    }
}