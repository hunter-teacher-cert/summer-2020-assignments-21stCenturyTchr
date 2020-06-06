import java.io.*;
import java.util.*;


public class Date {
    public static void main(String[] args)
    	{
        
	    	String day= "Sunday";
			//System.out.println(day); 

			int date= 5;
			//System.out.println(date);

			String month= "June ";
			//System.out.println(month);  

			int year= 2020;
			//System.out.println(year); 

			// American format:
			// Thursday, July 16, 2015
			// European format:
			// Thursday 16 July 2015

			System.out.println("American Format:");
			System.out.print(day);
			System.out.print(", ");
			System.out.print(month);
			System.out.print(date);
			System.out.print(", ");
			System.out.println(year);

			System.out.println();

			System.out.println("European Format:");
			System.out.print(day);
			System.out.print(date);
			System.out.print(" ");
			System.out.print(month);
			System.out.println(year);



    	}
}