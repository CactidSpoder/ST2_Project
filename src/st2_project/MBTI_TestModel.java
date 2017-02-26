package st2_project;

import java.util.ArrayList;

/**
 *
 * @author Paolo Merle, Corina Obrero
 */

class MBTI_TestModel {
    
    private final ArrayList<String> questions;

    MBTI_TestModel() {
        
        questions = new ArrayList<>();
    }
    
    public int size(){
    
        return questions.size();
    }

    public String getQuestion(int index) {
        
        return questions.get(index);
    }
}
