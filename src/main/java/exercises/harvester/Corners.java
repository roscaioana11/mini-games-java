package exercises.harvester;

//Level 2
public class Corners {
    public static void main(String[] args) {
        int nrRows = 23;
        int nrColumns = 12;
        int startRow = 1;
        int startColumn = 12;

        if(startRow == 1 && startColumn == 1){
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
        }else if(startRow == nrRows && startColumn == nrColumns){
            for(int i = nrRows - 1; i >= 0; i--){
                if(i % 2 != (nrRows - 1) % 2){
                    for(int j = 1; j <= nrColumns; j++){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }else{
                    for(int j = nrColumns; j >= 1; j--){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }
            }
        }else if(startRow == nrRows && startColumn == 1){
            for(int i = nrRows - 1; i >= 0; i--){
                if(i % 2 == (nrRows - 1) % 2){
                    for(int j = 1; j <= nrColumns; j++){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }else{
                    for(int j = nrColumns; j >= 1; j--){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }
            }
        }else if(startRow == 1 && startColumn == nrColumns){
            for(int i = 0; i < nrRows; i++){
                if(i % 2 != 0){
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
}
