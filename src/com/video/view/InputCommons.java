package com.video.view;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Filtrar datos introducidos por Usuario
 * 
 *
 */
public class InputCommons {
	private Scanner input;
	public InputCommons(Scanner input){
		this.input = input;
	}
	public String askString(String questionMessage) {
		System.out.println(questionMessage);
		String answer = this.input.nextLine();
		return answer;
	}
	public String[] askList (String questionMessage) {
		System.out.println(questionMessage);
		String answer = this.input.nextLine();
		String[] tags= answer.split(",");
		return tags ;
	}
	public String askDate(String questionMessage) {
		String answer="";
		boolean correctFormat = false;
		while(correctFormat==false) {
        try {
        	System.out.println(questionMessage);
			answer = this.input.nextLine();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(answer);
            correctFormat=true;
        } catch (Exception e) {
         System.out.println("S'ha produit la excepciò:  "+ e);
        }
	}
		return answer;
	}
	public int askOption(int minInt, int maxInt) {
		return askInt("Selecciona una opción:",minInt,maxInt);
	}
	public int askInt(String questionMessage,int minInt, int maxInt) {
		int option= 0;
		boolean numberFormat = false;
		System.out.println(questionMessage);
		while(numberFormat==false) {
			try {
				option = this.input.nextInt();
				if(option>=minInt && option<=maxInt) {
					numberFormat=true;
				}else {
					System.out.println("Seleciona una opcion introduciendo  un número entre "+minInt+ " i "+maxInt);
				}
			}catch(InputMismatchException e) {
				System.out.println("Seleccina una opcion entre "+minInt+ " i "+maxInt);
			}
			this.input.nextLine();
		}
		return option;
	}
	public double askDouble(String questionMessage) {
		double number = 0;
		boolean numberFormat = false;
		System.out.println(questionMessage);
		while(numberFormat==false) {
			try {
				number = this.input.nextDouble();
				numberFormat=true;
			}catch(InputMismatchException e) {
				
				System.out.println("El valor introducido no es valido.");
			}
			this.input.nextLine();
		}
		return number;
	}	
	public void pause() {
		System.out.println("Pulsa ENTER para volver al MENU ");
		this.input.nextLine();
	}
}


