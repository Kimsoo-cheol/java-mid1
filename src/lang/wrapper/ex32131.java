package lang.wrapper;

public class ex32131 {
    public static void main(String[] ar) {
        String a = ar[0];
        String b = ar[1];
        String c = ar[2];

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(b+1);
        System.out.println(c+1);

        int d = Integer.parseInt(b);
        double e = Double.parseDouble(c);

        System.out.println(d+1);
        System.out.println(e+1);

    }
}
