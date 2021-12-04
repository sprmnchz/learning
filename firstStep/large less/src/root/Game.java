package root;

import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    private OutputFromDisplay outputFromDisplay = new OutputFromDisplay();
    private int inputUser;
    private GeneratorNumbers generator = new GeneratorNumbers();
    private int generatedNumber;
    int countTrying;

    public void start(){
        generatorNumbersForGame();
        outputFromDisplay.outputTheInstruction();
        countTrying = 0;
        do {

            input();
            //if (inputUser == generatedNumber) outputFromDisplay.outputSuccessfulResult();
            if (inputUser > generatedNumber) outputFromDisplay.outputNeedLessNumber();
            if (inputUser < generatedNumber) outputFromDisplay.outputNeedLargeNumber();
            countTrying++;
        } while (inputUser != generatedNumber);

        outputFromDisplay.outputSuccessfulResult();
        System.out.println("Было попыток "+ countTrying);
    }

    private void input(){
        outputFromDisplay.requestInputTheNumber();
        inputUser = scanner.nextInt();
    }

    private void generatorNumbersForGame(){generatedNumber = generator.numberGeneration();}

}
