import java.util.ArrayList;
class Main{
	
	public static void main(String[] args){


		//Yusef siger:
		/*

I stedet, lav 3 teams hvor hvert team indeholder 3 personnavne

		*/

		Team t1= new Team("Arizona Cardinals");
		Team t2= new Team("Atlanta Falcons");
		Team t3= new Team("Carolina Panthers");
		
		t1.setRank(10);
		t2.setRank(20);
		t3.setRank(30);
		
		t1.getPlayers().add("Yusef");
		t1.getPlayers().add("Dennis");
		t1.getPlayers().add("Laith");

		t2.getPlayers().add("Joe");
		//TODO: Skriv resten

		System.out.println(t1);
		System.out.println(t2);

	}
}