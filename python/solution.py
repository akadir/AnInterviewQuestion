from __future__ import print_function
import time

def iterative_solution(number):
    result = [0, 1, 2]

    for i in range(3, number + 1):
        a = result[i - 1]
        b = result[i - 2]

        result.append(a + b)

    return result[number]


def recursive_solution(number):
    if number <= 3:
        return number

    return recursive_solution(number - 1) + recursive_solution(number - 2)


def memoize(f):
    memo = {}

    def helper(x):
        if x not in memo:
            memo[x] = f(x)
        return memo[x]

    return helper


@memoize
def recursive_solution_with_memoization(number):
    if number <= 2:
        return number

    return recursive_solution_with_memoization(number - 1) + recursive_solution_with_memoization(number - 2)


if __name__ == '__main__':
    number = input("Enter number of balls in a bag:")
    number = int(number)

    start = time.time()
    iterative_result = iterative_solution(number)
    end = time.time()
    print('There are ', iterative_result, ' different way(s) | Calculated in ', end - start, ' seconds using Iterative method')

    start = time.time()
    recursive_result = recursive_solution(number)
    end = time.time()
    print('There are ', iterative_result, ' different way(s) | Calculated in ', end - start, ' seconds using Recursive method')

    start = time.time()
    recursive_result = recursive_solution_with_memoization(number)
    end = time.time()
    print('There are ', iterative_result, ' different way(s) | Calculated in ', end - start, ' seconds using Memoization method')