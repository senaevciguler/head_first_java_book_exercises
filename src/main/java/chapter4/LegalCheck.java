package chapter4;

public class LegalCheck {
    int calcArea(int height, int width) {
        return height * width;
    }

        int a = calcArea(7, 12);
        short c = 7;
        //calcArea(c,15);            method should be return int not short.
        //int d = calcArea(57);      method parameter have 2 not one.
        //calcArea(2, 3);
        long t = 42;
        //int f = calcArea(t, 17);   method parameter should be int type. t is long.
        //int g = calcArea();        method should include 2 parameter
        //calcArea();
        //byte h = calcArea(4, 20);  method parameter should be int type. h is byte.
        //int j = calcArea(2, 3, 5); method parameter have 2 not 3.

}
