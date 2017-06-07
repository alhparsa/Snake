import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Parsa on 2017-05-18.
 */

class snake {
    int width = 50; int length = 50;
    int x = length/2-1;
    int y = width/2-1;
    int size = 2;
    int keyID; // stores the value of keyID


    // variables to track the movement of the snake
    boolean right = true;
    boolean left = false;
    boolean down = false;
    boolean up = false;
    ArrayList<Integer> snakePos= new ArrayList<>();

    int tracker = 3;
    protected void adder() {
        for (int k = 0; k < 2500; k++)
            snakePos.add(2);
    }



    private void direction() { //method for direction
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

    protected void posInitializer(JButton [][]grid){
        colouring(grid,x,y);
        colouring(grid,x-1,y);

    }

    protected void boardInitializer(int length, int width){
        length = length;
        width = width;
    }


    private void colouring(JButton [][]grid, int x, int y){
        grid[x][y].setBackground(Color.ORANGE);
        grid[x][y].setBorderPainted(true);
        grid[x][y].setOpaque(true);
    }

    private void tailFollower(JButton [][]grid){
        int tailLoc=snakePos.indexOf(tracker-size);
        System.out.println(tailLoc%50+"" + ""+(tailLoc/50));
        if (tailLoc%50!= 0 && tailLoc%50 != -1 && tailLoc/50!= 0 && tailLoc/50 != -1)
            grid[tailLoc%50][tailLoc/50].setBackground(Color.lightGray);
        if (tailtrack==0)
            grid[x-1][y].setBackground(Color.lightGray);
        if (tailtrack==1)
            grid[x-3][y].setBackground(Color.lightGray);
    }
    int tailtrack = 0;



    protected void body(JButton [][]grid, int length, int width){
        direction();
        if (right){
            x+=1;
            colouring(grid,x,y);
            tracker+=1;
            tailFollower(grid);
            snakePos.set(y*length+x,tracker);
            tailtrack+=1;
        }
        if (left){
            x-=1;
            colouring(grid,x,y);
            tracker+=1;
            tailFollower(grid);
            snakePos.set(y*length+x,tracker);
            tailtrack+=1;


        }
        if (down){
            y+=1;
            colouring(grid,x,y);
            tracker+=1;
            snakePos.set(y*50+x,tracker);
            tailFollower(grid);
            snakePos.set(y*length+x,tracker);
            tailtrack+=1;


        }
        if (up){
            y-=1;
            colouring(grid,x,y);
            tracker+=1;
            snakePos.set(y*length+x,tracker);
            tailFollower(grid);
            tailtrack+=1;

        }


    }


    protected void keyPress(int keyID){ //receives and stores the value of keyID in this.keyID
        this.keyID = keyID;
        direction();
    }

}