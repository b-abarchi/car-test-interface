//==============================
//=======Bello Abarchi==========
//=======4/15/2018==============
public class Car implements Vehicle, Movable, FuelDriven {

private double mileage, capacity, cost;

private int maxSpeed;

private String make;

public Car(double mileage, double capacity, double cost, int maxSpeed,

String make) {

this.mileage = mileage;

this.capacity = capacity;

this.cost = cost;

this.maxSpeed = maxSpeed;

this.make = make;

}

public void setMileage(double mileage) {

this.mileage = mileage;

}

public void setCapacity(double capacity) {

this.capacity = capacity;

}

public void setCost(double cost) {

this.cost = cost;

}

public void setMaxSpeed(int maxSpeed) {

this.maxSpeed = maxSpeed;

}

public void setMake(String make) {

this.make = make;

}

@Override

public double getMileage() {

return mileage;

}

@Override

public double getFuelCapacity() {

return capacity;

}

@Override

public int getMaxSpeed() {

return maxSpeed;

}

@Override

public String getMake() {

return make;

}

@Override

public double getCost() {

return cost;

}

}