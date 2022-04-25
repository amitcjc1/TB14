
public class A 
{

	public void m1()
	{
		System.out.println("This is M1 method");
	}
	public void m2()
	{
		System.out.println("This is M2 method");
	}
	
	public void m3()
	{
		System.out.println("This is M3 method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello A");
		A a=new A();
		a.m2();
		a.m1();
	}
}
