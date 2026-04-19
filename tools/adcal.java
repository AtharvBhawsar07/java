package tools;

class Ad extends Cl

{
    public int mul(int a,int b)
    {
        return a * b;
    }
    public int div(int a,int b)
    {
        return a / b;
    }

    int add(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    int sub(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}

public class adcal
{
        public static void main(String[] args)
    {
         Ad a = new Ad();
        int r =a.add(23 , 89);
        int r1= a.sub(57, 23);
        int r2 = a.mul(8,19);
        int r3 = a.div(72,9);
        
       System.out.println(r +"  "+ r2 +"  " +"  "+ r3+"  "+ r1);
       
       
    }

}
