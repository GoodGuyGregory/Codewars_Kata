#include <iostream>

/*  Kata:  
    Your task is to create function **isDivideBy** (or is_divide_by) 
    to check if an integer number is divisible by each out of two arguments.

EXAMPLES:  
(-12, 2, -6)  ->  true
(-12, 2, -5)  ->  false

(45, 1, 6)    ->  false
(45, 5, 15)   ->  true

(4, 1, 4)     ->  true
(15, -5, 3)   ->  true

*/

// Solution Here:  

bool isDivideBy(int number, int a, int b)
{
  //your code here
  if ((number % a == 0) && (number % b == 0)) {
    return true;
  } 
  else
  {
    return false;
  } 

}// test Method

int main() {
// Test Series One:
std::cout <<"Series Test: (-12, 2, -6)\n";
std::cout << "Result:" << isDivideBy(-12, 2, -6) << "\n";

std::cout << " Series Test: (-12, 2, -5)\n";
std::cout << "Result:" << isDivideBy(-12, 2, -5) << "\n";

std::cout << " Series Test: (45, 1, 6)\n";
std::cout << "Result:" << isDivideBy(45, 1, 6) << "\n";

std::cout << " Series Test: (45, 5, 15)\n";
std::cout << "Result:" << isDivideBy(45, 5, 15) << "\n";

}
;