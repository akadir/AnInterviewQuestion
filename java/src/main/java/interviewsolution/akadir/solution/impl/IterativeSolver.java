package interviewsolution.akadir.solution.impl;

import interviewsolution.akadir.solution.ISolver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author akadir
 * Date: 15.01.2020
 * Time: 22:29
 */
public class IterativeSolver implements ISolver {


    @Override
    public int solve(int numberOfBalls) {
        List<Integer> resultList = new ArrayList<>();

        resultList.add(0);
        resultList.add(1);
        resultList.add(2);

        for (int i = 3; i < numberOfBalls + 1; i++) {
            resultList.add(resultList.get(i - 1) + resultList.get(i - 2));
        }

        return resultList.get(numberOfBalls);
    }
}
