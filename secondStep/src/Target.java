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
        if (nameStep.isEmpty()) {
            addStep();
        }
        else {
            var step = new Step(nameStep);
            stepList.add(step);
        }

    }

    public void getTargetList() {
        System.out.println("Name List");
        System.out.println("______________________");
        System.out.println(getName());
        System.out.println("______________________");
        System.out.println("Name step " + " | " + "State step");
        System.out.println("______________________");
        iteratorStepList();
    }

    private void iteratorStepList(){
        for (Step iteratorList : stepList){
            System.out.println(iteratorList.getName() + " " + "|" + " " + iteratorList.getDone());
            System.out.println("-------------");
        }
    }

    public void setName() {
        System.out.println("Введите имя листа шагов");
        this.name = inputUserData.getData();

    }

    public String getName() {
        return name;
    }

    public void createTargetList() {

        boolean nextAddStep = false;

        setName();
        do {
            addStep();
            System.out.println("Еще шаг?");
            nextAddStep = checkExit();
        }
        while (nextAddStep == true);
    }

    private boolean checkExit(){

        final String y = "y";
        final String n = "n";
        boolean check = true;

        System.out.println("Finish adding?" + y + " or " + n);
        String buffer = inputUserData.getData();
        if (buffer.equalsIgnoreCase(y)) check = true;
        else if (buffer.equalsIgnoreCase(n)) check = false;
        else checkExit();
        return check;
    }


}
