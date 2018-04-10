## Personnel: 
Lamia Bushra, Austin Leung

## Statement of Problem: 
What is the boolean value of the statement

>there exists a path through a maze, starting at a designated beginning and ending at treasure

?


## Recursive Abstraction: 
When I am asked to return the boolean value of the statement 

>there exists one path through a maze, starting at a designated beginning ending at treasure 

, the recursive abstraction can return the boolean value of the statement 

>there exists one path through a maze, starting at a designated beginning ending at treasure

for an adjacent stepping stone that has not been visited before.


## Base Case:
* Return true only if the current stepping stone is the treasure.

## English/Pseudocode Description of Algorithm:
* Mark stone is visited

* Decision: Is your current stepping stone the treasure?

* Base Case (if true): 

   * If current stepping stone is the treasure, return true.
   
   * Otherwise, return false.
   
* Recursive Case:
   * Keep moving until the next stepping stone is an intersection:
   
         * store this location and then go to the next stepping stone

   * Check the stepping stone in currentFile + 1, currentRank + 1, currentFile - 1, and currentRank - 1 until the stepping stone in front of is valid and is unvisited.
   
         * Move to that stepping stone.
         
   * If none of the stones are valid, go back to the last location you stored
   
   * Invoke the recursive abstraction


## Class, with Fields and Methods
null, for the moment


## Version *n* Wishlist:
* Find all solutions
* Find shortest solution


