import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    //Konstant med static final
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("Scott", 600));
        shop.addBike(new Bike("Nishiki", 500));
        shop.addBike(new Bike("Insera", 200));

        shop.getBike(0).addFeature("suspension", "hardtail");
        shop.getBike(0).addFeature("wheelsize", "29 inch");
        //System.out.println(shop.getBike(0).getFeature("suspension"));
        //System.out.println(shop.getBike(0).getFeature("wheelsize"));

        System.out.println("Välkommen till BikeShop! Våra cyklar: ");

        for (int i = 0; i < shop.getBikeCount(); i++) {
            System.out.printf("%d - %s %.2f € lagersaldo: %s\n",
                    i,
                    shop.getBike(i).getName(),
                    shop.getBike(i).getPrice(),
                    shop.getBike(i).getStock()
            );
        }
        //System.out.println(shop.getBike(i).getFeatures());
        System.out.print("Vilken cykel vill du köpa? (q för quit)");


        String userInput;
        while (true) {


            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase( "q")){
                System.out.println("Tack, välkommen åter!");
                System.exit(0);
            }

            try {
                int bikeIndex = Integer.parseInt(userInput);
                System.out.printf("Grattis, du äger nu en %s\n",
                        shop.getBike(bikeIndex).getName()
                );
                break;
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Det finns ingen sådan cykel!");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.exit(0);


        Vehicle car = new Car("Toyota", 5000.0);

        Car car2 = new Car("Fiat");
        car2.refuel();
        Car car3 = new Car(20000.0);
        Car car4 = new Car("Tesla", "electric");
        Vehicle todaysVehicle;
        todaysVehicle = car;
        Calculator calc = new Calculator();

        //default-konstruktor
        Foo foo = new Foo();

        //System.out.println("i dag åker jag " + todaysVehicle.getName());
        //upcasting

        //car.setPrice(-1000.0);

        Clothing shirt = new Shirt("Nike ", "blue ", 50.00);
        Shirt otherShirt = new Shirt("Adidas ", "Red ", 99.9999 * 2 / 3);
        //Clothing pants = new Pants("Levi's ", "black ", 100.00);

        //System.out.printf("%s kostar %.2f\n",car.getName(), car.getPrice());
        //System.out.printf( "%s is %s\n", car.getName(), car.getType());
        //System.out.println(car.soundWarning());
        //System.out.printf("%s kostar %.2f\n",car2.getName(), car2.getPrice());

        //System.out.println(bike.getName() + " is " + bike.getType());
        //System.out.println(bike.soundWarning());

        System.out.println(shirt.getBrand() + shirt.getColor() + shirt.getPrice());
        System.out.println(otherShirt.getCondition() + otherShirt.getColor() + otherShirt.getPrice());

        System.out.println(otherShirt.getBrand() + " kostar " + otherShirt.getPrice() + " lagersaldo: " + otherShirt.getStock() + " st");
        System.out.printf("%s kostar %.2f €, lagersaldo: %d st\n",
                otherShirt.getBrand(),
                otherShirt.getPrice(),
                otherShirt.getStock());
        //String.format() returnerar en string
        String shirtInfo = String.format("%s kostar %.2f €, lagersaldo: %d st\n",
                otherShirt.getBrand(),
                otherShirt.getPrice(),
                otherShirt.getStock());
        System.out.println(shirtInfo);

        //System.out.println(pants.getBrand() + pants.getColor() + pants.getPrice());


    }
}
