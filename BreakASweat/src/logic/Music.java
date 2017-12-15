package logic;

public class Music {
	private String genre;
	private String length;
	private String name;
	private String musicmode;
	public Music(String name, String length, String genre, String musicmode) {
		super();
		this.genre = genre;
		this.length = length;
		this.name = name;
		this.musicmode = musicmode;
	}
	public String getGenre() {
		return genre;
	}
	public String getLength() {
		return length;
	}
	public String getName() {
		return name;
	}
	public String getMusicmode() {
		return musicmode;
	}
	
}
