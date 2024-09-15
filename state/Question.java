//Kyle Hix 2024

/**
 * Question Class that creates a questions and checks for correct answer
 */

public class Question {

    private String question;
    private int answer;

    /**
     * Creates a question based on the operator
     * @param num1 integer that is chosen at random from difficulty classes
     * @param num2 integer that is chosen at random from difficulty classes
     * @param operation Plus, minus, multiply, or divide.
     */
    public Question(int num1, int num2, Operation operation){
        switch (operation) {
            case PLUS:
                this.question = num1 + " + " + num2;
                this.answer = num1 + num2;
                break;
            case MINUS:
                this.question = num1 + " - " + num2;
                this.answer = num1 - num2;
                break;
            case MULTIPLY:
                this.question = num1 + " * " + num2;
                this.answer = num1 * num2;
                break;
            case DIVIDE:
                this.question = num1 + " / " + num2;
                this.answer = num1 / num2;
                break;
        }
    }

    /**
     * returns question from the constructor
     */
    public String toString(){
        return question;
    }

    /**
     * returns the answer from the constructor
     * @return
     */
    public int getAnswer(){
        return answer;
    }

    /**
     * Checks for the correct answer.
     * @param answer Takes in the users response
     * @return true or false bases on if the user answer matches the answer.
     */
    public boolean isCorrect(int answer){
        if(this.answer==answer)
         return true;
        else
         return false;
    }
    
}
