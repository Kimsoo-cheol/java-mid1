package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "Hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); //두 문자열을 사전 순으로 비교한다. 1차이남
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a")); //2차이남
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        //첫 번째로 다른 문자가 나올 때 그 문자들의 유니코드 값 차이를 반환합니다.
        //문자 "J"의 유니코드 값은 74이고, 문자 "W"의 유니코드 값은 87입니다. 두 문자 간의 차이는:
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java': " + str1.endsWith("Java!"));


    }
}
