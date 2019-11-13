###### Concurrent Programming ######

## Question 1
Write a thread that tosses a coin 1000 times and computes the frequency of heads and tails.
A coin can be modelled by a random number generator that generates random numbers in the range 0..1.

## Question 2
Write a thread that continuously prints a message every 100 milliseconds while it is still alive. 
The thread should be written in such a way that it can be terminated at any time by a control program (main).

## Question 3
Write a program that employs 2 threads that each toss their own die (modelled by a random number generator that generates random numbers in the range 1..6) a given number of times. 
In both cases the result of each toss is stored in a shared array. 
The array is deemed to be large enough to store the result of every throw and each thread should only write to its own array segment.
Once the threads have completed their work then the main program counts the frequency of each number thrown and prints it on the screen.

# Compiling & Execution of Programs #

- Question 1 -
javac Question1.java 
java Question1

- Question 2 -
javac Question2.java.java 
java Question2

- Question 3 -
javac Question3.java 
java Question3
