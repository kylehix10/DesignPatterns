//KyleHix

import observer.Genre;

public class Book{

    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;
    private String toString;

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
        return "----- "+ title +"-----\n"+ genre +" by: "+ authorFirstName 
        + authorLastName + "\n" + description;
                
    }
    


}