/**
 * Lab 10 Car class
 * @author Charlie Burrell
 *
 */
 
 public class Car extends Vehicle{
 	 private int Doors;
 	 private int Passengers;
 	 
 	public Car(String aMake, String aModel, String aPlate, int door, int passengers) {
 		super( aMake, aModel, aPlate);
 		this.Doors = door;
 		this.Passengers = passengers;
 	}
 	
 	public int getDoors() {
 		return this.Doors;
 	}
 	
 	public int getPassengers() {
 		return this.Passengers;
 	}
 	
 	@Override
 	public String toString() {
 		return Doors + "door" + getMake() + getModel() + "with license" + getPlate();
 	}
 	
 	@Override
 	public boolean equals(Object other) {
 		if(!(other instanceof Car)) {
			return false;
		}
 		Car otherCar = (Car) other;
  		return super.equals(otherCar) && this.Doors == otherCar.getDoors() && 
  				this.Passengers == otherCar.getPassengers();
 	}
 	
 	public Car copy() {
 		return new Car(getMake(), getModel(), getPlate(), getDoors(), getPassengers());
 	}
 }