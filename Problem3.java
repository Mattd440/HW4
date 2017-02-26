import java.util.Scanner;

/*
# Name : Matt Diederick

        # Class: CSET 1200

        # Instructor: Dr. Jared Oluoch

        # Homework: 4

        # Date: 02/17/17

        # Summary:
        This program allows the user to enter a loan amount and period and calculates the montly payment and total
        payment for interest rates between 5% - 8% in .125% increments


 */
public class Problem3 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        double loanAmount =0;
        int loanPeriod = 0;
        double monthlyPayment = 0;
        double totalPayment = 0;

        System.out.println("Loan Amount: ");
        loanAmount = input.nextDouble();
        System.out.println("Number of Years:");
        loanPeriod = input.nextInt();

        System.out.println("Interest Rate \t Monthly Payment \t Total Payment \n");
        for(double i = 5; i<=8 ; i+= .125){
            double interestRate = i / 1200;
            monthlyPayment = Problem3.getMonthlyPayment(loanAmount,interestRate,loanPeriod);
            totalPayment = getTotalPayment(monthlyPayment,loanPeriod);
            System.out.printf("\t%.3f%c \t\t\t %.2f \t\t  %.2f \n",i,'%',monthlyPayment,totalPayment );
        }

    }
    private static double getMonthlyPayment(double amount, double interestRate, int years){
        return  amount * interestRate / (1 - 1 / Math.pow(1+interestRate,years * 12));
    }
    private static double getTotalPayment(double monthlyPayment, int years){
        return monthlyPayment * years * 12;
    }
}
