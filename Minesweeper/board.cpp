#include "board.h"
#include "square.h"
#include <iostream>
#include <list>
#include <iterator>  
using namespace std;

int board_size;
list<Square> board;

Board::Board(int s){
   board_size = s;
   board.resize(board_size * board_size);
   cout << "Board resized!" << endl;
};

void Board::display(){
   int count = 1;
   cout << "Displaying board..." << endl;

   for (Square spot : board){
      tuple <char, bool> val = spot.values;
      cout << get<0>(val);
      if (count % board_size == 0)
         cout << "endl";
      count++;
   }
   cout << "Display complete!" << endl;
};