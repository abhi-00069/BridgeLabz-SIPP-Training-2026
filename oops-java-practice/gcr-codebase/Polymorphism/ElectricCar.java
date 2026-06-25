class ElectricCar extends Vehicle{

    ElectricCar(String hehe){
        super(hehe);
    }

    double fuelCost(int km){
        return km*1.2;
    }
}
