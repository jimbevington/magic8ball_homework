import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestMagic8Ball {

    private Magic8Ball ball;
    private ArrayList<String> answers;

    @Before
    public void before(){
        answers = new ArrayList<>();
        answers.add("Get some sleep");
        answers.add("Stuff it in the microwave");
        answers.add("Brexit means Brexit");
        ball = new Magic8Ball(answers);
    }

//    test if the Magic8Ball has some answers
    @Test
    public void hasAnswers(){
        ArrayList answers = ball.getAnswers();
        assertEquals(3, answers.size());
    }

    @Test
    public void canGetAnswer(){
        ArrayList answers = ball.getAnswers();
        String randomAnswer = ball.shakeBall();
        assertTrue(answers.contains(randomAnswer));
    }

    @Test
    public void canAddAnswer(){
        ball.addAnswer("Me too");
        ArrayList answers = ball.getAnswers();
        assertEquals(4, answers.size());
    }

    @Test
    public void canRemoveAnswer__success(){
        String answer = "Get some sleep";
        ball.removeAnswer(answer);
        ArrayList answers = ball.getAnswers();
        assertFalse(answers.contains(answer));
    }

    @Test
    public void canRemoveAnswer__fail(){
        String answer = "Jump";
        ball.removeAnswer(answer);
        ArrayList answers = ball.getAnswers();
        assertEquals(3, answers.size());
    }

}
