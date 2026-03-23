class A
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
}
class B extends A
{
	public int add(int n1, int n2)
	{
		return n1+n2+3;
	}
}


public class AX{
	public static void main(String args[])
	{

		
		B obj=new B();
		int r1=obj.add(3, 4);
		System.out.println(r1);
	}
}