package interviewsolution.akadir.exception;

import interviewsolution.akadir.enumeration.SolverType;

/**
 * @author akadir
 * Date: 15.01.2020
 * Time: 22:35
 */
public class UnknownSolverTypeException extends RuntimeException {
    private static final String MESSAGE = "Solver type is not supported: ";

    public UnknownSolverTypeException(SolverType solverType) {
        super(MESSAGE + solverType.getClass().getSimpleName());
    }
}
