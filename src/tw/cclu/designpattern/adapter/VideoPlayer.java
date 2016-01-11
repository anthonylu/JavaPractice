package tw.cclu.designpattern.adapter;

public class VideoPlayer {
	public void playMp4(String fileName) {
		System.out.println("Play mp4 "+fileName);
	}
	
	public void playMkv(String fileName) {
		System.out.println("Play mkv "+fileName);
	}
	
	public void playRmvb(String fileName) {
		System.out.println("Play rmvb "+fileName);
	}
}
