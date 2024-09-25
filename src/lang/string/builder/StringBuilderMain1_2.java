package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        // 변하는 문자열을 가지고 있다.
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D").
                insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("string = " + string);
    }
}
