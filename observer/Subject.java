//Kyle Hix 2024

/**Public interface for adding, removing and notifying Observers */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver (Observer observer);
    public void notifyObservers(Book book);
}
