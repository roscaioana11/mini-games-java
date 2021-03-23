import java.util.Random;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        String[][] map = new String[10][10];
        Scanner read = new Scanner(System.in);

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                map[i][j] = "[ ]";
            }
        }

        Random spawn = new Random();
        int playerX = spawn.nextInt(map[0].length);
        int playerY = spawn.nextInt(map.length);

        map[playerY][playerX] = "[P]";

        int goalX = spawn.nextInt(map[0].length);
        int goalY = spawn.nextInt(map.length);

        map[goalY][goalX] = "[x]";

        while(true){
            for(int i = 0; i < map.length; i++){
                for (int j = 0; j < map[0].length; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println("");
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
                if(playerY > map.length - 1){
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

            if(playerX == goalX && playerY == goalY){
                System.out.println("You won!");
                break;
            }
        }
    }
}
