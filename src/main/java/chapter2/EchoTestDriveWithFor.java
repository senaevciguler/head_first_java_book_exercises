package chapter2;

public class EchoTestDriveWithFor {
    public static void main(String[] args) {
        Echo e1 = new Echo();
      for(int x = 0; x < 4; x++){
          e1.hello();
          e1.count +=6;
      }
        System.out.println(e1.count);
    }
}
class EchoWithFor {
    int count = 0;

    void hello() {
        System.out.println("helloooo...");
    }
}
