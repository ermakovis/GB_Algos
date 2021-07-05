import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = refreshList();
        Instant start = Instant.now();
        myArrayList.bubbleSort();
        Instant end = Instant.now();
        System.out.println("Bubble - " + humanReadableFormat(Duration.between(start, end)));


        myArrayList = refreshList();
        start = Instant.now();
        myArrayList.insertionSort();
        end = Instant.now();
        System.out.println("Insertion - " + humanReadableFormat(Duration.between(start, end)));

        myArrayList = refreshList();
        start = Instant.now();
        myArrayList.selectionSort();
        end = Instant.now();
        System.out.println("Selection - " + humanReadableFormat(Duration.between(start, end)));

    }

    private static MyArrayList<Integer> refreshList() {
        Random random = new Random();
        MyArrayList<Integer> myArrayList = new MyArrayList<>(100000);
        random.ints(100000, 0, 100)
                .forEach(myArrayList::add);
        return myArrayList;
    }

    public static String humanReadableFormat(Duration duration) {
        return duration.toString()
                .substring(2)
                .replaceAll("(\\d[HMS])(?!$)", "$1 ")
                .toLowerCase();
    }
}
