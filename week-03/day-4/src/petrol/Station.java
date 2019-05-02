package petrol;

public class Station {

  int gasAmount;

  public Station() {

  }

  public void refill(Car car) {
    gasAmount = gasAmount - car.capacity;
    car.gasAmount = car.gasAmount + gasAmount;
  }
}
/*Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount*/
