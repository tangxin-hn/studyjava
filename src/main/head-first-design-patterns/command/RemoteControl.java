package command;

import java.util.Stack;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i=0;i<7;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommands = new Stack<Command>();
        undoCommands.push(noCommand);
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommands.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommands.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if(!undoCommands.empty() && !undoCommands.peek().getClass().getName().equals("command.NoCommand") ) {
            Command undoCommand = undoCommands.pop();
            undoCommand.undo();
        }
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommands.peek().getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
