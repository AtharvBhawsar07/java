 class A 
 {
      
    public A() {
        System.out.println("object is created");
    }

    public void show()
    {
        System.out.println("this is method");
    }
 }
    public class ob1
{
        public static void main(String [] args)
    {
        new A(); // anoymous object
        new A().show();

    }
    
}
