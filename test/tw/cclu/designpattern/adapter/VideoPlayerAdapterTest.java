package tw.cclu.designpattern.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoPlayerAdapterTest {

	@Test(expected=RuntimeException.class)
	public void testPlay() {
		VideoPlayerAdapter player = new VideoPlayerAdapter();
		player.play("video.mp4");
		player.play("video.mkv");
		player.play("video.rmvb");
		player.play("video.flv");
	}

}
