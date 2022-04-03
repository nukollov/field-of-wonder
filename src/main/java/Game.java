import lombok.Getter;

@Getter

public class Game {
    private String[] words = {"собака", "автомобиль", "цветок", "дом"};

    private String userAnswer;

    private String hiddenWord;

    private char[] stars = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};

    private String hiddenWordMask;

    public String start(){
        int index = 0 + (int)(Math.random() * (words.length));
        hiddenWord = words[index];
        hiddenWordMask = new String(stars, 0, hiddenWord.length());
        return hiddenWord;
    }

    public String inputAnswer(String answer){
        userAnswer = answer;
        return userAnswer;
    }

    public int checkAnswer(){

    }
}
