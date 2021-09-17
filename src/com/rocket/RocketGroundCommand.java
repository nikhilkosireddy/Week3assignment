package com.rocket;

public class RocketGroundCommand implements Command{

	private RocketLaunch launch;
	public RocketGroundCommand(RocketLaunch launch) 
	{
		this.launch = launch;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Rocket Ground command is executed");	
		launch.ground();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Rocket Ground command is undo the previous action");	

		launch.launch();
		
	}

}
