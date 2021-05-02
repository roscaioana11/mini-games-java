package exercises;

import java.util.ArrayList;
import java.util.List;

public class DeletablePrime {

    public static void main(String[] args) {
        List<Long> numbersList = new ArrayList<>();
        long testedNumber = 46216567629137L;
        numbersList.add(testedNumber);

        int counter = 0;
        while(numbersList.size() > 0 && isPrime(testedNumber)){
            long currentNumber = numbersList.get(0);
            long decimalPlace = 10L;
            long modPlace = 1L;
            while(currentNumber > modPlace){
                long subNumber = currentNumber / decimalPlace * modPlace + currentNumber % modPlace;
                if(isPrime(subNumber)){
                    numbersList.add(subNumber);
                    if(subNumber < 10){
                        counter++;
                    }
                }
                decimalPlace = decimalPlace * 10;
                modPlace = modPlace * 10;
            }
            numbersList.remove(0);
        }
        System.out.println(counter);
    }

    public static boolean isPrime(long n){
        if(n < 2){
            return false;
        }
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
