
package com.video.application.VideoController;

import com.video.domain.Users;
import com.video.domain.Video;
import com.video.persistence.VideoClubRepository;

public class VideoController {
		private VideoClubRepository videoRepository;
		private Users currentSelectedUser = null; 
		
		public VideoController(){
			this.videoRepository = new VideoClubRepository(); 
		}
		public void createUser(String nom, String cognom,String password, String dateRegistre) throws Exception{
			Users user = new Users(nom,cognom,password,dateRegistre);
			this.videoRepository.addUser(user);
			this.currentSelectedUser = user; 
		}	
		public void createvideos(Users user,String URL, String title,String[] tags) throws Exception{
			Video video = new Video(URL,title,tags);
			user.addVideo(video);
		}
		public void selectCurrentuser(Users currentSelectedUser) {
			this.currentSelectedUser = currentSelectedUser;
		}
		public Users getCurrentuser() {
			return this.currentSelectedUser;
		}
	}

