
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Newman_853963
 */
public class Tile extends JLabel{
    
    // Instance Variables
    private int numBombs;
    private int gridX;      // keeps track of the column in the grid
    private int gridY;      // keeps track of the row in the grid
    private boolean flag;
    private boolean revealed;
    
    /* numBombs will represent the state of the tile ine the game
     * Restrictions:
        value must be from 0 - 9 
     * 0 - blank space, uses "blank.gif" icon
       1 - 1 adjacent bombs, uses "1" image in blue
       2 - 2 adjacent bombs, uses "2" image in green
       3 - 3 adjacent bombs, uses "3" image in red
       4 - 4 adjacent bombs, uses "4" image in navy
       5 - 5 adjacent bombs, uses "5" image in maroon
       6 - 6 adjacent bombs, uses "6" image in teal
       7 - 7 adjacent bombs, uses "7" image in black
       8 - 8 adjacent bombs, uses "8" image in gray
       9 - snake (bomb) , uses "snake.gif" image       
     */

    public Tile(int gridY, int gridX) {
        this.gridX = gridX;
        this.gridY = gridY;
        this.numBombs = 0;
        this.flag = false;
        this.revealed = false;
    }

    public int getGridX() {
        return gridX;
    }

    public int getGridY() {
        return gridY;
    }

    
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }
    
    

    
    

    /*public Tile() {
        numBombs = 0;
    }*/

    public int getNumBombs() {
        return numBombs;
    }

    public void setNumBombs(int numBombs) {
        this.numBombs = numBombs;
    }
    
    
    
    
    
}
