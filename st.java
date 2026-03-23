class Mobile
{
 String brand;
 int price;
 static String name;
 public void show ()
 {

    System.out.println(brand + " : " + name +" : "+ price);
 }
}
public class st 
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand  = "Apple";
        obj1.name   = "Iphone";
        obj1.price  = 1_50_000;
        
       
        
        Mobile obj2 = new Mobile();
        obj2.brand  = "Samsung";
        obj2.name   = "phone";
        obj2.price  = 2_50_000;
        obj2.name = "ipad";
        //obj1.name = "phone";           
        
        obj1.show();
        obj2.show();
    }
}
