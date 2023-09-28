import jutil.util.Scanner;

class Main{
	public static void main(String[] args){
        System.out.println("Please type your name");

    Scanner sc = new Scanner(System.in);


    String name =  sc.nextLine();
    System.out.println("Name: "+name);

    System.out.println("Please type your age");
    int age =  sc.nextInt();
    System.out.println("Age: "+age);


    //int retirementAge =  sc.nextInt();
    int retirement = 67;
    System.out.println("You can retire in: "+(retirement-age) + " years");





    }



}