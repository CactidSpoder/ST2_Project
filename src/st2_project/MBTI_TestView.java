package st2_project;

import java.util.Scanner;

/**
 *
 * @author Paolo Merle, Corina Obrero
 */

public class MBTI_TestView {
    
    private final Scanner sc;
    
    public MBTI_TestView() {
        
        sc = new Scanner(System.in);
    }
     
    public void askQuestion(String question){
        
        System.out.println(question);
    }
    
    public String getInput(){
        
        System.out.print("Your choice: ");
        String input = sc.next();
        
        while(!(input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B"))) {
            
            System.out.println("\nInvalid input. Please input only A or B");
            System.out.print("Your choice: ");
            
            input = sc.next();
        }
        
        return input;
    }
    
    public void showPersonalityType(String acronym, String name, String description) {
        
        String[] splitDescription = description.split(" ");
        String currString = "";
        
        System.out.println("\n\nYou are an " + acronym + ", also known as \""
                + name +"\"");
        
        System.out.println("\nDescription:");
        
        for(int x = 0; x < splitDescription.length; x++){
            
            if(currString.length() < 40)
                currString += splitDescription[x] + " ";
            else{
                
                System.out.println(currString);
                currString = "";
            }
        }
        
    }
}
