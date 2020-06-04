package chapter6;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        String a = new String("whoohoo");
        myList.add(a);
        String b = new String("Frog");
        myList.add(b);
        int theSize = myList.size();
        Object o = myList.get(1);
        myList.remove(1);
        boolean isIn = myList.contains(b);
        System.out.println(myList);

    }

}

