package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    private Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //printer.printer();를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return printer;
        //이 때, printer 변수가 LocalPrinter 타입이지만, process 메서드의 반환 타입인 Printer로 반환됩니다.
        // 자바에서는 자식 클래스의 객체를 부모 클래스 타입으로 자동으로 변환(업캐스팅)해주기 때문에, 이 부분에서 타입 변환이 일어납니다.
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
