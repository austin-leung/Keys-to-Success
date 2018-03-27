## Personnel: 
Lamia Bushra, Austin Leung

## Problem: 
What is the boolean value of the statement

>there exists a path through a maze, starting at a designated beginning and ending at treasure

?


## Recursive Abstraction: 
When I am asked to return the boolean value of the statement 

>there exists one path through a maze, starting at a designated beginning ending at treasure 

, the recursive abstraction can return the boolean value of the statement 

>there exists one path through a maze, starting at a designated beginning ending at treasure

for an adjacent stepping stone that has not been visited before.


## Version *n* Wishlist:
* Find all solutions
* Find shortest solution


## Pseudocode:
* Mark stone is visited

* Decision: Is your current stepping stone, the treasure?

* Base Case (if yes): 

⋅⋅⋅* Do nothing. Stop the method.
   
* Recursive Case:

⋅⋅⋅* Rotate 90 degrees until the stepping stone in front of you is unvisited and is valid. Rotate up to 4 times.
   
⋅⋅⋅* Invoke recursive abstraction
   
⋅⋅⋅* Go to the last stepping stone you were on, facing the same way.
