package com.tasima.appmageis.web;

import java.util.Date;

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
    String execute(@RequestParam("rg") String rg, Model model) {
    	
    	try {
			RG registro = new RG(rg);
			model.addAttribute("message","O RG " + registro.getRg() + " é valido!");
		} catch (Exception e) {
			System.out.println(new Date(System.currentTimeMillis())+ " INFO --- " + e.getMessage());
			model.addAttribute("message","O RG " + rg + " é invalido!");
		}
    	
        return "execute";
    }
}