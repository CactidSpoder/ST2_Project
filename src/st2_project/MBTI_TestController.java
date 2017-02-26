package st2_project;

import java.util.ArrayList;

/**
 *
 * @author Paolo Merle, Corina Obrero
 */
public class MBTI_TestController {
    
    private final MBTI_TestView testView;
    private final MBTI_TestModel testModel;
    private final ArrayList<String> answerList;
    
    public MBTI_TestController(){
        
        testView = new MBTI_TestView();
        testModel = new MBTI_TestModel(this);
        answerList = new ArrayList<>();
    }
    
    public void startQuiz() {
        
        for(int x = 0; x < testModel.size(); x++) {
            
            testView.askQuestion(testModel.getQuestion(x));
            answerList.set(x, testView.getInput());
        }
    }
    
    public void calculatePersonalityType(){
        
        //todo calculations here
    }
    
}
