/**
Find the boolean value of the statement

there exists at least one path through a maze, starting at a designated beginning and ending at treasure

?
**/

public class MazeSolver {

    //fields
    // new instances of Maze and Displayer
	public Maze newMaze;
	public Displayer newDisplayer;

	public boolean pathExists;

    //methods
	public MazeSolver (Maze mazeGiven, int windowHeight) {

		newMaze = mazeGiven;

        //specify the window height and use Displayer to print out the maze. 
		newDisplayer = new Displayer(windowHeight);
		newDisplayer.atTopOfWindow("Maze visualization:" + newMaze);

		//helper method
		pathExists = mazeSolution();
	}

	public String toString() {
		if (pathExists) {
			return "At least one path exists, solving the maze! :)";
		}
		else {
			return "No path exists to solve the maze... :(";
		}
	}

	private boolean mazeSolution() {

		//pseudocode here
		return true; //temporarily here so code compiles
	}

}
