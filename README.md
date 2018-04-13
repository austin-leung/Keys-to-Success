## Personnel: 
Lamia Bushra, Austin Leung

## Statement of Problem: 
What is the boolean value of the statement

>there exists at least one path through a maze, starting at a designated beginning and ending at treasure

?


## Recursive Abstraction: 
When I am asked to return the boolean value of the statement 

>there exists at least one path through a maze, starting at a designated beginning ending at treasure 

, the recursive abstraction can return the boolean value of the statement 

>there exists at least one path through a maze, starting at a designated beginning ending at treasure

starting at an adjacent stepping stone that has not been visited before.


## Base Case:
Return true if the current stepping stone is the treasure or the explorer is in the wall.


## English/Pseudocode Description of Algorithm:

* Decision: Is your current stepping stone the treasure?

* Base Case: 

   * If current stepping stone is the treasure, return true.
   
   * Else (current stepping stone is the wall), return false.
   
* Recursive Case:
         
   * Take a snapshot of current stepping stone.

   * Check the stepping stone in currentFile + 1, currentRank + 1, currentFile - 1, and currentRank - 1 until the stepping stone in front of it is unvisited.
   
         * Move to that stepping stone.
         
   * If, from this stepping stone, there are no more unvisited stepping stones, go back to the last location you stored.
   
   * Invoke the recursive abstraction.


## Class, with Fields and Methods

*Maze:* 
Represent a field with an explorer on it
   * Fields
      * maze
      * treasure
      * Parts of the maze (wall, stepping_stone)
      * Directions (east, north, south, west)
   
   * Methods
      * toString(): Return a depiction of the maze
      * go(int direction): Move the explorer a step in the indicated direction
      * dropA(int mazeElement): Modify the maze such that indicated mazeElement is in the explorer's position
      * explorerIsOnA(): Return the mazeElement the explorer is on.
   
*Displayer:*
Display a string at the top of the window

   * Fields
      * windowHeight

   * Methods
      * atTopOfWindow(String pic): Display the pic at the top of the window
      * lineSeparatorsIn(String string): Return the number of line separators in string
      * copyConstructTest(Maze old): Copy and construct a new maze and check it's independence from the original maze
      * displayerTest(Maze m): Show changes made to a maze 

*UserOfMaze:*
Test Maze Class
   * Methods
      * moveTest(Maze maze): Move around the maze and check the results
      * dropTest(Maze maze): Drop maze elements and check the results

*MazeSolver*
Find the boolean value of the statement
      there exists at least one path through a maze, starting at a designated beginning and ending at treasure
?

   * Fields
      * newMaze: a new instance of Maze
      * pathExists: a boolean that will answer the recursive abstraction
      * directionArray: an array to hold the possible directions the explorer can take

   * Methods
      * toString
      * mazeSolution(): solves the maze and returns the boolean value of the statement: "There exists at least one path through a maze, starting at a designated beginning and ending at treasure."

*UserOfMazeSolver*
Test MazeSolver Class
   
## Version *n* Wishlist:
* Find all solutions
* Find shortest solution

## Known Bugs:
* Unable to specify windowHeight in a method in order to display the maze. When using displayer in code, recieved an error message stating that there was an exception.


