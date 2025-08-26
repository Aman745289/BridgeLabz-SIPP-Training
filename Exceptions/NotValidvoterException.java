package Exceptions;

import java.util.Scanner;

public class NotValidvoterException extends  Exception {
	private String message;
	NotValidvoterException(String message){
		this.message=message;
		
	}
	@Override
	public String getMessage() {
		return message;
	}
	
}

