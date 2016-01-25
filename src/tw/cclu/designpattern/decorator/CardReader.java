package tw.cclu.designpattern.decorator;

public class CardReader extends PlugAndPlayDecorator {

	public CardReader(Device device) {
		super(device);
	}
	
	public void execute() {
		device.execute();
		this.read();
	}

	public void read() {
		System.out.println("Reading content of card");
	}
}
