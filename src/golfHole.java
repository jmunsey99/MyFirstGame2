import java.awt.*;

public class golfHole {




        public int xpos;
        public int ypos;
        public int width;
        public int height;
        public boolean alive;
        public int holeHeight;
        public int holeWidth;
        public int holeXpos;
        public int holeYpos;
        public boolean wPressed;
    public Rectangle rec;

    public golfHole (int pXpos, int pYpos, int pWidth, int pHeight){
            xpos = pXpos;
            ypos = pYpos;
            width = pWidth;
            height = pHeight;
            alive = true;
            holeHeight = height-10;
            holeWidth = width- 50;
            holeXpos = xpos+height-40;
            holeYpos = ypos+width-55;

            rec = new Rectangle(holeXpos, holeYpos, holeWidth, holeHeight);





        }


    }

