package tw.cclu.designpattern.decorator;

public class Webcam extends PlugAndPlayDecorator {

	public Webcam(Device device) {
		super(device);
	}
	
	public void execute() {
		device.execute();
		this.captureImage();
	}
	
	public void captureImage() {
		System.out.println("Webcam is capturing images.");
	}

}
