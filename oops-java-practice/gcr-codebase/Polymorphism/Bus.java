class Bus extends Vehicle{

Bus(String x){
    super(x);
}

double fuelCost(int km){
    return km*15.8;
}
}
