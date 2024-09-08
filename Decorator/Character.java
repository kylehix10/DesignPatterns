//KyleHix 2024

import java.util.ArrayList;
/**
 * Character abstract class that outlines a character.
 */
public abstract class Character {

    private String name;
    protected ArrayList<String> lines;

    /**
     * Character constructors
     * @param lines horizontal lines of characters to be printed to the terminal
     * @param name String that is the name of the character
     */
    public Character(ArrayList<String> lines, String name){
        this.name=name;
        this.lines= lines;
    }
    /**
     * Returns a name
     * @return returns the name.
     */
    public String getName(){
        return name;
    }

    /**
     * Uses StringBuilder to space the lines out.
     * Prior to using, the text was bunched together across the screen.
     * Used GeeksforGeeks.org on how to use StringBuilder
     * 
     * returns the string from the txt files.
     */
    public String toString(){
        StringBuilder result = new StringBuilder("----- " + name + " -----\n");
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
               
    }

    
}

