package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

//route to enable check sum return of static data example  
@RestController
class ServerController {
	
	// initialized private final data string with my first an last name
	private final String data = "Kenneth Wilkerson's Check Sum!";
	
	@RequestMapping("/hash")
	public String myHash() {
		
		// generate hash value from data string
		String hashValue = calculateHash(data);
	        
		// output message on https://localhost:8443/hash
		return "<p>Data: " + data + "</p><p> SHA-384: CheckSum Value: " + hashValue + "</p>";
	    }
	
	// hash calculation method using SHA-384
	private String calculateHash(String data) {
		try {
			MessageDigest mdObject = MessageDigest.getInstance("SHA-384");
			byte[] byteArray = mdObject.digest(data.getBytes());
			return bytesToHex(byteArray);
	        } 
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Hash calculation error", e);
	        }
	    }
	
	// byte array to hex string conversion method
	private String bytesToHex(byte[] bytes) {
		StringBuilder hexString = new StringBuilder(bytes.length * 2);
		
		for (byte b : bytes) {
			hexString.append(String.format("%02x", b));
	             }
		return hexString.toString();
	    }
	}

}
