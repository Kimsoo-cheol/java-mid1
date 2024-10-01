package enumeration.ref1;


public class DiscountService {
    
    // ClassGrade 타입만 들어오게 막아버림
    public int discount(ClassGrade classGrade, int price){
        return price * classGrade.getDiscountPercent() / 100;
    }
}
