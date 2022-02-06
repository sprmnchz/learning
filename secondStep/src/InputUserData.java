import java.util.Scanner;

public class InputUserData {

    private static String buffer;
    private static int count=0;

    private static void inputString(){
        Scanner input = new Scanner(System.in);
        buffer = input.nextLine();
    }

    public static String getData(){
        //inputString();
        buffer = "Step"+ Integer.toString(count);
        count++;
        if (count == 4){
            buffer= "exit";
            count = 0;
        }
        if (buffer.equalsIgnoreCase("exit")) {
            count = 0;
        }
        return buffer;
    }

}
