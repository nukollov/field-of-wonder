import lombok.Getter;

@Getter

public class Game {
    private String[] words = {"собака", "автомобиль", "цветок", "дом"};

    private String userAnswer;

    private String hiddenWord;

    public String Start(){
        int index = 0 + (int)(Math.random() * (words.length));
        hiddenWord = words[index];
        return hiddenWord;
    }

    public String InputAnswer(String answer){
        return "";
    }
}
