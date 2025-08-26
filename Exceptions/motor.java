package Exceptions;

import java.util.Scanner;

class motor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
		if(age<18) {
			throw new NotValidvoterException("not a valid");
		}
		 else {
                System.out.println("You are eligible to vote.");
            }
		} catch (NotValidvoterException e) {
             e.printStackTrace();
        }
	}
}

