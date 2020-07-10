import java.io.*;
import java.util.*;


public class Exercise {
    public static void main(String[] args)
    	{
    

            // Exercise 3.12 - #2
            int celcius;
            int farenheit;

            Scanner in = new Scanner(System.in);

            System.out.print("How many celcius? ");

            celcius = in.nextInt();
            
            farenheit = (celcius * 9/5) + 32;

            System.out.println(celcius + "C = " + farenheit + "F");




            // Exercise 3.12 - #3
            int provided_seconds;

            System.out.print("How many seconds would you like to convert? ");

            provided_seconds = in.nextInt();

            double hours = provided_seconds/3600;
            double hours_remainder = provided_seconds%3600;

            double minutes = hours_remainder/60;
            double minutes_remainder = hours_remainder%60;

            double seconds = minutes_remainder;


            System.out.printf(provided_seconds + " seconds = %.0f Hours : %.0f Minutes : %.0f Seconds",hours,minutes,seconds);
            System.out.println();




            // Exercise 3.12 - #4
            System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
            System.out.print("Type a number: ");

            int guessed_number = in.nextInt();
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            int offby;

            if(guessed_number == number)
                {
                    System.out.println("You got it!");
                }
            else
                {
                    System.out.println("Your guess is: " + guessed_number);
                    System.out.println("The number I was thinking of is: " + number);

                    if(guessed_number > number)
                        offby = guessed_number - number;
                    else
                        offby = number - guessed_number;

                    System.out.println("You were off by: " + offby);
                }







    	}
}