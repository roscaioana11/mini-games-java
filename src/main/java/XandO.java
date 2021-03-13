import java.util.Scanner;

public class XandO {
    public static void main(String[] args) {
        String[][] map = new String[3][3]; // [3][3] - 3 elemente
        Scanner read = new Scanner(System.in);

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                map[i][j] = " ";
            }
        }

        int tura = 1;

        while (true){
            for(int i = 0; i < map.length; i++){
                for(int j = 0; j < map[0].length; j++){
                    System.out.print(map[j][i]);
                }
                System.out.println("");
            }
            int playerX = read.nextInt();
            int playerY = read.nextInt();

            if(tura == 1){
                map[playerX][playerY] = "x";
                tura = 2;
            }else if(tura == 2){
                map[playerX][playerY] = "o";
                tura = 1;
            }
            //counter pt X si O
            int counterX = 0;
            int counterO = 0;
            //verificam coloanele
            for(int i = 0; i < map.length; i++){ // i reprezinta X
                for(int j = 0; j < map[0].length; j++){ //j reprezinta Y
                    if(map[i][j].equals("x")){
                        counterX++;
                    }else if(map[i][j].equals("o")){
                        counterO++;
                    }
                }
                if(counterX == 3){
                    System.out.println("Player 1 won");
                    return;
                }else if(counterO == 3){
                    System.out.println("Player 2 won");
                    return;
                }
                counterX = 0;
                counterO = 0;
            }
            //verificam randurile
            for(int i = 0; i < map.length; i++){
                for(int j = 0; j < map[0].length; j++){
                    if(map[j][i].equals("x")){
                        counterX++;
                    }else if(map[j][i].equals("o")){
                        counterO++;
                    }
                }
                if(counterX == 3){
                    System.out.println("Player 1 won");
                    return;
                }else if(counterO == 3){
                    System.out.println("Player 2 won");
                    return;
                }
                counterX = 0;
                counterO = 0;
            }
            //verificam prima diagonala
            for(int i = 0; i < map.length; i++){
                if(map[i][i].equals("x")){
                    counterX++;
                }else if(map[i][i].equals("o")){
                    counterO++;
                }
            }
            if(counterX == 3){
                System.out.println("Player 1 won");
                return;
            }else if(counterO == 3){
                System.out.println("Player 2 won");
                return;
            }
            counterX = 0;
            counterO = 0;
            //verificam a2a diagonala
            for(int i = 0; i < map.length; i++){
                if(map[i][map.length - 1 - i].equals("x")){
                    counterX++;
                }else if(map[i][map.length - 1 - i].equals("o")){
                    counterO++;
                }
            }
            if(counterX == 3){
                System.out.println("Player 1 won");
                return;
            }else if(counterO == 3){
                System.out.println("Player 2 won");
                return;
            }
            counterX = 0;
            counterO = 0;
            //verificam daca toata harta este plina
            int counter = 0;
            for (int i = 0; i < map.length; i++){
                for(int j = 0; j < map[0].length; j++){
                    if(map[i][j].equals("x") || map[i][j].equals("o")){
                        counter++;
                    }
                }
            }
            if(counter == 9){
                System.out.println("Remiza");
                break;
            }
        }
    }
}
