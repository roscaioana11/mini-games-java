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
            System.out.println("Pick an option: " + "\n" + "1. Change a tile" + "\n" + "2. Reset the map" + "\n"
                    + "3. Change Rectangle Tile Area" + "\n" + "4. Change Circle Tile Area" + "\n" + "0. Exit");

            String pick = read.nextLine();

            if(pick.equals("1")){
                changeATile(read);
            }else if(pick.equals("2")) {
                resetMap();
            }else if(pick.equals("3")){
                changeRectangle(read);
            }else if(pick.equals("4")){
                changeCircle(read);
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

    public static void changeATile(Scanner read){ //Pick 1
        int playerX = -1;
        while(playerX == -1){
            System.out.println("x = ");
            playerX = readCoordinateX(read);
        }
        int playerY = -1;
        while (playerY == -1){
            System.out.println("y = ");
            playerY = readCoordinateY(read);
        }
        read.nextLine();
        String drawing = "";
        while (drawing.equals("")){
            System.out.println("Pick '^' = mountain, '~' = water, ' ' = 'field'");
            drawing = readTile(read);
        }
        setTile(playerX,playerY,drawing);
    }

    public static void changeRectangle(Scanner read){ //Pick 3
        int playerX1 = -1;
        while(playerX1 == -1){
            System.out.println("x1 = ");
            playerX1 = readCoordinateX(read);
        }
        int playerY1 = -1;
        while (playerY1 == -1){
            System.out.println("y1 = ");
            playerY1 = readCoordinateY(read);
        }
        int playerX2 = -1;
        while (playerX2 == -1){
            System.out.println("x2 = ");
            playerX2 = readCoordinateX(read);
        }
        int playerY2 = -1;
        while (playerY2 == -1){
            System.out.println("y2 = ");
            playerY2 = readCoordinateY(read);
        }
        read.nextLine();
        String drawing = "";
        while(drawing.equals("")){
            System.out.println("tile = ");
            System.out.println("Pick '^' = mountain, '~' = water, ' ' = 'field'");
            drawing = readTile(read);
        }
        if(drawing.length() == 1 && playerX1 != -1 && playerY1 != -1
                && playerX2 != -1 && playerY2 != -1){ //verifica daca este in range-ul corect
            setRectangle(playerX1, playerY1, playerX2, playerY2, drawing);
        }
    }

    public static void changeCircle(Scanner read){
        int playerX = -1;
        while(playerX == -1){
            System.out.println("x = ");
            playerX = readCoordinateX(read);
        }
        int playerY = -1;
        while (playerY == -1){
            System.out.println("y = ");
            playerY = readCoordinateY(read);
        }
        int radius = read.nextInt();

        read.nextLine();
        String drawing = "";
        while (drawing.equals("")){
            System.out.println("Pick '^' = mountain, '~' = water, ' ' = 'field'");
            drawing = readTile(read);
        }
        setCircle(playerX, playerY, radius , drawing);
    }

    public static void setTile(int coordonataX, int coordonataY, String tile){
        worldMap[coordonataY][coordonataX] = tile;
    }

    public static void setRectangle(int coordonataX1, int coordonataY1, int coordonataX2, int coordonataY2, String tile){
        for(int i = coordonataY1; i <= coordonataY2; i++){
            for (int j = coordonataX1; j <= coordonataX2; j++){
                setTile(j, i, tile);
            }
        }
    }

    public static String readTile(Scanner read){
        String scan = read.nextLine();
        if(scan.equals("^") || scan.equals("~") || scan.equals(" ")){
            return scan;
        }else{
            System.out.println("Not the right choice (^, ~, ' ')");
            return "";
        }
    }

    public static int readCoordinateX(Scanner read){
        int scan = read.nextInt();
        if(scan >= 0 && scan < mapWidth){
            return scan;
        }else{
            System.out.println("Coordinate X Out of Range");
            return -1;
        }
    }

    public static int readCoordinateY(Scanner read){
        int scan = read.nextInt();
        if(scan >= 0 && scan < mapHeight){
            return scan;
        }else {
            System.out.println("Coordinate Y Out of Range");
            return -1;
        }
    }

    public static void setCircle(int oX, int oY, int oR, String tile){
        for(int i = oY - oR + 1; i < oY + oR; i++){
            for(int j = oX - oR + 1; j < oX + oR; j++){
//                double m = Math.atan2(oY - i, oX - j);
//                double pointX = oR * Math.cos(m);
//                double pointY = oR * Math.sin(m);
                double deltaX = j - oX;
                double deltaY = i - oY;
                double squareDistance = deltaX * deltaX + deltaY * deltaY;
                //if(oR * oR >= (oR * Math.cos(m) - oX) * (oR * Math.cos(m) - oX) + (oR * Math.sin(m) - oY) * (oR * Math.sin(m) - oY)){
                if(oR * oR >= squareDistance){
                    setTile(j, i, tile);
                }
            }
        }
    }
}
