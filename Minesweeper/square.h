#pragma once
#include <iostream>
#include <tuple>
using namespace std;
#ifndef SQUARE_H
#define SQUARE_H

class Square {
  
   public:
      tuple <char, bool> values;      
      Square(char c = '0', bool b = false);
      void setValues(char c, bool b);
};

#endif