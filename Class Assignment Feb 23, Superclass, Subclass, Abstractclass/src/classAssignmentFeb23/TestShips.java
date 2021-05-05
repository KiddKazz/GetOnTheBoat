package classAssignmentFeb23;

public class TestShips {
	
	public static void main(String[] args) {
	//Storing our ships into an array for processing purposes.
	Ship[] myShips=new Ship[3];
	myShips[0]=new Cargoship("Shell Oil","1990",50000);
	myShips[1]=new Ship("my first boat","1985");
	myShips[2]=new Cruiseship("Pacific Dream","2015",500);
	
	//Enhanced for loop example
	for(Ship sh:myShips) {
		System.out.println(sh);
	}
	
	}
}
