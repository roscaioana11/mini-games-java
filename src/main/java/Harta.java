import java.util.Scanner;

public class Harta {
    public static int mapHeight = 10;
    public static int mapWidth = 10;
    public static String[][] worldMap;

    public static void main(String[] args) {
        worldMap = new String[mapHeight][mapWidth];
        resetMap();
        Scanner read = new Scanner(System.in);

        while(true){
            displayMap();
            System.out.println("Pick an option: " + "\n" + "1. Change a tile" + "\n" + "2. Reset the map" + "\n" + "0. Exit");

            String pick = read.nextLine();


            if(pick.equals("1")){
                int playerX = read.nextInt();
                int playerY = read.nextInt();
                read.nextLine();
                String drawing = read.nextLine();
                setTile(playerX,playerY,drawing);
            }else if(pick.equals("2")){
                resetMap();
            }else if(pick.equals("0")){
                break;
            }else{
                System.out.println("Not the right pick");
            }
        }
        displayMap();
    }

    public static void resetMap(){
        for(int i = 0; i < worldMap.length; i++){
            for (int j = 0; j < worldMap[0].length; j++){
                worldMap[i][j] = "~";
            }
        }
    }

    public static void displayMap(){
        for(int i = 0; i < worldMap.length; i++){
            for (int j = 0; j < worldMap[0].length; j++){
                //worldMap[i][j] = "~";
                System.out.print(worldMap[i][j]);
            }
            System.out.println("");
        }
    }

    public static void setTile(int coordonataX, int coordonataY, String tile){
        worldMap[coordonataX][coordonataY] = tile;

    }
}
