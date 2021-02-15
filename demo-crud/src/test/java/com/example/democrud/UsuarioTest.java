package com.example.democrud;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioTest {
	
	@Test
	public void generatePassword() {
		BCryptPasswordEncoder passGen = new BCryptPasswordEncoder();
		System.out.println(passGen.encode("admin"));
	}

}
