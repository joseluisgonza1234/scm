package com.co.scmtest.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.co.scmtest.servlet.Util;

public class UtilTest {

	@Test
	public void atest() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void Btest() {
		Util util = new Util();
		String resu = util.nombreCompleto("juan", "carlo");
		assertNotNull("Nombre Vacio",resu.trim());
		
	}

}
