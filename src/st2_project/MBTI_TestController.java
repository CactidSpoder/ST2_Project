package st2_project;

/**
 *
 * @author Paolo Merle, Corina Obrero
 */

public class MBTI_TestController {
    
    private final String[] answerList;
    private final MBTI_TestView testView;
    private final MBTI_TestModel testModel;
    private final PersonalityTypeModel personalityModel;
    
    public MBTI_TestController(){
        
        answerList = new String[70];
        
        //for testing only
        /*
        for(int x = 0; x < answerList.length; x += 7)
            answerList[x] = "A";
        
        for(int x = 1; x < answerList.length; x += 7)
            answerList[x] = "B";
        
        for(int x = 2; x < answerList.length; x += 7)
            answerList[x] = "B";
        
        for(int x = 3; x < answerList.length; x += 7)
            answerList[x] = "A";
        
        for(int x = 4; x < answerList.length; x += 7)
            answerList[x] = "A";
        
        for(int x = 5; x < answerList.length; x += 7)
            answerList[x] = "B";
        
        for(int x = 6; x < answerList.length; x += 7)
            answerList[x] = "B";
        */
        
        testView = new MBTI_TestView();
        testModel = new MBTI_TestModel(this);
        personalityModel = new PersonalityTypeModel();
    }
    
    public void startQuiz() {
        
        for(int x = 0; x < testModel.size(); x++) {
            
            testView.askQuestion(testModel.getQuestion(x));
            answerList[x] = testView.getInput();
        }
    }
    
    public void calculatePersonalityType(){
        
        String acronym = "";
        
        acronym += isA(0, 0) ? "E" : "I";
        acronym += isA(1, 2) ? "S" : "N";
        acronym += isA(3, 4) ? "T" : "F";
        acronym += isA(5, 6) ? "J" : "P";
        
        PersonalityType personalityType = personalityModel.getType(acronym);
        
        testView.showPersonalityType(acronym, personalityType.getName(),
                personalityType.getDescription());
    }
    
    public boolean isA(int startNode1, int startNode2){
        
        int a = 0;
        int b = 0;
        
        a += summarize("A", startNode1);
        b += summarize("B", startNode1);
        
        if(startNode1 != startNode2){
            
            a += summarize("A", startNode1);
            b += summarize("B", startNode1);
        }
        
        return a > b;
    }
    
    private int summarize(String answer, int startNode){
        
        int sum = 0;
        
        for(int x = startNode; x < answerList.length; x += 7)
            if(answerList[x].equalsIgnoreCase(answer))
                sum++;
        
        return sum;
    }
}
