import java.util.ArrayList;
import java.util.List;


public class ballScore implements subject {
    private List<observer> observers;
    private score score;

    public ballScore() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(observer o) {
        observers.add(o);
    }

    @Override
    public void detach(observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(score score) {
        for (observer observer : observers) {
            observer.update(score);
        }
    }

    public void setScore(score score) {
        this.score = score;
        notifyUpdate(score);
    }
}