package tw.cclu.designpattern.adapter;

// object adapter
public class VideoPlayerAdapter implements Player {
	private final VideoPlayer adaptee = new VideoPlayer();
	
	@Override
	public void play(String fileName) {
		String ext = fileName.substring(fileName.lastIndexOf('.'));
		switch(ext) {
		case ".mp4":
			adaptee.playMp4(fileName);
			break;
		case ".mkv":
			adaptee.playMkv(fileName);
			break;
		case ".rmvb":
			adaptee.playRmvb(fileName);
			break;
		default:
			throw new RuntimeException("Media type is not supported");
		}
	}

}
