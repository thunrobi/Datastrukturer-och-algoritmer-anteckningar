public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", 5000.0);
        Vehicle bike = new Bike("Scott");

        Car car2 = new Car("Fiat");
        car2.refuel();
        Car car3 = new Car (20000.0);
        Car car4 = new Car("Tesla", "electric");

        Vehicle todaysVehicle;
        todaysVehicle = car;
        todaysVehicle = bike;

        System.out.println("i dag åker jag " + todaysVehicle.getName());
        //upcasting

        //car.setPrice(-1000.0);

       //Shirt shirt = new Shirt("Nike ", "blue ", "50€");
       //Shirt otherShirt = new Shirt("Adidas ", "Red ", "30€");
       //Pants pants = new Pants("Levi's ", "black ", "100€");

        System.out.printf("%s kostar %.2f\n",car.getName(), car.getPrice());
        System.out.printf( "%s is %s\n", car.getName(), car.getType());
        System.out.println(car.soundWarning());

        System.out.printf("%s kostar %.2f\n",car2.getName(), car2.getPrice());

        System.out.println(bike.getName()+ " is " + bike.getType());
        System.out.println(bike.soundWarning());


        //System.out.println(shirt.getBrand() + shirt.getColor() + shirt.getPrice());
        //System.out.println(otherShirt.getBrand() + otherShirt.getColor() + otherShirt.getPrice());
        //System.out.println(pants.getBrand() + pants.getColor() + pants.getPrice());


    }
}