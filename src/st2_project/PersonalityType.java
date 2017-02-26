package st2_project;

/**
 *
 * @author Paolo Merle, Corina Obrero
 */

public class PersonalityType {
    
    private final String name;
    private final String description;

    public PersonalityType(String name, String description){
        
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    
    public String getDescription() {
        
        return description;
    }
}
