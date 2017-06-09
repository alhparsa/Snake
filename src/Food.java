import javax.swing.*;
import java.awt.*;

/**
 * Created by Parsa on 2017-06-08.
 */
public class Food {
    int foodposx;
    int foodposy;
    boolean foodonGrid = false;
    int width = 50;
    int length = 50;

    protected void food(JButton[][] grid) {
        foodposx = (int) (Math.random() * width);
        foodposy = (int) (Math.random() * length);
        grid[foodposx][foodposy].setBackground(Color.red);
        grid[foodposx][foodposy].setBorderPainted(false);
        grid[foodposx][foodposy].setOpaque(true);
        foodonGrid = true;
    }

}
