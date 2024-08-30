//Kyle Hix

import java.util.HashMap;
import java.util.ArrayList;
import observer.Genre;

public class FanReads implements Observer{

    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;
   
    public FanReads(Subject subject, String firstName, String lastName){

    }

    public void update(Book book) {
        
    }

    public ArrayList<Book> getRecommendations(Genre genre){
        
    }
    
}
