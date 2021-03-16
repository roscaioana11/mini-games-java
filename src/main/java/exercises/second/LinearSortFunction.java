package exercises.second;

public class LinearSortFunction {

    public static int[] LinearSort(int[] sir){
        for(int i = 0; i < sir.length; i++){ //i reprezinta pozitia elementului care urmeaza sa fie ordonat, valoarea de pe pozitia i este comparata cu valorile celorlalte elemente din sir care reprezinta j
            for(int j = i; j < sir.length; j++){ //j reprezinta fiecare element ramas in sir (cauta in sir)
                if(sir[j] < sir[i]){
                    int aux = sir[i];
                    sir[i] = sir[j];
                    sir[j] = aux;
                }
            }
        }
        return sir;
    }

    public static void main(String[] args) {
        int[] sir = new int[]{12,36,4,1,102,5};
        sir = LinearSort(sir);

        for(int i = 0; i < sir.length; i++){
            System.out.println(sir[i]); //acceseaza elementul pozitiei i din sir
        }
    }
}
