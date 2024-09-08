//KyleHix 2024

import java.util.ArrayList;
/**
 * Abstract base class that extends Character
 */
public abstract class CharacterDecorator extends Character{
    private Character character;

    /**
     * Constructors of the CharacterDecorator class.
     * @param character character is a Character.
     */
    public CharacterDecorator(Character character){
        super(character.lines,character.getName());
        this.character=character;
    }

    /**
     * Abstract method to be implemented in other classes.
     * @param decor Takes in a ArrayList<String>. Used to take in txt files.
     */
    protected void integrateDecor(ArrayList<String>decor){
        
    }
}