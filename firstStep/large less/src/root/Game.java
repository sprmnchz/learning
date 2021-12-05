package root;

import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    private OutputFromDisplay outputFromDisplay = new OutputFromDisplay();
    private int inputUser;
    private GeneratorNumbers generator = new GeneratorNumbers();
    private int generatedNumber;
    private int countTrying;
    private boolean nextGame = true;
    private final int nextRound = 1;
    private int buffer;


    public void start(){
        do {
            outputFromDisplay.outputTheInstruction();
            generatorNumbersForGame();
            countTrying = 0;
            do {
                input();
                //if (inputUser == generatedNumber) outputFromDisplay.outputSuccessfulResult();
                if (inputUser > generatedNumber) outputFromDisplay.outputNeedLessNumber();
                if (inputUser < generatedNumber) outputFromDisplay.outputNeedLargeNumber();
                countTrying++;
            } while (inputUser != generatedNumber);
            outputFromDisplay.outputSuccessfulResult();
            System.out.println("Было попыток " + countTrying);
            System.out.println("---------------");
            System.out.println("Хотите сыграть еще?");
            System.out.println("1 - Next round");
            System.out.println("0 - Closed the game");
            buffer = scanner.nextInt();
            if (buffer == 0) nextGame=false;
        } while (nextGame);
    }

    private void input(){
        outputFromDisplay.requestInputTheNumber();
        inputUser = scanner.nextInt();
    }

    private void generatorNumbersForGame(){generatedNumber = generator.getNumberGeneration();}

}
