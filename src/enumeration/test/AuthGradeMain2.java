package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        Scanner grade = new Scanner(System.in);

        AuthGrade authGrade = AuthGrade.valueOf(grade.nextLine().toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
        authGrade.menuOutput(authGrade.getDescription());

    }
}
