package interviewsolution.akadir.factory;

import interviewsolution.akadir.enumeration.SolverType;
import interviewsolution.akadir.exception.UnknownSolverTypeException;
import interviewsolution.akadir.solution.ISolver;
import interviewsolution.akadir.solution.impl.IterativeSolver;
import interviewsolution.akadir.solution.impl.RecursiveSolver;

/**
 * @author akadir
 * Date: 15.01.2020
 * Time: 22:30
 */
public class SolutionFactory {

    private SolutionFactory() {
    }

    public static ISolver getSolver(SolverType solverType) {

        if (SolverType.ITERATIVE == solverType) {
            return new IterativeSolver();
        } else if (SolverType.RECURSIVE == solverType) {
            return new RecursiveSolver();
        } else {
            throw new UnknownSolverTypeException(solverType);
        }
    }
}
