/*
 * =====================================================================================
 *
 *       Filename:  decode.cpp
 *
 *    Description:  LAB - FILE IO - Spring, 2021
 *                  Open text files for reading and writing
 *                  Read encrypted text and de-code using
 *                  Caeser cipher
 *                  Write out de-coded passage
 *
 *        Version:  1.0
 *        Created:  03/17/2021 10:19:46 AM
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Steve Ettorre (), 
 *   Organization:  UC - EECS
 *
 *   (From Hands On C++ by Joel C. Adams; used by permission.) 
 *
 * =====================================================================================
 */

#include <iostream>    // stream I/O
#include <fstream>     // stream I/O
#include <string>      // string, isupper(), islower()
#include <cstdlib>     // exit()
#include <cctype>      // isupper(), islower()
#include <cassert>     // assert()
using namespace std;


char CaesarDecode(char ch, const int &key); // prototype


int main() {
cout << "Introductory Message:" << endl;
cout << "This code can be used for decryption of a text coded in caesar cipher. It will use file operations to access the text and decode and write it into an output files" << endl;

// 1. Prompt for and read the name of the input file
cout << "Enter input file name to read:(alice.code) " << endl;
string inFileName;
cin >> inFileName;
// 2. Open an ifstream named instream for input from file: inFileName
ifstream instream;
instream.open(inFileName); 

// 3. If instream failed to open, display an error message and quit
assert(instream.is_open());

// 4. Prompt for and read the name of the output file
cout << "Enter name of the output file:(alice.decode) " << endl;
string outFileName;
cin >> outFileName;

// 5. Open an ofstream named outstream for output to file: outFileName
ofstream outstream;
outstream.open(outFileName); 

// 6. If outstream failed to open, display an error message and quit
assert(outstream.is_open());

// 7. Set up infinite loop (e.g., while(1) or for(;;))
   for(;;) {
// 8a. read a character from the input file via instream into variable of type char
      char inChar;
      instream.get(inChar);
      cout << "inChar= " << inChar << endl; 
// 8b. if end-of-file was reached, terminate loop
      if (instream.eof())
      {
         cout << "[EoF reached for input file]" << endl;
         break;
      }
// 8c. decode the character using the Caesar cipher and output
      char temp=CaesarDecode(inChar, 3);
      cout << "temp= " << temp << endl;
      outstream << temp; // do not change function call
      
   } // close loop...
  
// 9. close the connection to the input and output streams
instream.close();
outstream.close();
// 10. display a 'successful completion' message
cout << "All done!!!" << endl;
return 0;
}


/********************************************************************
 * CaesarDecode implements the Caesar cipher encoding scheme.       
 *                                                                   
 * Receive: ch, a character,                                        
 *          key, an integer.                                        
 * Return:  The character that is key positions before ch,          
 *          with "wrap-around" to the end of the sequence.          
 *
 * DO NOT CHANGE THIS FUNCTION
 ********************************************************************/
char CaesarDecode(char ch, const int &key) {
   auto FIRST_UPPER = 65,
        FIRST_LOWER = 97,
        NUM_CHARS = 26; // have not discussed keyword 'auto'
  
   if (key <= 0 or key >= 26) { // C++ allows use of 'or' for '||'
// cerr -> standard error stream...usually your terminal screen
      cerr << "\n*** CaesarDecode: key must be between 1 and 25!\n" << endl;
      return 1; // stop execution due to error condition
   }

   if (isupper(ch))
      return (ch - FIRST_UPPER + NUM_CHARS - key) % NUM_CHARS + FIRST_UPPER;
   else if (islower(ch))
      return (ch - FIRST_LOWER + NUM_CHARS - key) % NUM_CHARS + FIRST_LOWER;
   else
      return ch;
}