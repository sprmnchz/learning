import java.util.ArrayList;

public class Menu {

    private static final ArrayList <String> generalMenu = new ArrayList<>();
    private static final ArrayList <String> editMenu = new ArrayList<>();
    private static final ArrayList <String> editTargetMenu = new ArrayList<>();
    private static final ArrayList <String> editStepMenu = new ArrayList<>();

    private static void setGeneralMenu(){
        generalMenu.add("CT: Create target");
        generalMenu.add("ET: Edit target");
        generalMenu.add("DT: Delete target");
        generalMenu.add("E: Exit");
    }

    private static void setEditMenu(){
        editMenu.add("ES: Edit step");
        editMenu.add("ET: Edit target");
    }

    private static void setEditTargetMenu() {
        editTargetMenu.add("rt: Rename target");
        editTargetMenu.add("as: Add step");
        editTargetMenu.add("ds: Delete step");
        editTargetMenu.add("e: Exit edit");
    }

    private static void setEditStepMenu() {
        editStepMenu.add("rs: Rename step");
        editStepMenu.add("fs: Finish step");
        editStepMenu.add("ds: Finish step");
        editStepMenu.add("e: Exit edit");
    }

    private static void setAllAppMenu(){
        setGeneralMenu();
        setEditMenu();
        setEditTargetMenu();
        setEditStepMenu();
    }

    public static void showGeneralMenu(){
        showMenu(generalMenu);
    }

    public static void showTargetMenu(){
        showMenu(editStepMenu);
        showMenu(editMenu);
    }

    public static void showEditStepMenu () {
        showMenu(editStepMenu);
    }

    public static void

    private static void showMenu(ArrayList <String> menu) {
        for (String menuItem : menu) {
            System.out.print(menuItem + " | ");
        }
    }

    public static void main(String[] args) {
        setAllAppMenu();

    }
}
