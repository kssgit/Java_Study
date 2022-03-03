package test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class salt {
	
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String salt = "TzlQLEQiLG77BKBPVeYDdQ==";
		String pwd = "123";
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(salt.getBytes());
		md.update(pwd.getBytes());
		String hex = String.format("%064x", new BigInteger(1, md.digest()));
		
		
		MessageDigest md2 = MessageDigest.getInstance("SHA-256");
		md2.update(salt.getBytes());
		md2.update(pwd.getBytes());
		String hex2 = String.format("%064x", new BigInteger(1, md2.digest()));
		if(hex.equals(hex2)) {
			System.out.println("같다");
		}
	}
	
	
}
