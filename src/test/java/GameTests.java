import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTests {

    @Test
    public void testStartMethod(){
        Game game = new Game();
        String hiddenWord = game.Start();
        String rellyHiddenWord = game.getHiddenWord();
        assertTrue(rellyHiddenWord.equals(hiddenWord));
    }

    @Test
    public void testInputAnswer(){
        Game game = new Game();
        String answer = game.InputAnswer("а");
        String reallyAnswer = game.getUserAnswer();
        assertEquals(answer, reallyAnswer);
    }
}
