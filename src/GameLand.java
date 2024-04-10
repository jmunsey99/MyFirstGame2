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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;



//*******************************************************************************
// Class Definition Section

public class GameLand implements Runnable, KeyListener {

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
    /**STEP 0: declare**/

    public BallorPointer redPointer;
    public BallorPointer golfBall;
    public shotMeter shotMeter;
    public golfHole hole1;
    public bunker hole1Bunker1;
    public bunker hole1Bunker2;
    public bunker hole1Bunker3;
    public bunker hole1Bunker4;
    public bunker hole1Bunker5;
    public distanceMarkers hole1whiteMarker;
    public distanceMarkers hole1yellowMarker;
    public distanceMarkers hole1cyanMarker;
    public distanceMarkers hole1greenMarker;
    public distanceMarkers hole1pinkMarker;
    public distanceMarkers hole1redMarker;
    public distanceMarkers hole1blueMarker;
    public distanceMarkers hole1blackMarker;
    public distanceMarkers hole1teeMarker1;
    public distanceMarkers hole1teeMarker2;
    
    



    //movements booleans




    /**Step 1: declare image for object**/

    public Image backgroundPic;
    public Image roryPic;
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
    public GameLand()  {
        setUpGraphics(); //this calls the setUpGraphics() method

        //create (construct) the objects needed for the game below
        /**Step 2 construct object**/





        redPointer = new BallorPointer (950, 300, 0, 20, 20,20);

        shotMeter = new shotMeter (935, 200, 30,170);

        golfBall = new BallorPointer (950, 450, 0,0, 15,15);

        /** hole 1 **/

        hole1 = new golfHole (150, 230, 60,60);

        hole1Bunker1 = new bunker (500,510, 70, 70 );

        hole1Bunker2 = new bunker (520,330, 70, 70);

        hole1Bunker3 = new bunker (300, 230, 70, 70);

        hole1Bunker4 = new bunker (120, 350, 70, 70);

        hole1Bunker5 = new bunker (35, 190, 70, 70);

        hole1whiteMarker = new distanceMarkers (550, 460, 10, 10);

        hole1yellowMarker = new distanceMarkers (495, 450, 10, 10);

        hole1cyanMarker = new distanceMarkers (440, 430, 10, 10);

        hole1greenMarker = new distanceMarkers (395, 400, 10, 10);

        hole1pinkMarker = new distanceMarkers (350, 375, 10, 10);

        hole1redMarker = new distanceMarkers (300, 340, 10, 10);

        hole1blueMarker = new distanceMarkers (250, 310, 10, 10);

        hole1blackMarker = new distanceMarkers (175, 200, 10, 10);

        hole1teeMarker1 = new distanceMarkers (950,400 , 10, 10);

        hole1teeMarker2 = new distanceMarkers (950,510 , 10, 10);



        /** end of Hole 1 **/







        /**Step 3 add image to object**/


        backgroundPic = Toolkit.getDefaultToolkit().getImage ("HOLE 1.png");
      //  roryPic = Toolkit.getDefaultToolkit().getImage("RoryImage.png");

        redPointerPic = Toolkit.getDefaultToolkit().getImage ("redPointer.png");

        shotMeterPic = Toolkit.getDefaultToolkit().getImage ("shotMeter.png");

        holePic = Toolkit.getDefaultToolkit().getImage ("Hole.png");

        bunkerPic = Toolkit.getDefaultToolkit().getImage ("bunker.png");

        WhiteDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("whiteMarker.png");

        YellowDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("yellowMarker.png");

        CyanDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("cyanMarker.png");

        GreenDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("greenMarker.png");

        PinkDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("pinkMarker.png");

        RedDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("redMarker.png");

        BlueDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("blueMarker.png");

        BlackDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("blackMarker.png");

        teeBoxDistanceMarkerPic = Toolkit.getDefaultToolkit().getImage ("whiteMarker.png");

        golfBallPic = Toolkit.getDefaultToolkit().getImage ("golfBall.png");














    }// GameLand()

//*******************************************************************************
//User Method Section
//
// put your code to do things here.

    // main thread
    // this is the code that plays the game after you set things up
    public void run() {
        //for the moment we will loop things forever using a while loop
        while (true) {
            moveThings();  //move all the game objects
            render();  // paint the graphics
            pause(20); // sleep for 20 ms
            collisions();
        }
    }

    //paints things on the screen using bufferStrategy
    private void render() {
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT);
//draw our background Image below;




