//Kyle Hix 2024

import java.util.List;

public class BinarySearch implements SearchBehavior{
    
    public boolean contains(List<Person> people, Person person) {

      int start = 0;
      int end = people.size()-1;
      while(start <= end){

        int middle = start + (end-start) /2;

        if(people.get(middle).equals(person))
          return true;

        if(people.get(middle).compareTo(person)<0)
          start=middle+1;
        else
          end = middle-1;
      }
      return false;
  }
}
