package exercises.harvester;

//Level 3
public class Columns {
    public static void main(String[] args) {
        int nrRows = 23;
        int nrColumns = 12;
        int startRow = 23;
        int startColumn = 1;
        String direction = "N";

        if(startRow == 1 && startColumn == 1 && direction.equals("E")){
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
        }else if(startRow == nrRows && startColumn == nrColumns && direction.equals("W")){
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
        }else if(startRow == nrRows && startColumn == 1 && direction.equals("E")){
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
        }else if(startRow == 1 && startColumn == nrColumns && direction.equals("W")){
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

        else if(startRow == 1 && startColumn == 1 && direction.equals("S")){
            for(int j = 1; j <= nrColumns; j++){
                if(j % 2 != 0){
                    for(int i = 0; i < nrRows; i++){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }else{
                    for(int i = nrRows - 1; i >= 0; i--){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }
            }
        }else if(startRow == nrRows && startColumn == nrColumns && direction.equals("N")){
            for(int j = nrColumns; j >= 1; j--){
                if(j % 2 == (nrRows - 1) % 2){
                    for(int i = nrRows - 1; i >= 0; i--){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }else{
                    for(int i = 0; i < nrRows; i++){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }
            }
        }else if(startRow == nrRows && startColumn == 1 && direction.equals("N")){
            for(int j = 1; j <= nrColumns; j++){
                if(j % 2 == 0){
                    for(int i = 0; i < nrRows; i++){
                        System.out.print((j + nrColumns * i) + " ");;
                    }
                }else{
                    for(int i = nrRows - 1; i >= 0; i--){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }
            }
        }else if(startRow == 1 && startColumn == nrColumns && direction.equals("S")){
            for(int j = nrColumns; j >= 1; j--){
                if(j % 2 != (nrRows - 1) % 2){
                    for(int i = nrRows - 1; i >= 0; i--){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }else{
                    for(int i = 0; i < nrRows; i++){
                        System.out.print((j + nrColumns * i) + " ");
                    }
                }
            }
        }
    }
}
