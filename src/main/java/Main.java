import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Game game = new Game();
        game.start();
        int codeOfChecking = 0;
        do {
            System.out.println("hidden word is:" + game.getHiddenWordMask());
            System.out.println("input symbol: ");
            Scanner scanner = new Scanner(System.in);
            String ch = scanner.nextLine();
            game.inputAnswer(ch.charAt(0));
            codeOfChecking = game.checkAnswer();
            if (codeOfChecking == -1)
            {
                System.out.println("wrong symbol!");
            }
            else
            {
                System.out.println("correct symbol!");
            }
        }while(codeOfChecking != 100);
        System.out.println("Victory! Yakubovich is proud of you");
    }
}
