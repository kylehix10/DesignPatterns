//Kyle Hix


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Store implements Observer{

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;


    /**
     * Setting default constructors. Creating a Linked list of Book. Registering observers
     * @param subject Taking in a subject and registering them to Observer.
     */
    public Store(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);

        this.bestSellers= new LinkedList<>();
            
       
    }

    /**
     * Updating the bestSellers list with a book.
     * Only holding 5 books on the list
     */
    public void update(Book book) {
        bestSellers.add(book);

        if(bestSellers.size()>5){
            bestSellers.poll();
        }
        
    }
/**
 * Getting the bestSellers list
 * @return Casted the Queue<Book> into a List.
 */
    public List<Book> getBestSellers(){ 
        return (List<Book>)bestSellers;
    }
    
}
