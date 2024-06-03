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
    public int score;

    //hole 2

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

    //hole 3

    public golfHole hole3;
    public bunker hole3Bunker3;
    public bunker hole3Bunker4;
    public bunker hole3Bunker5;
    public distanceMarkers hole3whiteMarker;
    public distanceMarkers hole3yellowMarker;
    public distanceMarkers hole3cyanMarker;
    public distanceMarkers hole3greenMarker;
    public distanceMarkers hole3pinkMarker;
    public distanceMarkers hole3redMarker;
    public distanceMarkers hole3blueMarker;
    public distanceMarkers hole3blackMarker;
    public distanceMarkers hole3teeMarker1;
    public distanceMarkers hole3teeMarker2;

    public golfHole hole4;
    public bunker hole4Bunker3;
    public bunker hole4Bunker4;
    public bunker hole4Bunker5;
    public distanceMarkers hole4whiteMarker;
    public distanceMarkers hole4yellowMarker;
    public distanceMarkers hole4cyanMarker;
    public distanceMarkers hole4greenMarker;
    public distanceMarkers hole4pinkMarker;
    public distanceMarkers hole4redMarker;
    public distanceMarkers hole4blueMarker;
    public distanceMarkers hole4blackMarker;
    public distanceMarkers hole4teeMarker1;
    public distanceMarkers hole4teeMarker2;

    public golfHole hole5;
    public bunker hole5Bunker3;
    public bunker hole5Bunker4;
    public bunker hole5Bunker5;
    public distanceMarkers hole5whiteMarker;
    public distanceMarkers hole5yellowMarker;
    public distanceMarkers hole5cyanMarker;
    public distanceMarkers hole5greenMarker;
    public distanceMarkers hole5pinkMarker;
    public distanceMarkers hole5redMarker;
    public distanceMarkers hole5blueMarker;
    public distanceMarkers hole5blackMarker;
    public distanceMarkers hole5teeMarker1;
    public distanceMarkers hole5teeMarker2;

    public golfHole hole6;
    public bunker hole6Bunker3;
    public bunker hole6Bunker4;
    public bunker hole6Bunker5;
    public distanceMarkers hole6whiteMarker;
    public distanceMarkers hole6yellowMarker;
    public distanceMarkers hole6cyanMarker;
    public distanceMarkers hole6greenMarker;
    public distanceMarkers hole6pinkMarker;
    public distanceMarkers hole6redMarker;
    public distanceMarkers hole6blueMarker;
    public distanceMarkers hole6blackMarker;
    public distanceMarkers hole6teeMarker1;
    public distanceMarkers hole6teeMarker2;

    public golfHole hole7;
    public bunker hole7Bunker3;
    public bunker hole7Bunker4;
    public bunker hole7Bunker5;
    public distanceMarkers hole7whiteMarker;
    public distanceMarkers hole7yellowMarker;
    public distanceMarkers hole7cyanMarker;
    public distanceMarkers hole7greenMarker;
    public distanceMarkers hole7pinkMarker;
    public distanceMarkers hole7redMarker;
    public distanceMarkers hole7blueMarker;
    public distanceMarkers hole7blackMarker;
    public distanceMarkers hole7teeMarker1;
    public distanceMarkers hole7teeMarker2;

    public golfHole hole8;
    public bunker hole8Bunker3;
    public bunker hole8Bunker4;
    public bunker hole8Bunker5;
    public distanceMarkers hole8whiteMarker;
    public distanceMarkers hole8yellowMarker;
    public distanceMarkers hole8cyanMarker;
    public distanceMarkers hole8greenMarker;
    public distanceMarkers hole8pinkMarker;
    public distanceMarkers hole8redMarker;
    public distanceMarkers hole8blueMarker;
    public distanceMarkers hole8blackMarker;
    public distanceMarkers hole8teeMarker1;
    public distanceMarkers hole8teeMarker2;

    public golfHole hole9;
    public bunker hole9Bunker3;
    public bunker hole9Bunker4;
    public bunker hole9Bunker5;
    public distanceMarkers hole9whiteMarker;
    public distanceMarkers hole9yellowMarker;
    public distanceMarkers hole9cyanMarker;
    public distanceMarkers hole9greenMarker;
    public distanceMarkers hole9pinkMarker;
    public distanceMarkers hole9redMarker;
    public distanceMarkers hole9blueMarker;
    public distanceMarkers hole9blackMarker;
    public distanceMarkers hole9teeMarker1;
    public distanceMarkers hole9teeMarker2;



    //booleans:
    public boolean startScreen = true;
    public boolean isPlaying = false;
    public boolean level1 = false;
    public boolean level2 = false;
    public boolean level3 = false;
    public boolean level4 = false;
    public boolean level5 = false;
    public boolean level6 = false;
    public boolean level7 = false;
    public boolean level8 = false;
    public boolean level9 = false;
    public boolean gameOver;
    public boolean gameWon = false;
    public boolean gameLost = false;
    public boolean redPointerWhite = false;
    public boolean redPointerYellow = false;
    public boolean redPointerCyan = false;
    public boolean redPointerGreen = false;
    public boolean redPointerPink = false;
    public boolean redPointerRed = false;
    public boolean redPointerBlue = false;
    public boolean redPointerBlack = false;
    public boolean gameRunning = false;
    public boolean bunkerIntersection;
    public boolean hole2Over;
    public boolean hole3Over;
    public boolean hole4Over;
    public boolean hole5Over;
    public boolean hole6Over;
    public boolean hole7Over;
    public boolean hole8Over;
    public boolean hole9Over;
    public boolean shotReset;

    boolean hole2Bunker1Intersecting = false;
    boolean hole2Bunker2Intersecting = false;
    boolean hole2Bunker3Intersecting = false;
    boolean hole2Bunker4Intersecting = false;
    boolean hole2Bunker5Intersecting = false;

    boolean hole3Bunker3Intersecting = false;
    boolean hole3Bunker4Intersecting = false;
    boolean hole3Bunker5Intersecting = false;

    boolean hole4Bunker3Intersecting = false;
    boolean hole4Bunker4Intersecting = false;
    boolean hole4Bunker5Intersecting = false;

    boolean hole5Bunker3Intersecting = false;
    boolean hole5Bunker4Intersecting = false;
    boolean hole5Bunker5Intersecting = false;

    boolean hole6Bunker3Intersecting = false;
    boolean hole6Bunker4Intersecting = false;
    boolean hole6Bunker5Intersecting = false;

    boolean hole7Bunker3Intersecting = false;
    boolean hole7Bunker4Intersecting = false;
    boolean hole7Bunker5Intersecting = false;

    boolean hole8Bunker3Intersecting = false;
    boolean hole8Bunker4Intersecting = false;
    boolean hole8Bunker5Intersecting = false;

    boolean hole9Bunker3Intersecting = false;
    boolean hole9Bunker4Intersecting = false;
    boolean hole9Bunker5Intersecting = false;



    //movements booleans


    /**
     * Step 1: declare image for object
     **/

    public Image backgroundPicHole2;
    public Image backgroundPicHole3;
    public Image backgroundPicHole4;
    public Image backgroundPicHole5;
    public Image backgroundPicHole6;
    public Image backgroundPicHole7;
    public Image backgroundPicHole8;
    public Image backgroundPicHole9;
    public Image endGameWinBackgroundPic;
    public Image endGameLossBackgroundPic;
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


        backgroundPicHole2 = Toolkit.getDefaultToolkit().getImage("HOLE 2.png");
        //  roryPic = Toolkit.getDefaultToolkit().getImage("RoryImage.png");

        backgroundPicHole3 = Toolkit.getDefaultToolkit().getImage("Hole 3.png");

        backgroundPicHole4 = Toolkit.getDefaultToolkit().getImage("hole 4.png");

        backgroundPicHole5 = Toolkit.getDefaultToolkit().getImage ("HOLE 5.png");

        backgroundPicHole6 = Toolkit.getDefaultToolkit().getImage ("hole 6.png");

        backgroundPicHole7 = Toolkit.getDefaultToolkit().getImage ("HOLE 7.png");

        backgroundPicHole8 = Toolkit.getDefaultToolkit().getImage ("HOLE 8.png");

        backgroundPicHole9 = Toolkit.getDefaultToolkit().getImage ("Hole 9.png");

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

        endGameWinBackgroundPic = Toolkit.getDefaultToolkit().getImage ("roryWin.jpeg");

        endGameLossBackgroundPic = Toolkit.getDefaultToolkit().getImage ("gameLost.jpeg");


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

        } if (hole2Over){

            level1 = false;
            level3 = true;
            level4 = false;
            level5 = false;
            level6 = false;
            level7 = false;
            level8 = false;
            level9=false;


            startLevel3();
        }

        if (hole3Over){
            level1 = false;
            level3 = false;
            level4 = true;
            level5 = false;
            level6 = false;
            level7 = false;
            level8 = false;
            level9=false;
            startLevel4();
        }

        if (hole4Over){
            level1 = false;
            level3 = false;
            level4 = false;
            level5 = true;
            level6 = false;
            level7 = false;
            level8 = false;
            level9=false;
            startLevel5();
        }
        if (hole5Over){
            level1 = false;
            level3 = false;
            level4 = false;
            level5 = false;
            level6 = true;
            level7 = false;
            level8 = false;
            level9=false;
            startLevel6();
        }

        if (hole6Over){
            level1 = false;
            level3 = false;
            level4 = false;
            level5 = false;
            level6 = false;
            level7 = true;
            level8 = false;
            level9=false;
            startLevel7();
        }

        if (hole7Over){
            level1 = false;
            level3 = false;
            level4 = false;
            level5 = false;
            level6 = false;
            level7 = false;
            level8 = true;
            level9=false;
            startLevel8();
        }

        if (hole8Over){
            level1 = false;
            level3 = false;
            level4 = false;
            level5 = false;
            level6 = false;
            level7 = false;
            level8 = false;
            level9= true;
            startLevel9();
        }

        if (hole9Over){
            gameOver = true;
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

        hole2Bunker5 = new bunker(212, 373, 70, 70);

        hole2whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole2yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole2cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole2greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole2pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole2redMarker = new distanceMarkers(432, 420, 10, 10);

        hole2blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole2blackMarker = new distanceMarkers(144, 318, 10, 10);

        hole2teeMarker1 = new distanceMarkers(900, 368, 10, 10);

        hole2teeMarker2 = new distanceMarkers(900, 443, 10, 10);

    }

    public void startLevel3(){

        redPointer = new BallorPointer(930, 300, 0, 5, 40, 10);

        shotMeter = new shotMeter(935, 200, 30, 170);

        golfBall = new BallorPointer(910, 400, 0, 0, 15, 15);


        hole3 = new golfHole(80, 372, 60, 60);



        hole3Bunker3 = new bunker(441, 347, 70, 70);

        hole3Bunker4 = new bunker(120, 475, 70, 70);

        hole3Bunker5 = new bunker(114, 267, 70, 70);

        hole3whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole3yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole3cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole3greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole3pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole3redMarker = new distanceMarkers(432, 420, 10, 10);

        hole3blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole3blackMarker = new distanceMarkers(144, 318, 10, 10);

        hole3teeMarker1 = new distanceMarkers(900, 368, 10, 10);

        hole3teeMarker2 = new distanceMarkers(900, 443, 10, 10);

    }

    public void startLevel4 () {

        redPointer = new BallorPointer(930, 300, 0, 5, 40, 10);

        shotMeter = new shotMeter(935, 200, 30, 170);

        golfBall = new BallorPointer(910, 400, 0, 0, 15, 15);

        hole3 = new golfHole (5000,5000, 10,10);

        hole4 = new golfHole(80, 372, 60, 60);


        hole4Bunker3 = new bunker(0, 362, 70, 70);

        hole4Bunker4 = new bunker(501, 385, 70, 70);

        hole4Bunker5 = new bunker(329, 388, 70, 70);

        hole4whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole4yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole4cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole4greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole4pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole4redMarker = new distanceMarkers(432, 420, 10, 10);

        hole4blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole4blackMarker = new distanceMarkers(144, 318, 10, 10);

        hole4teeMarker1 = new distanceMarkers(900, 368, 10, 10);

        hole4teeMarker2 = new distanceMarkers(900, 443, 10, 10);

    }




    public void startLevel5 () {

        redPointer = new BallorPointer(930, 300, 0, 5, 40, 10);

        shotMeter = new shotMeter(935, 200, 30, 170);

        golfBall = new BallorPointer(910, 400, 0, 0, 15, 15);


        hole4 = new golfHole(5000,5000, 0,0);

        hole5 = new golfHole(80, 372, 60, 60);


        hole5Bunker3 = new bunker(622, 349, 70, 70);

        hole5Bunker4 = new bunker(460, 449, 70, 70);

        hole5Bunker5 = new bunker(271, 345, 70, 70);

        hole5whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole5yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole5cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole5greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole5pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole5redMarker = new distanceMarkers(432, 420, 10, 10);

        hole5blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole5blackMarker = new distanceMarkers(144, 318, 10, 10);

        hole5teeMarker1 = new distanceMarkers(900, 368, 10, 10);

        hole5teeMarker2 = new distanceMarkers(900, 443, 10, 10);

    }

    public void startLevel6 () {

        redPointer = new BallorPointer(930, 300, 0, 5, 40, 10);

        shotMeter = new shotMeter(935, 200, 30, 170);

        golfBall = new BallorPointer(910, 400, 0, 0, 15, 15);

hole5 = new golfHole(5000,5000, 0,0);

        hole6 = new golfHole(80, 321, 60, 60);


        hole6Bunker3 = new bunker(529, 376, 70, 70);

        hole6Bunker4 = new bunker(201, 437, 70, 70);

        hole6Bunker5 = new bunker(252, 303, 70, 70);

        hole6whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole6yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole6cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole6greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole6pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole6redMarker = new distanceMarkers(432, 420, 10, 10);

        hole6blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole6blackMarker = new distanceMarkers(144, 318, 10, 10);

        hole6teeMarker1 = new distanceMarkers(900, 368, 10, 10);

        hole6teeMarker2 = new distanceMarkers(900, 443, 10, 10);

    }

    public void startLevel7 () {

        redPointer = new BallorPointer(930, 300, 0, 5, 40, 10);

        shotMeter = new shotMeter(935, 200, 30, 170);

        golfBall = new BallorPointer(910, 400, 0, 0, 15, 15);

        hole6 = new golfHole(5000,5000, 0,0);

        hole7 = new golfHole(80, 267, 60, 60);


        hole7Bunker3 = new bunker(180, 273, 70, 70);

        hole7Bunker4 = new bunker(165, 382, 70, 70);

        hole7Bunker5 = new bunker(410, 331, 70, 70);

        hole7whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole7yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole7cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole7greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole7pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole7redMarker = new distanceMarkers(432, 420, 10, 10);

        hole7blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole7blackMarker = new distanceMarkers(144, 318, 10, 10);

        hole7teeMarker1 = new distanceMarkers(897, 352, 10, 10);

        hole7teeMarker2 = new distanceMarkers(902, 412, 10, 10);

    }

    public void startLevel8 () {

        redPointer = new BallorPointer(930, 300, 0, 5, 40, 10);

        shotMeter = new shotMeter(935, 200, 30, 170);

        golfBall = new BallorPointer(910, 400, 0, 0, 15, 15);

hole7 = new golfHole(5000,5000, 0,0);

        hole8 = new golfHole(80, 280, 60, 60);


        hole8Bunker3 = new bunker(591, 318, 70, 70);

        hole8Bunker4 = new bunker(497, 450, 70, 70);

        hole8Bunker5 = new bunker(261, 314, 70, 70);

        hole8whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole8yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole8cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole8greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole8pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole8redMarker = new distanceMarkers(432, 420, 10, 10);

        hole8blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole8blackMarker = new distanceMarkers(144, 318, 10, 10);

        hole8teeMarker1 = new distanceMarkers(900, 368, 10, 10);

        hole8teeMarker2 = new distanceMarkers(900, 443, 10, 10);

    }

    public void startLevel9 () {


        redPointer = new BallorPointer(930, 300, 0, 5, 40, 10);

        shotMeter = new shotMeter(935, 200, 30, 170);

        golfBall = new BallorPointer(910, 400, 0, 0, 15, 15);


       hole8 = new golfHole(5000,5000, 0,0);

        hole9 = new golfHole(80, 372, 60, 60);


        hole9Bunker3 = new bunker(207, 236, 70, 70);

        hole9Bunker4 = new bunker(207, 344, 70, 70);

        hole9Bunker5 = new bunker(207, 457, 70, 70);

        hole9whiteMarker = new distanceMarkers(613, 420, 10, 10);

        hole9yellowMarker = new distanceMarkers(583, 420, 10, 10);

        hole9cyanMarker = new distanceMarkers(550, 420, 10, 10);

        hole9greenMarker = new distanceMarkers(508, 420, 10, 10);

        hole9pinkMarker = new distanceMarkers(469, 420, 10, 10);

        hole9redMarker = new distanceMarkers(432, 420, 10, 10);

        hole9blueMarker = new distanceMarkers(394, 420, 10, 10);

        hole9blackMarker = new distanceMarkers(144, 318, 10, 10);

        hole9teeMarker1 = new distanceMarkers(903, 339, 10, 10);

        hole9teeMarker2 = new distanceMarkers(903, 423, 10, 10);

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
           g.drawString ("Rules of the course: Can't hit the same club twice!, and don't go past the hole! it will RESET you!", 220, 550);
           g.drawString("Unfortunately Hole 1 is under construction due to poor weather conditions last night, there will be only 8 holes for this year's masters", 200, 600);
           g.drawString("To win the masters you must finish the course in 30 shots or less, fail to do so and you lose!", 250, 650);
            g.drawString("Press 'w' to help me win my first Masters!", 370, 700);

        }




        //draw the image of your objects below:
        /**Step 4: draw object images**/

        /** Hole 1 **/

        if (level1 && isPlaying && backgroundPicHole2 != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole2 != null && hole2Bunker2 != null && hole2Bunker3 != null && hole2Bunker4 != null && hole2Bunker5 != null && hole2whiteMarker != null && hole2yellowMarker != null && hole2cyanMarker != null && hole2greenMarker != null && hole2pinkMarker != null && hole2redMarker != null && hole2blueMarker != null && hole2blackMarker != null && hole2teeMarker1 != null && hole2teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPicHole2, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole2.xpos, hole2.ypos, hole2.width, hole2.height, null);
            g.drawRect(hole2.rec.x, hole2.rec.y, hole2.rec.width, hole2.rec.height);
            g.drawRect(golfBall.rec.x, golfBall.rec.y, golfBall.rec.width, golfBall.rec.height);


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
        if (level3 && isPlaying && backgroundPicHole3 != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole2 != null && hole2Bunker2 != null && hole2Bunker3 != null && hole2Bunker4 != null && hole2Bunker5 != null && hole2whiteMarker != null && hole2yellowMarker != null && hole2cyanMarker != null && hole2greenMarker != null && hole2pinkMarker != null && hole2redMarker != null && hole2blueMarker != null && hole2blackMarker != null && hole2teeMarker1 != null && hole2teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPicHole3, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole3.xpos, hole3.ypos, hole3.width, hole3.height, null);
            g.drawRect(hole3.rec.x, hole3.rec.y, hole3.rec.width, hole3.rec.height);
            g.drawRect(golfBall.rec.x, golfBall.rec.y, golfBall.rec.width, golfBall.rec.height);


            g.drawImage(bunkerPic, hole3Bunker3.xpos, hole3Bunker3.ypos, hole3Bunker3.width, hole3Bunker3.height, null);

            g.drawImage(bunkerPic, hole3Bunker4.xpos, hole3Bunker4.ypos, hole3Bunker4.width, hole3Bunker4.height, null);

            g.drawImage(bunkerPic, hole3Bunker5.xpos, hole3Bunker5.ypos, hole3Bunker5.width, hole3Bunker5.height, null);

            g.drawImage(WhiteDistanceMarkerPic, hole3whiteMarker.xpos, hole3whiteMarker.ypos, hole3whiteMarker.width, hole3whiteMarker.height, null);

            g.drawImage(YellowDistanceMarkerPic, hole3yellowMarker.xpos, hole3yellowMarker.ypos, hole3yellowMarker.width, hole3yellowMarker.height, null);

            g.drawImage(CyanDistanceMarkerPic, hole3cyanMarker.xpos, hole3cyanMarker.ypos, hole3cyanMarker.width, hole3cyanMarker.height, null);

            g.drawImage(GreenDistanceMarkerPic, hole3greenMarker.xpos, hole3greenMarker.ypos, hole3greenMarker.width, hole3greenMarker.height, null);

            g.drawImage(PinkDistanceMarkerPic, hole3pinkMarker.xpos, hole3pinkMarker.ypos, hole3pinkMarker.width, hole3pinkMarker.height, null);

            g.drawImage(RedDistanceMarkerPic, hole3redMarker.xpos, hole3redMarker.ypos, hole3redMarker.width, hole3redMarker.height, null);

            g.drawImage(BlueDistanceMarkerPic, hole3blueMarker.xpos, hole3blueMarker.ypos, hole3blueMarker.width, hole3blueMarker.height, null);

            g.drawImage(BlackDistanceMarkerPic, hole3blackMarker.xpos, hole3blackMarker.ypos, hole3blackMarker.width, hole3blackMarker.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole3teeMarker1.xpos, hole3teeMarker1.ypos, hole3teeMarker1.width, hole3teeMarker1.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole3teeMarker2.xpos, hole3teeMarker2.ypos, hole3teeMarker2.width, hole3teeMarker2.height, null);

            g.drawImage(golfBallPic, (int) golfBall.xpos, (int) golfBall.ypos, golfBall.width, golfBall.height, null);


        }
        if (level4 && isPlaying && backgroundPicHole4 != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole4 != null && hole4Bunker3 != null && hole4Bunker4 != null && hole4Bunker5 != null && hole4whiteMarker != null && hole4yellowMarker != null && hole4cyanMarker != null && hole4greenMarker != null && hole4pinkMarker != null && hole4redMarker != null && hole4blueMarker != null && hole4blackMarker != null && hole4teeMarker1 != null && hole4teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPicHole4, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole4.xpos, hole4.ypos, hole4.width, hole4.height, null);
            g.drawRect(hole4.rec.x, hole4.rec.y, hole4.rec.width, hole4.rec.height);
            g.drawRect(golfBall.rec.x, golfBall.rec.y, golfBall.rec.width, golfBall.rec.height);



            g.drawImage(bunkerPic, hole4Bunker3.xpos, hole4Bunker3.ypos, hole4Bunker3.width, hole4Bunker3.height, null);

            g.drawImage(bunkerPic, hole4Bunker4.xpos, hole4Bunker4.ypos, hole4Bunker4.width, hole4Bunker4.height, null);

            g.drawImage(bunkerPic, hole4Bunker5.xpos, hole4Bunker5.ypos, hole4Bunker5.width, hole4Bunker5.height, null);

            g.drawImage(WhiteDistanceMarkerPic, hole4whiteMarker.xpos, hole4whiteMarker.ypos, hole4whiteMarker.width, hole4whiteMarker.height, null);

            g.drawImage(YellowDistanceMarkerPic, hole4yellowMarker.xpos, hole4yellowMarker.ypos, hole4yellowMarker.width, hole4yellowMarker.height, null);

            g.drawImage(CyanDistanceMarkerPic, hole4cyanMarker.xpos, hole4cyanMarker.ypos, hole4cyanMarker.width, hole4cyanMarker.height, null);

            g.drawImage(GreenDistanceMarkerPic, hole4greenMarker.xpos, hole4greenMarker.ypos, hole4greenMarker.width, hole4greenMarker.height, null);

            g.drawImage(PinkDistanceMarkerPic, hole4pinkMarker.xpos, hole4pinkMarker.ypos, hole4pinkMarker.width, hole4pinkMarker.height, null);

            g.drawImage(RedDistanceMarkerPic, hole4redMarker.xpos, hole4redMarker.ypos, hole4redMarker.width, hole4redMarker.height, null);

            g.drawImage(BlueDistanceMarkerPic, hole4blueMarker.xpos, hole4blueMarker.ypos, hole4blueMarker.width, hole4blueMarker.height, null);

            g.drawImage(BlackDistanceMarkerPic, hole4blackMarker.xpos, hole4blackMarker.ypos, hole4blackMarker.width, hole4blackMarker.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole4teeMarker1.xpos, hole3teeMarker1.ypos, hole4teeMarker1.width, hole4teeMarker1.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole4teeMarker2.xpos, hole4teeMarker2.ypos, hole4teeMarker2.width, hole4teeMarker2.height, null);

            g.drawImage(golfBallPic, (int) golfBall.xpos, (int) golfBall.ypos, golfBall.width, golfBall.height, null);


        }


         if (level5 && isPlaying && backgroundPicHole5 != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole5 != null && hole5Bunker3 != null && hole5Bunker4 != null && hole5Bunker5 != null && hole5whiteMarker != null && hole5yellowMarker != null && hole5cyanMarker != null && hole5greenMarker != null && hole5pinkMarker != null && hole5redMarker != null && hole5blueMarker != null && hole5blackMarker != null && hole5teeMarker1 != null && hole5teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPicHole5, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole5.xpos, hole5.ypos, hole5.width, hole5.height, null);
            g.drawRect(hole5.rec.x, hole5.rec.y, hole5.rec.width, hole5.rec.height);
            g.drawRect(golfBall.rec.x, golfBall.rec.y, golfBall.rec.width, golfBall.rec.height);


            g.drawImage(bunkerPic, hole5Bunker3.xpos, hole5Bunker3.ypos, hole5Bunker3.width, hole5Bunker3.height, null);

            g.drawImage(bunkerPic, hole5Bunker4.xpos, hole5Bunker4.ypos, hole5Bunker4.width, hole5Bunker4.height, null);

            g.drawImage(bunkerPic, hole5Bunker5.xpos, hole5Bunker5.ypos, hole5Bunker5.width, hole5Bunker5.height, null);

            g.drawImage(WhiteDistanceMarkerPic, hole5whiteMarker.xpos, hole5whiteMarker.ypos, hole5whiteMarker.width, hole5whiteMarker.height, null);

            g.drawImage(YellowDistanceMarkerPic, hole5yellowMarker.xpos, hole5yellowMarker.ypos, hole5yellowMarker.width, hole5yellowMarker.height, null);

            g.drawImage(CyanDistanceMarkerPic, hole5cyanMarker.xpos, hole5cyanMarker.ypos, hole5cyanMarker.width, hole5cyanMarker.height, null);

            g.drawImage(GreenDistanceMarkerPic, hole5greenMarker.xpos, hole5greenMarker.ypos, hole5greenMarker.width, hole5greenMarker.height, null);

            g.drawImage(PinkDistanceMarkerPic, hole5pinkMarker.xpos, hole5pinkMarker.ypos, hole5pinkMarker.width, hole5pinkMarker.height, null);

            g.drawImage(RedDistanceMarkerPic, hole5redMarker.xpos, hole5redMarker.ypos, hole5redMarker.width, hole5redMarker.height, null);

            g.drawImage(BlueDistanceMarkerPic, hole5blueMarker.xpos, hole5blueMarker.ypos, hole5blueMarker.width, hole5blueMarker.height, null);

            g.drawImage(BlackDistanceMarkerPic, hole5blackMarker.xpos, hole5blackMarker.ypos, hole5blackMarker.width, hole5blackMarker.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole5teeMarker1.xpos, hole5teeMarker1.ypos, hole5teeMarker1.width, hole5teeMarker1.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole5teeMarker2.xpos, hole5teeMarker2.ypos, hole5teeMarker2.width, hole5teeMarker2.height, null);

            g.drawImage(golfBallPic, (int) golfBall.xpos, (int) golfBall.ypos, golfBall.width, golfBall.height, null);


        } if (level6 && isPlaying && backgroundPicHole6 != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole6 != null && hole6Bunker3 != null && hole6Bunker4 != null && hole6Bunker5 != null && hole6whiteMarker != null && hole6yellowMarker != null && hole6cyanMarker != null && hole6greenMarker != null && hole6pinkMarker != null && hole6redMarker != null && hole6blueMarker != null && hole6blackMarker != null && hole6teeMarker1 != null && hole6teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPicHole6, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole6.xpos, hole6.ypos, hole6.width, hole6.height, null);
            g.drawRect(hole6.rec.x, hole6.rec.y, hole6.rec.width, hole6.rec.height);
            g.drawRect(golfBall.rec.x, golfBall.rec.y, golfBall.rec.width, golfBall.rec.height);


            g.drawImage(bunkerPic, hole6Bunker3.xpos, hole6Bunker3.ypos, hole6Bunker3.width, hole6Bunker3.height, null);

            g.drawImage(bunkerPic, hole6Bunker4.xpos, hole6Bunker4.ypos, hole6Bunker4.width, hole6Bunker4.height, null);

            g.drawImage(bunkerPic, hole6Bunker5.xpos, hole6Bunker5.ypos, hole6Bunker5.width, hole6Bunker5.height, null);

            g.drawImage(WhiteDistanceMarkerPic, hole6whiteMarker.xpos, hole6whiteMarker.ypos, hole6whiteMarker.width, hole6whiteMarker.height, null);

            g.drawImage(YellowDistanceMarkerPic, hole6yellowMarker.xpos, hole6yellowMarker.ypos, hole6yellowMarker.width, hole6yellowMarker.height, null);

            g.drawImage(CyanDistanceMarkerPic, hole6cyanMarker.xpos, hole6cyanMarker.ypos, hole6cyanMarker.width, hole6cyanMarker.height, null);

            g.drawImage(GreenDistanceMarkerPic, hole6greenMarker.xpos, hole6greenMarker.ypos, hole6greenMarker.width, hole6greenMarker.height, null);

            g.drawImage(PinkDistanceMarkerPic, hole6pinkMarker.xpos, hole6pinkMarker.ypos, hole6pinkMarker.width, hole6pinkMarker.height, null);

            g.drawImage(RedDistanceMarkerPic, hole6redMarker.xpos, hole6redMarker.ypos, hole6redMarker.width, hole6redMarker.height, null);

            g.drawImage(BlueDistanceMarkerPic, hole6blueMarker.xpos, hole6blueMarker.ypos, hole6blueMarker.width, hole6blueMarker.height, null);

            g.drawImage(BlackDistanceMarkerPic, hole6blackMarker.xpos, hole6blackMarker.ypos, hole6blackMarker.width, hole6blackMarker.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole6teeMarker1.xpos, hole6teeMarker1.ypos, hole6teeMarker1.width, hole6teeMarker1.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole6teeMarker2.xpos, hole6teeMarker2.ypos, hole6teeMarker2.width, hole6teeMarker2.height, null);

            g.drawImage(golfBallPic, (int) golfBall.xpos, (int) golfBall.ypos, golfBall.width, golfBall.height, null);


        } if (level7 && isPlaying && backgroundPicHole7 != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole7 != null && hole7Bunker3 != null && hole7Bunker4 != null && hole7Bunker5 != null && hole7whiteMarker != null && hole7yellowMarker != null && hole7cyanMarker != null && hole7greenMarker != null && hole7pinkMarker != null && hole7redMarker != null && hole7blueMarker != null && hole7blackMarker != null && hole7teeMarker1 != null && hole7teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPicHole7, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole7.xpos, hole7.ypos, hole7.width, hole7.height, null);
            g.drawRect(hole7.rec.x, hole7.rec.y, hole7.rec.width, hole7.rec.height);
            g.drawRect(golfBall.rec.x, golfBall.rec.y, golfBall.rec.width, golfBall.rec.height);


            g.drawImage(bunkerPic, hole7Bunker3.xpos, hole7Bunker3.ypos, hole7Bunker3.width, hole7Bunker3.height, null);

            g.drawImage(bunkerPic, hole7Bunker4.xpos, hole7Bunker4.ypos, hole7Bunker4.width, hole7Bunker4.height, null);

            g.drawImage(bunkerPic, hole7Bunker5.xpos, hole7Bunker5.ypos, hole7Bunker5.width, hole7Bunker5.height, null);

            g.drawImage(WhiteDistanceMarkerPic, hole7whiteMarker.xpos, hole7whiteMarker.ypos, hole7whiteMarker.width, hole7whiteMarker.height, null);

            g.drawImage(YellowDistanceMarkerPic, hole7yellowMarker.xpos, hole7yellowMarker.ypos, hole7yellowMarker.width, hole7yellowMarker.height, null);

            g.drawImage(CyanDistanceMarkerPic, hole7cyanMarker.xpos, hole7cyanMarker.ypos, hole7cyanMarker.width, hole7cyanMarker.height, null);

            g.drawImage(GreenDistanceMarkerPic, hole7greenMarker.xpos, hole7greenMarker.ypos, hole7greenMarker.width, hole7greenMarker.height, null);

            g.drawImage(PinkDistanceMarkerPic, hole7pinkMarker.xpos, hole7pinkMarker.ypos, hole7pinkMarker.width, hole7pinkMarker.height, null);

            g.drawImage(RedDistanceMarkerPic, hole7redMarker.xpos, hole7redMarker.ypos, hole7redMarker.width, hole7redMarker.height, null);

            g.drawImage(BlueDistanceMarkerPic, hole7blueMarker.xpos, hole7blueMarker.ypos, hole7blueMarker.width, hole7blueMarker.height, null);

            g.drawImage(BlackDistanceMarkerPic, hole7blackMarker.xpos, hole7blackMarker.ypos, hole7blackMarker.width, hole7blackMarker.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole7teeMarker1.xpos, hole7teeMarker1.ypos, hole7teeMarker1.width, hole7teeMarker1.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole7teeMarker2.xpos, hole7teeMarker2.ypos, hole7teeMarker2.width, hole7teeMarker2.height, null);

            g.drawImage(golfBallPic, (int) golfBall.xpos, (int) golfBall.ypos, golfBall.width, golfBall.height, null);


        } if (level8 && isPlaying && backgroundPicHole8 != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole8 != null && hole8Bunker3 != null && hole8Bunker4 != null && hole8Bunker5 != null && hole8whiteMarker != null && hole8yellowMarker != null && hole8cyanMarker != null && hole8greenMarker != null && hole8pinkMarker != null && hole8redMarker != null && hole8blueMarker != null && hole8blackMarker != null && hole8teeMarker1 != null && hole8teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPicHole8, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole8.xpos, hole8.ypos, hole8.width, hole8.height, null);
            g.drawRect(hole8.rec.x, hole8.rec.y, hole8.rec.width, hole8.rec.height);
            g.drawRect(golfBall.rec.x, golfBall.rec.y, golfBall.rec.width, golfBall.rec.height);


            g.drawImage(bunkerPic, hole8Bunker3.xpos, hole8Bunker3.ypos, hole8Bunker3.width, hole8Bunker3.height, null);

            g.drawImage(bunkerPic, hole8Bunker4.xpos, hole8Bunker4.ypos, hole8Bunker4.width, hole8Bunker4.height, null);

            g.drawImage(bunkerPic, hole8Bunker5.xpos, hole8Bunker5.ypos, hole8Bunker5.width, hole8Bunker5.height, null);

            g.drawImage(WhiteDistanceMarkerPic, hole8whiteMarker.xpos, hole8whiteMarker.ypos, hole8whiteMarker.width, hole8whiteMarker.height, null);

            g.drawImage(YellowDistanceMarkerPic, hole8yellowMarker.xpos, hole8yellowMarker.ypos, hole8yellowMarker.width, hole8yellowMarker.height, null);

            g.drawImage(CyanDistanceMarkerPic, hole8cyanMarker.xpos, hole8cyanMarker.ypos, hole8cyanMarker.width, hole8cyanMarker.height, null);

            g.drawImage(GreenDistanceMarkerPic, hole8greenMarker.xpos, hole8greenMarker.ypos, hole8greenMarker.width, hole8greenMarker.height, null);

            g.drawImage(PinkDistanceMarkerPic, hole8pinkMarker.xpos, hole8pinkMarker.ypos, hole8pinkMarker.width, hole8pinkMarker.height, null);

            g.drawImage(RedDistanceMarkerPic, hole8redMarker.xpos, hole8redMarker.ypos, hole8redMarker.width, hole8redMarker.height, null);

            g.drawImage(BlueDistanceMarkerPic, hole8blueMarker.xpos, hole8blueMarker.ypos, hole8blueMarker.width, hole8blueMarker.height, null);

            g.drawImage(BlackDistanceMarkerPic, hole8blackMarker.xpos, hole8blackMarker.ypos, hole8blackMarker.width, hole8blackMarker.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole8teeMarker1.xpos, hole8teeMarker1.ypos, hole8teeMarker1.width, hole8teeMarker1.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole8teeMarker2.xpos, hole8teeMarker2.ypos, hole8teeMarker2.width, hole8teeMarker2.height, null);

            g.drawImage(golfBallPic, (int) golfBall.xpos, (int) golfBall.ypos, golfBall.width, golfBall.height, null);


        } if (level9 && isPlaying && backgroundPicHole9 != null && shotMeterPic != null && redPointer != null && shotMeter != null && hole9 != null && hole9Bunker3 != null && hole9Bunker4 != null && hole9Bunker5 != null && hole9whiteMarker != null && hole9yellowMarker != null && hole9cyanMarker != null && hole9greenMarker != null && hole9pinkMarker != null && hole9redMarker != null && hole9blueMarker != null && hole9blackMarker != null && hole9teeMarker1 != null && hole9teeMarker2 != null && golfBall != null) {



            g.drawImage(backgroundPicHole9, 0, 0, WIDTH, HEIGHT, null);

            g.drawString("Shots: " + score,850, 150 );
            g.drawImage(shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

            g.drawImage(redPointerPic, (int) redPointer.xpos, (int) redPointer.ypos, redPointer.width, redPointer.height, null);

            g.drawImage(holePic, hole9.xpos, hole9.ypos, hole9.width, hole9.height, null);
            g.drawRect(hole9.rec.x, hole9.rec.y, hole9.rec.width, hole9.rec.height);
            g.drawRect(golfBall.rec.x, golfBall.rec.y, golfBall.rec.width, golfBall.rec.height);


            g.drawImage(bunkerPic, hole9Bunker3.xpos, hole9Bunker3.ypos, hole9Bunker3.width, hole9Bunker3.height, null);

            g.drawImage(bunkerPic, hole9Bunker4.xpos, hole9Bunker4.ypos, hole9Bunker4.width, hole9Bunker4.height, null);

            g.drawImage(bunkerPic, hole9Bunker5.xpos, hole9Bunker5.ypos, hole9Bunker5.width, hole9Bunker5.height, null);

            g.drawImage(WhiteDistanceMarkerPic, hole9whiteMarker.xpos, hole9whiteMarker.ypos, hole9whiteMarker.width, hole9whiteMarker.height, null);

            g.drawImage(YellowDistanceMarkerPic, hole9yellowMarker.xpos, hole9yellowMarker.ypos, hole9yellowMarker.width, hole9yellowMarker.height, null);

            g.drawImage(CyanDistanceMarkerPic, hole9cyanMarker.xpos, hole9cyanMarker.ypos, hole9cyanMarker.width, hole9cyanMarker.height, null);

            g.drawImage(GreenDistanceMarkerPic, hole9greenMarker.xpos, hole9greenMarker.ypos, hole9greenMarker.width, hole9greenMarker.height, null);

            g.drawImage(PinkDistanceMarkerPic, hole9pinkMarker.xpos, hole9pinkMarker.ypos, hole9pinkMarker.width, hole9pinkMarker.height, null);

            g.drawImage(RedDistanceMarkerPic, hole9redMarker.xpos, hole9redMarker.ypos, hole9redMarker.width, hole9redMarker.height, null);

            g.drawImage(BlueDistanceMarkerPic, hole9blueMarker.xpos, hole9blueMarker.ypos, hole9blueMarker.width, hole9blueMarker.height, null);

            g.drawImage(BlackDistanceMarkerPic, hole9blackMarker.xpos, hole9blackMarker.ypos, hole9blackMarker.width, hole9blackMarker.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole9teeMarker1.xpos, hole9teeMarker1.ypos, hole9teeMarker1.width, hole9teeMarker1.height, null);

            g.drawImage(teeBoxDistanceMarkerPic, hole9teeMarker2.xpos, hole9teeMarker2.ypos, hole9teeMarker2.width, hole9teeMarker2.height, null);

            g.drawImage(golfBallPic, (int) golfBall.xpos, (int) golfBall.ypos, golfBall.width, golfBall.height, null);


        }




        //dispose the images each time(this allows for the illusion of movement).


        if (gameOver && score<=30) {

            g.drawImage(endGameWinBackgroundPic, 0, 0, WIDTH, HEIGHT, null);
            g.setColor(Color.white);
            g.setFont(new Font("Times New Roman", Font.BOLD, 60));
            g.drawString("Final Score: " + score, 350, 400);

        }

        if (gameOver && score>=31){

            g.drawImage(endGameLossBackgroundPic, 0, 0, WIDTH, HEIGHT, null);
            g.setColor(Color.RED);
            g.setFont(new Font("Times New Roman", Font.BOLD, 60));
            g.drawString("Final Score: " + score, 350, 400);

        }



        g.dispose(); // second to last line in render method
        bufferStrategy.show(); // last line in render method
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
            redPointerYellow=true;
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

            golfBall.redMove();





        } else if (redPointer != null && redPointer.ypos > 320 && redPointer.ypos <= 340 && gameRunning && shotReset) {
            redPointerBlue = true;

            golfBall.blueMove();


        } else if (redPointer != null && redPointer.ypos > 340 && redPointer.ypos <= 360 && gameRunning && shotReset) {


            redPointerBlack = true;

            golfBall.blackMove();


        }




    }




    public void collisions() {

        // HOLE 2
        if (golfBall != null && golfBall.rec != null && hole2 != null && hole2.rec != null) {
            if (golfBall.rec.intersects(hole2.rec)) {
                golfBall.dx = 0;
                golfBall.dy = 0;
                level1 = false;
                level3 = true;
                level4 = false;
                level5 = false;
                level6 = false;
                level7 = false;
                level8 = false;
                level9 = false;
                hole2Over = true;
                shotReset = false;
                runCorrectLevel();
            }
        }

        if (golfBall != null && golfBall.rec != null) {
            if (hole2Bunker1 != null && hole2Bunker1.rec != null) {
                if (golfBall.rec.intersects(hole2Bunker1.rec) && !hole2Bunker1Intersecting) {
                    hole2Bunker1Intersecting = true;
                    score++;
                }
            }

            if (hole2Bunker2 != null && hole2Bunker2.rec != null) {
                if (golfBall.rec.intersects(hole2Bunker2.rec) && !hole2Bunker2Intersecting) {
                    hole2Bunker2Intersecting = true;
                    score++;
                }
            }

            if (hole2Bunker3 != null && hole2Bunker3.rec != null) {
                if (golfBall.rec.intersects(hole2Bunker3.rec) && !hole2Bunker3Intersecting) {
                    hole2Bunker3Intersecting = true;
                    score++;
                }
            }

            if (hole2Bunker4 != null && hole2Bunker4.rec != null) {
                if (golfBall.rec.intersects(hole2Bunker4.rec) && !hole2Bunker4Intersecting) {
                    hole2Bunker4Intersecting = true;
                    score++;
                }
            }

            if (hole2Bunker5 != null && hole2Bunker5.rec != null) {
                if (golfBall.rec.intersects(hole2Bunker5.rec) && !hole2Bunker5Intersecting) {
                    hole2Bunker5Intersecting = true;
                    score++;
                }
            }
        }

// HOLE 3
        if (golfBall != null && golfBall.rec != null && hole3 != null && hole3.rec != null) {
            if (golfBall.rec.intersects(hole3.rec)) {
                System.out.println("ball intersecting hole 3");
                golfBall.dx = 0;
                golfBall.dy = 0;
                level1 = false;
                level3 = false;
                level4 = true;
                level5 = false;
                level6 = false;
                level7 = false;
                level8 = false;
                level9 = false;
                hole3Over = true;
                shotReset = false;
                runCorrectLevel();
            }
        }

        if (golfBall != null && golfBall.rec != null) {
            if (hole3Bunker3 != null && hole3Bunker3.rec != null) {
                if (golfBall.rec.intersects(hole3Bunker3.rec) && !hole3Bunker3Intersecting) {
                    hole3Bunker3Intersecting = true;
                    score++;
                }
            }

            if (hole3Bunker4 != null && hole3Bunker4.rec != null) {
                if (golfBall.rec.intersects(hole3Bunker4.rec) && !hole3Bunker4Intersecting) {
                    hole3Bunker4Intersecting = true;
                    score++;
                }
            }

            if (hole3Bunker5 != null && hole3Bunker5.rec != null) {
                if (golfBall.rec.intersects(hole3Bunker5.rec) && !hole3Bunker5Intersecting) {
                    hole3Bunker5Intersecting = true;
                    score++;
                }
            }
        }

// HOLE 4
        if (golfBall != null && golfBall.rec != null && hole4 != null && hole4.rec != null) {
            if (golfBall.rec.intersects(hole4.rec)) {
                golfBall.dx = 0;
                golfBall.dy = 0;
                level1 = false;
                level3 = false;
                level4 = false;
                level5 = true;
                level6 = false;
                level7 = false;
                level8 = false;
                level9 = false;
                hole4Over = true;
                shotReset = false;
                runCorrectLevel();
            }
        }

        if (golfBall != null && golfBall.rec != null) {
            if (hole4Bunker3 != null && hole4Bunker3.rec != null) {
                if (golfBall.rec.intersects(hole4Bunker3.rec) && !hole4Bunker3Intersecting) {
                    hole4Bunker3Intersecting = true;
                    score++;
                }
            }

            if (hole4Bunker4 != null && hole4Bunker4.rec != null) {
                if (golfBall.rec.intersects(hole4Bunker4.rec) && !hole4Bunker4Intersecting) {
                    hole4Bunker4Intersecting = true;
                    score++;
                }
            }

            if (hole4Bunker5 != null && hole4Bunker5.rec != null) {
                if (golfBall.rec.intersects(hole4Bunker5.rec) && !hole4Bunker5Intersecting) {
                    hole4Bunker5Intersecting = true;
                    score++;
                }
            }
        }

// HOLE 5
        if (golfBall != null && golfBall.rec != null && hole5 != null && hole5.rec != null) {
            if (golfBall.rec.intersects(hole5.rec)) {
                golfBall.dx = 0;
                golfBall.dy = 0;
                level1 = false;
                level3 = false;
                level4 = false;
                level5 = false;
                level6 = true;
                level7 = false;
                level8 = false;
                level9 = false;
                hole5Over = true;
                shotReset = false;
                runCorrectLevel();
            }
        }

        if (golfBall != null && golfBall.rec != null) {
            if (hole5Bunker3 != null && hole5Bunker3.rec != null) {
                if (golfBall.rec.intersects(hole5Bunker3.rec) && !hole5Bunker3Intersecting) {
                    hole5Bunker3Intersecting = true;
                    score++;
                }
            }

            if (hole5Bunker4 != null && hole5Bunker4.rec != null) {
                if (golfBall.rec.intersects(hole5Bunker4.rec) && !hole5Bunker4Intersecting) {
                    hole5Bunker4Intersecting = true;
                    score++;
                }
            }

            if (hole5Bunker5 != null && hole5Bunker5.rec != null) {
                if (golfBall.rec.intersects(hole5Bunker5.rec) && !hole5Bunker5Intersecting) {
                    hole5Bunker5Intersecting = true;
                    score++;
                }
            }
        }

// HOLE 6
        if (golfBall != null && golfBall.rec != null && hole6 != null && hole6.rec != null) {
            if (golfBall.rec.intersects(hole6.rec)) {
                golfBall.dx = 0;
                golfBall.dy = 0;
                level1 = false;
                level3 = false;
                level4 = false;
                level5 = false;
                level6 = false;
                level7 = true;
                level8 = false;
                level9 = false;
                hole6Over = true;
                shotReset = false;
                runCorrectLevel();
            }
        }

        if (golfBall != null && golfBall.rec != null) {
            if (hole6Bunker3 != null && hole6Bunker3.rec != null) {
                if (golfBall.rec.intersects(hole6Bunker3.rec) && !hole6Bunker3Intersecting) {
                    hole6Bunker3Intersecting = true;
                    score++;
                }
            }

            if (hole6Bunker4 != null && hole6Bunker4.rec != null) {
                if (golfBall.rec.intersects(hole6Bunker4.rec) && !hole6Bunker4Intersecting) {
                    hole6Bunker4Intersecting = true;
                    score++;
                }
            }

            if (hole6Bunker5 != null && hole6Bunker5.rec != null) {
                if (golfBall.rec.intersects(hole6Bunker5.rec) && !hole6Bunker5Intersecting) {
                    hole6Bunker5Intersecting = true;
                    score++;
                }
            }
        }

// HOLE 7
        if (golfBall != null && golfBall.rec != null && hole7 != null && hole7.rec != null) {
            if (golfBall.rec.intersects(hole7.rec)) {
                golfBall.dx = 0;
                golfBall.dy = 0;
                level1 = false;
                level3 = false;
                level4 = false;
                level5 = false;
                level6 = false;
                level7 = false;
                level8 = true;
                level9 = false;
                hole7Over = true;
                shotReset = false;
                runCorrectLevel();
            }
        }

        if (golfBall != null && golfBall.rec != null) {
            if (hole7Bunker3 != null && hole7Bunker3.rec != null) {
                if (golfBall.rec.intersects(hole7Bunker3.rec) && !hole7Bunker3Intersecting) {
                    hole7Bunker3Intersecting = true;
                    score++;
                }
            }

            if (hole7Bunker4 != null && hole7Bunker4.rec != null) {
                if (golfBall.rec.intersects(hole7Bunker4.rec) && !hole7Bunker4Intersecting) {
                    hole7Bunker4Intersecting = true;
                    score++;
                }
            }

            if (hole7Bunker5 != null && hole7Bunker5.rec != null) {
                if (golfBall.rec.intersects(hole7Bunker5.rec) && !hole7Bunker5Intersecting) {
                    hole7Bunker5Intersecting = true;
                    score++;
                }
            }
        }

// HOLE 8
        if (golfBall != null && golfBall.rec != null && hole8 != null && hole8.rec != null) {
            if (golfBall.rec.intersects(hole8.rec)) {
                golfBall.dx = 0;
                golfBall.dy = 0;
                level1 = false;
                level3 = false;
                level4 = false;
                level5 = false;
                level6 = false;
                level7 = false;
                level8 = false;
                level9 = true;
                hole8Over = true;
                shotReset = false;
                runCorrectLevel();
            }
        }

        if (golfBall != null && golfBall.rec != null) {
            if (hole8Bunker3 != null && hole8Bunker3.rec != null) {
                if (golfBall.rec.intersects(hole8Bunker3.rec) && !hole8Bunker3Intersecting) {
                    hole8Bunker3Intersecting = true;
                    score++;
                }
            }

            if (hole8Bunker4 != null && hole8Bunker4.rec != null) {
                if (golfBall.rec.intersects(hole8Bunker4.rec) && !hole8Bunker4Intersecting) {
                    hole8Bunker4Intersecting = true;
                    score++;
                }
            }

            if (hole8Bunker5 != null && hole8Bunker5.rec != null) {
                if (golfBall.rec.intersects(hole8Bunker5.rec) && !hole8Bunker5Intersecting) {
                    hole8Bunker5Intersecting = true;
                    score++;
                }
            }
        }

// HOLE 9
        if (golfBall != null && golfBall.rec != null && hole9 != null && hole9.rec != null) {
            if (golfBall.rec.intersects(hole9.rec)) {
                golfBall.dx = 0;
                golfBall.dy = 0;
                level1 = false;
                level3 = false;
                level4 = false;
                level5 = false;
                level6 = false;
                level7 = false;
                level8 = false;
                level9 = false;
                hole9Over = true;
                shotReset = false;
                runCorrectLevel();
            }
        }

        if (golfBall != null && golfBall.rec != null) {
            if (hole9Bunker3 != null && hole9Bunker3.rec != null) {
                if (golfBall.rec.intersects(hole9Bunker3.rec) && !hole9Bunker3Intersecting) {
                    hole9Bunker3Intersecting = true;
                    score++;
                }
            }

            if (hole9Bunker4 != null && hole9Bunker4.rec != null) {
                if (golfBall.rec.intersects(hole9Bunker4.rec) && !hole9Bunker4Intersecting) {
                    hole9Bunker4Intersecting = true;
                    score++;
                }
            }

            if (hole9Bunker5 != null && hole9Bunker5.rec != null) {
                if (golfBall.rec.intersects(hole9Bunker5.rec) && !hole9Bunker5Intersecting) {
                    hole9Bunker5Intersecting = true;
                    score++;
                }
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
            golfBall.leftPressed = true;
        }

        if (keyCode == 38) {
            golfBall.upPressed = true;
        }

        if (keyCode == 39) {
            golfBall.rightPressed = true;
        }

        if (keyCode == 40) {
            golfBall.downPressed = true;
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
            golfBall.leftPressed = false;
        }

        if (keyCode == 38) {
            golfBall.upPressed = false;
        }

        if (keyCode == 39) {
            golfBall.rightPressed = false;
        }

        if (keyCode == 40) {
            golfBall.downPressed = false;
        }

        if (keyCode == 32 && redPointer != null) {

            redPointer.spacePressed = false;
            gameRunning = true;
            shotReset=true;
            score = score + 1;




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
