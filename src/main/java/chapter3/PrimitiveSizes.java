package chapter3;

public class PrimitiveSizes {

    //int x = 34.5;        not legal, compiler error(it is a double)
    //boolean boo = x;     not legal, compiler error(value must be return true or false)
    int g = 17;
    int y = g;
    //y =y +10;            not legal, compiler error()
    short s;
    //s =y;                not legal, compiler error(int not converted to short)
    byte b = 3;
    byte v = b;
    short n = 12;
    //v =n;                not legal, compiler error(short not converted to byte)
    //byte k = 128;        not legal, compiler error(byte value must be among -128 to 127)
}
