import java.util.ArrayList;

public class Menu {

    private final ArrayList <String> GeneralMenu = new ArrayList<>();

    private void createMenu(){
        GeneralMenu.add("H: Home panel");
        GeneralMenu.add("C: Create list");
        GeneralMenu.add("E: Exit");
    }

    public void displayTheMenu(){
        createMenu();
        iteratorMenu();
    }

    private void iteratorMenu () {
        for (String iterGenMenu : GeneralMenu) {
            System.out.print(iterGenMenu + " | ");
        }
    }

}
