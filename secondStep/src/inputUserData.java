import java.util.Scanner;

public class inputUserData {

    private static String buffer;

    private static void inputString(){
        Scanner input = new Scanner(System.in);
        buffer = input.nextLine();
    }

    public static String getData(){
        inputString();
        return buffer;
    }

}
