    final class A
{
        public final void show()    // example of final method
    { 
        System.out.println("BY ATHARV");   
    }
        public final void add(int a, int b)
    {
        System.out.println(a+b);

    }
}
    class B extends A     // example of final class
    {
          public void show()
    {
        System.out.println("BY RAM");  
        
        
        public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    }
    }

    public class f2 
 {
    public static void main(String []args)
    {
         B obj  = new B();
        obj.show();
        obj.add(4,4); 
    
    }
 }
