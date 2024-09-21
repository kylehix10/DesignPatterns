
import java.util.ArrayList;
import java.util.Random;


/**
 * Trivia game class that pulls questions, keeps score, and track of what round the user is on.
 * @author Kyle Hix
 */

public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    /**
     * TriviaGame constructors.
     * Loading trivia questions from a text file into the ArrayList of questions.
     */

    private TriviaGame(){
        score=0;
        numGames=0;
        rand = new Random();
        questions=DataLoader.getTriviaQuestions();
    }

    /**
     * Creates a new triviaGame
     * @return a new TriviaGame
     */
    public static TriviaGame getInstance(){
        if(triviaGame==null)
            triviaGame=new TriviaGame();
        return triviaGame;
    }

    /**
     * Pulling a random question from the ArrayList based on a random index number.
     * If the list is empty the game is over and displays the users results.
     * @return random question from the Array List.
     */
    public Question getQuestion(){
         if (questions.isEmpty()) {
            System.out.println("Out of questions\nYou scored: "+score+"/"+numGames);
            System.exit(0);
        }
        int questionNum= rand.nextInt(questions.size());
        Question question = questions.get(questionNum);
        questions.remove(questionNum);
        return question;
        
      
    }

    /**
     * Checks the arrayList of questions to see if it is empty or not.
     * @return
     */
    public boolean hasMoreQuestions(){
        if(questions.isEmpty()==true)
            return false;
        else
            return true;
    }

    /**
     * Increases the score and number of games played.
     */
    public void winRound(){
        score++;
        numGames++;
    }

    /**
     * Increases the number of games played. No increase in score.
     */
    public void loseRound(){
        numGames++;
    }

    /**
     * Returns the score to games played to the user.
     * @return score to games played.
     */
    public String getScores(){
        return "You scored: "+score+"/"+numGames;
    }

}
