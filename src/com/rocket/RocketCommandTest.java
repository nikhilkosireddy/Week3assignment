package com.rocket;
public class RocketCommandTest {

	
	
public static void main(String[] args) {   
		
	    RemoteControl rc = new RemoteControl();
	    System.out.println("Move Rockets");
        System.out.println("=============");

        Rocket rocket = new Rocket();
        Command rmc = new RocketMoveCommand(rocket);
        rc.onButtonPress(rmc);
        
        System.out.println("==============");
        System.out.println("Stop Rockets");
        System.out.println("==============");

        Command rm = new RocketStopCommand(rocket);
        rc.offButtonPress(rm);
        
        System.out.println("==============");
        System.out.println("Launch Rockets");
        System.out.println("==============");  
        RocketLaunch launch = new RocketLaunch();
        Command rocketlaunch = new RocketLaunchCommand(launch);
        rc.onButtonPress(rocketlaunch);

        
        System.out.println("=====================");
        System.out.println("Ground Rockets ");
        System.out.println("=====================");  
        Command rocketground = new RocketGroundCommand(launch);
        rc.offButtonPress(rocketground);


	 }    

}


