import java.awt.*;

public class bunker  {


    public int xpos;
    public int ypos;
    public int width;
    public int height;
    public boolean alive;
    public Rectangle rec;
    public int bunkerXpos;
    public int bunkerYpos;
    public int bunkerWidth;
    public int bunkerHeight;

    public bunker (int pXpos, int pYpos, int pWidth, int pHeight){
        xpos = pXpos;
        ypos = pYpos;
        width = pWidth;
        height = pHeight;
        alive = true;
        bunkerHeight = height-10;
        bunkerWidth = width- 50;
        bunkerXpos = xpos+height-40;
        bunkerYpos = ypos+width-55;


        rec = new Rectangle(bunkerXpos, bunkerYpos, bunkerWidth, bunkerHeight);





    }


}

