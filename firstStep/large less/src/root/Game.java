package root;

import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);
    private final OutputFromDisplay outputFromDisplay = new OutputFromDisplay();
    private int inputUser;
    private final GeneratorNumbers generator = new GeneratorNumbers();
    private int generatedNumber;
    private int countTrying;
    private boolean nextGame = true;

    public void start(){
        do {
            generatorNumbersForGame();
            outputFromDisplay.outputTheInstruction();
            countTrying = 0;
            do {
                input();
                if (inputUser > generatedNumber) outputFromDisplay.outputNeedLessNumber();
                if (inputUser < generatedNumber) outputFromDisplay.outputNeedLargeNumber();
                countTrying++;
            } while (inputUser != generatedNumber);
            outputFromDisplay.outputSuccessfulResult();
            System.out.println("Было попыток " + countTrying);
            System.out.println("---------------");
            System.out.println("Хотите сыграть еще?");
            System.out.println("another number - Next round");
            System.out.println("0 - Closed the game");
            input();
            if (inputUser == 0) nextGame=false;
        } while (nextGame);
    }

    private void input(){
        outputFromDisplay.requestInputTheNumber();
        inputUser = scanner.nextInt();
    }

    private void generatorNumbersForGame(){generatedNumber = generator.getNumberGeneration();}

}
