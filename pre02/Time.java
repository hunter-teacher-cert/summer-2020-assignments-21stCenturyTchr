import java.io.*;
import java.util.*;


public class Time {
    public static void main(String[] args)
    	{
    
    int hour = 20;
    int minute = 46;
    int second = 30;

    System.out.print("Number of seconds since midnight: ");
	System.out.println((hour * 3600) + (minute * 60) + second);

	int total_seconds_passed_since_midnight = (hour * 3600) + (minute * 60) + second;

	System.out.print("Number of seconds remaining in the day: ");
	System.out.println(86400 - ((hour * 3600) + (minute * 60) + second));


	double percentage;

	System.out.print("Percent of the day that has passed: ");
	System.out.print( total_seconds_passed_since_midnight * 100 / 86400);
	System.out.println("%"); 

	int hournow = 21;
    int minutenow = 2;
    int secondnow= 30;

    int total_seconds_passed_since_midnight_now = (hournow * 3600) + (minutenow * 60) + secondnow;

    System.out.print("Total time elapsed since i satred: ");
    System.out.println((total_seconds_passed_since_midnight_now - total_seconds_passed_since_midnight) / 60);
    System.out.print(" minutes");







    	}
}