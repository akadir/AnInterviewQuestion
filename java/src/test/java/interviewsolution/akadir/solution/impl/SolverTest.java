package interviewsolution.akadir.solution.impl;

import interviewsolution.akadir.solution.ISolver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author akadir
 * Date: 15.01.2020
 * Time: 23:47
 */
@RunWith(Parameterized.class)
public class SolverTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 5}, {5, 8}, {6, 13}, {7, 21},
                {8, 34}, {9, 55}, {10, 89}, {11, 144}, {12, 233}, {13, 377},
                {14, 610}, {15, 987}, {16, 1597}, {17, 2584}, {18, 4181},
                {19, 6765}, {20, 10946}
        });
    }

    private int numberOfBalls;

    private int expectedResult;

    public SolverTest(int numberOfBalls, int expectedResult) {
        this.numberOfBalls = numberOfBalls;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testIterativeSolver() {
        ISolver iterativeSolver = new IterativeSolver();
        assertEquals(expectedResult, iterativeSolver.solve(numberOfBalls));
    }

    @Test
    public void testRecursiveSolver() {
        ISolver iterativeSolver = new RecursiveSolver();
        assertEquals(expectedResult, iterativeSolver.solve(numberOfBalls));
    }
}
