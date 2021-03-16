package exercises.second;

import java.util.Scanner;

/**
 * Pentru a genera sirul Fibonacci (O spirala) - tot timpul trb sa adaugi 2 nr la inceput (1,1)-> ca sa gasesti urmatorul numar, aduni 1+1=2 => (1,1,2) => (1,1,2,3) =>
 * (1,1,2,3,5) => (1,1,2,3,5,8) ...>
 *              -> a=1, b=1
 *              -> la fiecare pas par a=a+b ( for(0...10), a este par pt ca primul numar din for, adica 0 este par)
 * 	            -> la fiecare pas impar b=a+b
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        int a = 1;
        int b = 1;

        if(n >= 1){
            System.out.println(a);
        }
        if(n >= 2){
            System.out.println(b);
        }

        for(int i = 2; i < n; i++){ // < n -> merge pana la n-1, <= n -> merge pana la n
            if(i % 2 == 0){
                a = a + b;
                System.out.println(a);
            }else{
                b = a + b;
                System.out.println(b);
            }
        }
    }
}
