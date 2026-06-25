class Car extends Vehicle{

    Car(String x){
        super(x);
    }

    double fuelCost(int km){
        return km*7.5;
    }
}
