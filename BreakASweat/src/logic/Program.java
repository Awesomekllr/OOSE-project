package logic;

public class Program {
	private String title;
	private String pictures;
	private String authors;
	private String details;
	private String price;
	private boolean joined;
	public Program(String title, String pictures, String authors,
			String details, String price, boolean joined) {
		super();
		this.title = title;
		this.pictures = pictures;
		this.authors = authors;
		this.details = details;
		this.price = price;
		this.joined = joined;
	}
	public String getTitle() {
		return title;
	}
	public String getPictures() {
		return pictures;
	}
	public String getAuthors() {
		return authors;
	}
	public String getDetails() {
		return details;
	}
	public String getPrice() {
		return price;
	}
	public boolean isJoined() {
		return joined;
	}
	
	
}
