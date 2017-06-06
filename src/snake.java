import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Parsa on 2017-05-18.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Parsa on 2017-05-18.
 */

class snake {
    int size = 2;
    int keyID; // stores the value of keyID


    // variables to track the movement of the snake
    boolean right = true;
    boolean left = false;
    boolean down = false;
    boolean up = false;


    private void direction() { //method for direction
        if (keyID == 38 && down == false){ //up arrow button is pressed
            right = false;
            up = true;
            left = false;
            System.out.println("up is pressed");
        }
        if (keyID == 39 && left == false){ //right arrow button is pressed
            right = true;
            down = false;
            up = false;
            System.out.println("right is pressed");
        }
        if (keyID == 40 && up == false){ //down arrow button is pressed
            down = true;
            left = false;
            right = false;
            System.out.println("down is pressed");
        }
        if (keyID == 37 && right == false){ //left arrow button is pressed
            left = true;
            down = false;
            up = false;
            System.out.println("left is pressed");
        }
    }


    private void colouring(JButton [][]grid, int x, int y){
        grid[x][y].setBackground(Color.ORANGE);
        grid[x][y].setBorderPainted(false);
        grid[x][y].setOpaque(true);
    }

    private int body(JButton [][]grid, int length, int width){
        colouring(grid,9,9);
        colouring(grid, 8,8);
        direction();
        return 0;
    }

    }
    protected void keyPress(int keyID){ //receives and stores the value of keyID in this.keyID
        this.keyID = keyID;
        direction();
    }

}