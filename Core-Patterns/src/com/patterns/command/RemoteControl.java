package com.patterns.command;

public class RemoteControl {
//used by client

	private Command command;

	public void pressButton() {
		command.execute();
	}
	
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
