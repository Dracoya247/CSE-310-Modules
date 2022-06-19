/*
5/24/22
Describes the player character.
*/
package Game.src;


public class Player {
    private String letter = "M";
    private int[] coord = {0, 0};
    protected boolean justMoved = false;

    public int[] getCoord()  { return coord; }
    public String getLetter(){ return letter; }
    
    public void setCoord(int[] newCoord)    { coord[0] = newCoord[0]; coord[1] = newCoord[1]; }
    public void setCoord(int x, int y)      { coord[0] = x; coord[1] = y; }
    public void setJustMoved(boolean moved) { justMoved = moved; }

    // Changes the player's coords.
    public void move(int direction){
        justMoved = true;
        switch (direction){
            // W
            case 0:
                coord[0] -= 1;
                break;
            // A
            case 1:
                coord[1] -= 1;
                break;
            // S
            case 2:
                coord[0] += 1;
                break;
            // D
            case 3:
                coord[1] += 1;
                break;
        }
    };
}
