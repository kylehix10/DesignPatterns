//Kyle Hix 2024

/**
 * Interface that is used acrossed the difficulty classes
 */
public interface State {

    public int getNum();
    public Operation getOperation();
    public void increaseDifficulty();
    public void decreaseDifficulty();
    
}
