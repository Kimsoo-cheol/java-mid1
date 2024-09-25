package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTimt = System.currentTimeMillis();
        String result = "";
        for (int i=0; i<100000; i++) {
            result += "Hello Java ";
        }
        long endTimt = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTimt - startTimt) + "ms");
    }
}
