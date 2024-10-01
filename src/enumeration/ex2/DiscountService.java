package enumeration.ex2;


public class DiscountService {
    
    // ClassGrade 타입만 들어오게 막아버림
    public int discount(ClassGrade classGrade, int price){
        int discountPervent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPervent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPervent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPervent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPervent / 100;


    }
}
