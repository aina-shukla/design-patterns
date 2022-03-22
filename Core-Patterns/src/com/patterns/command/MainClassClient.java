package com.patterns.command;

public class MainClassClient {

	// command is a behavioral design pattern
	// it encapsulates request as an object and pass it to invoker
	// invoker passes the command to the receiver who knows what/how action to
	// perform

	// client class

	public static void main(String[] args) {

		TelevisionReceiver receiver = new TelevisionReceiver();
		RemoteControl control = new RemoteControl();

		OnCommand command = new OnCommand(receiver);
		control.setCommand(command);
		control.pressButton();
		
		OffCommand command2 = new OffCommand(receiver);
		control.setCommand(command2);
		control.pressButton();
	}

}
