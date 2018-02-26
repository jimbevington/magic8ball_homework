import java.util.ArrayList;
import java.util.Collections;

public class Magic8Ball {

    private ArrayList<String> answers;

    public Magic8Ball(ArrayList<String> answers){
     this.answers = answers;
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<>(this.answers);
    }

    public String shakeBall(){
        Collections.shuffle(this.answers);
        return this.answers.get(0);
    }

    public void addAnswer(String answer){
        this.answers.add(answer);
    }

    public void removeAnswer(String answer){
        if (this.answers.contains(answer)){
            this.answers.remove(answer);
        }
    }

}
