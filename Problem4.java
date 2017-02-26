
/*
 # Name : Matt Diederick
 
 # Class: CSET 1200
 
 # Instructor: Dr. Jared Oluoch
 
 # Homework: 4
 
 # Date: 02/17/17
 
 # Summary:
 This program display each leap year between 101 and 2100 
 
 */
public class Problem4 {
    public static void main(String[] args){
        final int beginYear = 101;
        final int endYear = 2100;
        int totalLeapYears =0;
        System.out.printf("\nLeap Years Between %d and %d \n\n",beginYear,endYear);
        for(int i = beginYear; i<=endYear;i++){
            //conditions on both sides of && must be true for inside of brackets to execute
            // and one of the two must be true on the right side 
            if(i % 4 ==0 && ( i % 100 != 0 || i % 400 == 0  )){
                totalLeapYears++;
                System.out.print(i + " ");
                //print a new line every ten years
                if(totalLeapYears % 10 == 0){
                    System.out.print("\n");
                }
            }
        }
        System.out.printf("\n\nThere are %d total leap years between %d and %d", totalLeapYears,beginYear,endYear);
    }
}
