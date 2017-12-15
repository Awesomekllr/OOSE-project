package logic;

public class Contributor extends User{
	private boolean isContributor;

	public Contributor(String user, String password, String confirmpassword,
			String email, String gender, boolean isContributor) {
		super(user, password, confirmpassword, email, gender);
		// TODO Auto-generated constructor stub
	}

	public boolean isContributor() {
		return isContributor;
	}
	
}
