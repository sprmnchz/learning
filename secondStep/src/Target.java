import java.util.ArrayList;

public class Target {

    private String name;
    private String nameStep;
    private ArrayList<Step> stepList = new ArrayList<>();

    private void getNameStep(){
        System.out.println("Enter name step");
        nameStep = inputUserData.getData();
    }

    public void addStep (){
        getNameStep();
        if (nameStep != null) {
            Step step = new Step(nameStep);
        }
        else addStep();

    }

    public void getStepList() {
        System.out.println(getName());
        iteratorList();
    }

    private void iteratorList(){
        for (Step iteratorList : stepList){
            System.out.print(iteratorList.getName()+" "+iteratorList.getDone());
        }
    }

    public void setName() {
        System.out.println("Введите имя листа шагов");
        this.name = inputUserData.getData();
    }

    public String getName() {
        return name;
    }

    public void createTargetList(){
        setName();
        addStep();
    }
}
