package singleton;

public class Main {

    public static void main(String[] args) {
        Ex ex = Ex.getInstance();
        Ex ex2 = Ex.getInstance();

        System.out.println(ex + " " + ex2);

    }
}
