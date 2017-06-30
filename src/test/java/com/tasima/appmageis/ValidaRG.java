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
		
		RG rg = new RG();
		assertEquals("Validacao do tamanho do RG", true, rg.valida(registro));
	}
	
	@Test 
	public void validaTamanhoMaiorDoRG(){
		
		String registro = "12345678900000";
		
		RG rg = new RG();
		assertEquals("Validacao do tamanho do RG", false, rg.valida(registro));
	}
	
	@Test 
	public void validaTamanhoMenorDoRG(){
		
		String registro = "123456";
		
		RG rg = new RG();
		assertEquals("Validacao do tamanho do RG", false, rg.valida(registro));
	}

}
