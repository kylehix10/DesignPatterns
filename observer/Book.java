//Kyle Hix 2024


public class Book{

    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;
    private String toString;
/**
 * Setting the default constructors for the Book class
 */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description){
        this.title=title;
        this.genre=genre;
        this.authorFirstName=authorFirstName;
        this.authorLastName=authorLastName;
        this.description=description;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getDescription() {
        return description;
    }

    public String getToString() {
        return toString;
    }

    public String toString() {
        return "\n----- "+ this.title +"-----\n"+ this.genre.label +" by: "+ this.authorFirstName 
        + " "+this.authorLastName + "\n" + this.description+"\n";
                
    }
    


}