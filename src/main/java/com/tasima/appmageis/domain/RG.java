package com.tasima.appmageis.domain;

public class RG  {
	
	private String rg;
	
	public RG(String rg) throws Exception {
		if(this.valida(rg)){
			throw new Exception("RG não é valido");
		}
	}

	private boolean valida(String rg) {
		
		try {
			@SuppressWarnings("unused")
			Long lg = Long.valueOf(rg);
		} catch (Exception e) {
			return false;
		}
		
		if (rg.length() != 11){
			return false;
		}
		
		return true;
	}

	public String getRg() {
		return rg;
	}

}
