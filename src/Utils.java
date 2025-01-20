import java.util.Scanner;

public class Utils {


    public static boolean isInteger(String str){
        return str.matches("-?\\d+");
    }

    public static int getIntInput() {
        String userInput;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();
            try {
                int userInt = Integer.parseInt(userInput);
                System.out.println(userInt);
                break;
            } catch (NumberFormatException e) {
                if (!Utils.isInteger(userInput))
                    System.out.println("Du måste ge ett heltal ");
            }
        }
            return 0;

    }
}
