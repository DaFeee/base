package hu.bme.mit.train.user;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainUserImpl implements TrainUser {

	public final TrainController controller;
	private int joystickPosition;
	private boolean alarm;

	public TrainUserImpl(TrainController controller) {
		this.controller = controller;
		this.alarm = false;
	}

	@Override
	public boolean getAlarmFlag() {
		return false;
	}

	@Override
	public int getJoystickPosition() {
		return joystickPosition;
	}

	@Override
	public void overrideJoystickPosition(int joystickPosition) {
		this.joystickPosition = joystickPosition;
		controller.setJoystickPosition(joystickPosition);
	}

	@Override
	public boolean getAlarmState(){
		return alarm;
	}

	@Override
	public void setAlarmState(boolean alarm){
		this.alarm = alarm;
	}

}
