import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class GameTests {

    @Test
    public void testStartMethod(){
        Game game = new Game();
        String hiddenWord = game.start();
        String rellyHiddenWord = game.getHiddenWord();
        assertTrue(rellyHiddenWord.equals(hiddenWord));
    }

    @Test
    public void testInputAnswer(){
        Game game = new Game();
        char answer = game.inputAnswer('a');
        char reallyAnswer = game.getUserAnswer();
        assertEquals(answer, reallyAnswer);
    }

    @Test
    public void testCheckAnswer(){
        Game game = new Game();
        game.start();
        char answer = game.inputAnswer('a');
        int index = game.checkAnswer();
        assertTrue(index >= -1);
        assertTrue(index <= game.getHiddenWord().length() - 1);
    }
}
