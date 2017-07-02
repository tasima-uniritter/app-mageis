package com.tasima.appmageis;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tasima.appmageis.domain.RG;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidaRG {
	
	@Test 
	public void validaTamanhoDoRG(){
		
		String registro = "12345678900";
		@SuppressWarnings("unused")
		RG rg;
		
		try {
			rg = new RG(registro);
			assertFalse(true);
		} catch (Exception e) {
			
			assertFalse(false);
		}
	}
	
	@Test 
	public void validaTamanhoMaiorDoRG(){
		
		String registro = "12345678900000";
		@SuppressWarnings("unused")
		RG rg;
		
		try {
			rg = new RG(registro);
			assertFalse(false);
		} catch (Exception e) {
			
			assertFalse(true);
		}
	}
	
	@Test 
	public void validaTamanhoMenorDoRG(){
		
		String registro = "123456";
		
		@SuppressWarnings("unused")
		RG rg;
		
		try {
			rg = new RG(registro);
			assertFalse(false);
		} catch (Exception e) {
			
			assertFalse(true);
		}
	}
	
	@Test 
	public void validaNumeroDoRG(){
		
		String registro = "12345623as";
		
		@SuppressWarnings("unused")
		RG rg;
		
		try {
			rg = new RG(registro);
			assertFalse(false);
		} catch (Exception e) {
			
			assertFalse(true);
		}
	}

}
