//Justin Himmighoefer
//A game of poker is played.
//The deck is created, shuffled and two hands are delt.
//The hands are compared against each other to determine a winner.
//All checks have not been accounted for thus far, it is possible to end in a tie

import java.util.*;

public class Deck 
{	
	
	
	public static int currentCard=0;
	
	public static void main(String[] args) 
	{
		int handScore1=0;
		int handScore2=0;
		Card[] Deck = new Card[52];
		String[] suit = {"Heart", "Spade", "Diamond", "Club"};
		String[] face = {"Ace", "Two", "Three", "Four", "Five", 
				          "Six", "Seven", "Eight", "Nine", "Ten", 
				          "Jack", "Queen", "King"};
		
		int position = 0;
		for (int s = 0; s < 4; ++s)
			for (int f = 0; f < 13; ++f)
			{
				Deck[position] = new Card(face[f], suit[s]);
				position++;
			}//end interior loop
		System.out.println("Original Deck:");
		printDeckOfCards(Deck);
		System.out.println();
		shuffleDeck(Deck);
		System.out.println("Shuffled Deck:");
		printDeckOfCards(Deck);
		System.out.println();
		System.out.println("First Hand Dealt:");
		Card[] h1=dealHand(Deck);
		printDeckOfCards(h1);
		System.out.println();
		System.out.println("Second Hand Dealt:");
		Card[] h2=dealHand(Deck);
		printDeckOfCards(h2);
		System.out.println();
		
		//Pairs
		if ((h1[0].getFace()==h1[1].getFace())||(h1[1].getFace()==h1[2].getFace())||(h1[2].getFace()==h1[3].getFace())||(h1[3].getFace()==h1[4].getFace())||(h1[0].getFace()==h1[2].getFace())||(h1[0].getFace()==h1[3].getFace())||(h1[0].getFace()==h1[4].getFace())||(h1[1].getFace()==h1[3].getFace()||(h1[1].getFace()==h1[4].getFace())||(h1[2].getFace()==h1[4].getFace())))
		{
			handScore1 = 1;
			if(handScore1==1)
			{
				if ((h1[0].getFace()==h1[1].getFace())&&(h1[2].getFace()==h1[3].getFace())||(h1[0].getFace()==h1[1].getFace())&&(h1[2].getFace()==h1[4].getFace())||(h1[0].getFace()==h1[1].getFace())&&(h1[3].getFace()==h1[4].getFace())||(h1[1].getFace()==h1[2].getFace())&&(h1[0].getFace()==h1[3].getFace())||(h1[1].getFace()==h1[2].getFace())&&(h1[0].getFace()==h1[4].getFace())||(h1[2].getFace()==h1[3].getFace())&&(h1[0].getFace()==h1[4].getFace()))
				{
					handScore1 = 2;
				}//end inner if checking for hand 1 two pairs
			}//end middle if
		}//end outer if checking hand 1 pairs
		
		if ((h2[0].getFace()==h2[1].getFace())||(h2[1].getFace()==h2[2].getFace())||(h2[2].getFace()==h2[3].getFace())||(h2[3].getFace()==h2[4].getFace())||(h2[0].getFace()==h2[2].getFace())||(h2[0].getFace()==h2[3].getFace())||(h2[0].getFace()==h2[4].getFace())||(h2[1].getFace()==h2[3].getFace()||(h2[1].getFace()==h2[4].getFace())||(h2[2].getFace()==h2[4].getFace())))
		{
			handScore2 = 1;
			if(handScore2 == 1)
			{
				if ((h2[0].getFace()==h2[1].getFace())&&(h2[2].getFace()==h2[3].getFace())||(h2[0].getFace()==h2[1].getFace())&&(h2[2].getFace()==h2[4].getFace())||(h2[0].getFace()==h2[1].getFace())&&(h2[3].getFace()==h2[4].getFace())||(h2[1].getFace()==h2[2].getFace())&&(h2[0].getFace()==h2[3].getFace())||(h2[1].getFace()==h2[2].getFace())&&(h2[0].getFace()==h2[4].getFace())||(h2[2].getFace()==h2[3].getFace())&&(h2[0].getFace()==h2[4].getFace()))
				{
					handScore2 = 2;
				}//end inner if checking for hand 2 two pairs
			}//end middle if
		}//end outer if checking for hand 2 pairs
		
		//Three of a Kind
		if ((h1[0].getFace()==h1[1].getFace())&&(h1[0].getFace()==h1[2].getFace())||(h1[1].getFace()==h1[2].getFace())&&(h1[1].getFace()==h1[3].getFace())||(h1[2].getFace()==h1[3].getFace())&&(h1[2].getFace()==h1[4].getFace())||(h1[0].getFace()==h1[1].getFace())&&(h1[0].getFace()==h1[3].getFace())||(h1[0].getFace()==h1[1].getFace())&&(h1[0].getFace()==h1[4].getFace())||(h1[1].getFace()==h1[2].getFace())&&(h1[2].getFace()==h1[4].getFace())||(h1[0].getFace()==h1[2].getFace())&&(h1[0].getFace()==h1[3].getFace())||(h1[0].getFace()==h1[2].getFace())&&(h1[0].getFace()==h1[4].getFace()||(h1[1].getFace()==h1[3].getFace())&&(h1[1].getFace()==h1[4].getFace())))
		{
			handScore1 = 3;
		}
		
		if ((h2[0].getFace()==h2[1].getFace())&&(h2[0].getFace()==h2[2].getFace())||(h2[1].getFace()==h2[2].getFace())&&(h2[1].getFace()==h2[3].getFace())||(h2[2].getFace()==h2[3].getFace())&&(h2[2].getFace()==h2[4].getFace())||(h2[0].getFace()==h2[1].getFace())&&(h2[0].getFace()==h2[3].getFace())||(h2[0].getFace()==h2[1].getFace())&&(h2[0].getFace()==h2[4].getFace())||(h2[1].getFace()==h2[2].getFace())&&(h2[2].getFace()==h2[4].getFace())||(h2[0].getFace()==h2[2].getFace())&&(h2[0].getFace()==h2[3].getFace())||(h2[0].getFace()==h2[2].getFace())&&(h2[0].getFace()==h2[4].getFace()||(h2[1].getFace()==h2[3].getFace())&&(h2[1].getFace()==h2[4].getFace())))
		{
			handScore2 = 3;
		}
		
		//Straight
		if (h1[0].getFace()=="Two"&&h1[1].getFace()=="Three")
		{
			if (h1[2].getFace()=="Four"&&h1[3].getFace()=="Five")
			{
				if (h1[4].getFace()=="Six")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 2-6 P1
		
		if (h1[0].getFace()=="Three"&&h1[1].getFace()=="Four")
		{
			if (h1[2].getFace()=="Five"&&h1[3].getFace()=="Six")
			{
				if (h1[4].getFace()=="Seven")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 3-7 P1
		
		if (h1[0].getFace()=="Four"&&h1[1].getFace()=="Five")
		{
			if (h1[2].getFace()=="Six"&&h1[3].getFace()=="Seven")
			{
				if (h1[4].getFace()=="Eight")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 4-8 P1
		
		if (h1[0].getFace()=="Five"&&h1[1].getFace()=="Six")
		{
			if (h1[2].getFace()=="Seven"&&h1[3].getFace()=="Eight")
			{
				if (h1[4].getFace()=="Nine")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 5-9 P1
		
		if (h1[0].getFace()=="Six"&&h1[1].getFace()=="Seven")
		{
			if (h1[2].getFace()=="Eight"&&h1[3].getFace()=="Nine")
			{
				if (h1[4].getFace()=="Ten")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 6-10 P1
		
		if (h1[0].getFace()=="Seven"&&h1[1].getFace()=="Eight")
		{
			if (h1[2].getFace()=="Nine"&&h1[3].getFace()=="Ten")
			{
				if (h1[4].getFace()=="Jack")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 7-J P1
		
		if (h1[0].getFace()=="Eight"&&h1[1].getFace()=="Nine")
		{
			if (h1[2].getFace()=="Ten"&&h1[3].getFace()=="Jack")
			{
				if (h1[4].getFace()=="Queen")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 8-Q P1
		
		if (h1[0].getFace()=="Nine"&&h1[1].getFace()=="Ten")
		{
			if (h1[2].getFace()=="Jack"&&h1[3].getFace()=="Queen")
			{
				if (h1[4].getFace()=="King")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 9-K P1
		
		if (h1[0].getFace()=="Ten"&&h1[1].getFace()=="Jack")
		{
			if (h1[2].getFace()=="Queen"&&h1[3].getFace()=="King")
			{
				if (h1[4].getFace()=="Ace")
				{
					handScore1 = 4;
				}
			}
		}//end if checking 10-A P1
		
		
		if (h2[0].getFace()=="Two"&&h2[1].getFace()=="Three")
		{
			if (h2[2].getFace()=="Four"&&h2[3].getFace()=="Five")
			{
				if (h2[4].getFace()=="Six")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 2-6 P2
		
		if (h2[0].getFace()=="Three"&&h2[1].getFace()=="Four")
		{
			if (h2[2].getFace()=="Five"&&h2[3].getFace()=="Six")
			{
				if (h2[4].getFace()=="Seven")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 3-7 P2
		
		if (h2[0].getFace()=="Four"&&h2[1].getFace()=="Five")
		{
			if (h2[2].getFace()=="Six"&&h2[3].getFace()=="Seven")
			{
				if (h2[4].getFace()=="Eight")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 4-8 P2
		
		if (h2[0].getFace()=="Five"&&h2[1].getFace()=="Six")
		{
			if (h2[2].getFace()=="Seven"&&h2[3].getFace()=="Eight")
			{
				if (h2[4].getFace()=="Nine")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 5-9 P2
		
		if (h2[0].getFace()=="Six"&&h2[1].getFace()=="Seven")
		{
			if (h2[2].getFace()=="Eight"&&h2[3].getFace()=="Nine")
			{
				if (h2[4].getFace()=="Ten")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 6-10 P2
		
		if (h2[0].getFace()=="Seven"&&h2[1].getFace()=="Eight")
		{
			if (h2[2].getFace()=="Nine"&&h2[3].getFace()=="Ten")
			{
				if (h2[4].getFace()=="Jack")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 7-J P2
		
		if (h2[0].getFace()=="Eight"&&h2[1].getFace()=="Nine")
		{
			if (h2[2].getFace()=="Ten"&&h2[3].getFace()=="Jack")
			{
				if (h2[4].getFace()=="Queen")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 8-Q P2
		
		if (h2[0].getFace()=="Nine"&&h2[1].getFace()=="Ten")
		{
			if (h2[2].getFace()=="Jack"&&h2[3].getFace()=="Queen")
			{
				if (h2[4].getFace()=="King")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 9-K P2
		
		if (h2[0].getFace()=="Ten"&&h2[1].getFace()=="Jack")
		{
			if (h2[2].getFace()=="Queen"&&h2[3].getFace()=="King")
			{
				if (h2[4].getFace()=="Ace")
				{
					handScore2 = 4;
				}
			}
		}//end if checking 10-A P2

		//Flush
		if (h1[0].getSuit()=="Heart"&&h1[1].getSuit()=="Heart")
		{
			if (h1[2].getSuit()=="Heart"&&h1[3].getSuit()=="Heart")
			{
				if (h1[4].getSuit()=="Heart")
				{
					handScore1 = 5;
					if (handScore1==5)
					{
						if (h1[0].getFace()=="Two"&&h1[1].getFace()=="Three")
						{
							if (h1[2].getFace()=="Four"&&h1[3].getFace()=="Five")
							{
								if (h1[4].getFace()=="Six")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 2-6 P1
						
						if (h1[0].getFace()=="Three"&&h1[1].getFace()=="Four")
						{
							if (h1[2].getFace()=="Five"&&h1[3].getFace()=="Six")
							{
								if (h1[4].getFace()=="Seven")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 3-7 P1
						
						if (h1[0].getFace()=="Four"&&h1[1].getFace()=="Five")
						{
							if (h1[2].getFace()=="Six"&&h1[3].getFace()=="Seven")
							{
								if (h1[4].getFace()=="Eight")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 4-8 P1
						
						if (h1[0].getFace()=="Five"&&h1[1].getFace()=="Six")
						{
							if (h1[2].getFace()=="Seven"&&h1[3].getFace()=="Eight")
							{
								if (h1[4].getFace()=="Nine")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 5-9 P1
						
						if (h1[0].getFace()=="Six"&&h1[1].getFace()=="Seven")
						{
							if (h1[2].getFace()=="Eight"&&h1[3].getFace()=="Nine")
							{
								if (h1[4].getFace()=="Ten")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 6-10 P1
						
						if (h1[0].getFace()=="Seven"&&h1[1].getFace()=="Eight")
						{
							if (h1[2].getFace()=="Nine"&&h1[3].getFace()=="Ten")
							{
								if (h1[4].getFace()=="Jack")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 7-J P1
						
						if (h1[0].getFace()=="Eight"&&h1[1].getFace()=="Nine")
						{
							if (h1[2].getFace()=="Ten"&&h1[3].getFace()=="Jack")
							{
								if (h1[4].getFace()=="Queen")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 8-Q P1
						
						if (h1[0].getFace()=="Nine"&&h1[1].getFace()=="Ten")
						{
							if (h1[2].getFace()=="Jack"&&h1[3].getFace()=="Queen")
							{
								if (h1[4].getFace()=="King")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 9-K P1
						
						if (h1[0].getFace()=="Ten"&&h1[1].getFace()=="Jack")
						{
							if (h1[2].getFace()=="Queen"&&h1[3].getFace()=="King")
							{
								if (h1[4].getFace()=="Ace")
								{
									handScore1 = 8;
								}
							}
						}//end if checking 10-A P1 aka Royal Flush
					}//end if checking for Straight Flush
				}
			}
		}//end if checking for heart flush P1
		
		if (h1[0].getSuit()=="Diamond"&&h1[1].getSuit()=="Diamond")
		{
			if (h1[2].getSuit()=="Diamond"&&h1[3].getSuit()=="Diamond")
			{
				if (h1[4].getSuit()=="Diamond")
				{
					handScore1 = 5;
					if (handScore1==5)
					{
						if (h1[0].getFace()=="Two"&&h1[1].getFace()=="Three")
						{
							if (h1[2].getFace()=="Four"&&h1[3].getFace()=="Five")
							{
								if (h1[4].getFace()=="Six")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 2-6 P1
						
						if (h1[0].getFace()=="Three"&&h1[1].getFace()=="Four")
						{
							if (h1[2].getFace()=="Five"&&h1[3].getFace()=="Six")
							{
								if (h1[4].getFace()=="Seven")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 3-7 P1
						
						if (h1[0].getFace()=="Four"&&h1[1].getFace()=="Five")
						{
							if (h1[2].getFace()=="Six"&&h1[3].getFace()=="Seven")
							{
								if (h1[4].getFace()=="Eight")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 4-8 P1
						
						if (h1[0].getFace()=="Five"&&h1[1].getFace()=="Six")
						{
							if (h1[2].getFace()=="Seven"&&h1[3].getFace()=="Eight")
							{
								if (h1[4].getFace()=="Nine")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 5-9 P1
						
						if (h1[0].getFace()=="Six"&&h1[1].getFace()=="Seven")
						{
							if (h1[2].getFace()=="Eight"&&h1[3].getFace()=="Nine")
							{
								if (h1[4].getFace()=="Ten")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 6-10 P1
						
						if (h1[0].getFace()=="Seven"&&h1[1].getFace()=="Eight")
						{
							if (h1[2].getFace()=="Nine"&&h1[3].getFace()=="Ten")
							{
								if (h1[4].getFace()=="Jack")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 7-J P1
						
						if (h1[0].getFace()=="Eight"&&h1[1].getFace()=="Nine")
						{
							if (h1[2].getFace()=="Ten"&&h1[3].getFace()=="Jack")
							{
								if (h1[4].getFace()=="Queen")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 8-Q P1
						
						if (h1[0].getFace()=="Nine"&&h1[1].getFace()=="Ten")
						{
							if (h1[2].getFace()=="Jack"&&h1[3].getFace()=="Queen")
							{
								if (h1[4].getFace()=="King")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 9-K P1
						
						if (h1[0].getFace()=="Ten"&&h1[1].getFace()=="Jack")
						{
							if (h1[2].getFace()=="Queen"&&h1[3].getFace()=="King")
							{
								if (h1[4].getFace()=="Ace")
								{
									handScore1 = 8;
								}
							}
						}//end if checking 10-A P1 aka Royal Flush
					}//end if checking for Straight Flush
				}
			}
		}//end if checking for diamond flush P1
		
		if (h1[0].getSuit()=="Spade"&&h1[1].getSuit()=="Spade")
		{
			if (h1[2].getSuit()=="Spade"&&h1[3].getSuit()=="Spade")
			{
				if (h1[4].getSuit()=="Spade")
				{
					handScore1 = 5;
					if (handScore1==5)
					{
						if (h1[0].getFace()=="Two"&&h1[1].getFace()=="Three")
						{
							if (h1[2].getFace()=="Four"&&h1[3].getFace()=="Five")
							{
								if (h1[4].getFace()=="Six")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 2-6 P1
						
						if (h1[0].getFace()=="Three"&&h1[1].getFace()=="Four")
						{
							if (h1[2].getFace()=="Five"&&h1[3].getFace()=="Six")
							{
								if (h1[4].getFace()=="Seven")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 3-7 P1
						
						if (h1[0].getFace()=="Four"&&h1[1].getFace()=="Five")
						{
							if (h1[2].getFace()=="Six"&&h1[3].getFace()=="Seven")
							{
								if (h1[4].getFace()=="Eight")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 4-8 P1
						
						if (h1[0].getFace()=="Five"&&h1[1].getFace()=="Six")
						{
							if (h1[2].getFace()=="Seven"&&h1[3].getFace()=="Eight")
							{
								if (h1[4].getFace()=="Nine")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 5-9 P1
						
						if (h1[0].getFace()=="Six"&&h1[1].getFace()=="Seven")
						{
							if (h1[2].getFace()=="Eight"&&h1[3].getFace()=="Nine")
							{
								if (h1[4].getFace()=="Ten")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 6-10 P1
						
						if (h1[0].getFace()=="Seven"&&h1[1].getFace()=="Eight")
						{
							if (h1[2].getFace()=="Nine"&&h1[3].getFace()=="Ten")
							{
								if (h1[4].getFace()=="Jack")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 7-J P1
						
						if (h1[0].getFace()=="Eight"&&h1[1].getFace()=="Nine")
						{
							if (h1[2].getFace()=="Ten"&&h1[3].getFace()=="Jack")
							{
								if (h1[4].getFace()=="Queen")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 8-Q P1
						
						if (h1[0].getFace()=="Nine"&&h1[1].getFace()=="Ten")
						{
							if (h1[2].getFace()=="Jack"&&h1[3].getFace()=="Queen")
							{
								if (h1[4].getFace()=="King")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 9-K P1
						
						if (h1[0].getFace()=="Ten"&&h1[1].getFace()=="Jack")
						{
							if (h1[2].getFace()=="Queen"&&h1[3].getFace()=="King")
							{
								if (h1[4].getFace()=="Ace")
								{
									handScore1 = 8;
								}
							}
						}//end if checking 10-A P1 aka Royal Flush
					}//end if checking for Straight Flush
				}
			}
		}//end if checking for spade flush P1
		
		if (h1[0].getSuit()=="Club"&&h1[1].getSuit()=="Club")
		{
			if (h1[2].getSuit()=="Club"&&h1[3].getSuit()=="Club")
			{
				if (h1[4].getSuit()=="Club")
				{
					handScore1 = 5;
					if (handScore1==5)
					{
						if (h1[0].getFace()=="Two"&&h1[1].getFace()=="Three")
						{
							if (h1[2].getFace()=="Four"&&h1[3].getFace()=="Five")
							{
								if (h1[4].getFace()=="Six")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 2-6 P1
						
						if (h1[0].getFace()=="Three"&&h1[1].getFace()=="Four")
						{
							if (h1[2].getFace()=="Five"&&h1[3].getFace()=="Six")
							{
								if (h1[4].getFace()=="Seven")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 3-7 P1
						
						if (h1[0].getFace()=="Four"&&h1[1].getFace()=="Five")
						{
							if (h1[2].getFace()=="Six"&&h1[3].getFace()=="Seven")
							{
								if (h1[4].getFace()=="Eight")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 4-8 P1
						
						if (h1[0].getFace()=="Five"&&h1[1].getFace()=="Six")
						{
							if (h1[2].getFace()=="Seven"&&h1[3].getFace()=="Eight")
							{
								if (h1[4].getFace()=="Nine")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 5-9 P1
						
						if (h1[0].getFace()=="Six"&&h1[1].getFace()=="Seven")
						{
							if (h1[2].getFace()=="Eight"&&h1[3].getFace()=="Nine")
							{
								if (h1[4].getFace()=="Ten")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 6-10 P1
						
						if (h1[0].getFace()=="Seven"&&h1[1].getFace()=="Eight")
						{
							if (h1[2].getFace()=="Nine"&&h1[3].getFace()=="Ten")
							{
								if (h1[4].getFace()=="Jack")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 7-J P1
						
						if (h1[0].getFace()=="Eight"&&h1[1].getFace()=="Nine")
						{
							if (h1[2].getFace()=="Ten"&&h1[3].getFace()=="Jack")
							{
								if (h1[4].getFace()=="Queen")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 8-Q P1
						
						if (h1[0].getFace()=="Nine"&&h1[1].getFace()=="Ten")
						{
							if (h1[2].getFace()=="Jack"&&h1[3].getFace()=="Queen")
							{
								if (h1[4].getFace()=="King")
								{
									handScore1 = 7;
								}
							}
						}//end if checking 9-K P1
						
						if (h1[0].getFace()=="Ten"&&h1[1].getFace()=="Jack")
						{
							if (h1[2].getFace()=="Queen"&&h1[3].getFace()=="King")
							{
								if (h1[4].getFace()=="Ace")
								{
									handScore1 = 8;
								}
							}
						}//end if checking 10-A P1 aka Royal Flush
					}//end if checking for Straight Flush
				}
			}
		}//end if checking for club flush P1
		
		if (h2[0].getSuit()=="Heart"&&h2[1].getSuit()=="Heart")
		{
			if (h2[2].getSuit()=="Heart"&&h2[3].getSuit()=="Heart")
			{
				if (h2[4].getSuit()=="Heart")
				{
					handScore2 = 5;
					if (handScore2==5)
					{
						if (h2[0].getFace()=="Two"&&h2[1].getFace()=="Three")
						{
							if (h2[2].getFace()=="Four"&&h2[3].getFace()=="Five")
							{
								if (h2[4].getFace()=="Six")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 2-6 P2
						
						if (h2[0].getFace()=="Three"&&h2[1].getFace()=="Four")
						{
							if (h2[2].getFace()=="Five"&&h2[3].getFace()=="Six")
							{
								if (h2[4].getFace()=="Seven")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 3-7 P2
						
						if (h2[0].getFace()=="Four"&&h2[1].getFace()=="Five")
						{
							if (h2[2].getFace()=="Six"&&h2[3].getFace()=="Seven")
							{
								if (h2[4].getFace()=="Eight")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 4-8 P2
						
						if (h2[0].getFace()=="Five"&&h2[1].getFace()=="Six")
						{
							if (h2[2].getFace()=="Seven"&&h2[3].getFace()=="Eight")
							{
								if (h2[4].getFace()=="Nine")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 5-9 P2
						
						if (h2[0].getFace()=="Six"&&h2[1].getFace()=="Seven")
						{
							if (h2[2].getFace()=="Eight"&&h2[3].getFace()=="Nine")
							{
								if (h2[4].getFace()=="Ten")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 6-10 P2
						
						if (h2[0].getFace()=="Seven"&&h2[1].getFace()=="Eight")
						{
							if (h2[2].getFace()=="Nine"&&h2[3].getFace()=="Ten")
							{
								if (h2[4].getFace()=="Jack")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 7-J P2
						
						if (h2[0].getFace()=="Eight"&&h2[1].getFace()=="Nine")
						{
							if (h2[2].getFace()=="Ten"&&h2[3].getFace()=="Jack")
							{
								if (h2[4].getFace()=="Queen")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 8-Q P2
						
						if (h2[0].getFace()=="Nine"&&h2[1].getFace()=="Ten")
						{
							if (h2[2].getFace()=="Jack"&&h2[3].getFace()=="Queen")
							{
								if (h2[4].getFace()=="King")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 9-K P2
						
						if (h2[0].getFace()=="Ten"&&h2[1].getFace()=="Jack")
						{
							if (h2[2].getFace()=="Queen"&&h2[3].getFace()=="King")
							{
								if (h2[4].getFace()=="Ace")
								{
									handScore2 = 8;
								}
							}
						}//end if checking 10-A P2 aka Royal Flush
					}//end checking for Straight Flush
				}
			}
		}//end if checking for heart flush P2
		
		if (h2[0].getSuit()=="Diamond"&&h2[1].getSuit()=="Diamond")
		{
			if (h2[2].getSuit()=="Diamond"&&h2[3].getSuit()=="Diamond")
			{
				if (h2[4].getSuit()=="Diamond")
				{
					handScore2 = 5;
					if (handScore2==5)
					{
						if (h2[0].getFace()=="Two"&&h2[1].getFace()=="Three")
						{
							if (h2[2].getFace()=="Four"&&h2[3].getFace()=="Five")
							{
								if (h2[4].getFace()=="Six")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 2-6 P2
						
						if (h2[0].getFace()=="Three"&&h2[1].getFace()=="Four")
						{
							if (h2[2].getFace()=="Five"&&h2[3].getFace()=="Six")
							{
								if (h2[4].getFace()=="Seven")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 3-7 P2
						
						if (h2[0].getFace()=="Four"&&h2[1].getFace()=="Five")
						{
							if (h2[2].getFace()=="Six"&&h2[3].getFace()=="Seven")
							{
								if (h2[4].getFace()=="Eight")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 4-8 P2
						
						if (h2[0].getFace()=="Five"&&h2[1].getFace()=="Six")
						{
							if (h2[2].getFace()=="Seven"&&h2[3].getFace()=="Eight")
							{
								if (h2[4].getFace()=="Nine")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 5-9 P2
						
						if (h2[0].getFace()=="Six"&&h2[1].getFace()=="Seven")
						{
							if (h2[2].getFace()=="Eight"&&h2[3].getFace()=="Nine")
							{
								if (h2[4].getFace()=="Ten")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 6-10 P2
						
						if (h2[0].getFace()=="Seven"&&h2[1].getFace()=="Eight")
						{
							if (h2[2].getFace()=="Nine"&&h2[3].getFace()=="Ten")
							{
								if (h2[4].getFace()=="Jack")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 7-J P2
						
						if (h2[0].getFace()=="Eight"&&h2[1].getFace()=="Nine")
						{
							if (h2[2].getFace()=="Ten"&&h2[3].getFace()=="Jack")
							{
								if (h2[4].getFace()=="Queen")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 8-Q P2
						
						if (h2[0].getFace()=="Nine"&&h2[1].getFace()=="Ten")
						{
							if (h2[2].getFace()=="Jack"&&h2[3].getFace()=="Queen")
							{
								if (h2[4].getFace()=="King")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 9-K P2
						
						if (h2[0].getFace()=="Ten"&&h2[1].getFace()=="Jack")
						{
							if (h2[2].getFace()=="Queen"&&h2[3].getFace()=="King")
							{
								if (h2[4].getFace()=="Ace")
								{
									handScore2 = 8;
								}
							}
						}//end if checking 10-A P2 aka Royal Flush
					}//end checking for Straight Flush
				}
			}
		}//end if checking for diamond flush P2
		
		if (h2[0].getSuit()=="Spade"&&h2[1].getFace()=="Spade")
		{
			if (h2[2].getFace()=="Spade"&&h2[3].getFace()=="Spade")
			{
				if (h2[4].getFace()=="Spade")
				{
					handScore2 = 5;
					if (handScore2==5)
					{
						if (h2[0].getFace()=="Two"&&h2[1].getFace()=="Three")
						{
							if (h2[2].getFace()=="Four"&&h2[3].getFace()=="Five")
							{
								if (h2[4].getFace()=="Six")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 2-6 P2
						
						if (h2[0].getFace()=="Three"&&h2[1].getFace()=="Four")
						{
							if (h2[2].getFace()=="Five"&&h2[3].getFace()=="Six")
							{
								if (h2[4].getFace()=="Seven")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 3-7 P2
						
						if (h2[0].getFace()=="Four"&&h2[1].getFace()=="Five")
						{
							if (h2[2].getFace()=="Six"&&h2[3].getFace()=="Seven")
							{
								if (h2[4].getFace()=="Eight")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 4-8 P2
						
						if (h2[0].getFace()=="Five"&&h2[1].getFace()=="Six")
						{
							if (h2[2].getFace()=="Seven"&&h2[3].getFace()=="Eight")
							{
								if (h2[4].getFace()=="Nine")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 5-9 P2
						
						if (h2[0].getFace()=="Six"&&h2[1].getFace()=="Seven")
						{
							if (h2[2].getFace()=="Eight"&&h2[3].getFace()=="Nine")
							{
								if (h2[4].getFace()=="Ten")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 6-10 P2
						
						if (h2[0].getFace()=="Seven"&&h2[1].getFace()=="Eight")
						{
							if (h2[2].getFace()=="Nine"&&h2[3].getFace()=="Ten")
							{
								if (h2[4].getFace()=="Jack")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 7-J P2
						
						if (h2[0].getFace()=="Eight"&&h2[1].getFace()=="Nine")
						{
							if (h2[2].getFace()=="Ten"&&h2[3].getFace()=="Jack")
							{
								if (h2[4].getFace()=="Queen")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 8-Q P2
						
						if (h2[0].getFace()=="Nine"&&h2[1].getFace()=="Ten")
						{
							if (h2[2].getFace()=="Jack"&&h2[3].getFace()=="Queen")
							{
								if (h2[4].getFace()=="King")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 9-K P2
						
						if (h2[0].getFace()=="Ten"&&h2[1].getFace()=="Jack")
						{
							if (h2[2].getFace()=="Queen"&&h2[3].getFace()=="King")
							{
								if (h2[4].getFace()=="Ace")
								{
									handScore2 = 8;
								}
							}
						}//end if checking 10-A P2 aka Royal Flush
					}//end checking for Straight Flush
				}
			}
		}//end if checking for spade flush P2
		
		if (h2[0].getSuit()=="Club"&&h2[1].getFace()=="Club")
		{
			if (h2[2].getFace()=="Club"&&h2[3].getFace()=="Club")
			{
				if (h2[4].getFace()=="Club")
				{
					handScore2 = 5;
					if (handScore2==5)
					{
						if (h2[0].getFace()=="Two"&&h2[1].getFace()=="Three")
						{
							if (h2[2].getFace()=="Four"&&h2[3].getFace()=="Five")
							{
								if (h2[4].getFace()=="Six")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 2-6 P2
						
						if (h2[0].getFace()=="Three"&&h2[1].getFace()=="Four")
						{
							if (h2[2].getFace()=="Five"&&h2[3].getFace()=="Six")
							{
								if (h2[4].getFace()=="Seven")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 3-7 P2
						
						if (h2[0].getFace()=="Four"&&h2[1].getFace()=="Five")
						{
							if (h2[2].getFace()=="Six"&&h2[3].getFace()=="Seven")
							{
								if (h2[4].getFace()=="Eight")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 4-8 P2
						
						if (h2[0].getFace()=="Five"&&h2[1].getFace()=="Six")
						{
							if (h2[2].getFace()=="Seven"&&h2[3].getFace()=="Eight")
							{
								if (h2[4].getFace()=="Nine")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 5-9 P2
						
						if (h2[0].getFace()=="Six"&&h2[1].getFace()=="Seven")
						{
							if (h2[2].getFace()=="Eight"&&h2[3].getFace()=="Nine")
							{
								if (h2[4].getFace()=="Ten")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 6-10 P2
						
						if (h2[0].getFace()=="Seven"&&h2[1].getFace()=="Eight")
						{
							if (h2[2].getFace()=="Nine"&&h2[3].getFace()=="Ten")
							{
								if (h2[4].getFace()=="Jack")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 7-J P2
						
						if (h2[0].getFace()=="Eight"&&h2[1].getFace()=="Nine")
						{
							if (h2[2].getFace()=="Ten"&&h2[3].getFace()=="Jack")
							{
								if (h2[4].getFace()=="Queen")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 8-Q P2
						
						if (h2[0].getFace()=="Nine"&&h2[1].getFace()=="Ten")
						{
							if (h2[2].getFace()=="Jack"&&h2[3].getFace()=="Queen")
							{
								if (h2[4].getFace()=="King")
								{
									handScore2 = 7;
								}
							}
						}//end if checking 9-K P2
						
						if (h2[0].getFace()=="Ten"&&h2[1].getFace()=="Jack")
						{
							if (h2[2].getFace()=="Queen"&&h2[3].getFace()=="King")
							{
								if (h2[4].getFace()=="Ace")
								{
									handScore2 = 8;
								}
							}
						}//end if checking 10-A P2 aka Royal Flush
					}//end checking for Straight Flush
				}
			}
		}//end if checking for club flush P2
		
		//Four of a Kind
		if ((h1[0].getFace()==h1[1].getFace())&&(h1[0].getFace()==h1[2].getFace()))
		{
			if (h1[0].getFace()==h1[3].getFace())
			{
				handScore1 = 6;
			}
		}
		
		if ((h1[1].getFace()==h1[2].getFace())&&(h1[1].getFace()==h1[3].getFace()))
		{
			if (h1[1].getFace()==h1[4].getFace())
			{
				handScore1 = 6;
			}
		}
		
		if ((h2[0].getFace()==h2[1].getFace())&&(h2[0].getFace()==h2[2].getFace()))
		{
			if (h2[0].getFace()==h2[3].getFace())
			{
				handScore2 = 6;
			}
		}
		
		if ((h2[1].getFace()==h2[2].getFace())&&(h2[2].getFace()==h2[3].getFace()))
		{
			if (h2[1].getFace()==h2[4].getFace())
			{
				handScore2 = 6;
			}
		}
		
		System.out.println("Player 1's hand score is: " + handScore1);
		System.out.println("Player 2's hand score is: " + handScore2);
		if (handScore1>handScore2)
			System.out.println("Congratulations Player 1, you are the winner!");
		if (handScore2>handScore1)
			System.out.println("Congratulations Player 2, you are the winner!");
		if (handScore1==handScore2)
			System.out.println("The game has ended in a tie!");
		
	}//end main
	
	public void checkHand()
	{
		for(int i = 0; i < 5; ++i)
		{
			System.out.println();
			
			String faceValue;
			
			//call the getFace method in Card
			//faceValue = Card.getFace();
			//System.out.println(faceValue);
		}
	}//end checkHand
	
	public static Card[] dealHand(Card[]arrayPassed)
	{
		Card[] handDealt=new Card[5];
		for(int i=0; i<5; ++i)
		{
			if(currentCard<arrayPassed.length)
				handDealt[i]=arrayPassed[currentCard++];
			//or - currentCard++;
			
		}//end for loop
		return handDealt;
	}
	
	public static void printDeckOfCards(Card[] deckPassed)
	{
		for (int i = 0; i < deckPassed.length; ++i)
			deckPassed[i].printInstanceVariables();;
	}
	
	public static void shuffleDeck(Card[] deckPassed)
	{
		Random randNumGen = new Random();
		Card temp;
		int r;
		for (int i = 0; i < deckPassed.length; ++i)
		{
			r = randNumGen.nextInt(deckPassed.length);
			temp = deckPassed[i];
			deckPassed [i] = deckPassed [r];
			deckPassed [r] = temp;
			System.out.println(deckPassed[i]);
		}//end for loop
	}//end method
}//end class
