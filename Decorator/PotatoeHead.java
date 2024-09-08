//KyleHix 2024

/**
 * PotatoeHead class is a character and sets a default value for the ArrayList lines
 */
public class PotatoeHead extends Character {
    /**
     * Sets default values for PotatoeHead
     * @param name Takes in the name of a character.
     */
    public PotatoeHead(String name){
    super(FileReader.getLines("txt/potatoe-head.txt"), name);
    }
}
