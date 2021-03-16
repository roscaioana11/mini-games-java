package exercises.third;

public class Exercise3 {
    private static void Find(int n,int[] sir) {
        int count = 0;
        for(int i = 0; i < sir.length; i++){
            if(n == sir[i]){
                count++;
            }
        }
        if(count >= 2){
            System.out.println("Duplicate");
        }else{
            System.out.println("Not Duplicate");
        }
    }

    public static void main(String[] args) {
        int[] sir = new int[]{80,1,5,7,12,101,8,9,10,3,5,7,99,95,102};

        System.out.println(sir[3]);
        int container = sir[3];
        int altContainer = sir[9];
        System.out.println((container + altContainer) * sir[5]);

        for(int i = sir.length - 1; i >= 0; i--){
            System.out.println(sir[i]);
        }

        int sum = 0;
        for(int i = 0; i < sir.length / 2; i++){
            sum = sum + sir[i];
        }
        System.out.println(sum);

        System.out.println(sir[11]);

        Find(101, sir);
    }
}
