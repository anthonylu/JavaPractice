package tw.cclu.designpattern.decorator;

public class Computer implements Device {

	@Override
	public void execute() {
		System.out.println("Computer is running");
	}

}
