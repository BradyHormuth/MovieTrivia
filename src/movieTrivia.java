public class movieTrivia {
    public static void main(String[] args) {

        MovieTriviaUserInterface ui = new MovieTriviaUserInterface();


        while(true)
        {
            String mainResponse = ui.mainMenuPrompt();
            if (mainResponse.equals("1"))
            {
                System.out.println("You will be given a random movie" +
                        "title and will be tasked with entering" +
                        "in the correct year that it was made");
            } else if (mainResponse.equals("2"))
            {
                System.out.println("Enter a movie to display that movie's info.");
            } else
            {
                System.out.println("Bye");
                break;
            }
        }
    }
}
