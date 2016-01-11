package tw.cclu.designpattern.composite;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiMediaTest {

	@Test(expected=UnsupportedOperationException.class)
	public void testComposite() {
		Media root = new MultiMedia();
		Media mp3 = new Mp3();
		root.add(mp3);
		Media video = new Video();
		root.add(video);
		video.add(new Mp4());
		video.add(new Rmvb());
		root.displayInfo();
		mp3.add(new Mp3());
	}

}
