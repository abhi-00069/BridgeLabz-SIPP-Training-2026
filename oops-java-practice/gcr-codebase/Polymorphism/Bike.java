class Bike extends Vehicle{

    Bike(String abc){
        super(abc);
    }

    double fuelCost(int km){
        return km*2.3;
    }
}
