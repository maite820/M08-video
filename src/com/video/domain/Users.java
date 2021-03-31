
package com.video;
import java.util.ArrayList;
import java.util.List;

import com.video.domain.Video;
import com.video.exceptions.EmptyFieldException;

public class Users {
	
		//Atributos
		protected String nom; 
		protected String cognom;
		protected String password;
		protected String dateRegistre;
		protected  List<Video> videoList;
		
		public Users (String nom, String cognom,String password, String dateRegistre) throws Exception{
			
			if(nom.contentEquals("")) throw new EmptyFieldException("no has introducido el nombre del usuario  ");
			if(cognom.contentEquals("")) throw new EmptyFieldException("no has introducido el apellido del usuario  ");
			if(password.contentEquals("")) throw new EmptyFieldException("no has introducido la contraseña del usuario  ");
			if(dateRegistre.contentEquals("")) throw new EmptyFieldException("no has introducido la fecha de registro  ");
			this.nom = nom;
			this.cognom = cognom;
			this.password = password;
			this.dateRegistre=dateRegistre;
			this.videoList = new ArrayList<Video>() ;
		}
		public void addVideo (Video video) {
			this.videoList.add(video);
		
	}
		public List <Video> listVideo(){
			return this.videoList;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getCognom() {
			return cognom;
		}
		public void setCognom(String cognom) {
			this.cognom = cognom;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getDateRegistre() {
			return dateRegistre;
		}
		public void setDateRegistre(String dateRegistre) {
			this.dateRegistre = dateRegistre;
		}
		
		
}
		
		
	

