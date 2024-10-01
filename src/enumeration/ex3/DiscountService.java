package enumeration.ex3;


import static enumeration.ex3.Grade.*;

public class DiscountService {
    
    // grade 타입만 들어오게 막아버림
    public int discount(Grade grade, int price){
        int discountPervent = 0;

        if (grade == BASIC) {
            discountPervent = 10;
        } else if (grade == GOLD) {
            discountPervent = 20;
        } else if (grade == DIAMOND) {
            discountPervent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPervent / 100;


    }
}
