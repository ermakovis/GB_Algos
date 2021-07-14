import java.util.EmptyStackException;
import java.util.Iterator;

public class MyLinkedStack<E> implements Iterable<E> {
    private final MyLinkedList<E> list = new MyLinkedList<>();

    public E peek() {
        if (size() == 0) throw new EmptyStackException();
        return list.getFirst();
    }

    public E pop() {
        if (size() == 0) throw new EmptyStackException();
        return list.removeFirst();
    }

    public void push(E i) {
        list.insertFirst(i);
    }

    public int size() {
        return list.size();
    }

    public boolean empty() {
        return list.size() == 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedStackIterator();
    }

    private class MyLinkedStackIterator implements Iterator<E> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public E next() {
            return list.get(index++);
        }
    }

}
