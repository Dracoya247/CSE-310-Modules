#include "square.h"
#include <iostream>
#include <tuple>
using namespace std;

Square::Square(char c, bool b){
   cout << "Making square..." << endl;
   setValues(c, b);
   cout << "Square created!" << endl; 
}

void Square::setValues(char c, bool b){
   cout << "Setting values..." << endl;
   values = make_tuple(c, b);
   cout << "Values set!" << endl;
}