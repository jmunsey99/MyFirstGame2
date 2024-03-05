import java.awt.*;

public class Hero {

    //variable declaration

    public int xpos;        //the x position
    public int ypos;        //the y position
    public int dx;          //the speed of the hero in the x direction
    public int dy;          // the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;//a boolean to denote if the hero is alive
    public Rectangle rec;

    public Hero(int pXpos, int pYpos, int pDx, int pDy, int pWidth, int pHeight) {
        xpos = pXpos;
        ypos = pYpos;
        dx = pDx;
        dy = pDy;
        width = pWidth;
        height = pHeight;
        isAlive = true;
        rec = new Rectangle(xpos, ypos, width, height);

    }

    public void printInfo() {
        System.out.println("x position: " + xpos);
        System.out.println("y position: " + ypos);
        System.out.println("x speed: " + dx);
        System.out.println("y speed: " + dy);
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("is the hero alive?: " + isAlive);

    }

    public void move() {

        xpos = xpos + dx;
        ypos = ypos + dy;

        rec = new Rectangle(xpos, ypos, width, height);

    }

    public void wrappingMove() {
        // Move the hero


        if (xpos >= 1000) {

            xpos = 1;
        }
        if (ypos >= 700) {
            ypos = 1;
        }
        if (xpos <= 0) {
            xpos = 1000;
        }
        if (ypos <= 0) {
            ypos = 700;
        }

        xpos = xpos + dx;
        ypos = ypos + dy;

        rec = new Rectangle(xpos, ypos, width, height);
    }

    public void bouncing() {

        if (xpos > 1000 - width) {
            dx = -dx;
        }
        if (xpos < 0) {
            dx = -dx;
        }

        if (ypos > 670 - height) {
            dy = -dy;
        }
        if (ypos < 20) {
            dy = -dy;
        }

        xpos = xpos + dx;
        ypos = ypos + dy;

        rec = new Rectangle(xpos, ypos, width, height);
    }

    public void ballBouncing() {

        if (xpos > 960 - width) {
            dx = -dx;
        }
        if (xpos < 40) {
            dx = -dx;
        }

        if (ypos > 640) {
            dy = -dy;
        }
        if (ypos < 20 + height) {
            dy = -dy;
        }

        xpos = xpos + dx;
        ypos = ypos + dy;

    }

    public void shooting() {

        if (xpos >= 1000) {

            xpos = 100;
        }
        if (ypos >= 700) {
            ypos = 360;
        }
        if (xpos <= 0) {
            xpos = 100;
        }
        if (ypos <= 0) {
            ypos = 360;
        }

        xpos = xpos + dx;
        ypos = ypos + dy;

        rec = new Rectangle(xpos, ypos, width, height);
    }

    public void tieFighterMove() {

        if (xpos > 1000 - width) {
            dx = -dx;
        }
        if (xpos < 700) {
            dx = -dx;
        }

        if (ypos > 670 - height) {
            dy = -dy;
        }
        if (ypos < 20) {
            dy = -dy;
        }

        xpos = xpos + dx;
        ypos = ypos + dy;

        rec = new Rectangle(xpos, ypos, width, height);

    }

    public void xWingMove() {

        if (xpos > 600) {
            dx = -dx;
        }
        if (xpos < 200) {
            dx = -dx;
        }

        xpos = xpos + dx;

        rec = new Rectangle(xpos, ypos, width, height);
    }

    public void blaster2() {

        if (ypos >= 700) {
            ypos = 520;


        }
        if (ypos < 0) {
            ypos = 520;
        }

        xpos = xpos + dx;
        ypos = ypos + dy;

        rec = new Rectangle(xpos, ypos, width, height);

    }

}