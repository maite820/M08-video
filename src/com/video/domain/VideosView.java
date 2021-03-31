package com.video.domain;

/**
 *Menu  
 *
 */
public class VideosView {
	
	public void showMainMenu() {
			
	System.out.println("Selecciona una  opción");
	System.out.println("1- Crear nuevo usuario ");
	System.out.println("2- Crea nuevo Video");
	System.out.println("3- Lista  Videos");
	System.out.println("4- Salir" );
	
	}


	public void listVideo(Users user) {
		int cont=0;
		System.out.println("Nombre usuario: "+ user.getNom());
		System.out.println("Apellido usuario"+ user.getCognom());
		System.out.println("Fecha registro : "+ user.getDateRegistre());
		System.out.println("");
		
		
		for (Video video: user.listVideo()) {
			cont++;
			System.out.println("El video nº :" + cont);
			System.out.println("URL : "+ video.getURL());
			System.out.println("Títol : "+ video.getTitle());
			video.getTags();
			System.out.println(" ");
		}
		if(cont==0) System.out.println("no has creado ningun video.");
	}
	
	public void endProgram() {
		System.out.println("Fin programa");  
	}
}
	

