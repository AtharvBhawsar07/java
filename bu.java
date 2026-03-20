

public class bu {
    public static void main(String []args){

        StringBuffer sb = new StringBuffer("rama");
        sb.append(" sita");
        sb.deleteCharAt(3);
        sb.insert(4, "hanuman ");
       sb.setLength(sb.length() + 9);
         System.out.println(sb);


        System.out.println(sb.capacity());
    }
}
