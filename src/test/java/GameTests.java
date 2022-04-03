import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class GameTests {

    @Test
    public void testStartMethod(){
        Game game = new Game();
        String hiddenWord = game.Start();
        String rellyHiddenWord = game.getHiddenWord();
        assertTrue(rellyHiddenWord.equals(hiddenWord));
    }
}
