import tools.*;

class Cl
{

    public int add(int a , int b)
{     
        return  a+b;
}
    public int sub(int a , int b)
{ 
    return   a - b;

}


}

public class cal
{
    public static void main(String[] args) 
    {
        Cl c = new Cl();
        int r1 =c.add(23 , 89);
        int r2= c.sub(57, 23);
        
       
       //System.out.println(r +"  "+ r2 +"  " +"  "+ r3+"  "+ r1);
    }

}
    

