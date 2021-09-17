package com.rocket;

public class RemoteControl {

	Command onCommand, offCommand, undoCommand;
	public void onButtonPress(Command onCommand)
	{
       this.onCommand = onCommand;
       onCommand.execute();
       undoCommand = onCommand;
	}
	public void offButtonPress(Command offCommand)
	{
       this.offCommand = offCommand;
       offCommand.execute();
       undoCommand = offCommand;
	}public void undoButtonPress(Command onCommand)
	{

	       undoCommand.undo();
		}
	
}
