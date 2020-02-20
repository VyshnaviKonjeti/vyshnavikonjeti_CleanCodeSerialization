package com.mycompany.task4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Client 
{
	static PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
	static Scanner scan = new Scanner(System.in);
	static int option;
	public static void main( String[] args ) 
    {
		
		boolean startOver = true;
    	while(startOver)
    	{
    		CalculateInterest ci = new CalculateInterest();
    		readInputs(ci);
    		
    	if(option==1)     		
    		myout.print(ci.CalculateSimpleInterest());

    	else if(option==2) 
    		myout.print(ci.CalculateCompoundInterest());
    	
    	else {
    		myout.print("The option you entered is not valid. Please try again.\n");
    		startOver = false;	
    	}

		if(!startOver)
            startOver=true;

		else 
			startOver=false;

      }
    	myout.print("------------------------------------------\n");
    	CalculateConstructionCost obj = new CalculateConstructionCost();
    	readInputsCost(obj);
    	myout.print("Estimated house construction cost is :  "+obj.ConstructionCost());
    }
	public static void  readInputs(CalculateInterest obj) {
		myout.print("---------------------------------\n");
		myout.print("INTEREST CALCULATOR\n");
		myout.print("Types of Interest   \n 1. Simple Interest \n 2. Compound Interest \n");
    	myout.print("Enter type of Interest : ");
    	option = scan.nextInt();
    	myout.print("Enter pricipal amount : ");
		double principal = scan.nextDouble();
		myout.print("Enter rate of interest : ");
		double rate = scan.nextDouble();
		myout.print("Enter time in years : ");
		double time = scan.nextDouble();
		obj.setPrincipal(principal);
		obj.setRate(rate);
		obj.setTime(time);
	}
	public static void readInputsCost(CalculateConstructionCost obj) {
		myout.print("ESTIMATING HOUSE CONSTRUCTION COST\n");
		myout.print("Enter area in sq.feet : ");
    	int area = scan.nextInt(); 
    	myout.print("Types of Materials :  \n 1. Standard Materials \n 2. Above Standard Material \n 3. High Standard material \n");
    	myout.print("Enter type of material that you want : ");
    	int type = scan.nextInt();
    	myout.print("Do you want automated home(y/n) ? : ");
    	String choice = scan.next();
    	obj.setArea(area);
    	obj.setChoice(choice);
    	obj.setType(type);
		
	}
}



 