#include <iostream>
#include <list>
#include <iterator>
#include <tuple>
#include <string>
#include <vector>
using namespace std;

class Square {
   public:
      tuple <int, bool> values;

      Square(int c = 0, bool b = false){
         values = make_tuple(c, b);
      }
};

class Board {

   public:
      int board_size;
      vector<Square> board;

      Board(int s){
         board_size = s;
         Square sqr = Square();
         board.assign(board_size * board_size, sqr);
      }

      void setValue(int coord, int val){         
         get<0>(board[coord].values) = val;
      }

      void setMines(int start_coord){
         int index = 0;
         for (Square spot : board){
            int isMine = rand() % 7 + 1;
            if (isMine == 7 && index != start_coord){
               setValue(index, -1);
            }
            index++; 
         }
      }

      bool isValid(int origin_coord, int check_coord){

         int org_x = origin_coord / board_size;
         int org_y = origin_coord % board_size;
         int chk_x = check_coord / board_size;
         int chk_y = check_coord % board_size;

         return true;
      }

      void setNumbers(int size){

         for (int i = 0; i < board_size; i++){
            int mine_count = 0;
            // Top left
            int check = i - size - 1;
            if (isValid(i, check)){
               if (get<0>(board[check].values) == -1){
                  mine_count++;
               }
            }
         }
      }

      void display(){
         int count = 1;

         for (Square spot : board){
            tuple <int, bool> val = spot.values;
            if (get<1>(val)){
               cout << 'O' << ' ';
            } else {
               cout << 'X' << ' ';
            };
            //cout << get<0>(val) << ' ';
            if (count % board_size == 0)
               cout << endl;
            count++;
         }
      }

};

bool isNumber(const string& s)
{
    for (char const &ch : s) {
        if (std::isdigit(ch) == 0)
            return false;
    }
    return true;
}

int getSize(){
   string input = "0";
   int size = 0;
   bool notValid = true;

   while (notValid){
      cout << "Please enter a number between 2 and 15:";
      cin >> input;
      if (isNumber(input)){
         size = stoi(input);
         if (int(size) > 1 && int(size) < 16)
            notValid = false;
      }
   }
   
   return int(size);
}

int getCoord(int size){
   int x = -1;
   int y = -1;

   while (x < 0 || x >= size){
      string px;
      cout << "Enter X (0-" << size - 1 << "): ";
      cin >> px;
      if (isNumber(px))
         x = stoi(px);
   }

   while (y < 0 || y >= size){
      string py;
      cout << "Enter Y (0-" << size - 1 << "): ";
      cin >> py;
      if (isNumber(py))
         y = stoi(py);
   }
   
   return (x * size + y);
}

int main(){

   int size = getSize();
   int start_coord;          // Get starting coord
   //setMines(start_coord);                               // << What computer sees
   //setNumbers();                             // << What computer sees
   //list<char> game_board = setGameBoard();   // << What player sees
   //displayBoard();
   
   Board board = Board(size);
   board.display();
   
   cout << "Enter starting coordinates." << endl;
   start_coord = getCoord(size);
   board.setMines(start_coord);
   board.setNumbers(size);
   board.display();
}