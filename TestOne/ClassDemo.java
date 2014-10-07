package TestOne;

public class ClassDemo {
	public void show(String name)
    {
        try
        {
             A show=(A)Class.forName(name).newInstance();
        show.aa();
    }
    catch(Exception e)
    {
        System.out.println (e.getMessage());
        }
            
        
    }
}
 class A
{
	 public void aa()
    {
        System.out.println ("A里的");    
        
    }    
    
}
 class B extends A
{
	 public void aa()
    {
        System.out.println ("B里的");    
        
    }    
    
}
 class C extends A
{
	 public void aa()
    {
        System.out.println ("C里的");    
        
    }    
    
}