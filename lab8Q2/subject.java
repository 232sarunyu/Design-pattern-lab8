import java.util.ArrayList;
import java.util.List;

public interface subject {
    void attach(observer o);
    void detach(observer o);
    void notifyUpdate(score score);
}
