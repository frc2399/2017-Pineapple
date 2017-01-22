package org.usfirst.frc.team2399.robot.commands;

import org.usfirst.frc.team2399.robot.Robot;
import org.usfirst.frc.team2399.robot.RobotMap;
import org.usfirst.frc.team2399.robot.subsystems.GearCollector;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearOut extends Command {
	
	private GearCollector gearCollector = Robot.gearCollector;

    public GearOut() {
    	requires(gearCollector);
    	setInterruptible(true);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(RobotMap.GEAR_TIMER);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	gearCollector.setGearSolenoid(RobotMap.GEAR_SOLENOID_OUT_CONSTANT);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
