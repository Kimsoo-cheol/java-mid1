package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10"); //문자열, 래퍼 객체 변환
        int intValue = Integer.parseInt("10"); //문자열 전용, 기본형 변환
        //파싱은 문자를 뭔가 다른 거로 바꾸는 거

        //비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        //산술
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
