import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    //Konstant med static final
    //static final String PROGRAM_VERSION = "1.0";
    //static final int DAYS_IN_WEEK = 7;


    public static void main(String[] args) {

        String[] testData = {"John", "Emma", "Liam", "Olivia", "Noah", "Ava", "James", "Sophia", "Benjamin"};
        String[] topNames = {"Liam", "Noah", "Oliver", "Elijah", "William", "James", "Benjamin", "Lucas", "Henry", "Alexander", "Mason", "Michael", "Ethan", "Daniel", "Jacob", "Logan", "Jackson", "Levi", "Sebastian", "Mateo", "Jack", "Owen", "Theodore", "Aiden", "Samuel", "Joseph", "John", "David", "Wyatt", "Matthew", "Luke", "Asher", "Carter", "Julian", "Grayson", "Leo", "Jayden", "Gabriel", "Isaac", "Lincoln", "Anthony", "Hudson", "Dylan", "Ezra", "Thomas", "Charles", "Christopher", "Jaxon", "Maverick", "Josiah", "Isaiah", "Andrew", "Elias", "Joshua", "Nathan", "Caleb", "Ryan", "Adrian", "Miles", "Eli", "Nolan", "Christian", "Aaron", "Cameron", "Ezekiel", "Colton", "Luca", "Landon", "Hunter", "Jonathan", "Santiago", "Axel", "Easton", "Cooper", "Jeremiah", "Angel", "Roman", "Connor", "Jameson", "Robert", "Greyson", "Jordan", "Ian", "Carson", "Jaxson", "Leonardo", "Nicholas", "Dominic", "Austin", "Everett", "Brooks", "Xavier", "Kai", "Jose", "Parker", "Adam", "Jace", "Wesley", "Kayden", "Silas", "Bennett", "Declan", "Waylon", "Weston", "Evan", "Emmett", "Micah", "Ryder", "Beau", "Damian", "Brayden", "Gael", "Rowan", "Harrison", "Bryson", "Sawyer", "Amir", "Kingston", "Jason", "Giovanni", "Vincent", "Ayden", "Chase", "Myles", "Diego", "Nathaniel", "Legend", "Jonah", "River", "Tyler", "Cole", "Braxton", "George", "Milo", "Zachary", "Ashton", "Luis", "Jasper", "Kaiden", "Adriel", "Gavin", "Bentley", "Calvin", "Zion", "Juan", "Maxwell", "Max", "Ryker", "Carlos", "Emmanuel", "Jayce", "Lorenzo", "Ivan", "Jude", "August", "Kevin", "Malachi", "Elliott", "Rhett", "Archer", "Karter", "Arthur", "Luka", "Elliot", "Thiago", "Brandon", "Camden", "Justin", "Jesus", "Maddox", "King", "Theo", "Enzo", "Matteo", "Emiliano", "Dean", "Hayden", "Finn", "Brody", "Antonio", "Abel", "Alex", "Tristan", "Graham", "Zayden", "Judah", "Xander", "Miguel", "Atlas", "Messiah", "Barrett", "Tucker", "Timothy", "Alan", "Edward", "Leon", "Dawson", "Eric", "Ace", "Victor", "Abraham", "Nicolas", "Jesse", "Charlie", "Patrick", "Walker", "Joel", "Richard", "Beckett", "Blake", "Alejandro", "Avery", "Grant", "Peter", "Oscar", "Matias", "Amari", "Lukas", "Andres", "Arlo", "Colt", "Adonis", "Kyrie", "Steven", "Felix", "Preston", "Marcus", "Holden", "Emilio", "Remington", "Jeremy", "Kaleb", "Brantley", "Bryce", "Mark", "Knox", "Israel", "Phoenix", "Kobe", "Nash", "Griffin", "Caden", "Kenneth", "Kyler", "Hayes", "Jax", "Rafael", "Beckham", "Javier", "Maximus", "Simon", "Paul", "Omar", "Kaden", "Kash", "Lane", "Bryan", "Riley", "Zane", "Louis", "Aidan", "Paxton", "Maximiliano", "Karson", "Cash", "Cayden", "Emerson", "Tobias", "Ronan", "Brian", "Dallas", "Bradley", "Jorge", "Walter", "Josue", "Khalil", "Damien", "Jett", "Kairo", "Zander", "Andre", "Cohen", "Crew", "Hendrix", "Colin", "Chance", "Malakai", "Clayton", "Daxton", "Malcolm", "Lennox", "Martin", "Jaden", "Kayson", "Bodhi", "Francisco", "Cody", "Erick", "Kameron", "Atticus", "Dante", "Jensen", "Cruz", "Finley", "Brady", "Joaquin", "Anderson", "Gunner", "Muhammad", "Zayn", "Derek", "Raymond", "Kyle", "Angelo", "Reid", "Spencer", "Nico", "Jaylen", "Jake", "Prince", "Manuel", "Ali", "Gideon", "Stephen", "Ellis", "Orion", "Rylan", "Eduardo", "Mario", "Rory", "Cristian", "Odin", "Tanner", "Julius", "Callum", "Sean", "Kane", "Ricardo", "Travis", "Wade", "Warren", "Fernando", "Titus", "Leonel", "Edwin", "Cairo", "Corbin", "Dakota", "Ismael", "Colson", "Killian", "Major", "Tate", "Gianni", "Elian", "Remy", "Lawson", "Niko", "Nasir", "Kade", "Armani", "Ezequiel", "Marshall", "Hector", "Desmond", "Kason", "Garrett", "Jared", "Cyrus", "Russell", "Cesar", "Tyson", "Malik", "Donovan", "Jaxton", "Cade", "Romeo", "Nehemiah", "Sergio", "Iker", "Caiden", "Jay", "Pablo", "Devin", "Jeffrey", "Otto", "Kamari", "Ronin", "Johnny", "Clark", "Ari", "Marco", "Edgar", "Bowen", "Jaiden", "Grady", "Zayne", "Sullivan", "Jayceon", "Sterling", "Andy", "Conor", "Raiden", "Royal", "Royce", "Solomon", "Trevor", "Winston", "Emanuel", "Finnegan", "Pedro", "Luciano", "Harvey", "Franklin", "Noel", "Troy", "Princeton", "Johnathan", "Erik", "Fabian", "Oakley", "Rhys", "Porter", "Hugo", "Frank", "Damon", "Kendrick", "Mathias", "Milan", "Peyton", "Wilder", "Callan", "Gregory", "Seth", "Matthias", "Briggs", "Ibrahim", "Roberto", "Conner", "Quinn", "Kashton", "Sage", "Santino", "Kolton", "Alijah", "Dominick", "Zyaire", "Apollo", "Kylo", "Reed", "Philip", "Kian", "Shawn", "Kaison", "Leonidas", "Ayaan", "Lucca", "Memphis", "Ford", "Baylor", "Kyson", "Uriel", "Allen", "Collin", "Ruben", "Archie", "Dalton", "Esteban", "Adan", "Forrest", "Alonzo", "Isaias", "Leland", "Jase", "Dax", "Kasen", "Gage", "Kamden", "Marcos", "Jamison", "Francis", "Hank", "Alexis", "Tripp", "Frederick", "Jonas", "Stetson", "Cassius", "Izaiah", "Eden", "Maximilian", "Rocco", "Tatum", "Keegan", "Aziel", "Moses", "Bruce", "Lewis", "Braylen", "Omari", "Mack", "Augustus", "Enrique", "Armando", "Pierce", "Moises", "Asa", "Shane", "Emmitt", "Soren", "Dorian", "Keanu", "Zaiden", "Raphael", "Deacon", "Abdiel", "Kieran", "Phillip", "Ryland", "Zachariah", "Casey", "Zaire", "Albert", "Baker", "Corey", "Kylan", "Denver", "Gunnar", "Jayson", "Drew", "Callen", "Jasiah", "Drake", "Kannon", "Braylon", "Sonny", "Bo", "Moshe", "Huxley", "Quentin", "Rowen", "Santana", "Cannon", "Kenzo", "Wells", "Julio", "Nikolai", "Conrad", "Jalen", "Makai", "Benson", "Derrick", "Gerardo", "Davis", "Abram", "Mohamed", "Ronald", "Raul", "Arjun", "Dexter", "Kaysen", "Jaime", "Scott", "Lawrence", "Ariel", "Skyler", "Danny", "Roland", "Chandler", "Yusuf", "Samson", "Case", "Zain", "Roy", "Rodrigo", "Sutton", "Boone", "Saint", "Saul", "Jaziel", "Hezekiah", "Alec", "Arturo", "Jamari", "Jaxtyn", "Julien", "Koa", "Reece", "Landen", "Koda", "Darius", "Sylas", "Ares", "Kyree", "Boston", "Keith", "Taylor", "Johan", "Edison", "Sincere", "Watson", "Jerry", "Nikolas", "Quincy", "Shepherd", "Brycen", "Marvin", "Dariel", "Axton", "Donald", "Bodie", "Finnley", "Onyx", "Rayan", "Raylan", "Brixton", "Colby", "Shiloh", "Valentino", "Layton", "Trenton", "Landyn", "Alessandro", "Ahmad", "Gustavo", "Ledger", "Ridge", "Ander", "Ahmed", "Kingsley", "Issac", "Mauricio", "Tony", "Leonard", "Mohammed", "Uriah", "Duke", "Kareem", "Lucian", "Marcelo", "Aarav", "Leandro", "Reign", "Clay", "Kohen", "Dennis", "Samir", "Ermias", "Otis", "Emir", "Nixon", "Ty", "Sam", "Fletcher", "Wilson", "Dustin", "Hamza", "Bryant", "Flynn", "Lionel", "Mohammad", "Cason", "Jamir", "Aden", "Dakari", "Justice", "Dillon", "Layne", "Zaid", "Alden", "Nelson", "Devon", "Titan", "Chris", "Khari", "Zeke", "Noe", "Alberto", "Roger", "Brock", "Rex", "Quinton", "Alvin", "Cullen", "Azariah", "Harlan", "Kellan", "Lennon", "Marcel", "Keaton", "Morgan", "Ricky", "Trey", "Karsyn", "Langston", "Miller", "Chaim", "Salvador", "Amias", "Tadeo", "Curtis", "Lachlan", "Amos", "Anakin", "Krew", "Tomas", "Jefferson", "Yosef", "Bruno", "Korbin", "Augustine", "Cayson", "Mathew", "Vihaan", "Jamie", "Clyde", "Brendan", "Jagger", "Carmelo", "Harry", "Nathanael", "Mitchell", "Darren", "Ray", "Jedidiah", "Jimmy", "Lochlan", "Bellamy", "Eddie", "Rayden", "Reese", "Stanley", "Joe", "Houston", "Douglas", "Vincenzo", "Casen", "Emery", "Joziah", "Leighton", "Marcellus", "Atreus", "Aron", "Hugh", "Musa", "Tommy", "Alfredo", "Junior", "Neil", "Westley", "Banks", "Eliel", "Melvin", "Maximo", "Briar", "Colten", "Lance", "Nova", "Trace", "Axl", "Ramon", "Vicente", "Brennan", "Caspian", "Remi", "Deandre", "Legacy", "Lee", "Valentin", "Ben", "Louie", "Westin", "Wayne", "Benicio", "Grey", "Zayd", "Gatlin", "Mekhi", "Orlando", "Bjorn", "Harley", "Alonso", "Rio", "Aldo", "Byron", "Eliseo", "Ernesto", "Talon", "Thaddeus", "Brecken", "Kace", "Kellen", "Enoch", "Kiaan", "Lian", "Creed", "Rohan", "Callahan", "Jaxxon", "Ocean", "Crosby", "Dash", "Gary", "Mylo", "Ira", "Magnus", "Salem", "Abdullah", "Kye", "Tru", "Forest", "Jon", "Misael", "Madden", "Braden", "Carl", "Hassan", "Emory", "Kristian", "Alaric", "Ambrose", "Dario", "Allan", "Bode", "Boden", "Juelz", "Kristopher", "Genesis", "Idris", "Ameer", "Anders", "Darian", "Kase", "Aryan", "Dane", "Guillermo", "Elisha", "Jakobe", "Thatcher", "Eugene", "Ishaan", "Larry", "Wesson", "Yehuda", "Alvaro", "Bobby", "Bronson", "Dilan", "Kole", "Kyro", "Tristen", "Blaze", "Brayan", "Jadiel", "Kamryn", "Demetrius", "Maurice", "Arian", "Kabir", "Rocky", "Rudy", "Randy", "Rodney", "Yousef", "Felipe", "Robin", "Aydin", "Dior", "Kaiser", "Van", "Brodie", "London", "Eithan", "Stefan", "Ulises", "Camilo", "Branson", "Jakari", "Judson", "Yahir", "Zavier", "Damari", "Jakob", "Jaxx", "Bentlee", "Cain", "Niklaus", "Rey", "Zahir", "Aries", "Blaine", "Kyng", "Castiel", "Henrik", "Joey", "Khalid", "Bear", "Graysen", "Jair", "Kylen", "Darwin", "Alfred", "Ayan", "Kenji", "Zakai", "Avi", "Cory", "Fisher", "Jacoby", "Osiris", "Harlem", "Jamal", "Santos", "Wallace", "Brett", "Fox", "Leif", "Maison", "Reuben", "Adler", "Zev", "Calum", "Kelvin", "Zechariah", "Bridger", "Mccoy", "Seven", "Shepard", "Azrael", "Leroy", "Terry", "Harold", "Mac", "Mordechai", "Ahmir", "Cal", "Franco", "Trent", "Blaise", "Coen", "Dominik", "Marley", "Davion", "Jeremias", "Riggs", "Jones", "Will", "Damir", "Dangelo", "Canaan", "Dion", "Jabari", "Landry", "Salvatore", "Kody", "Hakeem", "Truett", "Gerald", "Lyric", "Gordon", "Jovanni", "Kamdyn", "Alistair", "Cillian", "Foster", "Terrance", "Murphy", "Zyair", "Cedric", "Rome", "Abner", "Colter", "Dayton", "Jad", "Xzavier", "Rene", "Vance", "Duncan", "Frankie", "Bishop", "Davian", "Everest", "Heath", "Jaxen", "Marlon", "Maxton", "Reginald", "Harris", "Jericho", "Keenan", "Korbyn", "Wes", "Eliezer", "Jeffery", "Kalel", "Kylian", "Turner", "Willie", "Rogelio", "Ephraim"};

        //Recursy.loop(0,10);
        Recursy.countdown(10);
        System.out.println();
        Recursy.countdown(32);
        System.out.println();
        System.out.println( Recursy.pow(4,3));
        System.exit(0);
        System.out.println("\n fib() O(n^2)");
        System.out.println(Recursy.fib(10) + " FIB OPS: " + Recursy.ops);
        System.out.println(Recursy.fib(20) + " FIB OPS: " + Recursy.ops);
        System.out.println(Recursy.fib(40) + " FIB OPS: " + Recursy.ops);
        Recursy.ops = 0;
        System.out.println("\n fib() O(n)");
        System.out.println(Recursy.fastFib(10) + " FIB OPS: " + Recursy.ops);
        System.out.println(Recursy.fastFib(40) + " FIB OPS: " + Recursy.ops);
        System.exit(0);

        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < testData.length; i++) {
            persons.add(new Person(testData[i], i + 1));

        }
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
/**
 * Sorting algorithms (Sorty)
 */

