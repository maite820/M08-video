  
package com.video.persistence;


import java.util.ArrayList;
import java.util.List;

import com.video.domain.*;
/**
 * 
 * Registro de videos y usuarios
 * 
 */

public class VideoClubRepository { 

	private static List<Users> usersList = new ArrayList<>();
	
	public VideoClubRepository() {
		
	}
	
	public List<Users> getAllUsersList() {
		return new ArrayList<>(usersList);
	}
	
	public void addUser(Users user) {
		usersList.add(user);
	}
	
}