//Kyle Hix 2024

import java.util.List;

public class LinearSearch implements SearchBehavior{
    
    public boolean contains(List<Person> people, Person person) {
       people.sort(null);
 
      for(Person guest : people){
        if(guest.equals(person))
            return true;
        }
        return false;
     }
}
