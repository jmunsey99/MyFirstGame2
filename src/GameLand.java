//Game Example
//Lockwood Version 2023-24
// Learning goals:
// make an object class to go with this main class
// the object class should have a printInfo()
//input picture for background
//input picture for object and paint the object on the screen at a given point
//create move method for the object, and use it
// create a wrapping move method and a bouncing move method
//create a second object class
//give objects rectangles
//start interactions/collisions

//*******************************************************************************
//Import Section
//Add Java libraries needed for the game
//import java.awt.Canvas;

//Graphics Libraries

import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;



//*******************************************************************************
// Class Definition Section

public class GameLand implements Runnable, KeyListener, MouseListener, MouseMotionListener {

    //Variable Declaration Section
    //Declare the variables used in the program
    //You can set their initial values here if you want

    //Sets the width and height of the program window
    final int WIDTH = 1000;
    final int HEIGHT = 800;

    //Declare the variables needed for the graphics
    public JFrame frame;
    public Canvas canvas;
    public JPanel panel;

    public BufferStrategy bufferStrategy;

    //Declare the objects used in the program below
    /**
     * STEP 0: declare
     **/

    public BallorPointer redPointer;
    public BallorPointer golfBall;
    public shotMeter shotMeter;
    public golfHole hole2;
    public bunker hole2Bunker1;
    public bunker hole2Bunker2;
    public bunker hole2Bunker3;
    public bunker hole2Bunker4;
    public bunker hole2Bunker5;
    public distanceMarkers hole2whiteMarker;
    public distanceMarkers hole2yellowMarker;
    public distanceMarkers hole2cyanMarker;
    public distanceMarkers hole2greenMarker;
    public distanceMarkers hole2pinkMarker;
    public distanceMarkers hole2redMarker;
    public distanceMarkers hole2blueMarker;
    public distanceMarkers hole2blackMarker;
    public distanceMarkers hole2teeMarker1;
    public distanceMarkers hole2teeMarker2;
    public boolean shotReset;

    //booleans:
    public boolean startScreen = true;
    public boolean isPlaying = false;
    public boolean level1;
    public boolean level2;
    public boolean level3;
    public boolean gameOver;
    public boolean redPointerWhite = false;
    public boolean redPointerYellow = false;
    public boolean redPointerCyan = false;
    public boolean redPointerGreen = false;
    public boolean redPointerPink = false;
    public boolean redPointerRed = false;
    public boolean redPointerBlue = false;
    public boolean redPointerBlack = false;
    public boolean gameRunning = false;
    public boolean puttMade = false;



    //movements booleans


    /**
     * Step 1: declare image for object
     **/

    public Image backgroundPic;
    public Image redPointerPic;
    public Image shotMeterPic;
    public Image holePic;
    public Image bunkerPic;
    public Image WhiteDistanceMarkerPic;
    public Image YellowDistanceMarkerPic;
    public Image CyanDistanceMarkerPic;
    public Image GreenDistanceMarkerPic;
    public Image PinkDistanceMarkerPic;
    public Image RedDistanceMarkerPic;
    public Image BlueDistanceMarkerPic;
    public Image BlackDistanceMarkerPic;
    public Image teeBoxDistanceMarkerPic;
    public Image golfBallPic;


    // Main method definition: PSVM
    // This is the code that runs first and automatically
    public static void main(String[] args) {
        GameLand ex = new GameLand();   //creates a new instance of the game and tells GameLand() method to run
        new Thread(ex).start();       //creates a thread & starts up the code in the run( ) method
    }


