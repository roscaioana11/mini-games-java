package exercises.third;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(sum(2, 2));
        System.out.println(totalSum(2, 10));
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int totalSum(int min, int max){
        int result = 0;
        for(int i = min; i <= max; i++){
            result = sum(i, result);
        }
        return result;
    }
}
