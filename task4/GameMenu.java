import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	Scanner sc= new Scanner(System.in);
	private ArrayList<String> actions = new ArrayList<>();

	GameMenu(ArrayList<String> actions){
		this.actions=actions;

	}	

	public void displayMenu(){
		for(String action : actions){
			System.out.println(action);
		}
		
	}
	public String getAction(){
		displayMenu();
		System.out.println("Type a number to choose an action");
		String choice=sc.nextLine();
		return choice;
	}

}