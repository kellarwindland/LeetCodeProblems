This is a ReadMe file for the LeetCodeProblem repo. Inside this repo you will find many different files. 
Each of these files are named with the problem number within the Leet Code site. 
Most all of the problems are done in the java programming language, in the top comment section the file gives the overveiw of each problem before the given solution.
If there is no "DISCLAIMER" warning at the top then the solutions provided are original and done with no help of anyone else. 
Even though there is a disclaimer, I did not go out and copy paste there solution. 
I first would have thought about it myself and try all the things I could have. 
Once I am offically stuck I go out and look for people who have solved this and see waht hints or information I could get form the, using that to build a solution. 
At times there are key components of the problem that I simply cannot get and will use one I found, changing what I can about it. 
I am in no means taking credit, I am simply trying to learn and and better myself through doing different coding problems. 
Problems in which I could not anything original to the solution I found or needed help with are not posted here, since I contributed nothing. 


This ReadMe file will also be a home for all of the tools (methods and objects) and tricks (algorithms) that I used to solve each problem
that I had to do research to find and did not already know, for example recently I did a problem that using the Arrays.binarySearch(Object[] a, Object key) 
and it helped immensely, prior to this problem I had not seen this, so into the ReadMe it goes. This way I can look back at past tools and tricks to help me 
along the way and maybe I can help out other programmers like myself.

# Methods:

## Arrays.binarySearch(Object[] a, Object key):

### Description
The java.util.Arrays.binarySearch(Object[] a, Object key) method searches the specified array for the specified object using the binary search algorithm.The array be sorted into ascending order according to the natural ordering of its elements prior to making this call. If it is not sorted, the results are undefined.

### Parameters
a − This is the array to be searched.
key − This is the value to be searched for.

### Return Value
This method returns index of the search key, if it is contained in the array, else it returns (-(insertion point) - 1). The insertion point is the point at which the key would be inserted into the array: the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key.

## Arrays.sort(a[]):

### Description
This method takes an array a and sorts it

### Parameters
a − This is the array to be sorted.

## Math.random():

### Description
The java.lang.Math.random() is used to return a pseudorandom double type number greater than or equal to 0.0 and less than 1.0. The default random number always generated between 0 and 1.

### Parameters
None

### Return Value
It returns a pseudorandom double value greater than or equal to 0.0 and less than 1.0.

## String.split(String regex):

### Description
Takes a string and then a delimiting expression and splits the string into smaller strings returned in a string array

### Parameters
regex - a delimiting regular expression

### Return Value
An array of strings computed by splitting the given string.

## Pattern.compile(String regex, int flags):

### Description
Compiles the given regular expression into a pattern with the given flags.

### Parameters
regex - The expression to be compiled
flags - Match flags, a bit mask that may include CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL, UNICODE_CHARACTER_CLASS and COMMENTS

### Return Value
Returns a pattern that can used

## Pattern.matcher(CharSequence input)

### Description
Creates a matcher that will match the given input against this pattern.

### Parameters
input - The character sequence to be matched

### Return Value
A new matcher for this pattern

## Pattern.matches(regex, input);
 
### Description
Compiles the given regular expression and attempts to match the given input against it.
behaves in exactly the same way as the expression, could also do Pattern.compile(regex).matcher(input).matches()
If a pattern is to be used multiple times, compiling it once and reusing it will be more efficient than invoking this method each time.

### Parameters
regex - The expression to be compiled
input - The character sequence to be matched

### Return Value
True if it can match it to the pattern and false otherwise

IMPORTANT LINK TO THE PATTERN API: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html

# CONCEPTS AND ALGORITHMS:

## Catalan Numbers

### Description
Catalan numbers is a number sequence, which is found useful in a number of combinatorial problems, often involving recursively-defined objects.

### Applications
Number of correct bracket sequence consisting of n opening and n closing brackets.
The number of rooted full binary trees with n+1 leaves (vertices are not numbered). A rooted binary tree is full if every vertex has either two children or no children.
The number of ways to completely parenthesize n+1 factors.
The number of triangulations of a convex polygon with n+2 sides (i.e. the number of partitions of polygon into disjoint triangles by using the diagonals).
The number of ways to connect the 2n points on a circle to form n disjoint chords.
The number of non-isomorphic full binary trees with n internal nodes (i.e. nodes having at least one son).
The number of monotonic lattice paths from point (0,0) to point (n,n) in a square lattice of size n×n, which do not pass above the main diagonal (i.e. connecting (0,0) to (n,n)).
Number of permutations of length n that can be stack sorted (i.e. it can be shown that the rearrangement is stack sorted if and only if there is no such index i<j<k, such that ak<ai<aj ).
The number of non-crossing partitions of a set of n elements.
The number of ways to cover the ladder 1…n using n rectangles (The ladder consists of n columns, where ith column has a height i).

### How to use
Use with dynamic programming to reduce work that the code does, so there is no overlapping calculations

## Floyd's Tortoise and Hare

### Description
Pointer algorithm that uses only two pointers, which move through the sequence at different speeds

### Applications
Cycle detection within a graph
Help to find duplicate numbers in an array

### How to use
Phase 1 
hare = nums[nums[hare]] is twice as fast as tortoise = nums[tortoise]. Since the hare goes fast, it would be the first one who enters the cycle and starts to run 
around the cycle. At some point, the tortoise enters the cycle as well, and since it's moving slower the hare catches the tortoise up at some intersection point. Now phase 1 is 
over, and the tortoise has lost.
Phase 2
We give the tortoise a second chance by slowing down the hare, so that it now moves with the speed of tortoise: tortoise = nums[tortoise], hare = nums[hare]. The tortoise is 
back at the starting position, and the hare starts from the intersection point.
The answer is then the intersection of hare and tortoise after phase 2 ends

