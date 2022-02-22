import java.util.Scanner;

public class InputUserData {

    private static String bufferString;
    private static int bufferInt;
    private static int countStep=0;
    private static int countTarget=0;
    private static int countExit=0;
    private static Scanner input = new Scanner(System.in);


    public static String getStringData(){
        //bufferString = input.nextLine();
        bufferString = "Step"+ Integer.toString(countStep);
        if (countExit==0){
            bufferString = "Target"+ countTarget;
        }
        countStep++;
        countExit++;
        if (countExit == 4){
            bufferString = "exit";
        }
        if (bufferString.equalsIgnoreCase("exit")) {
            countExit = 0;
            countTarget++;
        }
        return bufferString;
    }

    public static int getIntData (){
        bufferInt = input.nextInt();
        return bufferInt;
    }

}
