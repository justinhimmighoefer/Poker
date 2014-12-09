//Justin Himmighoefer

public class Card
{
	private String face;
	private String suit;

	public Card ()
	{
		face = "Not yet assigned";
		suit = "Not yet assigned";
	}//end default constructor


	public Card (String facePassed, String suitPassed)
	{
		face = facePassed;
		suit = suitPassed;
	}//end constructor

	public String getFace()
	{
        return face;
	}

	public String getSuit()
	{
        return suit;
	}

	public void setFace(String facePassed)
	{
        face = facePassed;
	}        

	public void setSuit(String suitPassed)
	{
        suit = suitPassed;
	}

	public void printInstanceVariables()
	{
		System.out.println("Suit: " + suit + " - Face: " + face);        
	}
	
}//end class
