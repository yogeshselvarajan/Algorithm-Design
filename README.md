# Algorithm-Design
This repository contains my solution for common algorithms. I've created this repository to learn about algorithms and improve solutions to common computer science problems. I'll try to add more solutions if I have time. :)

Each solution has a Java program and is tested. Some problems contain multiple solutions with different implementations.

Problems
--------

### 1. Brute Force Algorithms
Brute Force Algorithms are exactly what they sound like – straightforward methods of solving a problem that rely on sheer computing power and trying every possibility rather than advanced techniques to improve efficiency.
For example, imagine you have a small padlock with 4 digits, each from 0-9. You forgot your combination, but you don't want to buy another padlock. Since you can't remember any of the digits, you have to use a brute force method to open the lock.
So you set all the numbers back to 0 and try them one by one: 0001, 0002, 0003, and so on until it opens. In the worst case scenario, it would take 104, or 10,000 tries to find your combination. 
* [Bubble Sort](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Brute_Force_Algorithms/BubbleSort.java)
* [Closest Pair Problem](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Brute_Force_Algorithms/ClosestPair.java)
* [Pattern Matching Problem](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Brute_Force_Algorithms/PatternMatching.java)
* [Selection Sort](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Brute_Force_Algorithms/SelectionSort.java)

### 2. Decrease and Conquer Algorithms
The decrease-and-conquer technique is based on exploiting the relationship between a solution to a given instance of a problem and a solution to its smaller instance. Once such a relationship is established, it can be exploited either top down or bottom up. The former leads naturally to a recursive implementa-tion, although, as one can see from several examples in this chapter, an ultimate implementation may well be nonrecursive. The bottom-up variation is usually implemented iteratively, starting with a solution to the smallest instance of the
problem; it is called sometimes the incremental approach.
* [Insertion Sort](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Decrease_and_Conquer_Algorithms/InsertionSort.java)
* [Josephus Problem](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Decrease_and_Conquer_Algorithms/Josephus.java)
* [Topological Sort](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Decrease_and_Conquer_Algorithms/TopologicalSort.java)


### 3. Divide and Conquer Algorithms
This technique can be divided into the following three parts:
1. Divide: This involves dividing the problem into smaller sub-problems.
2. Conquer: Solve sub-problems by calling recursively until solved.
3. Combine: Combine the sub-problems to get the final solution of the whole problem.

* [Binary Search Problem](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Divide_and_Conquer_Algorithms/BinarySearch.java)
* [Merge Sort](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Divide_and_Conquer_Algorithms/MergeSort.java)
* [Quick Sort](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Divide_and_Conquer_Algorithms/QuickSort.java)
* [Strassen's Matrix Multiplication Problem](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Divide_and_Conquer_Algorithms/Strassens_MatrixMultiplication.java)


### 4. Exhaustive Search Algorithms
Exhaustive search is simply a brute-force approach to combinatorial prob-lems. It suggests generating each and every element of the problem domain, se-lecting those of them that satisfy all the constraints, and then finding a desired element (e.g., the one that optimizes some objective function). Note that although the idea of exhaustive search is quite straightforward, its implementation typically requires an algorithm for generating certain combinatorial objects.

* [Knapsack Problem](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Exhaustive_Search_Algorithms/KnapSack.java)

### 5. Transform and Conquer Algorithms
This group of techniques solves a problem by a transformation
1. to a simpler/more convenient instance of the same problem
(instance simplification)
2. to a different representation of the same instance
(representation change)
3. to a different problem for which an algorithm is already
available (problem reduction)

* [Presorting Problem](https://github.com/yogeshcenation/Algorithm-Design/blob/dea63dd8bc388a089ab200850788355fefb53dcc/src/Transform_and_Conquer_Algorithms/Presorting.java)
