package lang.math.test;

import java.util.Random;

import static java.lang.Math.random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

     public int[] generate() {
         lottoNumbers = new int[6];
         count = 0;

         while (count < lottoNumbers.length) {
             int number = (int)(Math.random() * 45) + 1;

             if(isUnique(number)) {
                 lottoNumbers[count] = number;
                 count++;
             }
         }
         return lottoNumbers;
     }

     private boolean isUnique(int value) {
         for(int i = 0; i < count; i++) {
             if(lottoNumbers[i] == value) {
                 return false;
             }
         }
         return true;
     }
}
