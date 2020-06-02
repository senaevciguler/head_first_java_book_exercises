package chapter1;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"dog", "duck", "monkey"};
        String[] wordListTwo = {"coffee", "wine"};
        String[] wordListThree = {"java", "react", "spring", "sql"};

        int lengthOfwordListOne = wordListOne.length;
        int lengthOfwordListTwo = wordListTwo.length;
        int lengthOfwordListThree = wordListThree.length;

        int random1 = (int) (Math.random() * lengthOfwordListOne);
        int random2 = (int) (Math.random() * lengthOfwordListTwo);
        int random3 = (int) (Math.random() * lengthOfwordListThree);

        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];
        System.out.println("what we need is a "+ " " + phrase);

    }
}
