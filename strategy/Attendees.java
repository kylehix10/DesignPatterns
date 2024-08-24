//Kyle Hix 2024

import java.util.List;

public class Attendees {

    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    public Attendees(String title){
        this.title=title;
    }

    public Person add(String firstName, String lastName, String phoneNumber, String reminder)
    {
      Person person = new Person(firstName, lastName, phoneNumber, reminder);
      people.add(person);
      return person;

    }

    public String getTitle()
    {
        return title;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior)
    {
        this.searchBehavior=searchBehavior;
    }

    public List<Person> getList()
    {
        return people;
    }


    
    




}