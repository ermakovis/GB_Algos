import lesson5.Pair;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static lesson5.Lesson5.bagProblem;
import static lesson5.Lesson5.power;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson5Test {

    @Test
    void powerTest() {
        assertEquals(power(0, 0), Math.pow(0, 0));
        assertEquals(power(1, 0), Math.pow(1, 0));
        assertEquals(power(0, 1), Math.pow(0, 1));
        assertEquals(power(1, 1), Math.pow(1, 1));
        assertEquals(power(100, 100), Math.pow(100, 100));
        assertEquals(power(0, 0), Math.pow(0, 0));
        assertEquals(power(-1, 0), Math.pow(-1, 0));
        assertEquals(power(0, -1), Math.pow(0, -1));
        assertEquals(power(1, -1), Math.pow(1, -1));
        assertEquals(power(-1, 1), Math.pow(-1, 1));
        assertEquals(power(100, -100), Math.pow(100, -100));
        assertEquals(power(-100, 100), Math.pow(-100, 100));
        assertEquals(power(-100, -100), Math.pow(-100, -100));
    }

    @Test
    void bagProblemTest() {
        List<Pair> doubleList = Collections.emptyList();
        double limit = 5.;
        System.out.println(limit + "  " + doubleList + "  " + bagProblem(doubleList, limit));


        doubleList = List.of(new Pair(1.,10.),
                new Pair(1.,10.),
                new Pair(2.,40.),
                new Pair(3.,10.),
                new Pair(5.,100.),
                new Pair(5.,100.),
                new Pair(5.,100.),
                new Pair(4.,10.),
                new Pair(10.,70.),
                new Pair(1.,4.)
        );
        limit = 1.;
        System.out.println(limit + "  " + doubleList + "  " + bagProblem(doubleList, limit));
        limit = 3.;
        System.out.println(limit + "  " + doubleList + "  " + bagProblem(doubleList, limit));
        limit = 5.;
        System.out.println(limit + "  " + doubleList + "  " + bagProblem(doubleList, limit));
        limit = 8.;
        System.out.println(limit + "  " + doubleList + "  " + bagProblem(doubleList, limit));
        limit = 9.;
        System.out.println(limit + "  " + doubleList + "  " + bagProblem(doubleList, limit));
        limit = 15.;
        System.out.println(limit + "  " + doubleList + "  " + bagProblem(doubleList, limit));
        limit = 20.;
        System.out.println(limit + "  " + doubleList + "  " + bagProblem(doubleList, limit));
    }
}