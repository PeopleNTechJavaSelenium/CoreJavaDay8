package finalize.example;

public class TestFinalize {

    public static void main(String[] args) {
        TestFinalize tf = new TestFinalize();
        tf.finalize();
        String st = new String("House");
        System.out.println(st);
        System.gc();
        System.out.println("End of main");
        System.gc();
        st = null;
        System.out.println(st);  
    }

    public void finalize(){
        System.out.println("Finalize method has been called...");
    }
}
