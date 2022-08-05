package immutableClass;

public final class ImmutableClass {

	private final int id;
	private final String name;
	private final Vehicle vehicle;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ImmutableClass(int id, String name, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
	//	this.vehicle = vehicle; 	//	-- Don't use this is shallow copy, the value depends on reference, hence mutable
		Vehicle veh=new Vehicle(vehicle.name);
		this.vehicle= veh;
	}
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle("Car");
		ImmutableClass immutableClass=new ImmutableClass(1, "Satyam", v);
		System.out.println(immutableClass.vehicle.getName());
		v.setName("Bike");
		System.out.println(immutableClass.vehicle.getName());
	}
	
	
}
