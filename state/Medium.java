//Kyle Hix
/**
 * Medium Class the outlines the variables for being in the medium state
 */
import java.util.Random;
public class Medium implements State{

    private ArithemeticGame game;

    /**
     * Constructors for Medium
     * @param game setting game to game
     */
    public Medium(ArithemeticGame game){
        this.game=game;
    }

    /**
     * Returning a random number between 1 and 25
     */
    public int getNum(){
        Random rn=new Random();
        int mediumQ=rn.nextInt(1,25);
        return mediumQ;

    }

    /**
     * Selecting an operation of plus, minus, or multiply at random
     */

    public Operation getOperation(){
       Random rn=new Random();
       int operation=rn.nextInt(3);
       if(operation==0)
        return Operation.PLUS;
       else if(operation==1)
        return Operation.MINUS;
       else
        return Operation.MULTIPLY;
    }

    /**
     * Increasing difficulty: Changing the current state and notifying the user.
     */
    public void increaseDifficulty(){
        game.setState(new Hard(game));
        System.out.println("Level Increase to: Hard");

    }

    /**
     * Decreasing difficulty: Changing the current state and notifying the user.
     */
    public void decreaseDifficulty(){
        game.setState(new Easy(game));
        System.out.println("Level Decreased to: Easy");
    }
    
}
