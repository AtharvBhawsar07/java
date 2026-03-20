
    class Mobile
{
 String brand;
 int price;
 static String name;
 public Mobile (){
    brand = "";
    price = 1433;
    System.out.println("IN THE CONSTRUCTOR");

 }

 static{
    name = "an";
    System.out.println("IN THE STATIC BLOCK");
 }

 public void show ()
 {
System.out.println(brand + " : " + name +" : "+ price);
 }
}
public class block
{
    public static void main(String[] args) throws ClassNotFoundException
    {
       
       Class.forName("Mobile");
             
    }
}


