class Test
{
  private int age  ; 
  private String name ; 
    
  public String getname  (){
    return name;
  }
    public Test(int age , String name)    //parameterized constructor
    {
       this.age = age;
        this.name = name;
    }

    public int getage() {
        return age;
    }

    
    }

    

public class para {
    public static void main(String[] args)
    {
        Test obj = new Test(14, "ram"); 
        obj.getname();
        obj.getage();
      System.out.println(obj.getname() + " = " +  obj.getage() );
    }
}
