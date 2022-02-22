import java.util.ArrayList;

public class Menu {

    private static final ArrayList <String> generalMenu = new ArrayList<>();
    private static final ArrayList <String> editMenu = new ArrayList<>();
    private static final ArrayList <String> editTargetList = new ArrayList<>();
    private static final ArrayList <String> editTarget = new ArrayList<>();
    private static final ArrayList <String> editStep = new ArrayList<>();

    private static void GeneralMenu(){
        generalMenu.add("T: Target list");
        generalMenu.add("C: Create target");
        generalMenu.add("E: Exit");
    }

    private static void editMenu(){
        editMenu.add("EL: Edit target list");
        editMenu.add("ET: Edit target");
        editMenu.add("ES: Edit step");
    }

    private static void editTargetList () {
        editTargetList.add("dt: Delete target");
        //editTargetList.add("at: Add target");
        editTargetList.add("e: Exit edit");
    }

    private static void editTarget () {
        editTarget.add("rt: Rename target");
        editTarget.add("as: Add step");
        editTarget.add("ds: Delete step");
        editTarget.add("e: Exit edit");
    }

    private static void editStep () {
        editStep.add("rs: Rename step");
        editStep.add("fs: Finish step");
        editStep.add("e: Exit edit");
    }

    public static void showGeneralMenu(){
        System.out.println();
        GeneralMenu();
        showMenu(generalMenu);
    }

    public static void showEditMenu(){
        System.out.println();
        editMenu();
        showMenu(editMenu);
    }

    public static void showEditTargetList(){
        System.out.println();
        editTargetList();
        showMenu(editTargetList);
    }

    public static void showEditTarget(){
        System.out.println();
        editTarget();
        showMenu(editTarget);
    }

    public static void showEditStep(){
        System.out.println();
        editStep();
        showMenu(editStep);
    }

    private static void showMenu(ArrayList <String> menu) {
        for (String iterMenu : menu) {
            System.out.print(iterMenu + " | ");
        }
    }

    public static void main(String[] args) {
        showGeneralMenu();
        System.out.println();
        showEditMenu();
        System.out.println();
        showEditTargetList();
        System.out.println();
        showEditTarget();
        System.out.println();
        showEditStep();
    }

}
