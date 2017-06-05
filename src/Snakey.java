import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Snakey {

    static JFrame frame=new JFrame(); //creates frame
    static JButton[][] grid; //names the grid of buttons

    public static void main(String[] args) {
        int width=20;
        int length=20;
        frame.setLayout(new GridLayout(width,length)); //set layout
        grid=new JButton[width][length]; //allocate the size of gri
        for(int y=0; y<length; y++){
            for(int x=0; x<width; x++){
                grid[x][y]=new JButton(); //creates new button
                frame.add(grid[x][y]);
                grid [x][y].setEnabled(false);//adds button to grid
            }
        }

        snake food = new snake();

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e){
                food.food(grid, width,length);
            }
        });
        timer.setRepeats(true);
        timer.start();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); //sets appropriate size for frame
        frame.setVisible(true); //makes frame visible
        frame.setSize(500, 500);


        //grid is created

    }
}