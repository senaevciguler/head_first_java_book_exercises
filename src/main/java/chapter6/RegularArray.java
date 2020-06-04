package chapter6;

public class RegularArray {
    public static void main(String[] args) {
        String[] myList = new String[2];
        String a = new String("wohoohoo");
        myList[0] = a;
        String b = new String("Frog");
        myList[1] = b;
        int length = myList.length;
        String secondValue = myList[1];
        myList[1] = null;
        boolean isIn = false;
        for (String item : myList) {
            if (b.equals(item)) {
                isIn = true;
                break;
            }
        }
        System.out.println(myList);
    }
}
