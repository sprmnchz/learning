package root;

public class OutputFromDisplay {

    public void outputTheInstruction(){
        System.out.println("Вам нужно угадать число за меньшее число попыток. После ввода будет выдан результат. Верный ли ответ или насколько выблизззко");
    }

    public void requestInputTheNumber(){
        System.out.println("Введите число");
    }
/*
    public void outputFailResult(){
        System.out.println("Вы не угадали");
    }
*/
    public void outputSuccessfulResult(){
        System.out.println("Вы угадали");
    }

    public void outputNeedLargeNumber(){
        System.out.println("Вы не угадали");
        System.out.println("Введите число с большим значением");
    }

    public void outputNeedLessNumber(){
        System.out.println("Вы не угадали");
        System.out.println("Введите число с меньшим значением");
    }

}
