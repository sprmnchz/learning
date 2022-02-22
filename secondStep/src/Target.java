import java.util.ArrayList;

public class Target {

    private String name;
    private int indexItem;
    private ArrayList<Step> stepList = new ArrayList<>();



    public void addStep(Step step){
        stepList.add(step);
    }

    public void getTargetList() {
        System.out.println(" ");
        System.out.println("Name List");
        System.out.println("----------");
        System.out.println(getName());
        System.out.println("----------");
        System.out.println("    " + "Name step " + " | " + "State step");
        System.out.println("    " + "-------------");
        showStepList();
    }

    private void showStepList(){
        for (Step iteratorList : stepList){
            System.out.println("    " + iteratorList.getName() + " " + "|" + " " + iteratorList.getDone());
            System.out.println("    " + "-------------");
        }
    }

    public void setName(String nameTarget) {
        this.name = nameTarget;
    }

    public String getName() {
        return name;
    }

    public void deleteStep(int indexItem){
        stepList.remove(indexItem);
    }

    public Target factoryTarget(){
        return new Target();
    }


}
