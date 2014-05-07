
public class Probability {
	
	
	static int[] PlayerScores= new int  [] {0,501,501,501,501};
	static int[] Throws = new int[3];
	static int totalThrow;
	int FinalScore=0;
	

	public static void ThrowTest1(){ //throw 1 allowing for the potential modifiers
		TextIO.putln("Enter Target number");
	
	Throws[0]= TextIO.getlnInt();

	
	TextIO.putln("Enter modifier");
	TextIO.putln("1= Single, 2= Double and 3= Triple");
	
	
	
	

	{ int modifier = TextIO.getInt(); 
	if (modifier==1 )

	{
		Throws[0]=(Throws[0]*1);
		TextIO.putln(Throws[0]);
		
		ThrowTest2();}
	
	if  (modifier==2)	
	{
		Throws[0]=(Throws[0]*2);
		TextIO.putln(Throws[0]);
		
		ThrowTest2();}
	
	
	if  (modifier==3)	
	{
		Throws[0]=(Throws[0]*3);
		TextIO.putln(Throws[0]);
		
		ThrowTest2();}
	}
	
	

	
	
	} // end of throw 1
	
	public static void ThrowTest2(){
		TextIO.putln("Enter Target number");
	
	Throws[1]= TextIO.getlnInt();
	TextIO.putln("Enter modifier");
	TextIO.putln("1= Single, 2= Double and 3= Triple");
	

	
	
	
	

	{ int modifier = TextIO.getInt(); 
	if (modifier==1 )
	{
		Throws[1]=(Throws[1]*1);
		TextIO.putln(Throws[1]);
		
		ThrowTest3();}
	
	if  (modifier==2)	{
		Throws[1]=(Throws[1]*2);
		TextIO.putln(Throws[1]);
		
		ThrowTest3();}
	
	
	if  (modifier==3)	{
		Throws[1]=(Throws[1]*3);
		TextIO.putln(Throws[1]);
		
		ThrowTest3();}
	}
	}
	 

	 //end of throw 2
	
	public static void ThrowTest3(){
		TextIO.putln("Enter Target number");
	
	Throws[2]= TextIO.getlnInt();

	
	TextIO.putln("Enter modifier");
	TextIO.putln("1= Single, 2= Double and 3= Triple");
	
	
	{ int modifier = TextIO.getInt(); 
	if (modifier==1 )
	{
		Throws[2]=(Throws[2]*1);
		TextIO.putln(Throws[2]);
		
		TotalScore();}
	
	if  (modifier==2)	{
		Throws[2]=(Throws[2]*2);
		TextIO.putln(Throws[2]);
		
		TotalScore();}
	
	
	if  (modifier==3)	{
		Throws[2]=(Throws[2]*3);
		TextIO.putln(Throws[2]);
		
		TotalScore();}
	}
	}
	
	
	
	
	
	
		

		public static void  TotalScore()
		
		{
		int Pnum;
		{
			totalThrow=(Throws[0]+Throws[1]+Throws[2]);
		    TextIO.putln(Throws[0]+Throws[1]+Throws[2]);
		    
		    TextIO.putln("Enter 1 for P1, 2 for P2, 3 for P3 or 4 for P4");
		    Pnum=TextIO.getlnInt();
		    
		    if (Pnum==1)
		    {Player1Score();}
		    if (Pnum==2)
		    {Player2Score();}
		    if (Pnum==3)
		    {Player3Score();}
		    if (Pnum==4)
		    {Player4Score();}
		    
		    
		    	}
		} // this sets the remaining scores for all players, by each player selecting their own position
		public static void Player1Score(){
			
			PlayerScores[1]= PlayerScores[1] - totalThrow;
			
			
			TextIO.putln("Player1's remaining score is "+ PlayerScores[1]);
			ThrowTest1();
			
}
public static void Player2Score(){
	

			
			PlayerScores[2]= PlayerScores[2] - totalThrow;
			
			
			TextIO.putln("Player2's remaining score is "+ PlayerScores[2]);
			ThrowTest1();
		}
public static void Player3Score(){
	

	
	PlayerScores[3]= PlayerScores[3] - totalThrow;
	
	
	TextIO.putln("Player2's remaining score is "+ PlayerScores[3]);
	ThrowTest1();// allows players to repeat till they reach 0 - not planned how to sort for that aspect yet.

}
public static void Player4Score(){
	

	
	PlayerScores[4]= PlayerScores[4] - totalThrow;
	
	
	TextIO.putln("Player4's remaining score is "+ PlayerScores[4]);
	ThrowTest1();


}
}
	



		
			
	
	
			
			
			
			
			
	

		
	        
	        
	           
	               

	            
	           
	
	

	
	
	


