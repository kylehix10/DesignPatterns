//Kyle Hix 2024

/**
 * ArithemeticGame Class. Sets, increases, decreases the states of the game. 
 * Retreives questions from each state and increases and decreases score.
 */
public class ArithemeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * Constructors of ArithemeticGame
     */
    public ArithemeticGame(){
        this.easyState=new Easy(this);
        this.mediumState=new Medium(this);
        this.hardState=new Hard(this);
        this.state=easyState;
        this.score=0;
    }

    /**
     * Produces a question based on the current state
     * @return a new question with two numbers and an operation based on the current state.
     */
    public Question getQuestion(){
        int num1 = state.getNum();
        int num2 = state.getNum();
        Operation operation = state.getOperation();
        return new Question(num1, num2, operation);
    }

    /**
     * Increasing the score and setting the current state based on score.
     */
    public void increaseScore(){
        score++;
        if(score==3 && state.equals(easyState)){
            state.increaseDifficulty();
            state.equals(mediumState);
        }
        else if(score==6||state.equals(mediumState)){
            state.increaseDifficulty();
            state.equals(hardState);
        }

    }

    /**
     * Decreasing the score and setting the current state based on score.
     */
    public void decreaseScore(){
        score--;
        if(score==-3){
        System.out.println("Game Over");
        System.exit(0);
        }
        if(score==6 && state.equals(hardState)){
            state.decreaseDifficulty();
            state.equals(mediumState);
        }
        else if(score==3||state.equals(mediumState)){
            state.decreaseDifficulty();
            state.equals(easyState);
        }
    }
    
    /**
     * Setting state
     * @param state taking in the state and setting it the the game state.
     */
    public void setState(State state){
        this.state=state;
    }

    /**
     * Retrieving easyState
     * @return easyState
     */
    public State getEasyState(){
        return easyState;
    }

    /**
     * Retrieving mediumState
     * @return mediumState
     */
    public State getMediumState(){
        return mediumState;
    }

    /**
     * Retrieving hardState
     * @return hardState
     */
    public State getHardState(){
        return hardState;
    }
    
}
