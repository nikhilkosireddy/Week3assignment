package com.rocket;

public class RocketStopCommand implements Command{

	private Rocket rocket;
	public RocketStopCommand(Rocket rocket) 
	{
		this.rocket = rocket;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Rocket move command is stopped");	
		rocket.stop();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Rocket move command is undo the previous action");	

		rocket.move();
		
	}

}