    // Constructor Method
    // This has no return type and has the same name as the class
    // This section is the setup portion of the program
    // Initialize your variables and construct your program objects here.
    public GameLand() {
        setUpGraphics(); //this calls the setUpGraphics() method

        //create (construct) the objects needed for the game below
        /**Step 2 construct object**/


        /** end of Hole 1 **/


        /**Step 3 add image to object**/


        backgroundPic = Toolkit.getDefaultToolkit().getImage("HOLE 2.png");
        //  roryPic = Toolkit.getDefaultToolkit().getImage("RoryImage.png");

        redPointerPic = Toolkit.getDefaultToolkit().getImage("redRec.png");

        shotMeterPic = Toolkit.getDefaultToolkit().getImage("shotMeter.png");

        holePic = Toolkit.getDefaultToolkit().getImage("Hole.png");

        bunkerPic = Toolkit.getDefaultToolkit().getImage("bunker.png");

        WhiteDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("whiteMarker.png");

        YellowDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("yellowMarker.png");

        CyanDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("cyanMarker.png");

        GreenDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("greenMarker.png");

        PinkDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("pinkMarker.png");

        RedDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("redMarker.png");

        BlueDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("blueMarker.png");

        BlackDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("blackMarker.png");

        teeBoxDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage("pinkMarker.png");

        golfBallPic = Toolkit.getDefaultToolkit().getImage("golfBall.png");


    }// GameLand()

    //*******************************************************************************
//User Method Section
//
// put your code to do things here.
    public void runCorrectLevel() {

        if (startScreen) {
            startScreen = false;
            level1 = true;
            isPlaying = true;
            startLevel1();

        }


    }

    public void startLevel1() {


        redPointer = new BallorPointer(930, 300, 0, 5, 40, 10);

        shotMeter = new shotMeter(935, 200, 30, 170);

        golfBall = new BallorPointer(910, 400, 0, 0, 15, 15);

        /** hole 1 **/

        hole2 = new golfHole(71, 368, 60, 60);

        hole2Bunker1 = new bunker(314, 290, 70, 70);

        hole2Bunker2 = new bunker(537, 290, 70, 70);

        hole2Bunker3 = new bunker(726, 290, 70, 70);

        hole2Bunker4 = new bunker(637, 495, 70, 70);

        hole2Bunker5 = new bunker(451, 485, 70, 70);

        hole2whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole2yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole2cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole2greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole2pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole2redMarker = new distanceMarkers(432, 420, 10, 10);

        hole2blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole2blackMarker = new distanceMarkers(354, 420, 10, 10);

        hole2teeMarker1 = new distanceMarkers(900, 368, 10, 10);

        hole2teeMarker2 = new distanceMarkers(900, 443, 10, 10);

    }


    // main thread
    // this is the code that plays the game after you set things up
    public void run() {
        //for the moment we will loop things forever using a while loop
        while (true) {
            //moveThings();  //move all the game objects
            render();  // paint the graphics
            pause(20); // sleep for 20 ms
            collisions();
            movePointer();
            moveBall();
        }
    }

    //paints things on the screen using bufferStrategy
    private void render() {
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT);
//draw our background Image below;

        if (startScreen) {
            g.drawString("Welcome to Rory Mcilroy Masters Challenge! After 13 years of playing in the Masters tournament in Augusta Georgia, I still have never won.", 100, 300);
            g.drawString("How to play:", 450, 350);
            g.drawString("Press Space Bar and Hold down, release when ready to shoot", 320, 400);
            g.drawString("Press arrow keys to determine direction", 365, 450);
            g.drawString("The colored squares dictate what color to aim for on the meter. Bunkers are +1 shot to your score", 220, 500);
            g.drawString("Press 'w' to help me win my first Masters!", 370, 600);
        }




        //draw the image of your objects below:
        /**Step 4: draw object images**/

        /** Hole 1 **/

        if (level1 && isPlaying && backgroundPic != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole2 != null && hole2Bunker2 != null && hole2Bunker3 != null && hole2Bunker4 != null && hole2Bunker5 != null && hole2whiteMarker != null && hole2yellowMarker != null && hole2cyanMarker != null && hole2greenMarker != null && hole2pinkMarker != null && hole2redMarker != null && hole2blueMarker != null && hole2blackMarker != null && hole2teeMarker1 != null && hole2teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPic, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + redPointer.score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole2.xpos, hole2.ypos, hole2.width, hole2.height, null);

