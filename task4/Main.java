import java.util.ArrayList;
import java.util.Scanner;

class Main{
	
	public static void	main(String[] args){
	ArrayList<String> gameOptions = new ArrayList<>();
	gameOptions.add("1: Start game");
	gameOptions.add("2: resume game");
	gameOptions.add("3: Pause game");
	gameOptions.add("4: end game");

	GameMenu t1=new GameMenu(gameOptions);
	
	Main.doAction(t1);

}

	public static void doAction(GameMenu gameList){

gameList.displayMenu();


int doActions = Main.getUserInput("Choose a number from 1-4:");
boolean isIn = true;

while(isIn){
		switch(doActions){
		case 0:
			System.out.println("the game will start");
			isIn = false;
			break;
		case 1:
			System.out.println("the game will resume");
			isIn = false;
			break;
		case 2:
			System.out.println("the game will pause");
			isIn = false;
			//more options method {

			//println("start again")

	//if yes, play again else stop
		//}
			break;
		case 3:
			System.out.println("the game will end");
			isIn=false;
			break;
		default:
			System.out.println("invalid input");
			doActions = Main.getUserInput("Choose another number");



}

		
	}
}

public static int getUserInput(String msg){
	System.out.println(msg);
	Scanner scan = new Scanner(System.in);
	return Integer.parseInt(scan.nextLine())-1;
}



}