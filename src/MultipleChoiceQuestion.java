
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class MultipleChoiceQuestion extends Question<String> {
    private String Answer;
    private final LinkedList Choices;

    public MultipleChoiceQuestion(String Text) {
        super(Text);
        this.Answer = null;
        this.Choices = new LinkedList();
    }

    @Override
    public String getQuestion() {
        String QuestionText = getText()+"\n";
        for(int i=0;i<this.Choices.size();++i)
            QuestionText+= i+")"+this.Choices.get(i)+"  ";
        return QuestionText;
        // Next Version Shuffle
    }

    @Override
    public String getAnswer() {
        return this.Answer;
    }

    @Override
    public boolean checkAnswer(String Answer) {
        if(Answer==this.Answer)
            return true;
        return false;
    }
    
    public void addChoice(String Choice, boolean check){
        this.Choices.add(Choice);
        if(check && this.Answer==null)
            this.Answer = Choice;
    }
    
}