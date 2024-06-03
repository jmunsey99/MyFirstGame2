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
    public boolean spacePressed=false;
    public double GRAVITY = 0.1;
    public boolean isShot = false;
    public double whiteMaxSpeed = 8;
    public double yellowMaxSpeed = 7.5;
    public double cyanMaxSpeed = 7;
    public double greenMaxSpeed = 6.5;
    public double pinkMaxSpeed = 6;
    public double redMaxSpeed = 5.5;
    public double blueMaxSpeed = 5;
    public double blackMaxSpeed = 2;
    public boolean whiteMaxSpeedAchieved;
    public boolean yellowMaxSpeedAchieved;
    public boolean cyanMaxSpeedAchieved;
    public boolean greenMaxSpeedAchieved;
    public boolean pinkMaxSpeedAchieved;
    public boolean redMaxSpeedAchieved;
    public boolean blueMaxSpeedAchieved;
    public boolean blackMaxSpeedAchieved;
   // public int score = 0;
    public double verticalSpeed = 0.5;
    public boolean puttMade;


    public BallorPointer(double pXpos, double pYpos, double pDx, double pDy, int pWidth, int pHeight) {
        xpos = pXpos;
        ypos = pYpos;
        dx = pDx;
        dy = pDy;
        width = pWidth;
        height = pHeight;
        isAlive = true;
        rec = new Rectangle((int) xpos, (int) ypos, width, height);

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

    public void whiteMove() {

        if (dx < whiteMaxSpeed && !whiteMaxSpeedAchieved && !spacePressed) {
            dx = dx + GRAVITY;
         //   score = score + 1;

            if(dx>8){
                whiteMaxSpeedAchieved=true;
            }
        }
        if (whiteMaxSpeedAchieved && dx>0){
            dx = dx - GRAVITY;

        }


        if (upPressed && dx!=0){
            ypos = ypos - verticalSpeed;
        }

        if (downPressed && dx!=0){
            ypos = ypos + verticalSpeed;
        }

        if (xpos<=80){
            dx=0;
        }








        xpos=xpos - dx;
        ypos= ypos+ dy;


        rec = new Rectangle((int) xpos, (int) ypos, width, height);


    }

    public void yellowMove() {

        if (dx < yellowMaxSpeed && !yellowMaxSpeedAchieved && !spacePressed ) {
            dx = dx + GRAVITY;
       //     score = score + 1;

            if(dx>7.5){
                yellowMaxSpeedAchieved=true;
            }
        }
        if (yellowMaxSpeedAchieved && dx>0){
            dx = dx - GRAVITY;

        }



        if (upPressed && dx!=0){
            ypos = ypos - verticalSpeed;
        }

        if (downPressed && dx!=0){
            ypos = ypos + verticalSpeed;
        }

        if (xpos<=80){
            dx=0;
        }



        // Update position
        xpos=xpos - dx;
        ypos= ypos+ dy;

        rec = new Rectangle((int) xpos, (int) ypos, width, height);



    }
    public void cyanMove() {

        if (dx < cyanMaxSpeed && !cyanMaxSpeedAchieved && !spacePressed) {
            dx = dx + GRAVITY;
       //     score = score + 1;

            if(dx>7){
                cyanMaxSpeedAchieved=true;
            }
        }
        if (cyanMaxSpeedAchieved && dx>0){
            dx = dx - GRAVITY;

        }



        if (upPressed && dx!=0){
            ypos = ypos - verticalSpeed;
        }

        if (downPressed && dx!=0){
            ypos = ypos + verticalSpeed;
        }

        if (xpos<=80){
            dx=0;
        }


        // Update position
        xpos=xpos - dx;
        ypos= ypos+ dy;

        rec = new Rectangle((int) xpos, (int) ypos, width, height);



    }
    public void greenMove() {

        if (dx < greenMaxSpeed && !greenMaxSpeedAchieved && !spacePressed) {
            dx = dx + GRAVITY;
       //     score = score + 1;

            if(dx>6.5){
                greenMaxSpeedAchieved=true;
            }
        }
        if (greenMaxSpeedAchieved && dx>0){
            dx = dx - GRAVITY;

        }



        if (upPressed && dx!=0){
            ypos = ypos - verticalSpeed;
        }

        if (downPressed && dx!=0){
            ypos = ypos + verticalSpeed;
        }

        if (xpos<=80){
            dx=0;
        }



        // Update position
        xpos=xpos - dx;
        ypos= ypos+ dy;

        rec = new Rectangle((int) xpos, (int) ypos, width, height);



    }
    public void pinkMove() {

        if (dx < pinkMaxSpeed && !pinkMaxSpeedAchieved && !spacePressed) {
            dx = dx + GRAVITY;
        //    score = score + 1;

            if(dx>6){
                pinkMaxSpeedAchieved=true;
            }
        }
        if (pinkMaxSpeedAchieved && dx>0){
            dx = dx - GRAVITY;

        }


        if (upPressed && dx!=0){
            ypos = ypos - verticalSpeed;
        }

        if (downPressed && dx!=0){
            ypos = ypos + verticalSpeed;
        }

        if (xpos<=80){
            dx=0;
        }




        // Update position
        xpos=xpos - dx;
        ypos= ypos+ dy;

        rec = new Rectangle((int) xpos, (int) ypos, width, height);



    }
    public void redMove() {

        if (dx < redMaxSpeed && !redMaxSpeedAchieved && !spacePressed) {
            dx = dx + GRAVITY;
        //    score = score + 1;

            if(dx>5.5){
                redMaxSpeedAchieved=true;
            }
        }
        if (redMaxSpeedAchieved && dx>0){
            dx = dx - GRAVITY;

        }

        if (xpos<=80){
            dx=0;
        }



        if (upPressed && dx!=0){
            ypos = ypos - verticalSpeed;
        }

        if (downPressed && dx!=0){
            ypos = ypos + verticalSpeed;
        }



        // Update position
        xpos=xpos - dx;
        ypos= ypos+ dy;

        rec = new Rectangle((int) xpos, (int) ypos, width, height);



    }
    public void blueMove() {

        if (dx < blueMaxSpeed && !blueMaxSpeedAchieved && !spacePressed) {
            dx = dx + GRAVITY;
        //    score = score + 1;

            if(dx>5){
                blueMaxSpeedAchieved=true;
            }
        }
        if (blueMaxSpeedAchieved && dx>0){
            dx = dx - GRAVITY;

        }



        if (upPressed && dx!=0){
            ypos = ypos - verticalSpeed;
        }

        if (downPressed && dx!=0){
            ypos = ypos + verticalSpeed;
        }

        if (xpos<=80){
            dx=0;
        }




        // Update position
        xpos=xpos - dx;
        ypos= ypos+ dy;

        rec = new Rectangle((int) xpos, (int) ypos, width, height);



    }
    public void blackMove() {

        if (dx < blackMaxSpeed && !blackMaxSpeedAchieved && !spacePressed) {
            dx = dx + GRAVITY;
       //     score = score + 1;

            if(dx>=2){
                blackMaxSpeedAchieved=true;
            }
        }
        if (blackMaxSpeedAchieved && dx>0){
            dx = dx - GRAVITY;

        }



        if (upPressed && dx!=0){
            ypos = ypos - verticalSpeed;
            System.out.println("moving up");
        }

        if (downPressed && dx!=0) {
            ypos = ypos + verticalSpeed;
        }

        if (xpos<=80){
            dx=0;
        }





        // Update position
        xpos=xpos - dx;
        ypos= ypos+ dy;

        rec = new Rectangle((int) xpos, (int) ypos, width, height);



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

        if(spacePressed) {

            if (ypos > 350 + height) {
                dy = -dy;
            }
            if (ypos < 200) {
                dy = -dy;
            }

            ypos = ypos + dy;

        }




    }










}