package com.video.exceptions;


public class EmptyFieldException extends Exception {
		
		private static final long serialVersionUID = 1L;

		public EmptyFieldException() {
			super();
		}
		
		public EmptyFieldException(String message) {
			super(message);
		}
	}

