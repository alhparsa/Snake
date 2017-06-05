import javax.swing.*;
import java.awt.*;

/**
 * Created by Parsa on 2017-05-18.
 */

public class snake {
    int size = 2;


    private int movement() {
        return size;
    }
    public void food(JButton[][] grid, int width, int length){
        int randomx = (int)(Math.random()*width);
        int randomy = (int)(Math.random()*length);
        grid[randomx][randomy].setEnabled(true);
        grid[randomx][randomy].setBackground(Color.ORANGE);
        grid[randomx][randomy].setBorderPainted(false);
        grid[randomx][randomy].setOpaque(true);


    }

}