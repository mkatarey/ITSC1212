import java.util.Scanner;

public class MagpieDriver{
/**
 * Create a Magpie, give it user input, and print its replies.
 */
    public static void main(String[] args) {
        MagPie maggie = new MagPie();

        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!statement.equalsIgnoreCase("Bye")) {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
        System.out.println("Goodbye!");
    }
}

//Part A
/*
How many constructors does this class have? 1
How many fields does this class have? 0
How many methods does this class have? 3
What does the method getGreeting() return? "Hello, let's talk."

What is the chatbot response when you enter the word no? "Why so negative?"
What is the chatbot response when you enter the word mother? "Tell me more about your family."
What is the chatbot response when you do not enter any words? It chooses from one of the random responses.
What happens when a keyword is included in another word? It is only answering based on the keyword.
    another: "Why so negative?"
    I know all the state capitals: "Why so negative?"
    I like vegetables smothered in cheese: "Tell me more about your family."
The problem with these responses is that it is only picking up the part of each word that fits its keyword
and not actually "responding" to the proper question being asked.
*/