package interviewsolution.akadir.solution.impl;

import interviewsolution.akadir.solution.ISolver;

/**
 * @author akadir
 * Date: 15.01.2020
 * Time: 22:29
 */
public class RecursiveSolver implements ISolver {
    @Override
    public int solve(int numberOfBalls) {
        if (numberOfBalls < 4)
            return numberOfBalls;

        return solve(numberOfBalls - 1) + solve(numberOfBalls - 2);
    }
}
