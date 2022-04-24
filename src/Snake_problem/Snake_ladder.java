package Snake_problem;

public class Snake_ladder
{
	public static int rollDie() 
	{
		int var0 = (int)(Math.random() * 6.0D + 1.0D);
		System.out.println("The die value is " + var0);
		return var0;
	}

	public static int optionValue() 
	{
		int var0 = (int)(Math.random() * 3.0D + 1.0D);
		return var0;
	}
	public static int playTurn(int var0)
	{
		int var1 = rollDie();
		int var2 = optionValue();
		
		
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
