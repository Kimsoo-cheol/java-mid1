package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price){
        int discountPervent = 0;

        if (grade.equals("BASIC")) {
            discountPervent = 10;
        } else if (grade.equals("GOLD")) {
            discountPervent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPervent = 30;
        }else {
            System.out.println(grade + ": 할인X");
        }

        return price * discountPervent / 100;


    }
}
