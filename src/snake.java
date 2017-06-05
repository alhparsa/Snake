import javax.swing.*;
import java.awt.*;

/**
 * Created by Parsa on 2017-05-18.
 */

class snake {
    int size = 2;
    int keyID;



    private int movement() {
        return size;
    }
    protected void food(JButton[][] grid, int width, int length){
        int randomx = (int)(Math.random()*width);
        int randomy = (int)(Math.random()*length);
        grid[randomx][randomy].setEnabled(true);
        grid[randomx][randomy].setBackground(Color.ORANGE);
        grid[randomx][randomy].setBorderPainted(false);
        grid[randomx][randomy].setOpaque(true);
    }
    protected void keyPress(int keyID){
        this.keyID = keyID;
        System.out.println("key Pressed is: "+keyID);
    }

}