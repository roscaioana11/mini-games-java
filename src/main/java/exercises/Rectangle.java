package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int x1, x2, x3,x4;
        int y1, y2, y3, y4;
        int xP, yP;

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the first X coordinate: ");
        x1 = read.nextInt();
        x4 = x1;

        System.out.print("Enter the first Y coordinate: ");
        y1 = read.nextInt();
        y2 = y1;

        System.out.print("Enter the second X coordinate: ");
        x2 = read.nextInt();
        x3 = x2;

        System.out.print("Enter the second Y coordinate: ");
        y3 = read.nextInt();
        y4 = y3;

        System.out.print("Enter the XP coordinate: ");
        xP = read.nextInt();
        System.out.print("Enter the YP coordinate: ");
        yP = read.nextInt();

        boolean p = (x1 <= xP && y1 >= yP) && (x2 >= xP && y2 >= yP)
                && (x4 <= xP && y4 <= yP) && (x3 >= xP && y3 <= yP);

        if(p == true){
            System.out.println("P is INSIDE the rectangle.");
        }else {
            System.out.println("P is OUTSIDE of the rectangle");
        }
    }
}
