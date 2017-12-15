package Data;

import java.util.ArrayList;

public class DatabaseManager {
	private TempUserRecord userrecord;
	private TempContributorRecord contributor;

	private ArrayList<TempUserRecord> userRegister = new ArrayList<TempUserRecord>();
	private ArrayList<TempContributorRecord> contributorRegister = new ArrayList<TempContributorRecord>();

	public DatabaseManager() {

		TempUserRecord user1 = new TempUserRecord("ryan", "ting123");
		TempUserRecord user2 = new TempUserRecord("fred", "fred123");
		TempUserRecord user3 = new TempUserRecord("sheng", "sheng123");

		userRegister.add(user1);
		userRegister.add(user2);
		userRegister.add(user3);

		TempContributorRecord con1 = new TempContributorRecord("kimchi", "kimchi123");
		TempContributorRecord con2 = new TempContributorRecord("jiayih", "jiayih123");
		TempContributorRecord con3 = new TempContributorRecord("lam", "lam123");
		
		contributorRegister.add(con1);
		contributorRegister.add(con2);
		contributorRegister.add(con3);
	}

	public boolean verifyUser(String username, String pwd) {
		if (userrecord.getUsername().equals(username) && userrecord.getPassword().equals(pwd))
			return true;
		else {
			return false;
		}
	}

	public boolean verifyContributor(String username, String password) {
		if (contributor.getUsername().equals(username) && contributor.getPassword().equals(password)) {
			return true;
		} else
			return false;
	}

	public TempUserRecord getUser(String username, String password) {
		for (TempUserRecord user : userRegister) {
			if (userrecord.getUsername().equals(username) && userrecord.getPassword().equals(password))
				return user;
		}

		return null;
	}

	public TempContributorRecord getContributor(String username, String password) {
		for (TempContributorRecord contributor : contributorRegister) {
			if (contributor.getUsername().equals(username) && contributor.getPassword().equals(password))
				return contributor;
		}

		return null;
	}

	public ArrayList<TempUserRecord> getUserRegister() {
		return userRegister;
	}

	public ArrayList<TempContributorRecord> getContributorRegister() {
		return contributorRegister;
	}

}
