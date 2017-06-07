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
    int foodposx;
    int foodposy;
    boolean foodonGrid=false;
    int width=20;
    int length=20;

    private Snakey(){ //constructor
        frame.setLayout(new GridLayout(width,length)); //set layout
        grid=new JButton[width][length]; //allocate the size of grid
        for(int y=0; y<length; y++) {
            for (int x = 0; x < width; x++) {
                grid[x][y] = new JButton(); //creates new button
                frame.add(grid[x][y]);
                grid[x][y].setEnabled(false);//adds button to grid
            }
        }

        Timer timer = new Timer(1000, e -> food());
        timer.setRepeats(true);
        timer.start();
        frame.setFocusable(true);
        frame.addKeyListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); //sets appropriate size for frame
        frame.setVisible(true); //makes frame visible
        frame.setSize(500, 500);
    }
    protected void food(){
            foodposx = (int) (Math.random() *width );
            foodposy= (int) (Math.random() * length);
            grid[foodposx][foodposy].setEnabled(true);
            grid[foodposx][foodposy].setBackground(Color.ORANGE);
            grid[foodposx][foodposy].setBorderPainted(false);
            grid[foodposx][foodposy].setOpaque(true);
            foodonGrid=true;
    }



    public static void main(String[] args) {
        new Snakey();//makes new ButtonGrid with 2 parameters
    }{
        if(foodonGrid==false){
            food();
    }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Snake.keyPress(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
