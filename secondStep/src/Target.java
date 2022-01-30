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
            Step step = new Step(nameStep);
        }
        else addStep();

    }

    public void getTargetList() {
        System.out.println(getName());
        iteratorStepList();
    }

    private void iteratorStepList(){
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

    public void createTargetList() {

        boolean nextAddStep = false;

        setName();
        do {
            addStep();
            System.out.println("Еще шаг?");
            nextAddStep = checkEqualsYorN();
        }
        while (nextAddStep = true);
    }

    private boolean checkEqualsYorN(){

        final String y = "Y";
        final String n = "N";
        boolean check = false;

        System.out.println("Enter "+ y + " or "+ n);
        String buffer = inputUserData.getData();
        if (buffer.equals(y)) check = true;
        else if (buffer.equals(n)) check = false;
        else checkEqualsYorN();
        return check;
    }


}
