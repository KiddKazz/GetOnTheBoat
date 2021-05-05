/*
 * Our SuperShip is just a mixture of both our Cargoship and Cruiseship
 * Containing both passengers and a cap for cargo.
 * 
 * We have additional methods being added from out interfaces,
 * serving as rules for our ships
 */
package classAssignmentFeb23;

public class SuperShip extends Ship implements TransportPassengers, TransportCargo{
	int passengers;
	int cap;
	
	public String cargoRules() {
		return "Keep dangerous cargo away from passengers";
	}
	public String passengerRules(){
		return "Stay away from the commercial cargo";
	}
	
	public SuperShip() {
		// TODO Auto-generated constructor stub
		passengers = 0;
		cap = 0;
	}
	
	public int getCap() {
		return cap;
	}
	//Mutators
	public void setCap(int c) {
		if(c>0)
			cap=c;
		else {
			System.out.println("Wrong Value");}
	}
		
	
	public SuperShip(String n, String y, int p, int c) {
		super(n,y);
		
	}

	@Override
	public int getPassengers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPassengers(int p) {
		// TODO Auto-generated method stub
		
	}

}
