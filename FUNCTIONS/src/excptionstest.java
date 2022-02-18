import java.io.IOException;

public class excptionstest {
    public static void main(String args[]) {
            fun1();
            System.out.print("A");
        }

        static void fun1() {
            try {
                fun2();
                System.out.print("B");
            } catch (Exception e) {
                System.out.print("C");
            }
        }

        static void fun2() throws IOException {
            fun3();
            System.out.print("D");
        }

        static void fun3() throws IOException {
            throw new IOException();
        }
}
