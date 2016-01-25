package tw.cclu.designpattern.decorator;

public abstract class PlugAndPlayDecorator implements Device {
	protected Device device;
	
	public PlugAndPlayDecorator(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.execute();
	}

}
