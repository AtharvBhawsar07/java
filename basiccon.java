
    class Human 
{
    private int age;
    private String su;

    public Human()
    {
        age = 19; 
        su = "atharv";
    }
     public int getage() 
    {
        return age; 
    }
     public String getname()
    {
        return su ;
    } 
     public void setage(int age)
     {
        this.age = age ;
     }
     public void setname (String su)
     {
        this.su = su;
     }

}

public class basiccon {
    public static void main(String[] args) 
    {  Human obj = new Human();

        System.out.println(obj.getname() +" = "+ obj.getage());

        obj.setage(12); 
        obj.setname("ram");
       // System.out.println(obj.getname() +" = "+ obj.getage());
    }
}


