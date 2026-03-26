 class A
{
  public void show()
  {
    System.out.println(" SHOW IN THE A");
  }
}
 class B extends A
 {
    public void show()
  {
    System.out.println("SHOW IN THE B");
  }
 }
  
 class C extends B
 {
    public void show()
  {
    System.out.println("SHOW IN THE C");
  }
 }

public class poly 
{
   public static void main (String [] args)
   {
        A obj = new A();
        obj.show();

        B obj1 = new B();
        obj1.show();

        C obj2 = new C();
        obj2.show();
   }
    
}
