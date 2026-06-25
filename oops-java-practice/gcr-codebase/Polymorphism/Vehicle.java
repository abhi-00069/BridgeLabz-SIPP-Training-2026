abstract class Vehicle{

    String naam;

    Vehicle(String naam){
      this.naam=naam;
    }

    abstract double fuelCost(int km);
}

class Car extends Vehicle{

    Car(String x){
        super(x);
    }

   double fuelCost(int km){
      return km*7.5;
   }
}

class Bus extends Vehicle{

Bus(String x){
    super(x);
}

double fuelCost(int km){
    return km*15.8;
}
}

class Bike extends Vehicle{

    Bike(String abc){
        super(abc);
    }

    double fuelCost(int km){
      return km*2.3;
    }
}

class ElectricCar extends Vehicle{

    ElectricCar(String hehe){
        super(hehe);
    }

    double fuelCost(int km){
        return km*1.2;
    }
}

public class Main{

    public static void main(String[] args){

        Vehicle arr[]=new Vehicle[4];

      arr[0]=new Car("Swift");
        arr[1]=new Bus("Volvo");
      arr[2]=new Bike("Pulsar");
         arr[3]=new ElectricCar("Nexon EV");

        int km=100;

      for(int i=0;i<arr.length;i++){

          System.out.println(arr[i].naam+" cost = "+arr[i].fuelCost(km));

          if(arr[i] instanceof Car){
             Car c=(Car)arr[i];
             System.out.println("its a car");
          }
           else if(arr[i] instanceof Bus){
            Bus b=(Bus)arr[i];
            System.out.println("big bus");
        }
        else if(arr[i] instanceof Bike){
              Bike lol=(Bike)arr[i];
              System.out.println("bike only");
          }
          else if(arr[i] instanceof ElectricCar){
            ElectricCar e=(ElectricCar)arr[i];
             System.out.println("electric one");
          }

          System.out.println();
      }

    }
}
