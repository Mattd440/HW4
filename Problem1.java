/*
# Name : Matt Diederick

        # Class: CSET 1200

        # Instructor: Dr. Jared Oluoch

        # Homework: 4

        # Date: 02/17/17

        # Summary: A brief description of what the program does

        Problem 1
        Write and run a java program that uses a for loop to generate 10 random
        numbers, prints out the random numbers generated, the sum of the random
        numbers, and the square root of the random numbers.
 */
import java.util.Random;
import java.util.Date;
public class Problem1 {
    public static void main(String [] args){
    Random rand = new Random();
    rand.setSeed(System.currentTimeMillis());

    int sum = 0;
    double sqrt = 0;
    int randNum = 0;

    for(int i =0; i<10; i++){
        randNum = rand.nextInt(100) + 1;
        sum += randNum;
        sqrt = Math.sqrt(randNum);
        System.out.printf("#%d) \t Random Number: %d \t Running Sum: %d \t Squareroot: %.2f \n", i+1, randNum, sum,sqrt);
    }
    }
}
