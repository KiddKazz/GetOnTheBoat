/*
 * This is our super class ship which will serve as the base for any future, specialized ships we create.
 * This class will have our basic mutators and accessors with a normal toString method.
 */
package classAssignmentFeb23;

public class Ship {
	
	private String name;
	private String year;
	
	//mutators
	public void setName(String n) {
		name=n;
	}
	public void setYear(String y) {
		year=y;
	}
	//Accessors
	public String getName() {
		return name;
	}
	
	public String getYear() {
		return year;
	}
	//Constructors
	public Ship() {
	name="noname";
	year="1/1/1";
	}
	public Ship(String n,String y) {
		setName(n);
		setYear(y);
	}
	public Ship(Ship s) {
		setName(s.name);
		setYear(s.year);
	}
	//toString 
	public String toString() {
		return "Name: "+name+" Year: "+year;
	}

}
