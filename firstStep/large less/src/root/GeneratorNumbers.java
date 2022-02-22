package root;

public class GeneratorNumbers { //Генерация случайного числа от 0 до 100


    private int clipboardNumber;

    public int getNumberGeneration(){
        numberGeneration();
        return clipboardNumber;
    }

    private void numberGeneration (){
        int number;
        number =(int)(Math.random()*100+1);
        clipboardNumber=number;
        System.out.println("numberGeneration"+number);
    }

}
