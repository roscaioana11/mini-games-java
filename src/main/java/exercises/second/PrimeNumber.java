package exercises.second;

import java.util.Scanner;

//Un nr este Prim daca se imparte numa cu 1 sau el insusi
public class PrimeNumber {

    public static boolean isPrime(int n){ //boolean zice daca este true sau false [0,1]=[false, true]
        for(int i = 2; i <= n/2; i++){ //2 este primul divizor posibil (1 nu se ia in considerare pentru ca totul se divide la 1)
            if(n % i == 0){ // % -> restul impartirii
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = scan.nextInt();

//        if(n >= 2 && isPrime(n)){
//            System.out.println("Prime");
//        }else{
//            System.out.println("Not Prime");
//        }

//        int counter = 0;
//        int num = 2;

//        while(counter <= n){ // n este limita, nu se schimba
//            if(num >= 2 && isPrime(num)){
//                System.out.println(num);
//                counter++; //cate nr prime au fost gasite
//            }
//            num++; //nr care este testat
//        }

        for(int i = 2; i <= n; i++){
            if(i >= 2 && isPrime(i)){
                System.out.println(i);
            }
        }

    }
}
