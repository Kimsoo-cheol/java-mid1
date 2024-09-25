package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int num = str.indexOf(ext);
        String filename = str.substring(0, num);
        String extName = str.substring(num);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + ext);
    }
}
