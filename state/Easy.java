//Kyle Hix 2024

/**
 * Easy Class the outline the game variables for being in the easy state.
 */
import java.util.Random;
public class Easy implements State{
    
    private ArithemeticGame game;

    /**
     * Constructors for Easy
     * @param game setting game to game
     */
    public Easy(ArithemeticGame game){
        this.game=game;
    }

    /**
     * Returning a random number between 1 and 10
     */
    public int getNum(){
        Random rn=new Random();
        int easyQ=rn.nextInt(1,10);
        return easyQ;      
    }

    /**
     * Selecting an operation of plus or minus at random
     */
    public Operation getOperation(){
       Random rn=new Random();
       int operation=rn.nextInt(2);
       if(operation==0)
        return Operation.PLUS;
       else
        return Operation.MINUS;
    }

    /**
     * Increasing difficulty: Changing the current state and notifying the user.
     */
    public void increaseDifficulty(){
        game.setState(new Medium(game));
        System.out.println("Level Increased to: Medium");

    }
    /**
     * Decreasing difficulty: Changing the current state and notifying the user.
     */
    public void decreaseDifficulty(){
        System.out.println("Cannot Decrease Level");
        
    }
}
