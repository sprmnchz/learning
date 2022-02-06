import java.util.HashMap;
import java.util.Map;

public class TargetList {

    private HashMap<Integer, Target> targetList = new HashMap<>();
    private int countKeyTargetList = 1;


    public void addInTargetList(Target target){
        targetList.put(countKeyTargetList, target);
        countKeyTargetList++;
    }

    private void iteratorTargetList (){
        for (Map.Entry <Integer, Target> iter : targetList.entrySet()) {
            var target = iter.getValue();
            System.out.println(target.getName());
            target.getTargetList();
        }
    }

    public void displayTargetList(){
        iteratorTargetList();
    }

    public static void main(String[] args) {
        var targetList = new TargetList();
        for (int i = 0;i < 5; i++){

        }
        targetList.displayTargetList();
    }


}