            g.drawImage(bunkerPic, hole2Bunker1.xpos, hole2Bunker1.ypos, hole2Bunker1.width, hole2Bunker1.height, null);

            g.drawImage(bunkerPic, hole2Bunker2.xpos, hole2Bunker2.ypos, hole2Bunker2.width, hole2Bunker2.height, null);

            g.drawImage(bunkerPic, hole2Bunker3.xpos, hole2Bunker3.ypos, hole2Bunker3.width, hole2Bunker3.height, null);

            g.drawImage(bunkerPic, hole2Bunker4.xpos, hole2Bunker4.ypos, hole2Bunker4.width, hole2Bunker4.height, null);

            g.drawImage(bunkerPic, hole2Bunker5.xpos, hole2Bunker5.ypos, hole2Bunker5.width, hole2Bunker5.height, null);

            g.drawImage(WhiteDistanceMarkerPic, hole2whiteMarker.xpos, hole2whiteMarker.ypos, hole2whiteMarker.width, hole2whiteMarker.height, null);

            g.drawImage(YellowDistanceMarkerPic, hole2yellowMarker.xpos, hole2yellowMarker.ypos, hole2yellowMarker.width, hole2yellowMarker.height, null);

            g.drawImage(CyanDistanceMarkerPic, hole2cyanMarker.xpos, hole2cyanMarker.ypos, hole2cyanMarker.width, hole2cyanMarker.height, null);

            g.drawImage(GreenDistanceMarkerPic, hole2greenMarker.xpos, hole2greenMarker.ypos, hole2greenMarker.width, hole2greenMarker.height, null);

            g.drawImage(PinkDistanceMarkerPic, hole2pinkMarker.xpos, hole2pinkMarker.ypos, hole2pinkMarker.width, hole2pinkMarker.height, null);

            g.drawImage(RedDistanceMarkerPic, hole2redMarker.xpos, hole2redMarker.ypos, hole2redMarker.width, hole2redMarker.height, null);

            g.drawImage(BlueDistanceMarkerPic, hole2blueMarker.xpos, hole2blueMarker.ypos, hole2blueMarker.width, hole2blueMarker.height, null);

            g.drawImage(BlackDistanceMarkerPic, hole2blackMarker.xpos, hole2blackMarker.ypos, hole2blackMarker.width, hole2blackMarker.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole2teeMarker1.xpos, hole2teeMarker1.ypos, hole2teeMarker1.width, hole2teeMarker1.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole2teeMarker2.xpos, hole2teeMarker2.ypos, hole2teeMarker2.width, hole2teeMarker2.height, null);

            g.drawImage(golfBallPic, (int) golfBall.xpos, (int) golfBall.ypos, golfBall.width, golfBall.height, null);


        }


        /** End of Hole 1 **/

        //dispose the images each time(this allows for the illusion of movement).

        g.dispose();

        if (gameOver) {


        }


        bufferStrategy.show();
    }

