/**
  Test MazeSolver class.

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  o  window height?

  For example,
      java UserOfMaze mazes/4cell_treasureWest.txt -1 -1 # no explorer

 */

      public class UserOfMazeSolver {

      	public static void main(String[] commandLine) 


      		throws java.io.FileNotFoundException {
      			System.out.println();
          
// testing the base case
            Maze baseCaseMaze = new Maze("/mazes/basecase_wall.txt", 0, 0);
            MazeSolver baseCaseTest = new MazeSolver(basecaseMaze);
            System.out.println(baseCaseTest);
      		}
      	
      }
