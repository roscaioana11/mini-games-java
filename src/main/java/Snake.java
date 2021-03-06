import java.util.Random;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        String[][] map = new String[10][10]; //variabila de tip matrice pt harta
        Scanner read = new Scanner(System.in);

        for(int i = 0; i < map.length; i++){ //pt latime
            for(int j = 0; j < map[0].length; j++){ //pt lungime [0] din cauza ca .lenght deja merge pe latime la i, i[0]j[0], i[0]j[1] etc
                map[i][j] = "[ ]"; //am initializat bucatica de coordonate [i] si [j] din harta
            }
        }

        Random spawn = new Random();
        //am plasat playerul random pe harta prin coordonatele i=Y si j=X
        int playerX = spawn.nextInt(map[0].length);
        int playerY = spawn.nextInt(map.length);

        map[playerY][playerX] = "[P]";

        //destination/goal point spawns randomly on the worldMap
        int goalX = spawn.nextInt(map[0].length);
        int goalY = spawn.nextInt(map.length);

        map[goalY][goalX] = "[x]";

        while(true){
            //ca harta sa fie printata de fiecare data cand playerul se misca
            for(int i = 0; i < map.length; i++){
                for (int j = 0; j < map[0].length; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println(""); //pt rand nou de printare, altfel se continua pe acelasi punct de la printul anterior
            }
            System.out.println("Use the keywords(U, D, L, R) to move the player: ");
            int oldPlayerX = playerX;
            int oldPlayerY = playerY;
            String move = read.nextLine();

            if(move.equals("U")){
                playerY--;
                if(playerY < 0){
                    playerY = map.length - 1;
                }
            }else if(move.equals("D")){
                playerY++;
                if(playerY > map.length - 1){ //10 elemente in worldMap care au indexul de la 0 -> 9
                    playerY = 0;
                }
            }else if(move.equals("L")){
                playerX--;
                if(playerX < 0){
                    playerX = map[0].length - 1;
                }
            }else if(move.equals("R")){
                playerX++;
                if(playerX > map[0].length - 1){
                    playerX = 0;
                }
            }else{
                System.out.println("Not the right keyword (U, D, L, R)");
            }
            map[oldPlayerY][oldPlayerX] = "[ ]";
            map[playerY][playerX] = "[P]";

            //verific daca coordonatele Playerului sunt egale cu coordonatele Goal-ului, then break
            //conditia de win
            if(playerX == goalX && playerY == goalY){
                System.out.println("You won!");
                break;
            }
        }
    }
}
