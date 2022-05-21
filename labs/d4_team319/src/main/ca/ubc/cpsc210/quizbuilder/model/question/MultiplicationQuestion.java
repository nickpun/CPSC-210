package ca.ubc.cpsc210.quizbuilder.model.question;

public class MultiplicationQuestion extends Question {
    private int factor1;
    private int factor2;
    private int ans;

    public MultiplicationQuestion(double maxMark, int factor1, int factor2) {
        super(maxMark, (factor1 +" * " +factor2 +" = ?"));
        this.factor1 = factor1;
        this.factor2 = factor2;
        this.ans = factor1*factor2;
    }

    @Override
    public boolean isCorrect(String answerS) {
        try{
            Integer.parseInt(answerS);
        } catch (NumberFormatException e){
            return false;
        }
        int answerI = Integer.parseInt(answerS);
        return (ans == answerI);
    }
}