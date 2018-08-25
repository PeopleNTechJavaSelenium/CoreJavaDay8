package string.example;

public class UseOfString {
    public static void main(String[] args) {
        String st = "We are java programmer";
        String st2 = "We are java programmer";
        st2 = st2.toUpperCase();
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.charAt(12));
        if(st.contains("are")){
            System.out.println("yes, we found it");
        }else{
            System.out.println("No, we did not find it");
        }
        if(st.equalsIgnoreCase(st2)){
            System.out.println("Yes, they are equal");
        }else{
            System.out.println("No, they are not equal");
        }
    }
}
