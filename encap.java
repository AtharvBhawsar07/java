class Human 
{
    private int age;
    private String su;
     public int getage() 
    {
        return age;
    }
     public String getname()
    {
        return su ;
    } 
     public void setage(int a)
     {
        age = a;
     }
     public void setname (String b)
     {
        su = b;
     }

}

public class encap {
    public static void main(String[] args) 
    {  Human obj = new Human();
        obj.setage(12); 
        obj.setname("ram");
        System.out.println(obj.getname() +" = "+ obj.getage());
    }
}
