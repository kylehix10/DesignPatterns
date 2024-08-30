//Kyle Hix

import java.util.ArrayList;

import observer.Genre;

public class BestSellers implements Subject{

    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers(){
        this.observers=new ArrayList<Observer>();
        this.bestSellers=new ArrayList<Book>();
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(Book book){
        for(Observer observer : observers){
            observer.update(book);
        }
    }

    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description){
   
    Book newBook= new Book(title, genre, authorFirstName, authorLastName, description);
    bestSellers.add(newBook);
        
    }

}
