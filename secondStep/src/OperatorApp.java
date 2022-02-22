import java.util.Locale;

public class OperatorApp {

    private String nameStep;
    private String nameTarget;
    private int indexItem;
    private boolean doneStep;
    private TargetList targetList = new TargetList();
    private OperatorApp operatorApp;
    private Step step;
    private Target target;


    private Target createTarget() {

        var target = new Target();
        Step step;
        boolean nextAddStep;

        System.out.println();
        System.out.println("Enter target");
        nameTarget = InputUserData.getStringData();
        target.setName(nameTarget);
        do {
            step = createSteps();
            nextAddStep = checkExit(nameStep);
            if (step != null) {
                target.addStep(step);
            }
        }
        while (nextAddStep);
        return target;
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

    private void check (String inputString){
        inputString = inputString.toUpperCase(Locale.ROOT);
        switch (inputString) {
            case ("T"):
                operatorApp.showMainArea();
                break;
            case ("C"):
                operatorApp.addTargetList();
                break;
            case ("E"):

                break;
            case ("EL"):
                Menu.showEditTargetList();
                break;
            case ("ET"):
                Menu.showEditTarget();
                System.out.println("Enter number target");
                indexItem = InputUserData.getIntData();
                target = targetList.getTarget(indexItem);
                break;
            case ("ES"):
                Menu.showEditStep();
                break;
            case ("dt"):
                System.out.println("Enter index deleting target");
                indexItem = InputUserData.getIntData();
                targetList.delete(indexItem);
                break;
//            case ("at"):
//                operatorApp.addTargetList();
//                break;
            case ("rt"):
                System.out.println("Enter name target");
                target.setName(InputUserData.getStringData());
                break;
            case ("as"):
                target.addStep(createSteps());;
                break;
            case ("ds"):
                System.out.println("Enter number step");
                indexItem = InputUserData.getIntData();
                target.deleteStep(indexItem);
                break;
            case ("rs"):
                System.out.println("Enter name step");
                nameStep = InputUserData.getStringData();
                step.setName(nameStep);
                break;
            case ("fs"):
                step.changeDone(doneStep);
                System.out.println("Step state has been changed");
                break;
            case ("exit"):
                break;
            default:
                break;
        }

    }

    private Step createSteps(){

        Step step = null;
        //boolean nextAddStep;

        System.out.println("Enter name step");
        nameStep = InputUserData.getStringData();
        if (nameStep.isEmpty()){
        createSteps();
        }
        if (!nameStep.equalsIgnoreCase("exit")){
        step = new Step(nameStep);
        }
        return step;
    }

    public void addTargetList (){
        targetList.add(createTarget());
    }

    public void showMainArea(){
        Menu.showGeneralMenu();
        targetList.show();
        Menu.showEditMenu();
    }

}

