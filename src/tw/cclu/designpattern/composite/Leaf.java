package tw.cclu.designpattern.composite;

public abstract class Leaf implements Media {

	@Override
	public void add(Media media) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Media media) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void displayInfo() {
		System.out.println(getType());
	}

}
