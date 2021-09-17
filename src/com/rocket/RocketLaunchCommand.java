package com.rocket;

public class RocketLaunchCommand implements Command{

	private RocketLaunch launch;
	public RocketLaunchCommand(RocketLaunch launch) 
	{
		this.launch = launch;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Rocket Launch command is executed");	
		launch.launch();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Rocket Launch command is undo the previous action");	

		launch.ground();
		
	}

}
