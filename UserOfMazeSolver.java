/**
  Test MazeSolver class.

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  o  window height

  For example,
      java UserOfMaze mazes/4cell_treasureWest.txt -1 -1 5 # no explorer

 */

      public class UserOfMazeSolver {

        public static void main(String[] commandLine) 



        throws java.io.FileNotFoundException {
         System.out.println();
         
// testing the base cases
         Maze baseCaseMaze0 = new Maze("mazes/basecase_wall.txt", 0, 0);
         MazeSolver baseCaseTestWall = new MazeSolver(baseCaseMaze0);
         System.out.println(baseCaseTestWall);

         Maze baseCaseMaze1 = new Maze("mazes/basecase_treasure.txt", 0, 0);
         MazeSolver baseCaseTestTreasure = new MazeSolver(baseCaseMaze1);
         System.out.println(baseCaseTestTreasure);
       }


      //   tbd code: MazeSolver baseCaseTest = new MazeSolver(baseCaseMaze, Integer.parseInt( commandLine[3]));

     }
