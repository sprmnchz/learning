package root;

import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    private OutputFromDisplay outputFromDisplay = new OutputFromDisplay();
    private int inputUser;
    private GeneratorNumbers generator = new GeneratorNumbers();
    private int generatedNumber;

    public void start(){
        generatorNumbersForGame();
        outputFromDisplay.outputTheInstruction();
        do {

            input();
            //if (inputUser == generatedNumber) outputFromDisplay.outputSuccessfulResult();
            if (inputUser > generatedNumber) outputFromDisplay.outputNeedLessNumber();
            if (inputUser < generatedNumber) outputFromDisplay.outputNeedLargeNumber();
        } while (inputUser != generatedNumber);

        outputFromDisplay.outputSuccessfulResult();
    }

    private void input(){
        outputFromDisplay.requestInputTheNumber();
        inputUser = scanner.nextInt();
    }

    private void generatorNumbersForGame(){generatedNumber = generator.numberGeneration();}

}
