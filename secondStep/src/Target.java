import java.util.ArrayList;

public class Target {

    private String name;
    private String nameStep;
    private ArrayList<Step> stepList = new ArrayList<>();

    private void getNameStep(){
        System.out.println("Enter name step");
        nameStep = InputUserData.getData();
    }

    public void addStep (){
        getNameStep();
        if (nameStep.isEmpty()) {
            addStep();
        }
        if (!nameStep.equalsIgnoreCase("exit")) {
            var step = new Step(nameStep);
            stepList.add(step);
        }

    }

    public void getTargetList() {
        System.out.println("Name List");
        System.out.println("----------");
        System.out.println(getName());
        System.out.println("----------");
        System.out.println("    " + "Name step " + " | " + "State step");
        System.out.println("    " + "----------");
        iteratorStepList();
    }

    private void iteratorStepList(){
        for (Step iteratorList : stepList){
            System.out.println("    " + iteratorList.getName() + " " + "|" + " " + iteratorList.getDone());
            System.out.println("    " + "-------------");
        }
    }

    public void setName() {
        System.out.println("Введите имя листа шагов");
        this.name = InputUserData.getData();

    }

    public String getName() {
        return name;
    }

    public void createTarget() {

        boolean nextAddStep;

        setName();
        do {
            addStep();
            //System.out.println("Enter next step");
            nextAddStep = checkExit(nameStep);
        }
        while (nextAddStep);

    }

    private boolean checkExit(String inputString){

        final String exit = "exit";
        boolean check = true;

        System.out.println(" 'exit' for exit");
        if (inputString.equalsIgnoreCase(exit)) {
            check = false;
        }
        return check;
    }

    public Target factoryTarget(){
        return new Target();
    }


}
