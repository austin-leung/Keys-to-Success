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
The stepping stone that the explorer is currently on is the treasure. 


## English/Pseudocode Description of Algorithm:
* Mark stone is visited

* Decision: Is your current stepping stone, the treasure?

* Base Case (if yes): 

   * Do nothing. Stop the method.
   
* Recursive Case:
   * If you need to make a choice (intersection)
   
         * store this location

   * Rotate 90 degrees until the stepping stone in front of is valid. Rotate up to 4 times.
   
         * Move to the stepping stone in front of you
         
   * Go back to the last location you stored (if none of the stones are valid)
   
   * Invoke the Recursive Abstraction


## Class, with Fields and Methods
null, for the moment


## Version *n* Wishlist:
* Find all solutions
* Find shortest solution


