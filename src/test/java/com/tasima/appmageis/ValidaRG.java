package com.tasima.appmageis;

import static org.junit.Assert.assertEquals;

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
		RG rg;
		Boolean validador = true; 
		
		try {
			rg = new RG(registro);
			
			if(!rg.getRg().equals(registro)) validador = false;
		} catch (Exception e) {
			validador = false;
		}
		
		assertEquals("Valida se o RG é valido", true, validador);
	}
	
	@Test 
	public void validaTamanhoMaiorDoRG(){
		
		String registro = "12345678900000";
		@SuppressWarnings("unused")
		RG rg;
		Boolean validador = false; 
		
		try {
			rg = new RG(registro);
		} catch (Exception e) {
			
			validador = true;
		}
		
		assertEquals("Valida se o RG é valido", true, validador);
	}
	
	@Test 
	public void validaTamanhoMenorDoRG(){
		
		String registro = "123456";
		
		@SuppressWarnings("unused")
		RG rg;
		Boolean validador = false; 
		
		try {
			rg = new RG(registro);
		} catch (Exception e) {
			validador = true;
		}
		
		assertEquals("Valida se o RG é valido", true, validador);
	}
	
	@Test 
	public void validaNumeroDoRG(){
		
		String registro = "12345623as";
		
		@SuppressWarnings("unused")
		RG rg;
		Boolean validador = false; 
		
		try {
			rg = new RG(registro);
			
		} catch (Exception e) {
			
			validador = true;
		}
		assertEquals("Valida se o RG é valido", true, validador);
	}
	
	@Test 
	public void validaNullDoRG(){
		
		String registro = "";
		
		@SuppressWarnings("unused")
		RG rg;
		Boolean validador = false; 
		
		try {
			rg = new RG(registro);
		} catch (Exception e) {
			
			validador = true;
		}
		assertEquals("Valida se o RG é valido", true, validador);
	}

}
