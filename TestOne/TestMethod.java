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
		System.out.println(this.name+"���ó���͵�ʱ����");
		
	}
	public void Lauch(Person person)
	{
		System.out.println(this.name+"���ó���͵�ʱ����");
		
	}
	public void Dinner(Person person)
	{
		System.out.println(this.name+"���ó���͵�ʱ����");
		
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
		System.out.println("�й����糿�԰�������");
		
	}
	public void Lauch(Person person)
	{
		System.out.println("��ͳ� �׷� ��ͷ");
		
	}
	public void Dinner(Person person)
	{
		System.out.println("�й������ϳ��࣬ �߲ˣ�ˮ��");
		
	}
	
	public void person1()
	{
		System.out.println("�����й���");
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
		System.out.println("������糿�Ի��� ���");
		
	}
	public void Lauch(Person person)
	{
		System.out.println("�������ͳԺ�����������һЩ�߲�");
		
	}
	public void Dinner(Person person)
	{
		System.out.println("��������ϳ� ���� �߲� ţ��");
		
	}
	
	public void person1()
	{
		System.out.println("I am a British");
	}
}

