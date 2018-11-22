import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList<Card>oneroundcard;
	

	public Player(String name,int chips )
	{
	  	this. name=name ;
	  	this. chips=chips ;
	}
	public String getName()
	{
		return name;
		
	}
	 public int makeBet()
	 {
		 if(chips>0)
		 {
			 bet=1;
			 chips=chips-1;
		return bet; 
		}
		 else
		 {
			 return 0;
		 }
		 
	 }
	 public void setOneRoundCard(ArrayList<Card> cards)
	 {
		 oneroundcard=cards;//¤£À´

	 }
	 public boolean hitMe() 
	 {    int value=0;
	   for(int i=0;i<oneroundcard.size();i++)
	   {
		   Card card=oneroundcard.get(i);
		   int rank=card.getRank();
		   if(rank>10)
		   {
			 rank=10;  
	       }
		   else
		   {
			   rank=rank;
		   }
		   value+=rank;
	   }
	   if(value>16)
	   {
		   return false;
	   }
	   else
	   {
		   return true;
	   }
	   
	 }
	 public int getTotalValue() 
	 {
		 int value=0;
		 for(int j=0;j<oneroundcard.size();j++)
		 {
			 Card card=oneroundcard.get(j);
			 int rank=card.getRank();
			 if(rank>10)
			 {
				 rank=10;
			 }
			 value+=rank;
		 }
		 return value;
	 }
	 public int get_current_chips()
	 {
		 return chips;
	 }
	 public void increase_chips (int diff)
	 {
		 chips+=diff;
		  
	 }
	 public void say_hello()
	 {
		 System.out.println("Hello, I am " + name + ".");
		 System.out.println("I have " + chips + " chips.");


	 }

}
