
public class AcoffCommands implements Command {
    Airconditioner ac;
    
    public AcoffCommands(Airconditioner ac) {
        this.ac = ac;
    }
    
    public void execute() {
        ac.off();
    }
    
    public void undo() {
        ac.on();
    }
}