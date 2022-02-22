import java.util.HashMap;
import java.util.Map;

public class TargetList {

    private HashMap<Integer, Target> targetList = new HashMap<>();
    private Target target = new Target();
    private int index = 1;


    public void add(Target target){
        index = targetList.size();
        if (index != 0) index++;
        targetList.put(index, target);
    }

    private void List(){
        for (Map.Entry <Integer, Target> iter : targetList.entrySet()) {
            var target = iter.getValue();
            //System.out.println(target.getName());
            target.getTargetList();
        }
    }

    public Target getTarget(int index){
        target = targetList.get(index);
        return target;
    }

    public void delete(int index){
        targetList.remove(index);
    }

    public void show(){
        List();
    }
}
