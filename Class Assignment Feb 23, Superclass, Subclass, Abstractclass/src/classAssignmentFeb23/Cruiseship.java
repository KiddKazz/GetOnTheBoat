/*
 * Second subclass this time implementing the TransportPassengers interface
 * Similar to our Cargoship class, instead of adding a max cap for cargo,
 * we have a maximum capacity for the amount of passengers allowed on board.
 */
package classAssignmentFeb23;

public class Cruiseship extends Ship implements TransportPassengers{
	private int passengers;
	
	public String passengerRules() {
		return "Enjoy your stay!";
	}
	//Accessors
	public int getPassengers() {
		return passengers;
	}

	//Mutator
	public void setPassengers(int s) {
		if(s>0)
			passengers=s;
		else {
			System.out.println("Wrong Value");
		}
	}
	//Constructors
	public Cruiseship() {
		passengers=0;
	}
	public Cruiseship(String n, String y,int p) {
		super(n,y);
		passengers=0;
		setPassengers(p);
	}
	public Cruiseship(Cruiseship crs) {
		//Using polymorphism to typecast cruiseship as a regular ship.
		super((Ship)crs);
		passengers=crs.passengers;
	}
	
	//toString
	public String toString() {
		return "Name: "+getName()+" Number of Passengers: "+passengers;
	}

	public char[] printRole() {
		// TODO Auto-generated method stub
		return null;
	}
}
