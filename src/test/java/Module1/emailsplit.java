package Module1;

import java.util.Random;
import java.util.Scanner;

public class emailsplit {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		String email="sherlock.holmes@gmail.com";
		System.out.println("Enter email");
		Scanner sc = new Scanner(System.in);
		String email1 = sc.next();
		String[] sb1 = email1.split("@");
		String[] sb2 = sb1[0].split("\\.");
	 	//String firstname=sb1[0];
	 	//String lastname=sb1[1];
	 	//System.out.println(sb1);
	 	for (int i=0; i<sb2.length;i++) {
	 		System.out.println(sb2[i]);
	 	}*/
		System.out.println(emailsplit.generateRandomNum());

	}
	
	public static String generateRandomNum() {
		Random random = new Random();
		 int randomInt = random.nextInt(1000000);
		 String rs = "AAA" + String.valueOf(randomInt);
		 return rs;
	}

}
