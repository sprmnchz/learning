package root;

public class GeneratorNumbers { //Генерация случайного числа от 0 до 100

    private int number =(int) (Math.random()*100);
    private int clipboardNumber = number;

    public int numberGeneration(){return clipboardNumber;}

}
