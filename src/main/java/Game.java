import lombok.Getter;

@Getter

public class Game {
    private String[] words = {"dog", "line", "flower", "house"};

    private char userAnswer;

    private String hiddenWord;

    private char[] stars = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};

    private String hiddenWordMask;

    public String start(){
        int index = 0 + (int)(Math.random() * (words.length));
        hiddenWord = words[index];
        hiddenWordMask = new String(stars, 0, hiddenWord.length());
        return hiddenWord;
    }

    public char inputAnswer(char answer){
        userAnswer = answer;
        return userAnswer;
    }

    public int checkAnswer(){
        int index = hiddenWord.indexOf(userAnswer);
        if (index != -1)
        {
            if (hiddenWord.charAt(index) == userAnswer)
            {
                StringBuilder newHiddenWordMask = new StringBuilder(hiddenWordMask);
                newHiddenWordMask.setCharAt(index, userAnswer);
                hiddenWordMask = newHiddenWordMask.toString();
                if (hiddenWordMask.indexOf('*') == -1)
                    return 100;
                return index;
            }
        }
        return -1;
    }
}
