/*
 * First specialized ship
 * Cargoship extends our super class Ship and implements the TransportCargo interface
 * Our cargo ship needs to have a max capacity (written as cap below), 
 * but will ultimately contain the same as our super class.
 */
package classAssignmentFeb23;

public class Cargoship extends Ship implements TransportCargo{
	private int cap;
	
	public String cargoRules() {
		return "Keep cargo safe";
	}
	//Accessors
	public int getCap() {
		return cap;
	}
	//Mutators
	public void setCap(int c) {
		if(c>0)
			cap=c;
		else {
			System.out.println("Wrong Value");
		}
	}
	//Constructors
	public Cargoship() {
		cap=0;
	}
	public Cargoship(String n, String y,int c) {
		super(n,y);
		cap=0;
		setCap(c);
	}
	public Cargoship(Cargoship cas) {
		super((Ship)cas);
		cap=cas.cap;
	}
	//toString
	public String toString() {
		return "Name: "+getName()+"  | Capacity: "+cap;
	}
	

}
