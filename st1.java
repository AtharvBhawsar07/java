class Sita {
String name ;
int age ;


public static void show(Sita rm1, Sita rm2){
    System.out.println( rm1.name + " = " +  rm1.age + "  " +  rm2.name + " =  " + rm2.age   );
}



public class st2{
    public static void main(String []args){

    Sita rm1 = new Sita();
    rm1.name = "love";
    rm1.age = 12;
        
    Sita rm2 = new Sita();
    rm2.name = "kush";
    rm2.age = 13;

    Sita.show(rm1 , rm2);
    }
}
}