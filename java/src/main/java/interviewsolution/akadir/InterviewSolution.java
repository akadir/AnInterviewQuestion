package interviewsolution.akadir;

import interviewsolution.akadir.enumeration.SolverType;
import interviewsolution.akadir.factory.SolverFactory;
import interviewsolution.akadir.solution.ISolver;

import java.util.Scanner;

/**
 * @author akadir
 * Date: 15.01.2020
 * Time: 22:39
 */
public class InterviewSolution {
    public static void main(String[] args) {
        System.out.print("Enter number of balls in a bag: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        solve(userInput, SolverType.ITERATIVE);
        solve(userInput, SolverType.RECURSIVE);
    }

    private static void solve(int userInput, SolverType solverType) {
        ISolver iterativeSolver = SolverFactory.getSolver(solverType);

        long start = System.nanoTime();
        int result = iterativeSolver.solve(userInput);
        long end = System.nanoTime();

        String message = new StringBuilder("There are ")
                .append(result).append(" different way(s) | Calculated in: ")
                .append((double) (end - start) / 1000000000L).append(" seconds using ")
                .append(solverType.name()).append(" approach").toString();

        System.out.println(message);
    }
}
