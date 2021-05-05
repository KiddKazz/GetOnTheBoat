package classAssignmentFeb23;

public interface TransportCargo {
	int getCap();
	void setCap(int c);
	
	//rules our cargoship must follow
	String cargoRules(); //Will be overridden in the respective classes
	

}
