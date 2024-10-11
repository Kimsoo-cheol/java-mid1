package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    private void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

            @Override
            public void print() {

            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
