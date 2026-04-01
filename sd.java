public class sd {
    
    static class Inner {
        void show() {
            System.out.println("Hello from static class");
        }
    }

    public static void main(String[] args) {
        Inner obj = new Inner();
        obj.show();
    }
} 
    
