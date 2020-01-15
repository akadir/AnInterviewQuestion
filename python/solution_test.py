import solution as solution
import unittest

class FibTest(unittest.TestCase):
    def test_iterative_solution(self):
        self.assertEqual(1, solution.iterative_solution(1))
        self.assertEqual(2, solution.iterative_solution(2))
        self.assertEqual(3, solution.iterative_solution(3))
        self.assertEqual(5, solution.iterative_solution(4))
        self.assertEqual(987, solution.iterative_solution(15))

    def test_recursive_solution(self):
        self.assertEqual(1, solution.recursive_solution(1))
        self.assertEqual(2, solution.recursive_solution(2))
        self.assertEqual(3, solution.recursive_solution(3))
        self.assertEqual(5, solution.recursive_solution(4))
        self.assertEqual(987, solution.recursive_solution(15))

    def test_recursive_solution_with_memoization(self):
        self.assertEqual(1, solution.recursive_solution_with_memoization(1))
        self.assertEqual(2, solution.recursive_solution_with_memoization(2))
        self.assertEqual(3, solution.recursive_solution_with_memoization(3))
        self.assertEqual(5, solution.recursive_solution_with_memoization(4))
        self.assertEqual(987, solution.recursive_solution_with_memoization(15))
        self.assertEqual(102334155, solution.recursive_solution_with_memoization(39))


if __name__ == '__main__':
    unittest.main()