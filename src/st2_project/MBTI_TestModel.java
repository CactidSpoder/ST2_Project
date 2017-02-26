package st2_project;

import java.util.ArrayList;

/**
 *
 * @author Paolo Merle, Corina Obrero
 */

class MBTI_TestModel {
    
    private ArrayList<String> questions;
    private MBTI_TestController controller;

    MBTI_TestModel(MBTI_TestController controller) {
        
        this.controller = controller;
        questions = new ArrayList<>();
    }
    
    public int size(){
    
        return questions.size();
    }

    public String getQuestion(int x) {
        
        return questions.get(x);
    }
}
