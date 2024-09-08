//KyleHix 2024

import java.util.ArrayList;
/**
 * Eyes Class that extends the CharacterDecorator
 * Updates the ArrayList lines with text from a new txt file
 */

public class Eyes extends CharacterDecorator{
   
    /**
     * Pulling lines from a txt file and storing them into a new list.
     * @param character Eyes are a character as well as a decoration
     */
    public Eyes(Character character){
        super(character);

        ArrayList<String> bodyPart = new ArrayList<>();
        bodyPart=FileReader.getLines("txt/eyes.txt");
        
        integrateDecor(bodyPart);

    }

    /**
     * Abstract method used to update the original printed txt with new lines of characters.
     */
    protected void integrateDecor(ArrayList<String>decor){

        for (int i = 0; i < decor.size(); i++) {

            String originalLine = this.lines.get(i); //Old line
            String decorLine = decor.get(i); //to be appended line

            
            StringBuilder overlappedLine = new StringBuilder();
            for (int j = 0; j < originalLine.length(); j++) {
                if (j < decorLine.length() && decorLine.charAt(j) != ' ') {
                    overlappedLine.append(decorLine.charAt(j)); // Placing new lines
                } else {
                    overlappedLine.append(originalLine.charAt(j)); // Keeping original lines
                }
            }
            
            this.lines.set(i, overlappedLine.toString());//updating
        }
    }
    }
    

