package exercises.harvester;

//Level 1
public class Serpentine {
    public static void main(String[] args) {
        int nrRows = 23;
        int nrColumns = 12;

        for(int i = 0; i < nrRows; i++){
            if(i % 2 == 0){
                for(int j = 1; j <= nrColumns; j++){
                    System.out.print((j + nrColumns * i) + " ");
                }
            }else{
                for(int j = nrColumns; j >= 1; j--){
                    System.out.print((j + nrColumns * i) + " ");
                }
            }
        }
    }
}
