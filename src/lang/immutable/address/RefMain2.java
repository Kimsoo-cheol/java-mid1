package lang.immutable.address;


import lang.immutable.address.ImmutableAddress;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); 불변객체로 만드니 실수할 가능성이 사라짐
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
}
