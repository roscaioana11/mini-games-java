package exercises.second;

/**
 * Verifica fiecare element al sirului pana ajunge la elementul cautat
 * Sirul nu trebuie sortat pt ca elementul sa fie gasit
 */
public class FindFunction {

    private static int Find(int n,int[] sir) {
        for(int i = 0; i < sir.length; i++){
            if(n == sir[i]){
                return i;
            }
        }
        return -1; //elementul -1 nu poate exista in sir pt ca indexul incepe tot timpul de la 0
    }

    public static void main(String[] args) {
        int[] sir = new int[] {12,36,4,1,102,5};

        int conditie = Find(36, sir);
        if(conditie == -1){
            System.out.println("Number not found");
        }else{
            System.out.println("Element found at: " + conditie);
        }
    }
}
