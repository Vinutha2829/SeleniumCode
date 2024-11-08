package seleniumSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CalendarHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		selectFutureDate("September 2024", 31);
		}
	public static void selectFutureDate(String expMonthYear, int date) {
		//Splitting month and year ==month is string format and year in int format
		String[] monthAndyear=expMonthYear.split(" ");
		String month=monthAndyear[0];
		int year=Integer.parseInt(monthAndyear[1]);
		//for 30 days month--- check (//April, june, sept, nov -- 4 months) --String[] list
				//listist.equalsIgnoreCAse(April) && day>30)--return;
		String[] list= {"April","June","September","November"};
		for(int i=0;i<list.length;i++)
		{
			if(list[i].equalsIgnoreCase(month)&& date>30)
			{
				System.out.println("  wrong date "+date+" is passed...please pass the right date for  " + month);
				return;
			}
		}
		//leap year: feb: 29
		if(month.equalsIgnoreCase("February")&&(year%4==0))
		{
			if(date >29)
			{
				System.out.println("Leap year:"+year+"  wrong date is passed...please pass the right date for Feb " + date);
				return;
			}
		}
		//non leap year: feb: 28
		if(month.equalsIgnoreCase("February")&&(year%4!=0))
		{
			
			if(date >28)
			{
				System.out.println("Non Leap year:"+year+"   wrong date is passed...please pass the right date for Feb " + date);
				return;
			}
		}
		
		if(expMonthYear.contains("February") && date >29) {
			System.out.println("wrong date is passed...please pass the right date for Feb" + date);
			return;
		}
		
		if(date>31) {
			System.out.println("wrong date is passed...plz pass the right date..." + date);
			return;
		}
		if(date<=0) {
			System.out.println("wrong date is passed...plz pass the right date..." + date);
			return;
		}
		
		
		String actMonYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		System.out.println("Actually Month and Year: "+actMonYear);//June 2023
		
		while(!actMonYear.equalsIgnoreCase(expMonthYear)) {
			//click on next icon:
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();

		}
		
		selectDate(date);
	}
	
	public static void selectDate(int date) {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}
}
