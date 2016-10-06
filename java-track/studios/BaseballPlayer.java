

public class BaseballPlayer
{
	/*HAS:
	 * name
	 * jersey number
	 * bats: left,right,switch
	 * 
	 * object should be able to react when a player
	 *  completes a game, recording how many hits
	 *   and RBIs the player earned in that game
	 *   
	 * player has a certain number of runs and RBIs
	 *  he or she has recorded over all games played
	 *  
	 *  player has a certain number of games he or she has played
	*/
	
	//declare variables
	private static String name = "";
	private static int jerseyNo = 0;
	private static String bats = "";
	
	int[] gameRuns;
	int[] gameRbis;
	
	private static int runs;
	private static int rbi;
	private static int games;
	
	static int runsTotal;
	static int rbiTotal;
	static int gamesTotal;
	
	//Constructor
	public BaseballPlayer(String name, int jerseyNo, String bats, int runs, int rbi,
			 int games, int runsTotal, int rbiTotal, int gamesTotal)
	{
		this.name = name;
		this.jerseyNo = jerseyNo;
		this.bats = bats;
		this.runs = runs;
		this.rbi = rbi;
		this.games = games;
		this.runsTotal = runsTotal;
		this.rbiTotal = rbiTotal;
		this.gamesTotal = gamesTotal;
	}
	
	
	public static int getRuns() {
		return runs;
	}


	public static void setRuns(int runs) {
		BaseballPlayer.runs = runs;
	}


	public static int getRbi() {
		return rbi;
	}


	public static void setRbi(int rbi) {
		BaseballPlayer.rbi = rbi;
	}


	public static int getGames() {
		return games;
	}


	public static void setGames(int games) {
		BaseballPlayer.games = games;
	}


	public static void inGame()
	{
		for(int i=0; i<games; i++)
		{
			gamesTotal++;
		}
		for(int i=0; i<runs; i++)
		{
			runsTotal++;
		}
		for(int i=0; i<rbi; i++)
		{
			rbiTotal++;
		}
	}
	
	public void gameStats()
	{
		for(int i=0; i<runs; i++)
		{
			runsTotal++;
		}
		for(int i=0; i<rbi; i++)
		{
			rbiTotal++;
		}
	}
	
	
	
	public static void main(String[] args)
	{	
		name = "Smith";
		jerseyNo = 5;
		bats = "left";
		
		runs = 2;
		rbi = 3;
		
		games = 1;
		
		inGame();
		
		System.out.println("#" + jerseyNo + " " + name );
		System.out.println("Bats: " + bats);
		System.out.println("Games played: " + gamesTotal);
		System.out.println("Runs: " + runsTotal);
		System.out.println("RBI: " + rbiTotal);
		
		
	}

}
