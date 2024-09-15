//Kyle Hix
/**
 * Hard class that outlines the variables for being in the hard state.
 */
import java.util.Random;
public class Hard implements State{

    private ArithemeticGame game;

    /**
     * Constructors for Hard
     * @param game setting game to game
     */
    public Hard(ArithemeticGame game){
        this.game=game;
    }

    /**
     * Returning a random number between 1 and 50
     */
    public int getNum(){
        Random rn=new Random();
        int hardQ=rn.nextInt(1,50);
        return hardQ;
    }

    /**
     * Selecting an operation of plus, minus, divide, or multiply at random
     */
    public Operation getOperation(){
       Random rn=new Random();
       int operation=rn.nextInt(4);
       if(operation==0)
        return Operation.PLUS;
       else if(operation==1)
        return Operation.MINUS;
       else if(operation==2)
        return Operation.MULTIPLY;
       else
        return Operation.DIVIDE;
    }

    /**
     * Increasing difficulty: Changing the current state and notifying the user.
     */
    public void increaseDifficulty(){
        System.out.println("Maximum Level of Difficulty Reached.");
    }

    /**
     * Decreasing difficulty: Changing the current state and notifying the user.
     */
    public void decreaseDifficulty(){
        game.setState(new Medium(game));
        System.out.println("Level Decreased to: Medium");        
    }
    
}