            g.drawImage(backgroundPic, 0, 0, WIDTH, HEIGHT, null);



            g.drawImage(roryPic, 0, 0, WIDTH, HEIGHT, null);




        //draw the image of your objects below:
        /**Step 4: draw object images**/

     /** Hole 1 **/

        g.drawImage (shotMeterPic, shotMeter.xpos, shotMeter.ypos, shotMeter.width, shotMeter.height, null);

        g.drawImage(redPointerPic, (int)redPointer.xpos, (int)redPointer.ypos, redPointer.width, redPointer.height, null );

        g.drawImage (holePic, hole1.xpos, hole1.ypos, hole1.width, hole1.height, null);

        g.drawImage (bunkerPic, hole1Bunker1.xpos, hole1Bunker1.ypos, hole1Bunker1.width, hole1Bunker1.height, null);

        g.drawImage (bunkerPic, hole1Bunker2.xpos, hole1Bunker2.ypos, hole1Bunker2.width, hole1Bunker2.height, null);

        g.drawImage (bunkerPic, hole1Bunker3.xpos, hole1Bunker3.ypos, hole1Bunker3.width, hole1Bunker3.height, null);

        g.drawImage (bunkerPic, hole1Bunker4.xpos, hole1Bunker4.ypos, hole1Bunker4.width, hole1Bunker4.height, null);

        g.drawImage (bunkerPic, hole1Bunker5.xpos, hole1Bunker5.ypos, hole1Bunker5.width, hole1Bunker5.height, null);

        g.drawImage (WhiteDistanceMarkerPic, hole1whiteMarker.xpos, hole1whiteMarker.ypos, hole1whiteMarker.width, hole1whiteMarker.height, null);

        g.drawImage (YellowDistanceMarkerPic, hole1yellowMarker.xpos, hole1yellowMarker.ypos, hole1yellowMarker.width, hole1yellowMarker.height, null);

        g.drawImage (CyanDistanceMarkerPic, hole1cyanMarker.xpos, hole1cyanMarker.ypos, hole1cyanMarker.width, hole1cyanMarker.height, null);

        g.drawImage (GreenDistanceMarkerPic, hole1greenMarker.xpos, hole1greenMarker.ypos, hole1greenMarker.width, hole1greenMarker.height, null);

        g.drawImage (PinkDistanceMarkerPic, hole1pinkMarker.xpos, hole1pinkMarker.ypos, hole1pinkMarker.width, hole1pinkMarker.height, null);

        g.drawImage (RedDistanceMarkerPic, hole1redMarker.xpos, hole1redMarker.ypos, hole1redMarker.width, hole1redMarker.height, null);

        g.drawImage (BlueDistanceMarkerPic, hole1blueMarker.xpos, hole1blueMarker.ypos, hole1blueMarker.width, hole1blueMarker.height, null);

        g.drawImage (BlackDistanceMarkerPic, hole1blackMarker.xpos, hole1blackMarker.ypos, hole1blackMarker.width, hole1blackMarker.height, null);

        g.drawImage (teeBoxDistanceMarkerPic, hole1teeMarker1.xpos, hole1teeMarker1.ypos, hole1teeMarker1.width, hole1teeMarker1.height, null);

        g.drawImage (teeBoxDistanceMarkerPic, hole1teeMarker2.xpos, hole1teeMarker2.ypos, hole1teeMarker2.width, hole1teeMarker2.height, null);

        g.drawImage (golfBallPic, (int)golfBall.xpos, (int)golfBall.ypos, golfBall.width, golfBall.height, null);


        /** End of Hole 1 **/

        //dispose the images each time(this allows for the illusion of movement).

        g.dispose();


        bufferStrategy.show();
    }



    public void moveThings() {


        redPointer.pointerBouncing();



        golfBall.move();




    }





    public void collisions () {


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
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

        char key = e.getKeyChar();
        int keyCode = e.getKeyCode();
        System.out.println("Key: " + key + " KeyCode: " + keyCode);

        if (keyCode == 37 ){
            redPointer.leftPressed=false;
        }

        if (keyCode == 38 ){
            redPointer.upPressed=false;
        }

        if (keyCode == 39 ){
            redPointer.rightPressed=false;
        }

        if (keyCode == 40 ){
            redPointer.downPressed=false;
        }

        if (keyCode == 32){
            redPointer.spacePressed=false;
        }

     


    }
}
