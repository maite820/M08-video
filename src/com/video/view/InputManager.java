package com.video.view;
import java.util.Scanner;

import com.video.application.VideoController.VideoController;
import com.video.domain.Users;
import com.video.domain.VideosView;
/**
 * 
 * crear usuarios,videos, lista de videos
 * ver menu
 * 
 *
 */


public class InputManager {

	private Scanner scanner;
	private InputCommons commons;
	private VideoController controller;
	private VideosView view;
	
	public InputManager() {
		this.scanner = new Scanner(System.in);
		this.commons = new InputCommons(this.scanner); 
		this.controller = new VideoController(); 
		this.view = new VideosView(); 
	}
	
	public void close() {
		this.scanner.close();
	}
	

	public void showMenu() {
				
		boolean exit = false;
		while (exit==false) {
			view.showMainMenu();
			int option = commons.askOption(1,4);
			switch(option) {
			  case 1:
				  this.createUser();
				  break;
			  case 2:
				  this.createvideos();
				  break;
			  case 3:
				  this.showvideo();
				   break;
			  case 4:
				  exit = true;
				  break;
			  default:
				  break;
			}
			if(exit==false) { 
				commons.pause();
			}else {
				view.endProgram();
			}
		}

	}


	public void createvideos() {
		boolean correctFormat = false;
		while(correctFormat==false) {
			try {
				String URL = commons.askString("Dime es el nombre de la URL del video a crear?:");
				String title = commons.askString("Dime el titulo del video a crear?:");
				String[]tags = commons.askList("Indicame los tags de este video.:");
				Users user = controller.getCurrentuser();
				if (user==null) {
					System.out.println(" El usuario no esta creado");
					return;
				}
				System.out.println("has creado un video");
				correctFormat=true;
				this.controller.createvideos(user,URL,title,tags);				
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Vuelve a introducir los datos del video a crear.");
			}
		}
	}
	public void createUser() {
		boolean correctFormat = false;
		while(correctFormat==false) {
			try {
				String name = commons.askString("Indicame el nombre del usuario:");
				String surname = commons.askString("Indicame el apellido del usuario:");
				String password = commons.askString("Indicame el password del usuario:");
				String dateRegister = commons.askDate("Dime la fecha de registro del usuario?:");
				correctFormat=true;
				this.controller.createUser(name, surname,password, dateRegister);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Vuelve a introducir los datos del usuario.");
			}
		}
	}
	
	public void showvideo() {
		if(controller.getCurrentuser()==null) {
			System.out.println("no has creado el usuario ");
		}else {
			Users currentUser = controller.getCurrentuser();
			this.view.listVideo(currentUser);
		}
	}
}