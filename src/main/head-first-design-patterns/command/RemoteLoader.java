package command;

public class RemoteLoader {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan1 = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan1);
        CeilingFanOffCommand ceilingFanOffCommand1 = new CeilingFanOffCommand(ceilingFan1);

        CeilingFan ceilingFan2 = new CeilingFan("Kitchen");
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan2);
        CeilingFanOffCommand ceilingFanOffCommand2 = new CeilingFanOffCommand(ceilingFan2);

        CeilingFan ceilingFan3 = new CeilingFan("Sleeping Room");
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan3);
        CeilingFanOffCommand ceilingFanOffCommand3 = new CeilingFanOffCommand(ceilingFan3);

        Light light1 = new Light("Living Room");
        LightOnCommand lightOnCommand1 = new LightOnCommand(light1);
        LightOffCommand lightOffCommand1 = new LightOffCommand(light1);

        Light light2 = new Light("Kitchen");
        LightOnCommand lightOnCommand2 = new LightOnCommand(light2);
        LightOffCommand lightOffCommand2 = new LightOffCommand(light2);

        Light light3 = new Light("Sleeping Room");
        LightOnCommand lightOnCommand3 = new LightOnCommand(light3);
        LightOffCommand lightOffCommand3 = new LightOffCommand(light3);

        Command[] partyOn = {ceilingFanHighCommand, ceilingFanMediumCommand, ceilingFanLowCommand, lightOnCommand1, lightOnCommand2, lightOnCommand3};
        Command[] partyOff = {ceilingFanOffCommand1, ceilingFanOffCommand2, ceilingFanOffCommand3, lightOffCommand1, lightOffCommand2, lightOffCommand3};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand1);
        remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand2);
        remoteControl.setCommand(2, ceilingFanLowCommand, ceilingFanOffCommand3);
        remoteControl.setCommand(3, lightOnCommand1, lightOffCommand1);
        remoteControl.setCommand(4, lightOnCommand2, lightOffCommand2);
        remoteControl.setCommand(5, lightOnCommand3, lightOffCommand3);
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(6);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(6);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
    }
}
