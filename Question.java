

import java.util.List;

public class Question {

    public String question1;
    public List<String> answer1;
    public String correctAnswer1;
    public Question() {
        super();
    }

    @Override
    public String toString() {
        return "Question{" +
                "question1='" + question1 + '\'' +
                ", answer1=" + answer1 +
                ", correctAnswer='" + correctAnswer1 + '\'' +
                '}';
    }
    public Question(String question1, String s, String tętnica) {
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public List<String> getAnswer1() {
        return answer1;
    }

    public void setAnswer1(List<String> answer1) {
        this.answer1 = answer1;
    }

    public String getCorrectAnswer() {
        return correctAnswer1;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer1 = correctAnswer;
    }

    public Question(String question1, List<String> answer1, String correctAnswer) {
        this.question1 = question1;
        this.answer1 = answer1;
        this.correctAnswer1 = correctAnswer;
    }
}

