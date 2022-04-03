import lombok.Getter;

@Getter

public class Game {
    private String[] words = {"собака", "автомобиль", "цветок", "дом"};

    private String userAnswer;

    private String hiddenWord;

    public String Start(){
        return "";
    }
}
