package logic;

import java.util.ArrayList;

import Data.DatabaseManager;
import Data.TempContributorRecord;
import Data.TempUserRecord;

public class MainSystem {
	private String name;
	
	DatabaseManager db = new DatabaseManager();
	
	public MainSystem(String name){
		this.name=name;
	}
	
	public boolean isValidUser(String username, String password){
		return db.verifyUser(username, password);
	}
	public boolean isValidContributor(String username, String password){
		return db.verifyContributor(username, password);
	}
	
	public ArrayList<User> getAllUser(){
		ArrayList<User> userlist = new ArrayList<User>();
		ArrayList<TempUserRecord> userRegister = db.getUserRegister();
		
		for(TempUserRecord tempuser : userrecord) {
			User users = new User(tempuser.getUsername() , tempuser.getPassword());
			userlist.add(users);
			
		}
		return userlist;
		
	}
	
	public ArrayList<Contributor> getAllContributor(){
		ArrayList<Contributor> contributorlist = new ArrayList<Contributor>();
		ArrayList<TempContributorRecord> contributorRegister = db.getContributorRegister();
		
		for(TempContributorRecord tempcontributor : contributorRegister) {
			Contributor contributors = new Contributor(tempcontributor.getUsername(), tempcontributor.getPassword());
			contributorlist.add(contributors);
		}
		
		return contributorlist;
		
	}
}
