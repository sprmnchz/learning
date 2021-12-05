package root;

public class GeneratorNumbers { //Генерация случайного числа от 0 до 100

    private int number;
    private int clipboardNumber = number;

    public int getNumberGeneration(){
        numberGeneration();
        return clipboardNumber;
    }

    private void numberGeneration (){
        number =(int)(Math.random()*100+1);
    }

}
