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
