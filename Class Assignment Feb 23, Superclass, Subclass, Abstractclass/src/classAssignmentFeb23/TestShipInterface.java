package classAssignmentFeb23;

//This is a good example of INTERFACES and POLYMORPHISM

public class TestShipInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TransportPassengers tp1=new Cruiseship("Vacation","2000",500);
		TransportPassengers tp2=new SuperShip("Anything goes","2020",1000,10000);
		TransportCargo tc1=new Cargoship("Tank","1990",20000);
		
		//Below we have two references pointing to the same object but those references are different
		//tp2 references TransportPassengers while tc2 is TransportCargo
		TransportCargo tc2=(SuperShip)tp2;
		System.out.println(tc2);
		System.out.println(tc2.cargoRules());
		System.out.println();
		System.out.println(tp1.passengerRules());
		System.out.println(tp2.passengerRules());
		System.out.println(tc1.cargoRules());
				
	}

}
