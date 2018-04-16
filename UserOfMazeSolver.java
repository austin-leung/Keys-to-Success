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
		
	private static Displayer displayer;

      	public static void main(String[] commandLine) 

	
	      
      		throws java.io.FileNotFoundException {
		
				Maze maze = new Maze( commandLine[0]
				, Integer.parseInt( commandLine[1])
				, Integer.parseInt( commandLine[2])
				);
				System.out.println( maze + System.lineSeparator());
					
				/**
				Display changes to a maze.
				Run by using the height of your shell window as a final argument, like...
				java UserOfMaze mazes/4cell_treasureWest.txt 0 3 25
				*/
				
				private static void displayerTest( Maze m) {
					int step = 0;

					displayer.atTopOfWindow( m + "step " + step++);

					// move past west edge, Displaying as we go
					while( step < 5) {
						m.go( Maze.WEST);
						displayer.atTopOfWindow( m + "step " + step++);
					}
				}	
		 
		 
		// testing the base cases
		//expecting false
		//		Maze baseCaseMaze = new Maze("mazes/basecase_wall.txt", 0, 0);
		//		MazeSolver baseCaseTest = new MazeSolver(baseCaseMaze);
		//		System.out.println(baseCaseTest);
      		
		//		System.out.println();
	
		//expecting true
		//		Maze baseCaseTreasure = new Maze("mazes/basecase_treasure.txt", 0, 0);
		//		MazeSolver baseCaseTest1 = new MazeSolver(baseCaseTreasure);
		//		System.out.println(baseCaseTest1);
      		
		//		System.out.println();
				
				
				
		//testing some recursive cases
		//some cases taken from piazza @446
		
		//expecting true
		//		Maze recursivePathTurn = new Maze("mazes/pathWithTurn.txt", 0, 2);
		//		MazeSolver recursiveTest = new MazeSolver(recursivePathTurn);
		//		System.out.println(recursiveTest);
      		
		//		System.out.println();
		
		//expecting false
		//		Maze recursiveWallHit = new Maze("mazes/wallHit.txt", 0, 0);
		//		MazeSolver recursiveTest1 = new MazeSolver(recursiveWallHit);
		//		System.out.println(recursiveTest1);
      		
		//		System.out.println();
				
			}
	  }
      	
      
