package com.rocket;

public class RocketMoveCommand implements Command{

	private Rocket rocket;
	public RocketMoveCommand(Rocket rocket) 
	{
		this.rocket = rocket;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Rocket move command is executed");	
		rocket.move();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Rocket move command is undo the previous action");	

		rocket.stop();
		
	}

}
