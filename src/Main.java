import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Main implements KeyListener {
    static snake Snake = new snake();
    JFrame frame = new JFrame(); //creates frame
    JButton[][] grid; //names the grid of buttons
    int width = 50; // number of horizontal JButtons
    int height = 50; // number of vertical JButtons


    private Main() { //constructor
        frame.setLayout(new GridLayout(width, height)); //set layout
        grid = new JButton[width][height]; //allocate the size of grid
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                grid[x][y] = new JButton(); //creates new button
                frame.add(grid[x][y]);
                grid[x][y].setEnabled(false);//adds button to grid
                grid[x][y].setBackground(Color.lightGray);
                grid[x][y].setBorderPainted(false);
                grid[x][y].setOpaque(true);
            }
        }

        Snake.setWidthandLength(height, width); //sets the width and height for snake class
        Snake.posInitializer(grid); //initializes the pos of snake in the beginning
        frame.setFocusable(true); //focuses on this frame for KeyboardListener
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //breaks when the program is closed
        frame.addKeyListener(this);
        frame.pack(); //sets appropriate size for frame
        frame.setVisible(true); //makes frame visible
        frame.setSize(500, 500); //sets the size of frame
    }

    public static void main(String[] args) {
        Main frame = new Main();
        Snake.adder();
        Timer timer = new Timer(100, e -> Snake.body(frame.grid, 50, 50)); // timer for the game
        timer.setRepeats(true);
        timer.start();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Snake.keyPress(e.getKeyCode());

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

