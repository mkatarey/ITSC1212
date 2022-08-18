import java.util.Scanner;

public class ITSC1212Lab4 {
    
    public static void main(String[] args) {
        /*Scanner scnr = new Scanner(System.in);
        String name = scnr.nextLine();
        name = name.toUpperCase();
        System.out.println("Welcome to ITSC1212 " + 1212 + " " + name);*/
        String welcomeMessage = "Welcome to ITSC1212";
        String name = "manav";
        String fullMessage = welcomeMessage.toUpperCase() + " "+ name.toUpperCase();
        System.out.println(fullMessage);
        System.out.println("The length of this message is: " + fullMessage.length());
        System.out.println("The word 'to' is located at index: " + fullMessage.indexOf("to"));
    }
}

/*Part B
Math.random(): Generates a potential value from the range [0,1)
Math.abs(int): Takes the absolute of the given int value
Math.pow(double, double): First value raised to the power of the second value
Math.sqrt(double): Takes the square root of the value

(Math.random()): [0,1)
(int)(Math.random()): [0]
(int)(Math.random() * 5): [0,4] (only integer values)
(int)(Math.random() * 2): [0,1] (only integer values)
(int)(Math.random() * 9 + 1): [0,9] (only integer values)
*/