

/*
# Name : Matt Diederick

        # Class: CSET 1200

        # Instructor: Dr. Jared Oluoch

        # Homework: 4

        # Date: 02/17/17

        # Summary:

  	Problem 2
	In a Fibnacci sequence, every number after the first two is the sum of two
	preceding ones, for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,....
	Write a java program that uses a while loop to print out all Fibonacci numbers
	less than 145.

 */
public class Problem2 {
    public static void main(String[] args){
        int fib =0;
        int fibArray[] = new int[20];
        int copiedArray[];
        fibArray[0] =0;
        fibArray[1] =1;
        int i =2;

        while(fib + 1< 145){
            fib = fibArray[i-2] + fibArray[i-1];
            fibArray[i] = fib;
            ++i;
        }
        copiedArray = new int[i];
        copiedArray[0] =0;
        i =1;

        while(i<fibArray.length){
            if(fibArray[i] !=0){
                copiedArray[i] = fibArray[i];
            }
            i++;
        }

//        Arrays.stream(fibArray)
//                .filter( x -> x != 0)
//                .forEach( System.out::println );


        for(int c : copiedArray){

            System.out.print(c + ", ");
        }
    }
}
