import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    //Konstant med static final
    //static final String PROGRAM_VERSION = "1.0";
    //static final int DAYS_IN_WEEK = 7;


    public static void main(String[] args) {

        String[] testData = {"John", "Emma", "Liam", "Olivia", "Noah", "Ava", "James", "Sophia", "Benjamin"};
        String[] sortedData = {"Ava", "Benjamin", "Emma", "James", "John", "Liam", "Noah", "Olivia", "Sophia"};


        Queuey queuey = new Queuey();
        queuey.enqueue("Aragorn");
        queuey.enqueue("Arwen");
        System.out.println("Först i kon: "+ queuey.peek());
        System.out.println(queuey.toString());
        queuey.enqueue("Bilbo");
        System.out.println(queuey.toString());
        System.out.println("dequeue: "+ queuey.dequeue());
        System.out.println(queuey.toString());
        System.out.println();

/**
 * Stack
*/
        Stacky stacky = new Stacky(5);
        stacky.push("Frodo");
        stacky.push("Sam");
        stacky.push("Gandalf");
        stacky.push("Gimli");
        stacky.push("Legolas");
        stacky.push("Bilbo");
        System.out.println(stacky.toString());
        System.out.println();

/**
 * Linked list
 */
        Person frodo = new Person(testData[0]);
        Person sam = new Person(testData[1]);
        Person gandalf = new Person(testData[2]);
        Person aragorn = new Person(testData[3]);

        Linky linky = new Linky();
        linky.add(frodo);
        linky.add(sam);
        linky.add(gandalf);
        System.out.println(linky.toString());
        linky.add(aragorn);
        System.out.println(linky.toString());
        System.out.println("Linky has " + linky.size());

/**
 * Code challange ciruclar arr
 */
  /*  String[] weekDays ={"må","ti","on","to","fr", "lö","sö"};
    int today = 3;
    System.out.printf("Idag är det %s\n",weekDays[today]);
    System.out.printf("I övermorgon är det %s\n", weekDays[(today+2)% weekDays.length]);
    System.out.printf("Om 6 dagar är det %s\n",weekDays[(today+6)% weekDays.length]);
    System.out.printf("Om 15 dagar är det %s\n",weekDays[(today+15)% weekDays.length]);

     Person p1 = new Person (testData[0]);
     Person p2 = new Person (testData[1],p1);
     Person p3 = new Person (testData[2],p2);
     Person p4 = new Person (testData[3],p3);

        Person current = p4;
        while(current != null){
            System.out.println(current.getName());
            current = current.next;
        }

        StringArray names = new StringArray(sortedData);
        System.out.println(names.toString());
        names.add("Isabella");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());
    System.exit(0);
    //testa loopa olika tidskomplexitet
     new BigO();

    Scanner scanner = new Scanner(System.in);

    //FileUtils.writeTextFile("Hello file!", "hello.txt");
    //System.out.println(FileUtils.readTextFile("hello.txt"));
    //System.exit(0);

        Customer customer;
        Object loadedObject = FileUtils.loadObject("customer.save");
        if(loadedObject != null){
            customer = (Customer) loadedObject;
        }else{
            customer = new Customer(1500);
        }

        BikeShop shop = new BikeShop();
        shop.addBike(BikeFactory.createExpensiveBike("Scott"));
        shop.addBike(BikeFactory.createCheapBike("Jopo"));
        shop.addBike(new Bike("Nishiki", 900,DiscountCategory.RETURNED));
        shop.addBike(new Bike("Insera", 600,DiscountCategory.DEMO));

        //shop.getBike(0).addFeature("suspension", "hardtail");
        //shop.getBike(0).addFeature("wheelsize", "29 inch");
        //System.out.println(shop.getBike(0).getFeature("suspension"));
        //System.out.println(shop.getBike(0).getFeature("wheelsize"));

        System.out.println("Välkommen till BikeShop! Våra cyklar: ");

        for (int i = 0; i < shop.getBikeCount(); i++) {
            System.out.printf("%d - %s %.2f € (%.2f €) lagersaldo: %s %s\n",
                    i,
                    shop.getBike(i).getName(),
                    shop.getBike(i).getPrice(),
                    shop.getBike(i).getGrossPrice(),
                    shop.getBike(i).getStock(),
                    shop.getBike(i).getDiscountCat()
            );
        }
        //System.out.println(shop.getBike(i).getFeatures());


        String userInput;
        while (true) {

            System.out.printf("Välkommen till Cykelbutiken! Du har %.2f € och %s\n (Enter = fortsätt, q = quit)\n",
                    customer.getFunds(),
                    (customer.getCurrentBike() == null) ? "Ingen cykel": customer.getCurrentBike().getName());

            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Tack, välkommen åter!");
                break;
            }


            int bikeIndex = Utils.getIntInput("Välj cykel att köpa");
            if(bikeIndex>=shop.getBikeCount()){
                System.out.println("Det finns ingen sådan cykel");
                continue;
            }
            if(!customer.buyBike(shop.getBike(bikeIndex))){
                System.out.println("Du har inte råd med den cykeln!");
                continue;
            }


            System.out.printf("Grattis, du köpte en %s för %.2f\n",
                    shop.getBike(bikeIndex).getName(),
                    shop.getBike(bikeIndex).getPrice()
            );

            break;
        }

        FileUtils.saveObject(customer,"customer.save");



        System.out.println("Här genereras slumptal tryck på enter!(q för exit)");
        String userInput1;
        while(true){
            RandomNum x = new RandomNum();
            userInput1 = scanner.nextLine();

            {
                if (userInput1.equalsIgnoreCase("")){
                    System.out.printf("Slumptal: %d tryck enter för ett nytt.\n",
                    x.getNumber());
                }else if (userInput1.equalsIgnoreCase("q")){
                    break;
                }
            }
        }*/

    }


       /* Vehicle car = new Car("Toyota", 5000.0);

        Car car2 = new Car("Fiat");
        car2.refuel();
        Car car3 = new Car(20000.0);
        Car car4 = new Car("Tesla", "electric");
        Vehicle todaysVehicle;
        todaysVehicle = car;
        Calculator calc = new Calculator();
        //default-konstruktor
        Foo foo = new Foo();

        System.out.println("i dag åker jag " + todaysVehicle.getName());
        //upcasting

        car.setPrice(-1000.0);

        Clothing shirt = new Shirt("Nike ", "blue ", 50.00);
        Shirt otherShirt = new Shirt("Adidas ", "Red ", 99.9999 * 2 / 3);
        Clothing pants = new Pants("Levi's ", "black ", 100.00);

        System.out.printf("%s kostar %.2f\n",car.getName(), car.getPrice());
        System.out.printf( "%s is %s\n", car.getName(), car.getType());
        System.out.println(car.soundWarning());
        System.out.printf("%s kostar %.2f\n",car2.getName(), car2.getPrice());

        System.out.println(bike.getName() + " is " + bike.getType());
        System.out.println(bike.soundWarning());

        System.out.println(shirt.getBrand() + shirt.getColor() + shirt.getPrice());
        System.out.println(otherShirt.getCondition() + otherShirt.getColor() + otherShirt.getPrice());

        System.out.println(otherShirt.getBrand() + " kostar " + otherShirt.getPrice() + " lagersaldo: " + otherShirt.getStock() + " st");
        System.out.printf("%s kostar %.2f €, lagersaldo: %d st\n",
                otherShirt.getBrand(),
                otherShirt.getPrice(),
                otherShirt.getStock());
        String.format() returnerar en string
        String shirtInfo = String.format("%s kostar %.2f €, lagersaldo: %d st\n",
                otherShirt.getBrand(),
                otherShirt.getPrice(),
                otherShirt.getStock());
        System.out.println(shirtInfo);

        System.out.println(pants.getBrand() + pants.getColor() + pants.getPrice());

*/
}

