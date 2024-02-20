public class AconCommands implements Command {
    Airconditioner ac;
    
    public AconCommands(Airconditioner ac) {
        this.ac = ac;
    }
    
    public void execute() {
        ac.on();
    }
    
    public void undo() {
        ac.off();
    }
}