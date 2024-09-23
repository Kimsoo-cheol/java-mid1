package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교1: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
//        return x == y; 이렇게 하면 안됨. 왜냐하면 new를 한 게 들어올지, 문자열 풀에 있는 게 들어올지,
//        아니면 뭔가 다른 데서 어떤 게 들어올지 모른다.
        return x.equals(y);

    }
}
