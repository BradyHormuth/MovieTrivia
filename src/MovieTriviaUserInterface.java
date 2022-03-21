import java.util.*;

public class MovieTriviaUserInterface {
    private Scanner input = new Scanner(System.in);

    public String mainMenuPrompt()
    {
        boolean validInput = false;
        String response = null;
        while( !validInput ) {
            System.out.println("Choose a function:");
            System.out.println("1) Quiz Me");
            System.out.println("2) Movie Info");
            System.out.println("Q) Quit");

            response = input.nextLine().toUpperCase();

            if( response.equals("1") || response.equals("2") || response.equals("Q"))
            {
                validInput = true;
            }
            else
            {
                System.out.println("Invalid input enter a valid selection.");
            }
        }

        return response;
    }
}
