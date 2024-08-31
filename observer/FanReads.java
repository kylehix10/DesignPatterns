//Kyle Hix

import java.util.HashMap;
import java.util.ArrayList;


public class FanReads implements Observer{

    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;
   /**
    * Default Constructors for FanReads class
    * @param subject Setting subject to subject
    * @param firstName Unused
    * @param lastName Unused
    * Creates a HashMap for recommendations
    * Registers subject as an Observer.
    */
    public FanReads(Subject subject, String firstName, String lastName){
        this.subject=subject;
        this.recommendations=new HashMap<>();
        this.subject.registerObserver(this);

    }
    /**
     * Adding books to the hash map based on genre.
     */
    public void update(Book book) {
        Genre genre = book.getGenre();
        recommendations.put(genre, new ArrayList<>());
        recommendations.get(genre).add(book);
    }

    /**
     * Calling a list of book recommendations based on genre
     * @param genre Used to pull a specific list of books based on the genre
     * @return returning a list of books.
     */
    public ArrayList<Book> getRecommendations(Genre genre){
        return recommendations.getOrDefault(genre,new ArrayList<>());
    }
    
}
