package Snake_problem;

public class Snake_ladder
{
	
	public static int playTurn(int var0)
	{
	
		System.out.println("Player position: " + var0);
		return var0;
	}
	public static void playGame()
	{
		for(int var0 = 0; var0 < 100; var0 = playTurn(var0))
		{
			System.out.println("-------------------------------");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame();

	}

}
