package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        // 변하는 문자열을 가지고 있다.
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);
        System.out.println(sb + "a");
        System.out.println(sb);

        String string = sb.toString();
        System.out.println("string = " + string);


    }
}
