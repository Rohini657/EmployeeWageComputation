package com.Employee;

public class EmployeeWageComputation 
{
	public static void main(String args[])
	{
		System.out.println("*********Welcome EmployeeWage Computtaion************");
		final int fullTime=1;
		final int partTime=2;
		final int wagePerHour=20;
		final int fullDayHour=8;
		//variable
		int dailyWage;
		int dailyHours;
		int monthlyWage=0;
		//computation
		for( int day=0;day<-dayPerMonth;d++)
		{
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch(empCheck){
				case fullTime:
					dailyHours=fullDayHour;
					break;
				case partTime:
					dailyHours=fullDayHour/2;
					break;
				default:
					dailyHours=0;
				break;
		}
		dailyWage=wagePerHour*dailyHour;
		System.out.println("Employee DailyWage= "+dailyWage);
		monthlyWage=dailywage*20;
		System.out.println("Employee Monthly wage="+monthlyWage)
	}
}
