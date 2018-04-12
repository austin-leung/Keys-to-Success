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
          
// testing the base cases
            Maze baseCaseMaze = new Maze("mazes/basecase_wall.txt", 0, 0);
            MazeSolver baseCaseTest = new MazeSolver(baseCaseMaze);
            System.out.println(baseCaseTest);
      		}
        
            Maze baseCaseTreasure = new Maze("mazes/basecase_treasure.txt", 0, 0);
            MazeSolver baseCaseTest1 = new MazeSolver(baseCaseTreasure);
            System.out.println(baseCaseTest1);
      		}

      //   tbd code: MazeSolver baseCaseTest = new MazeSolver(baseCaseMaze, Integer.parseInt( commandLine[3]));
      	
      }
