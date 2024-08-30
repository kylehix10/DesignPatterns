//Kyle Hix

import java.util.List;
import java.util.Queue;

public class Store implements Observer{

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;


    public Store(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }

    public void update(Book book) {
        bestSellers.add(book);
        
    }

    public List<Book> getBestSellers;{ 
        
    }
    
}
