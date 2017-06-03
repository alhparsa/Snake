import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout; //imports GridLayout library

public class main {

    JFrame frame=new JFrame(); //creates frame
    JButton[][] grid; //names the grid of buttons

    public main(int width, int length){ //constructor
        frame.setLayout(new GridLayout(width,length)); //set layout
        grid=new JButton[width][length]; //allocate the size of grid
        for(int y=0; y<length; y++){
            for(int x=0; x<width; x++){
                grid[x][y]=new JButton(); //creates new button
                frame.add(grid[x][y]);
                grid [x][y].setEnabled(false);//adds button to grid
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); //sets appropriate size for frame
        frame.setVisible(true); //makes frame visible
        frame.setSize(500, 500);
    }
    public static void main(String[] args) {
        new main(20,20);//makes new ButtonGrid with 2 parameters
    }
}