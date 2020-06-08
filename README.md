
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

Methods:

Arrays.binarySearch(Object[] a, Object key):

Description
The java.util.Arrays.binarySearch(Object[] a, Object key) method searches the specified array for the specified object using the binary search algorithm.The array be sorted into ascending order according to the natural ordering of its elements prior to making this call. If it is not sorted, the results are undefined.

Parameters
a − This is the array to be searched.

key − This is the value to be searched for.

Return Value
This method returns index of the search key, if it is contained in the array, else it returns (-(insertion point) - 1). The insertion point is the point at which the key would be inserted into the array: the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key.

Arrays.sort(a[]):

Description
This method takes an array a and sorts it

Parameters

a − This is the array to be sorted.

Math.random():

Description
The java.lang.Math.random() is used to return a pseudorandom double type number greater than or equal to 0.0 and less than 1.0. The default random number always generated between 0 and 1.

Parameters
None

Return Value
It returns a pseudorandom double value greater than or equal to 0.0 and less than 1.0.

String.split(String regex):

Description
Takes a string and then a delimiting expression and splits the string into smaller strings returned in a string array

Parameters
regex - a delimiting regular expression

Return Value
An array of strings computed by splitting the given string.
