import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Snakey implements KeyListener{
    snake Snake = new snake();
    JFrame frame=new JFrame(); //creates frame
    JButton[][] grid; //names the grid of buttons

    private Snakey(int width, int length){ //constructor
        frame.setLayout(new GridLayout(width,length)); //set layout
        grid=new JButton[width][length]; //allocate the size of grid
        for(int y=0; y<length; y++){
            for(int x=0; x<width; x++){
                grid[x][y]=new JButton(); //creates new button
                frame.add(grid[x][y]);
                grid [x][y].setEnabled(false);//adds button to grid
            }
        }

        snake food = new snake();

        Timer timer = new Timer(1000, e -> food.food(grid, width,length));
        timer.setRepeats(true);
        timer.start();
        frame.setFocusable(true);
        frame.addKeyListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); //sets appropriate size for frame
        frame.setVisible(true); //makes frame visible
        frame.setSize(500, 500);
    }
    public static void main(String[] args) {
        new Snakey(20,20);//makes new ButtonGrid with 2 parameters
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Snake.keyPress(e.getKeyCode());
        System.out.println("transferred");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