public void movePointer(){

        if (redPointer!=null){

            redPointer.pointerBouncing();
        }

}
public void moveBall() {

    if (redPointer != null && redPointer.ypos < 220 && gameRunning && shotReset) {
        redPointerWhite = true;
        golfBall.whiteMove();



    } else if (redPointer != null && redPointer.ypos > 220 && redPointer.ypos <= 240 && gameRunning && shotReset) {
        redPointerYellow = true;


        golfBall.yellowMove();


    } else if (redPointer != null && redPointer.ypos > 240 && redPointer.ypos <= 260 && gameRunning && shotReset) {
        redPointerCyan = true;

        golfBall.cyanMove();


    } else if (redPointer != null && redPointer.ypos > 260 && redPointer.ypos <= 280 && gameRunning && shotReset) {
        redPointerGreen = true;
        golfBall.greenMove();


    } else if (redPointer != null && redPointer.ypos > 280 && redPointer.ypos <= 300 && gameRunning && shotReset) {
        redPointerPink = true;
        golfBall.pinkMove();


    } else if (redPointer != null && redPointer.ypos > 300 && redPointer.ypos <= 320 && gameRunning && shotReset) {
        redPointerRed = true;
        redPointer.redMove();


    } else if (redPointer != null && redPointer.ypos > 320 && redPointer.ypos <= 340 && gameRunning && shotReset) {
        redPointerBlue = true;
        golfBall.blueMove();

    } else if (redPointer != null && redPointer.ypos > 340 && redPointer.ypos <= 360 && gameRunning && shotReset) {
        redPointerBlack = true;
        golfBall.blackMove();
    }




}




    public void collisions() {

        if (golfBall != null && golfBall.rec != null && hole2 != null && hole2.rec != null) {
            if (golfBall.rec.intersects(hole2.rec) && golfBall.dx<1.5 && golfBall.dy<1.5 ) {
                runCorrectLevel();
            }
        }


    }

    //Pauses or sleeps the computer for the amount specified in milliseconds
    public void pause(int time) {
        //sleep
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }
    }

    //Graphics setup method
    private void setUpGraphics() {
        frame = new JFrame("Rory McIlroy Masters Challenge");   //Create the program window or frame.  Names it.

        panel = (JPanel) frame.getContentPane();  //sets up a JPanel which is what goes in the frame
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));  //sizes the JPanel
        panel.setLayout(null);   //set the layout

        // creates a canvas which is a blank rectangular area of the screen onto which the application can draw
        // and trap input events (Mouse and Keyboard events)
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);
        canvas.addKeyListener(this);
        canvas.addMouseListener(this);
        canvas.addMouseMotionListener(this);
        panel.add(canvas);  // adds the canvas to the panel.

        // frame operations
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes the frame close and exit nicely
        frame.pack();  //adjusts the frame and its contents so the sizes are at their default or larger
        frame.setResizable(false);   //makes it so the frame cannot be resized
        frame.setVisible(true);      //IMPORTANT!!!  if the frame is not set to visible it will not appear on the screen!

        // sets up things so the screen displays images nicely.
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        System.out.println("DONE graphic setup");
    }


    @Override
    public void keyTyped(KeyEvent e) {
        //commonly ignored
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        int keyCode = e.getKeyCode();
        System.out.println("Key: " + key + " KeyCode: " + keyCode);

        if (keyCode == 37) {
            redPointer.leftPressed = true;
        }

        if (keyCode == 38) {
            redPointer.upPressed = true;
        }

        if (keyCode == 39) {
            redPointer.rightPressed = true;
        }

        if (keyCode == 40) {
            redPointer.downPressed = true;
        }

        if (keyCode == 32) {
            redPointer.spacePressed = true;
            shotReset=false;

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

        char key = e.getKeyChar();
        int keyCode = e.getKeyCode();
        System.out.println("Key: " + key + " KeyCode: " + keyCode);

        if (keyCode == 37) {
            redPointer.leftPressed = false;
        }

        if (keyCode == 38) {
            redPointer.upPressed = false;
        }

        if (keyCode == 39) {
            redPointer.rightPressed = false;
        }

        if (keyCode == 40) {
            redPointer.downPressed = false;
        }

        if (keyCode == 32 && redPointer != null) {

            redPointer.spacePressed = false;
            gameRunning = true;
            shotReset=true;



        }

        // eventually I am going to call a method that chooses each hole
        if (keyCode == 87) {
            runCorrectLevel();

        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {



    }

    public void mouseReleased (MouseEvent e) {


        System.out.println("(" + e.getX() + "," + e.getY() + ")");


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
