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
		final int dayPerMonth=20;
		final int totalHours=100;
		//variable
		int dailyWage;
		int dailyHours;
		int monthlyWage=0;
		int hours=0;
		int day=0;
		//computation
		while(hours<=totalHours && day<=dayPerMonth)
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
		hours += dailyHours;
		day++;
		dailyWage=wagePerHour*dailyHour;
		System.out.println("Employee DailyWage= "+dailyWage);
		monthlyWage=dailywage*20;
		System.out.println("Employee Monthly wage="+monthlyWage)
		
	}
}
