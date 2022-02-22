public class Step {

    private String name;
    private boolean done;

    Step (String name){
        this.name =name;
        done = false;
    }

    public boolean getDone(){
        return done;
    }

    public void changeDone(boolean done) {
        if (done == true)
            this.done = false;
        else
            this.done = true;
    }

    public String getName() {
        return name;
    }
    public void setName(String nameStep) {
        this.name = nameStep;
    }

}
