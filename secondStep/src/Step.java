public class Step {

    private String name;
    private boolean done;

    public Step (String name){
        done = false;
    }

    public boolean getDone(){
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
