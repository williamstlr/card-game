import java.util.ArrayList;

//class to represent a player



public class Player {
	private String name;			//How do I get this figured out? Also 2 lines down. Same question.
	private int Score;
	private int position;
	Hand hand = new Hand();
	
	
	public Player(String name, int position, int score) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.position = position;
		this.Score = score;
		
	}

	public int getscore()
		{
			return Score;
		}
//****************************************************************
	public void setScore(int s)
	{
		this.Score = s;
	}
//********************************************************************
	public void setHand (Hand h)
	{
		this.hand = h;
	}
//*************************************************************************
	public Hand getHand()
	{
		return hand;
	}
}



   