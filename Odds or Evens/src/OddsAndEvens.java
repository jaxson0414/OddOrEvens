import java.util.*;

public class OddsAndEvens {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lets play a game called \"Odds and Even\"");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String choose = input.next();

        if(choose.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        }else {
            System.out.println(name + " has picked evens! The computer w" + "ill be odds.");
        }
        System.out.println("-----------------------------------------------");

        System.out.print("How many \"fingers\" do you put out?");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\"");
        System.out.println("-----------------------------------------------");
        int userNumber = fingers;
        int computerNumber = computer;
        int sum = (userNumber + computerNumber);
        System.out.println(userNumber + " + " + computerNumber + " = " + sum );
        boolean oddOrEven = sum % 2 == 0;

        if(oddOrEven) {
            System.out.println(sum + "is ...Even!");
            if (choose.equals("E")) {
                System.out.println("That means " + name + " wins!  :)");
            }else {
                System.out.println("That means computer wins!  :(");
            }
        }else {
            System.out.println(sum + " is ...Odd!");
            if (choose.equals("O")) {
                System.out.println("That means " + name + " wins!  :)");
            }else {
                System.out.println("That means computer wins!  :(");
            }
        }
    }
}
