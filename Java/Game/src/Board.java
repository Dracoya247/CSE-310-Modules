/*
5/24/22
Describes a empty game board / room.
*/
package Game.src;

public class Board {
    public String[][] board = new String[20][20];
    
    private int height = board.length;
    private int width = board[0].length;
    private int length = height * width;

    public int getHeight(){ return height; }
    public int getWidth() { return width;  }
    public int getLength(){ return length; }

    public void setBoard(){
      for (int r = 0; r < height; r++){
        for (int c = 0; c < width; c++){
          board[r][c] = ".";
        }
      }
    }

    public void setTile(int[] coord, String letter){
        board[coord[0]][coord[1]] = letter;
    }
    
    public void display(){
        for (String[] i : board){
            for (String j : i){
              System.out.print(j + " ");
            }
            System.out.println();
          }
    }
}
