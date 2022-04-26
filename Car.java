/**
 * Car class
 * @author Matt Thompson
 * date: 4/26/2022
 *
 */
public class Car extends Vehicle {
	private int numDoors;
	private int numPass;
	
	/**
	 * Parameterized constructor for the class Car
	 * 
	 * @param aMake : make of the car
	 * @param aModel : model of the car
	 * @param aPlate : license plate of the car
	 */
	public Car(String aMake, String aModel, String aPlate) {
		super(aMake, aModel, aPlate);
	}
	
	/**
	 * Retrieves the number of doors on a car object
	 * @return this.numPass : the number of doors
	 */
	public int getDoors() {
		return this.numDoors;
	}
	
	/**
	 * Retrieves the number of passengers 
	 * @return this.numPass : the number of passengers
	 */
	public int getPassengers() {
		return this.numPass;
	}
	
	@Override
	public String toString() {
		return this.numDoors + "-door " + this.getMake() + " " + this.getModel() + " with license " + this.getPlate();
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		return this.getDoors() == otherCar.getPassengers() && super.equals(other);
	}
	
	/**
	 * Creates a copy (of class Car) of the Car's information
	 * @return clone : the copied information
	 */
	public Car copy() {

        Car clone = new Car(super.getMake(), super.getModel(), super.getPlate());
        return clone;
	}

}
