/**
  Test MazeSolver class.

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  o  window height?

  For example,
      java UserOfMazeSolver mazes/intersection_treasureNorth.txt 0 1 10 

 */

      public class UserOfMazeSolver {
		

      	public static void main(String[] commandLine) 


      		throws java.io.FileNotFoundException {
		
		 
		// testing the base cases
		//expecting false
				Maze baseCaseMaze = new Maze("mazes/basecase_wall.txt", 0, 0);
				MazeSolver baseCaseTest = new MazeSolver(baseCaseMaze);
				System.out.println(baseCaseTest);
      		
				System.out.println();
	
		//expecting true
				Maze baseCaseTreasure = new Maze("mazes/basecase_treasure.txt", 0, 0);
				MazeSolver baseCaseTest1 = new MazeSolver(baseCaseTreasure);
				System.out.println(baseCaseTest1);
      		
				System.out.println();
				
				
				
		//testing some recursive cases
		//some cases taken from piazza @446
		
		//expecting true
				Maze recursivePathTurn = new Maze("mazes/pathWithTurn.txt", 0, 2);
				MazeSolver recursiveTest = new MazeSolver(recursivePathTurn);
				System.out.println(recursiveTest);
      		
				System.out.println();
		
		//expecting false
				Maze recursiveWallHit = new Maze("mazes/wallHit.txt", 0, 0);
				MazeSolver recursiveTest1 = new MazeSolver(recursiveWallHit);
				System.out.println(recursiveTest1);
      		
				System.out.println();
				

        //command line test
         Maze commandLineMaze = new Maze( commandLine[0]
          , Integer.parseInt( commandLine[1])
          , Integer.parseInt( commandLine[2])
          );

         MazeSolver mazeTest = new MazeSolver(commandLineMaze, Integer.parseInt( commandLine[3]));
         System.out.println(mazeTest);
			}
	  }
      	
      
