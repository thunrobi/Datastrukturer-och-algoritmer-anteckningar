import java.util.Scanner;

public class Utils {


    public static boolean isInteger(String str){
        return str.matches("-?\\d+");
    }

    public static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
               return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                    System.out.println("Du måste ge ett heltal ");
            }
        }

    }
}
