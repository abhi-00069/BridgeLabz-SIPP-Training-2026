abstract class Vehicle {

    String naam;

    Vehicle(String naam){
      this.naam=naam;
    }

    abstract double fuelCost(int km);
}
