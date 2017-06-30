package com.tasima.appmageis.domain;

public class RG {

	public boolean valida(String rg) {
		
		if (rg.length() == 11){
			return true;
		}
		
		return false;
	}

}
