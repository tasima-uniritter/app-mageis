package com.tasima.appmageis.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tasima.appmageis.domain.RG;

@Controller
public class SampleController {

    @RequestMapping(value="/")
    String home() {
        return "index";
    }
    
    @RequestMapping(value="/execute", method=RequestMethod.POST)
    String execute(@RequestParam("nome") String rg, Model model) {
    	
    	try {
			RG registro = new RG(rg);
			model.addAttribute("message","O RG" + registro.getRg() + " é valido!");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message","O RG" + rg + " é valido!");
		}
    	
        return "execute";
    }
}