/*      Sorty sorty1  = new Sorty(topNames);
        sorty1.bubbleSort();
        System.out.println(sorty1.toString());

        String[] sorted = sorty1.getValues();
        StringArray reverse = (new StringArray(sorted));
        reverse.reverse();

        Sorty sorty2  = new Sorty(topNames);
        sorty2.insertionSort();
        System.out.println(sorty2.toString());

        Sorty sorty3  = new Sorty(reverse.getValues());
        sorty3.insertionSort();
        System.out.println(sorty3.toString());*/

/**
 * Hashmap (Hashy)
 */

/*        String search = "Seven";

        Hashy hashy = new Hashy(topNames.length);

        //Lägg in alla personer i vår Hashtabell
        for (int i = 0; i < topNames.length; i++) {
            hashy.add(new Person(topNames[i], i));
        }

        System.out.println("Total collisions " + hashy.totCollisions);

        int ops = 0;
        for (int i = 0; i < topNames.length; i++) {
            ops++;
            if (topNames[i].equals(search)) {
                System.out.println(search + " is ranked " + i);
                break;
            }
        }
        System.out.println("Sequential search O(n) operations: " + ops);
        System.out.println(search + " is ranked " + hashy.search(search).getRank());

        Graphy graphy = new Graphy();
        graphy.addNode("sk", "Skjorta");
        graphy.addNode("sl", "Slips");
        graphy.addNode("je", "Jeans");
        graphy.addNode("cr", "Crocs");

        graphy.addEdge("sk", "sl");
        graphy.addEdge("sk", "je");
        graphy.addEdge("sl", "je");
        graphy.addEdge("sl", "sk");
        graphy.addEdge("je", "sk");
        graphy.addEdge("je", "sl");
        graphy.addEdge("je", "cr");
        graphy.addEdge("cr", "je");

        System.out.println(graphy.toString());*/

/**
 * Queue (Queuey)
 */
/*
        Queuey queuey = new Queuey();
        queuey.enqueue("Aragorn");
        queuey.enqueue("Arwen");
        System.out.println("Först i kon: " + queuey.peek());
        System.out.println(queuey.toString());
        queuey.enqueue("Bilbo");
        System.out.println(queuey.toString());
        System.out.println("dequeue: " + queuey.dequeue());
        System.out.println(queuey.toString());
        System.out.println();
*/
/**
 * Stack
 */
/*
        Stacky stacky = new Stacky(5);
        stacky.push("Frodo");
        stacky.push("Sam");
        stacky.push("Gandalf");
        stacky.push("Gimli");
        stacky.push("Legolas");
        stacky.push("Bilbo");
        System.out.println(stacky.toString());
        System.out.println();
*/
/**
 * Linked list
 */
/*
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
*/
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

