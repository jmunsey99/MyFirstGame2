import java.awt.*;

public class BallorPointer {

    //variable declaration

    public double xpos;        //the x position
    public double ypos;        //the y position
    public double dx;          //the speed of the hero in the x direction
    public double dy;          // the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;//a boolean to denote if the hero is alive
    public Rectangle rec;
    public boolean leftPressed;
    public boolean rightPressed;
    public boolean upPressed;
    public boolean downPressed;
    public boolean spacePressed;
    public double GRAVITY = 0.1;
    public boolean isJumping=false;

    public BallorPointer(double pXpos, double pYpos, double pDx, double pDy, int pWidth, int pHeight) {
        xpos = pXpos;
        ypos = pYpos;
        dx = pDx;
        dy = pDy;
        width = pWidth;
        height = pHeight;
        isAlive = true;
        rec = new Rectangle((int)xpos, (int)ypos, width, height);

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

        dx = dx + GRAVITY;

        // Check if jump is pressed and the hero is on the ground
        if (isJumping && (xpos + width) >= 1000) {
            dx = 5; // Adjust the jump height as needed
        }
        //Check if you aren't jumping. Then when you hit the ground, stop falling due to gravity.
        if (isJumping==false && (xpos + width) >= 1000){
            dx=0;
        }
        // Update position
        xpos=xpos - dx;
        ypos= ypos+ dy;


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

        rec = new Rectangle((int)xpos, (int)ypos, width, height);
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

        rec = new Rectangle((int)xpos, (int) ypos, width, height);
    }

    public void pointerBouncing() {

        if(spacePressed==true) {

            if (ypos > 350) {
                dy = -dy;
            }
            if (ypos < 180 + height) {
                dy = -dy;
            }


            xpos = xpos + dx;
            ypos = ypos + dy;

        }

    }








}