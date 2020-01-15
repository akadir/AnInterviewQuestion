# An Interview Question

A programming question have sent to me by one of the companies I have applied for a job via email the other day. 

Here is definition of the question:

In a bag, there are n identical balls (n >= 1) that needs to be removed from the bag. You can either remove one ball or two balls at a time. Write a code that, given n, calculates how many different ways you can remove the balls from the bag. 

Example 1:

```
input n = 3
result = 3

1 - 1 - 1
1 - 2
2 - 1
```
Example 2:
```
input n = 5
result = 8

1 - 1 - 1 - 1 - 1
1 - 1 - 1 - 2
1 - 1 - 2 - 1
1 - 2 - 1 - 1
2 - 1 - 1 - 1
1 - 2 - 2
2 - 1 - 2
2 - 2 - 1
```

```
ways(n) = ways(n-1) + ways(n-2)
```

## My Solutions

As it is stated in the problem definition, this problem is very similiar to the Fibonacci number calculation problem. The only difference is the first couple of values.

In fibonacci comes in this order:
```
0->0
1->1
2->1
3->2
4->3
5->5
.
.
.
```

But in this question values are like this:
```
0->0
1->1
2->2
3->3
4->5
5->8
.
.
.
````

So we can use fibonacci algorithm with some minor changes. 

### Python Solution:

Tested versions:
```
Python: 2.7.17 and 3.7.5
```

### run using python2

```
cd python

# run project
python solution.py

# run unit tests
python solution_test.py
```

### run using python3

```
cd python

# run project
python3 solution.py

# run unit tests
python3 solution_test.py
```

## JAVA Solution

Tested versions:
```
Java: 1.8.0 and 11.0.2
Maven: Apache Maven 3.6.2 (40f52333136460af0dc0d7232c0dc0bcf0d9e117)
Gradle: Gradle 6.0.1 fad121066a68c4701acd362daf4287a7c309a0f5
```

### run using gradle

```
cd java

# run jar file
java -jar build/libs/solution-1.0.jar

# rebuild jar file
./gradlew jar

# run tests with maven
./gradlew clean test --info
```

### run using maven

```
cd java

# run jar file
java -jar target/solution-1.0.jar

# rebuild jar file
mvn package

# run with mvn task
mvn clean compile exec:java

# run tests with maven
mvn test
```
