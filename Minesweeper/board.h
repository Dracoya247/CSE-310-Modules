#pragma once
#include <iostream>
#include <list>
#include <tuple>
#include <iterator>
#ifndef BOARD_H
#define BOARD_H
#include "square.h"
using namespace std;

class Square;

class Board {

   int board_size;
   list<Square> board;

   public:
      Board(int s);
      void display();
}; 

#endif