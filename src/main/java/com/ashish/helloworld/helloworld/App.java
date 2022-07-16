package com.ashish.helloworld.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
	    final LocalDateTime now = LocalDateTime.now();

	    System.out.println("Hello, World! The current time is " + dtf.format(now));
    }
}
