package tw.cclu.designpattern.composite;

import java.util.ArrayList;

public abstract class Group implements Media {
	protected ArrayList<Media> list = new ArrayList<>();

	@Override
	public void add(Media media) {
		list.add(media);
	}

	@Override
	public void remove(Media media) {
		list.remove(media);
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public void displayInfo() {
		System.out.println(getType()+" group:");
		for (Media m:list) {
			m.displayInfo();
		}
	}
}
