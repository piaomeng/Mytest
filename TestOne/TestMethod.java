package TestOne;

import java.math.BigDecimal;
import java.util.Date;

import org.omg.CORBA.PUBLIC_MEMBER;

import sun.net.www.content.text.plain;
import sun.nio.cs.ext.TIS_620;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class TestMethod {
	public static void test1() {
		
		Person p=new Chinese();
		p.name="sdas";
		p.Dinner(p);
	}
	
	
}

class Person
{
	
	public String name;
	Date date=new Date();
	int hour =date.getHours();
	public void Dinner_Time(Person person)
	{
		if(this.hour<=8 && this.hour>7)
		{
			this.Breakfast(person);
		}
		else if(this.hour<=13 && this.hour>11)
		{
			this.Lauch(person);
		}
		else if(this.hour<=20 && this.hour>17)
		{
			this.Dinner(person);
		}
	}
	
	public void Breakfast(Person person)
	{
		System.out.println(this.name+"到该吃早餐的时间了");
		
	}
	public void Lauch(Person person)
	{
		System.out.println(this.name+"到该吃午餐的时间了");
		
	}
	public void Dinner(Person person)
	{
		System.out.println(this.name+"到该吃晚餐的时间了");
		
	}
}

class Chinese extends Person
{
	public void Dinner_Time(Chinese person)
	{
		if(this.hour<=8 && this.hour>7)
		{
			this.Breakfast(person);
		}
		else if(this.hour<=13 && this.hour>11)
		{
			this.Lauch(person);
		}
		else if(this.hour<=20 && this.hour>17)
		{
			this.Dinner(person);
		}
	}
	
	public void Breakfast(Person person)
	{
		System.out.println("中国人早晨吃包子油条");
		
	}
	public void Lauch(Person person)
	{
		System.out.println("午餐吃 米饭 馒头");
		
	}
	public void Dinner(Person person)
	{
		System.out.println("中国人晚上吃粥， 蔬菜，水果");
		
	}
	
	public void person1()
	{
		System.out.println("我是中国人");
	}
}

class Foreigners extends Person
{
	public void Dinner_Time(Foreigners person)
	{
		if(this.hour<=8 && this.hour>7)
		{
			this.Breakfast(person);
		}
		else if(this.hour<=13 && this.hour>11)
		{
			this.Lauch(person);
		}
		else if(this.hour<=20 && this.hour>17)
		{
			this.Dinner(person);
		}
	}
	
	public void Breakfast(Person person)
	{
		System.out.println("外国人早晨吃黄油 面包");
		
	}
	public void Lauch(Person person)
	{
		System.out.println("外国人午餐吃汉堡。马铃薯，一些蔬菜");
		
	}
	public void Dinner(Person person)
	{
		System.out.println("外国人晚上吃 萨饼 蔬菜 牛肉");
		
	}
	
	public void person1()
	{
		System.out.println("I am a British");
	}
}

