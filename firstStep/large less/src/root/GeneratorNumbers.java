package root;

import java.util.Random;

public class GeneratorNumbers { //Генерация случайного числа от 0 до 100


    private int clipboardNumber;

    public int getNumberGeneration(){
        numberGeneration();
        //System.out.println("getNumberGeneration"+clipboardNumber);
        return clipboardNumber;
    }

    private void numberGeneration (){
        int number;
        number =(int)(Math.random()*100+1);
        //number = r.nextInt(100);
        clipboardNumber=number;
        System.out.println("numberGeneration"+number);
    }

}
