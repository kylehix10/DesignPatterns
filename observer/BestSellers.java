//Kyle Hix

import java.util.ArrayList;

public class BestSellers implements Subject{

    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Default constructors
     * observers is an ArrayList of Observer
     * bestSellers is an ArrayList of Book
     */
    public BestSellers(){
        this.observers=new ArrayList<Observer>();
        this.bestSellers=new ArrayList<Book>();
    }

    /**
     * Adding an observer to observers
     */
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * Removing an observer from observers
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * Updating observer with new books
     */
    public void notifyObservers(Book book){
        for(Observer observer : observers){
            observer.update(book);
        }
    }

    /**
     * Taking in book parameters. Adding them to the bestSellers list. Notifying observers.
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description){
        Book newBook= new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(newBook);
        notifyObservers(newBook);
        
    }

}
