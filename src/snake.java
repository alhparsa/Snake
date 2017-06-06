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


    protected void movement() { //method for movement
        if (keyID == 38 && down == false){ //up arrow button is pressed
            right = false;
            up = true;
            left = false;
        }
        if (keyID == 39 && left == false){ //right arrow button is pressed
            right = true;
            down = false;
            up = false;
        }
        if (keyID == 40 && up == false){ //down arrow button is pressed
            down = true;
            left = false;
            right = false;
        }
        if (keyID == 37 && right == false){ //left arrow button is pressed
            left = true;
            down = false;
            up = false;
        }
    }

    protected void keyPress(int keyID){ //receives and stores the value of keyID in this.keyID
        this.keyID = keyID;
        System.out.println("key Pressed is: "+keyID);
    }

}