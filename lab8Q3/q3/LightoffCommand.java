
public class LightoffCommand implements Command {
    Light light;
    
    public LightoffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.off();
    }
    
    public void undo() {
        light.on();
    }
}
