

import java.util.ArrayList;

/**
 * @author Kyle Hix
 * Class outlines the properties of a question.
 * Returns a question, an answer, and checks if the user is correct.
 */

public class Question {

    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    /**
     * Constructors of the Question class.
     * @param question Storing the input of question to this question.
     * @param correctAnswer Storing the index of the correct Answer. Given by the txt file
     * @param answer An array of string. Multiple choice answers.
     */
    public Question(String question, int correctAnswer, String[] answer){
        this.question=question;
        answers=new ArrayList<String>();
        for(int i=0; i<answer.length;i++){
           String multipleChoice=answer[i];
            answers.add(multipleChoice);
        }
        this.correctAnswer= correctAnswer;
    }
    /**
     * Returns the question with answer choices in a multiple choice format. 
     * Note: the choice option does not match the index.
     */
    public String toString(){
        return 
           "\n"+ question+"\n"+
            "1. "+answers.get(0)+" "+
            "2. "+answers.get(1)+" "+
            "3. "+answers.get(2)+" "+
            "4. "+answers.get(3);
    }

    /**
     * Checks the users input against the correct answer index
     * @param userAnswer 
     * @return
     */
    public boolean isCorrect(int userAnswer){
        int answer=userAnswer-1;
        if(answer==correctAnswer)
            return true;
        else
            return false;
    }

    /**
     * Pulling correct answer index from the array.
     * @return
     */
    public String getCorrectAnswer(){
       return answers.get(correctAnswer);
    }
    
}
