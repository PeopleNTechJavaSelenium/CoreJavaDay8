package arraylist.example;

import java.util.ArrayList;
import java.util.List;

public class UseOfArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(25);

        for(Integer number:list) {
            System.out.println(number);
            System.out.println("hello");
        }
    }
}


