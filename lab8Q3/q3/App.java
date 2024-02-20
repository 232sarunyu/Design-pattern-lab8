public class App {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedroomAC = new Airconditioner("Bed Room");
        
        LightonCommand livingRoomLightOn = new LightonCommand(livingRoomLight);
        LightoffCommand livingRoomLightOff = new LightoffCommand(livingRoomLight);
        LightonCommand kitchenLightOn = new LightonCommand(kitchenLight);
        LightoffCommand kitchenLightOff = new LightoffCommand(kitchenLight);
        AconCommands bedroomACOn = new AconCommands(bedroomAC);
        AcoffCommands bedroomACOff = new AcoffCommands(bedroomAC);
        
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, bedroomACOn, bedroomACOff);
        
        System.out.println(remote);
        
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println("--------------------------------");
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        System.out.println("--------------------------------");
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        System.out.println("--------------------------------");
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
    }
}
