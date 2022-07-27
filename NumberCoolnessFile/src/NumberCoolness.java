//*******************************************************************
//
//   File: NumberCoolness.java          
//
//   Author: maximilian
//
//   Class: NumberCoolness
// 
//   
//   --------------------
//      This program prints a pyramidal number pattern with arithmetic in for loops and strings.
//      
//
//*******************************************************************
public class NumberCoolness 
{
    // main
    public static void main(String[] args){
        printNumberCoolness(3);
        printNumberCoolness(9);
    }
    
    // prints Spaces
    public static void printSpaces(int nSpaces){
        for (int i = 1; i <= nSpaces; i++){
            System.out.print(" ");
        }
    }

    // prints Number Coolness Equation
    public static void printNumberCoolness(int rows){
        // declares "origin" variable for unlocking first integer of the equation
        //calculates number coolness equation by row
        for (int row = 1, origin = 0; row <= rows; row++){
        printSpaces(rows-row);
        System.out.println((origin * 10 + row) + " x 8 + " + row + " = " + ((origin * 10 + row) * 8 + row) + "\n");
        origin = origin * 10 + row;
        }
    } 
}//end of NumberCoolness class

