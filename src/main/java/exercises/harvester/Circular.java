package exercises.harvester;

//Level 4
public class Circular {
    static int nrRows = 23; // i
    static int nrColumns = 12; // j
    static int startRow = 23;
    static int startColumn = 1;
    static String direction = "N";
    static String mode = "Z";

    public static void main(String[] args) {
        String verticalDirection = "";
        String horizontalDirection = "";

        if(startRow == 1 && startColumn == 1){
            verticalDirection = "DOWN";
            horizontalDirection = "RIGHT";
        }else if(startRow == nrRows && startColumn == nrColumns){
            verticalDirection = "UP";
            horizontalDirection = "LEFT";
        }else if(startRow == 1 && startColumn == nrColumns){
            verticalDirection = "DOWN";
            horizontalDirection = "LEFT";
        }else if(startRow == nrRows && startColumn == 1){
            verticalDirection = "UP";
            horizontalDirection = "RIGHT";
        }

        if(mode.equals("S")){
            if(direction.equals("N")){
                if(horizontalDirection.equals("RIGHT")){
                    for(int j = 1; j <= nrColumns; j++){
                        if(j % 2 != 0){
                            printColumnDesc(j);
                        }else {
                            printColumn(j);
                        }
                    }
                }else{
                    for(int j = nrColumns; j >= 1; j--){
                        if(j % 2 == nrColumns % 2){
                            printColumnDesc(j);
                        }else {
                            printColumn(j);
                        }
                    }
                }
            }else if(direction.equals("S")){
                if(horizontalDirection.equals("RIGHT")){
                    for(int j = 1; j <= nrColumns; j++){
                        if(j % 2 == 0){
                            printColumnDesc(j);
                        }else {
                            printColumn(j);
                        }
                    }
                }else{
                    for(int j = nrColumns; j >= 1; j--){
                        if(j % 2 != nrColumns % 2){
                            printColumnDesc(j);
                        }else {
                            printColumn(j);
                        }
                    }
                }
            }else if(direction.equals("E")){
                if(verticalDirection.equals("DOWN")){
                    for(int i = 1; i <= nrRows; i++){
                        if(i % 2 == 0){
                            printRowDesc(i);
                        }else {
                            printRow(i);
                        }
                    }
                }else{
                    for(int i = nrRows; i >= 1; i--){
                        if(i % 2 != nrRows % 2){
                            printRowDesc(i);
                        }else {
                            printRow(i);
                        }
                    }
                }
            }else if(direction.equals("W")){
                if(verticalDirection.equals("DOWN")){
                    for(int i = 1; i <= nrRows; i++){
                        if(i % 2 != 0){
                            printRowDesc(i);
                        }else {
                            printRow(i);
                        }
                    }
                }else{
                    for(int i = nrRows; i >= 1; i--){
                        if(i % 2 == nrRows % 2){
                            printRowDesc(i);
                        }else {
                            printRow(i);
                        }
                    }
                }
            }
        }

        else{
            if(direction.equals("N")){
                if(horizontalDirection.equals("RIGHT")){
                    for(int j = 1; j <= nrColumns / 2; j++){
                        printColumnDesc(j);
                        if(j < nrColumns + 1 - j){
                            printColumn(nrColumns + 1 - j);
                        }
                    }
                }else{
                    for(int j = nrColumns; j > nrColumns / 2; j--){
                        printColumnDesc(j);
                        if(j > nrColumns + 1 - j){
                            printColumn(nrColumns + 1 - j);
                        }
                    }
                }
            }else if(direction.equals("S")){
                if(horizontalDirection.equals("RIGHT")){
                    for(int j = 1; j <= nrColumns / 2; j++){
                        printColumn(j);
                        if(j < nrColumns + 1 - j) {
                            printColumnDesc(nrColumns + 1 - j);
                        }
                    }
                }else{
                    for(int j = nrColumns; j > nrColumns / 2; j--){
                        printColumn(j);
                        if(j > nrColumns + 1 - j) {
                            printColumnDesc(nrColumns + 1 - j);
                        }
                    }
                }
            }else if(direction.equals("E")){
                if(verticalDirection.equals("DOWN")){
                    for(int i = 1; i <= nrRows / 2; i++){
                        printRow(i);
                        if(i < nrRows + 1 - i) {
                            printColumnDesc(nrRows + 1 - i);
                        }
                    }
                }else{
                    for(int i = nrRows; i > nrRows / 2; i--){
                        printRow(i);
                        if(i > nrRows + 1 - i) {
                            printColumnDesc(nrRows + 1 - i);
                        }
                    }
                }
            }else if(direction.equals("W")){
                if(verticalDirection.equals("DOWN")){
                    for(int i = 1; i <= nrRows / 2; i++){
                        printRowDesc(i);
                        if(i < nrRows + 1 - i){
                            printColumn(nrRows + 1 - i);
                        }
                    }
                }else{
                    for(int i = nrRows; i > nrRows / 2; i--){
                        printRowDesc(i);
                        if(i > nrRows + 1 - i){
                            printColumn(nrRows + 1 - i);
                        }
                    }
                }
            }
        }
    }

    public static void printRow(int n){
        for(int j = 1; j <= nrColumns; j++){
            System.out.print(((n - 1) * nrColumns + j) + " ");
        }
    }

    public static void printColumn(int n){
        for(int i = 0; i < nrRows; i++){
            System.out.print((i * nrColumns + n) + " ");
        }
    }

    public static void printRowDesc(int n){
        for(int j = nrColumns; j >= 1; j--){
            System.out.print(((n - 1) * nrColumns + j) + " ");
        }
    }

    public static void printColumnDesc(int n){
        for(int i = nrRows - 1; i >= 0; i--){
            System.out.print((i * nrColumns + n) + " ");
        }
    }
}
