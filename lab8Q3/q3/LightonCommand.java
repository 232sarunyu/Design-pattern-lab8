
public class LightonCommand implements Command {
    Light light;
    
    public LightonCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.on();
    }
    
    public void undo() {
        light.off();
    }
}