package kyu8;

import com.sun.jdi.connect.Connector;

public class HelloWorld {
    static {
        System.out.println( "Hello World!" );
    }

    public static void main(String[] args) {

        System.out.println(greet());
    }

   public static String greet(){
        return "hello world!";

   }

}
