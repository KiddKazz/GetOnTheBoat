package classAssignmentFeb23;

public interface TransportPassengers {
	
	int getPassengers();
	void setPassengers(int p);
	//Rules that any passenger needs to follow
	String passengerRules(); //will be overridden in the respective classes.

}
