//Kyle Hix 2024

import java.util.LinkedList;
import java.util.List;


/** Creating a List of People for an event */
public class Attendees {

    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    /**
     * title: Title of the event
     * people: A list of people attending the event.
     * searchBehavior: Type of search that will be used for the list.
    */

    /**
     * Setting the default constructors
     * people: Using a linked list 
     * searchBehavior: Setting default search method to Linear Search.
     */
    public Attendees(String title){
        this.title=title;
        this.people= new LinkedList<>();
        this.searchBehavior=new LinearSearch();
    }

    /**
     * Adding a new person to List<people>
     * Returning either the new person or null if person already on list.
     * 
     * Used the sorting method here instead of in the search classes
     * because it was not sorting the last person in the list. 
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder){
      Person person = new Person(firstName, lastName, phoneNumber, reminder);

      boolean present= searchBehavior.contains(people, person);
      if(!present){
        people.add(person);
        people.sort(null);
        return person;
      }
      else
        return null;
    }

    /**
     * @return Gets the title of the event
     */
    public String getTitle(){
        return title;
    }

    /**
     * Sets the searchBehavior to what he user decided. Default is Linear Search.
     */
    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior=searchBehavior;
    }

    /**
     * Returns the list of people.
     */
    public List<Person> getList() {
            return people;
    }
}