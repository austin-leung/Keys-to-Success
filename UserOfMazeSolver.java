/**
  Test MazeSolver class.

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  o  window height?

  For example,
      java UserOfMaze mazes/4cell_treasureWest.txt -1 -1  ??? # no explorer

      NOTE: I'm not sure how to express window height
 */

      public class UserOfMazeSolver {

      	public static void main(String[] commandLine) 


      		throws java.io.FileNotFoundException {
      			System.out.println();

      			Maze maze = new Maze( commandLine[0]
      				, Integer.parseInt( commandLine[1])
      				, Integer.parseInt( commandLine[2])
      				);

      			MazeSolver mazeSolver = new MazeSolver (maze, Integer.parseInt( commandLine[3]) );
//probably need incremental tests in between
      			System.out.println(mazeSolver); //should print true or false
          
// testing the base case
            Maze baseCaseMaze = new Maze("/mazes/basecase_wall.txt", 0, 0);
            MazeSolver baseCaseTest = new MazeSolver(basecaseMaze);
            System.out.println(baseCaseTest);
      		}
      	
      }
